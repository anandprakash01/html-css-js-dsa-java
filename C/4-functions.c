#include <stdio.h>
#include <string.h>

int glo = 76;
// data_type func_name(parameter_type parametername){
//     return value_of_type_data_type;
// }

void newPrint(char *char1)
{
    printf("The value is %s\n\n\n\n", char1);
}

int sum(int a, int b)
{
    return a + b;
}

float average(float a, float b)
{
    return (a + b) / 2;
}
int main()
{

    // Functions
    printf("The average of 100 and 299 is %f", average(100, 299));
    int glo = 87;
    printf("Glo is %d", glo);

    int arr[10] = {0, 1, 2, 3, 4, 5, 6, 70, 8, 9};
    for (int i = 0; i < 10; i++)
    {
        printf("Enter the values for index %d \n", i);
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < 10; i++)
    {
        printf("The value for index %d is %d\n", i, arr[i]);
    }

    return 0;
}
