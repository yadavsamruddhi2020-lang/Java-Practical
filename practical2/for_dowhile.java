// Calculating the sum of natural numbers.
// import java.util.Scanner;
// class SumOfNaturalNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         int i = 1;

//         do {
//             sum += i;
//             i++;
//         } while (i <= n);

//         System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

//         sc.close();
//     }
// }

// =================================================
// •	Printing alphabets from A to Z.
// import java.util.Scanner;
// class PrintAlphabets {  
//     public static void main(String[] args) {
//         char ch = 'A';

//         System.out.println("Alphabets from A to Z:");

//         do {
//             System.out.print(ch + " ");
//             ch++;
//         } while (ch <= 'Z');
//     }
// }

// ==================================================
// •	Finding the factorial of a number.
// import java.util.Scanner;
// class Factorial {           
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int n = sc.nextInt();

//         int factorial = 1;
//         int i = 1;

//         do {
//             factorial *= i;
//             i++;
//         } while (i <= n);

//         System.out.println("The factorial of " + n + " is: " + factorial);

//         sc.close();
//     }
// }
// ==================================================
// •	Generating a multiplication table
// import java.util.Scanner;
// class MultiplicationTable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number to generate its multiplication table: ");
//         int n = sc.nextInt();

//         int i = 1;

//         System.out.println("Multiplication table of " + n + ":");

//         do {
//             System.out.println(n + " x " + i + " = " + (n * i));
//             i++;
//         } while (i <= 10);

//         sc.close();
//     }
// }

// ==================================================
// •	Printing the Fibonacci series.
// import java.util.Scanner;
// class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("Enter the number of terms in the Fibonacci series: ");
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         int count = 0;
//         System.out.println("Fibonacci series:");
//         do {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//             count++;
//         } while (count < n);
//         sc.close();
//     }
// }
// ==================================================
// •	Reversing a number
// import java.util.Scanner;
// class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive integer: ");
//         int n = sc.nextInt();
//         int reversed = 0;
//         do {
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//             n /= 10;
//         } while (n != 0);
//         System.out.println("Reversed number: " + reversed);
//         sc.close();
//     }
// }
// ==================================================
// •	Checking if a number is a palindrome.
// import java.util.Scanner;
// class PalindromeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive integer: ");
//         int n = sc.nextInt();
//         int original = n;
//         int reversed = 0;
//         do {
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//             n /= 10;
//         } while (n != 0);
//         if (original == reversed) {
//             System.out.println(original + " is a palindrome.");
//         } else {
//             System.out.println(original + " is not a palindrome.");
//         }
//         sc.close();
//     }
// }
// ==================================================
// •	Determining if a number is prime.
import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        int i = 2;

        if (n <= 1) {
            isPrime = false;
        } else {
            do {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(n));
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}