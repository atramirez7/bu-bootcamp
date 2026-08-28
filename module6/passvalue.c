#include <stdio.h>

/* Pass by value: the function gets a copy. Original is unchanged. */
void try_double_value(int x) {
    x = x * 2;
    printf("Inside function: %d\n", x);
}

/* Pass by pointer: the function gets the address. Can modify the original. */
void actually_double(int *x) {
    *x = *x * 2;
}

int main() {
    int n = 5;

    try_double_value(n);
    printf("After by-value:   %d\n", n);   /* still 5 */

    actually_double(&n);
    printf("After by-pointer: %d\n", n);   /* now 10 */

    return 0;
}
