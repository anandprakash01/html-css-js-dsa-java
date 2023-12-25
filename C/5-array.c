#include <stdio.h>

int main()
{
    int arr[5] = {1, 2, 3, 4, 5};
    printf("%d", arr[0]);

    for (int i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }
}