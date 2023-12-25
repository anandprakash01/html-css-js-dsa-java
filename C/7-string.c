#include <stdio.h>
#include <string.h>

int main()
{

    // Strings
    char name[3] = {'m', 'y', '\0'};
    char str1[65], str2[98], str3[32];
    strcpy(str1, "Harry");
    strcpy(str2, "Rohan");
    strcat(str1, str2);
    printf("%d", strcmp(str1, str2));

    return 0;
}
