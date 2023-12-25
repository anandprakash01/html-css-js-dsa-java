#include <stdio.h>
#include <string.h>

int main()
{

    // Pointers
    int a = 98;
    printf("%d\n", a);
    int *ptr = NULL;
    if (!ptr)
    {
        printf("pointer is not null");
    }
    ptr = &a;
    *ptr = 188;
    printf("%d", a);
}
