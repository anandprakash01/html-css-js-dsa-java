#include <stdio.h>
#include <string.h>

struct Books
{
    char name[50];
    char author[50];
    int price;
} book;

void printStruct(struct Books bk)
{
    printf("Book name is %s\n", bk.name);
    printf("Author name is %s\n", bk.author);
    printf("Book Price is %d\n", bk.price);
}
int main()
{

    // Structures
    struct Books bk1, bk2;
    strcpy(bk1.name, "C Programming");
    strcpy(bk1.author, "Dennis");
    bk1.price = 78;
    printStruct(bk1);

    return 0;
}
