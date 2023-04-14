const quoteContainer=document.getElementById('quote-container');
const quoteText=document.getElementById('quote');
const author=document.getElementById('author');
const newQuoteBtn=document.getElementById('new-quote-btn');
const twitterBtn=document.getElementById('twitter');
const loader=document.querySelector('span.loader');

//show loading
function loading(){
    loader.classList.remove('hide');
    quoteContainer.classList.add('hide');
}
//hide loading
function complete(){
    loader.classList.add('hide');
    quoteContainer.classList.remove('hide');
}

let apiQuotesArray = [];
//onload
getQuotes();
newQuoteBtn.addEventListener('click',newQuote);

function newQuote(){
    const quote=apiQuotesArray[Math.floor(Math.random() * apiQuotesArray.length)];
    quoteText.textContent=quote.text;
    author.textContent=quote.author || "Unknown";

    if(quote.text.length > 110){
        quoteText.classList.add("long-quote");
    }
    else{
        quoteText.classList.remove("long-quote");
    }
}

async function getQuotes() {
    loading();
    const apiUrl = 'https://type.fit/api/quotes'

    try {
        const response = await fetch(apiUrl);
        apiQuotesArray = await response.json();
        // console.log(apiQuotesArray);
        newQuote();
        //stop loading
        complete();
    } catch (error) {
        
    }
}

//tweet quote
function tweetQuote(){
    const twitterUrl=`https://twitter.com/intent/tweet?text=${quoteText.text} - ${author.textContent}`;
    window.open(twitterUrl,'_blank');
}
twitterBtn.addEventListener('click', tweetQuote);

