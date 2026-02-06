// import java.util.Scanner;

// class PositiveNegativeZero {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num > 0) {
//             System.out.println("Positive number");
//         } else if (num < 0) {
//             System.out.println("Negative number");
//         } else {
//             System.out.println("Zero");
//         }

//         sc.close();
//     }
// }

// ==================================================
// •	Determine if a number is even or odd.
// import java.util.Scanner;
// class EvenOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("Even number");
//         } else {
//             System.out.println("Odd number");
//         }

//         sc.close();
//     }
// }
// ==================================================
//•	Check if a character is a vowel or consonant.
// import java.util.Scanner;
// class VowelConsonant {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);

//         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
//             ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//             System.out.println("Vowel");
//         } else {
//             System.out.println("Consonant");
//         }

//         sc.close();
//     }
// }

// ==================================================
//  •	Find the largest of three numbers.
// import java.util.Scanner;   
// class LargestOfThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int num3 = sc.nextInt();

//         int largest;

//         if (num1 >= num2 && num1 >= num3) {
//             largest = num1;
//         } else if (num2 >= num1 && num2 >= num3) {
//             largest = num2;
//         } else {
//             largest = num3;
//         }

//         System.out.println("The largest number is: " + largest);

//         sc.close();
//     }
// }

// ==================================================
// •	Check if a year is a leap year or not.
// import java.util.Scanner;
// class LeapYear {    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         boolean isLeapYear;

//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     isLeapYear = true;
//                 } else {
//                     isLeapYear = false;
//                 }
//             } else {
//                 isLeapYear = true;
//             }
//         } else {
//             isLeapYear = false;
//         }

//         if (isLeapYear) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         sc.close();
//     }
// }
// ==================================================
// •	Create a simple calculator, often utilizing switch statements.
// import java.util.Scanner;
// class SimpleCalculator {    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();

//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();

//         System.out.print("Enter an operator (+, -, *, /): ");
//         char operator = sc.next().charAt(0);

//         double result;

//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Error: Division by zero");
//                     sc.close();
//                     return;
//                 }
//                 break;
//             default:
//                 System.out.println("Error: Invalid operator");
//                 sc.close();
//                 return;
//         }

//         System.out.println("The result is: " + result);

//         sc.close();
//     }
// }