#include <stdio.h>

#define PI 3.14159
#define FACTOR 2

// Function to display values
void ShowValues(int x, int y) {
    int d, e, f, g;
    float r2, r3, r4, r5;

    printf("First value: %d\n", x);
    printf("Second value: %d\n", y);
}

// Function to multiply two integers
int Multiply(int n1, int n2) {
    return n1 * n2;
}

// Function to calculate the area of a circle
float CircleArea(float radius) {
    return PI * radius * radius;
}

int main() {
    int a, b, c;
    float r, area;

    a = 5;
    b = 10;
    c = Multiply(a, b);

    ShowValues(a, c);

    r = 7.5;
    area = CircleArea(r);

    printf("Radius: %.2f\n", r);
    printf("Area of circle: %.2f\n", area);
    printf("Constant factor: %d\n", FACTOR);

    return 0;
}
