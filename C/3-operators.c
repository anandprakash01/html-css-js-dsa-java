#include <stdio.h>

int main()
{

    /*
    Arithmetic Operators
    Relational Operators
    Logical Operators
    Bitwise Operators
    Assignment Operators
    Misc Operators
   */

    // Arithmetic Operators
    int a = 60, b = 7, c = 8;

    printf("%d\n", a + b);
    printf("%d\n", a - b);
    printf("%d\n", a * b);
    printf("%d\n", a / b);
    printf("%d\n", a % b);
    printf("%d\n", a++);
    printf("%d\n", a--);
    printf("%d\n", ++a);
    printf("%d\n", --b);

    // Relational Operators
    int num1 = 10, num2 = 20;
    printf("%d\n", num1 == num2);
    printf("%d\n", num1 != num2);
    printf("%d\n", num1 > num2);
    printf("%d\n", num1 < num2);
    printf("%d\n", num1 >= num2);
    printf("%d\n", num1 <= num2);

    // Logical Operators
    int h = 0, j = 1;
    printf("The logical operator returned %d\n", h && j);
    printf("The logical operaTor returned %d\n", h || j);
    printf("The logical operator returned %d\n", !j);
    printf("The logical operator returned %d\n", !h);

    // Bitwise Operators
    // A = 60 B=13
    // A = 00111100
    // B = 00001101
    // R = 00001100
    int A = 60, B = 14;
    printf("Bitwise and operator returned %d\n", A & B);
    printf("Bitwise or operator returned %d\n", A | B);
    printf("Bitwise xor operator returned %d\n", A ^ B);
    printf("Bitwise ones complement operator returned %d\n", ~B);
    printf("Bitwise left shift operator operator returned %d\n", A << B);
    printf("Bitwise right shift operator operator returned %d\n", A >> B);

    // Assignment Operators
    // =, +=, -=, *=, %=, etc
    int ha = 9;
    ha += 9;
    printf("ha is %d\n", ha);

    // Misc Operators :->   &, *, ?:

    printf("\n\n*******Taking input from user in C*********");
    // int harryInput;
    // printf("\n Please enter the value of harryInput");
    // scanf("%d", &harryInput);
    // printf("\n You Entered %f as harryInput", (float) harryInput);

    // int n1, n2;
    // scanf("%d", &n1);
    // scanf("%d", &n2);
    // printf("\n n1/n2 is %f", (float)n1/n2);

    printf("\n\n*******Decision Making in C*********\n\n");
    int age;
    printf("Enter your age\n");
    // scanf("%d", &age);
    age = 44;
    if (age < 18)
    {
        printf("You can drive");
    }
    else if (age >= 18 && age <= 24)
    {
        printf("You are banned from driving");
    }
    else
    {
        printf("You can drive but drive carefully");
    }

    // Exercise: Tell me about Switch statement
    int i4 = age > 3 ? 100 : 200; // short hand if else
    printf(" %d ", i4);

    printf("\n\n*******Loop in C*********\n\n");
    int index = 0;
    while (index < 10)
    {
        printf("%d\n", index);
        index++;
    }

    for (int j = 0; j < 67; j++)
    {
        printf("%d\n", j);
    }

    do
    {
        printf("do while loop is running");
    } while (j > 65656);

    printf("\n\n*******Functions in C*********\n\n");

    return 0;
}
