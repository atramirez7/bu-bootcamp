# `printf` Format Specifiers

| Specifier | Meaning |
| --- | --- |
| `%d` | Integer |
| `%f` | Floating-point number (`double`) |
| `%c` | Character |
| `%s` | String |
| `%p` | Pointer address |
| `%x` | Integer in hexadecimal |

## Formatted Output with `printf`

The following program demonstrates the most common format specifiers. Each line shows one specifier and what it produces.

```c
#include <stdio.h>

int main() {
    int    count  = 7;
    double ratio  = 3.14159;
    char   letter = 'G';

    printf("Count:  %d\n",      count);    /* integer */
    printf("Ratio:  %.3f\n",    ratio);    /* float, 3 decimal places */
    printf("Letter: %c\n",      letter);   /* single character */
    printf("Hex:    %x\n",      count);    /* integer in hexadecimal: 7 */
    printf("Width:  %8d\n",     count);    /* right-aligned in 8 characters */
    printf("%s\n", "a string");            /* string */

    return 0;
}
```

Add a number between `%` and the letter to control width or precision:

- `%8d` sets a minimum field width of 8 characters.
- `%.3f` displays 3 digits after the decimal point.
