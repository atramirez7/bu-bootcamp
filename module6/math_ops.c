#include <stdio.h>

void print_math(int a, int b);

int main() {
  int a, b;

  printf("Enter first number: ");
  scanf("%d", &a);
  printf("Enter second number: ");
  scanf("%d", &b);
  print_math(a, b);

  return 0;
}

void print_math(int a, int b) {
  printf("Sum: %d\n", a + b);
  printf("Product: %d\n", a * b);
}
