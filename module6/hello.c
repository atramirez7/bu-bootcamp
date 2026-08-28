#include <stdio.h>

/* #include <stdio.h> — This is a preprocessor directive. It tells gcc to include the Standard Input/Output (Standard I/O) */
/* library before compiling. stdio.h provides printf and scanf. Without it, the compiler does not know what printf means. */

int main() {
  printf("Hello from C!\n");
  return 0;
}

/* int main() — The entry point of every C program. Returns an int to the operating system: 0 means success, any other value means an error occurred. */

/* printf("Hello from C!\n") — Prints text to the terminal. The \n is a newline character. printf does not add one automatically, unlike Java’s System.out.println. */

/* return 0 — Tells the operating system the program finished successfully. */
