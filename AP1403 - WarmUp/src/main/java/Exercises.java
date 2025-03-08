public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        if (n < 0) return -1; // Negative numbers cannot be in Fibonacci sequence

        long a = 0, b = 1, index = 0;

        while (a <= n) {
            if (a == n) return index; // If the number is found, return the index
            long temp = b;
            b = a + b;
            a = temp;
            index++;
        }

        return -1; // If the number is not in the Fibonacci sequence
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        if (n == 0) return new char[0][];

        char[][] triangle = new char[n][];
        for(int i = 0; i < n; i++) {
            triangle[i] = new char[i+1];
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (i == n - 1) { // Last row should be all asterisks
                    triangle[i][j] = '*';
                } else if (j == 0 || j == i) { // First and last columns should be asterisks
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }

        return triangle;
    }


    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        // Test prime checker

        }
    }

