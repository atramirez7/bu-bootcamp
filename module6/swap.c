 #include <stdio.h>

void swap(int *a, int *b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

void broken_swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

/* The values do not change because broken_swap receives copies, not addresses. */

int main(void) {
	int x = 70;
	int y = 40;

	printf("Before swap: x = %d, y = %d\n", x, y);
	swap(&x, &y);
	printf("After swap:  x = %d, y = %d\n", x, y);

	int first = 10;
	int second = 20;
	printf("Before broken swap: first = %d, second = %d\n", first, second);
	broken_swap(first, second);
	printf("After broken swap:  first = %d, second = %d\n", first, second);

	return 0;
}
