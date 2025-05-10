#include <stdio.h>

#define PI 3.14159
#define FACTOR 2

  int a, b, c;
  float r, area;

void ShowValues(int x, int y) {
  int d, e, f, g;
  float r2, r3, r4, r5;
  printf("First value:  %f \n", x);
  printf("Second value:  %f \n", y);
}

int Multiply(int n1, int n2) {
  int n2;
  return n1*n2;
}

float CircleArea(float radius) {
  return PI*radius*radius;
}

void main(void) {
  a = 5;
  b = 10;
  c = Multiply(a,b);
  ShowValues(a,c);
  r = 7.5;
  area = CircleArea(r);
  printf("Radius:  %f \n", r);
  printf("Area of circle:  %f \n", area);
  printf("Constant factor:  %f \n", FACTOR);
  return 0;
}
