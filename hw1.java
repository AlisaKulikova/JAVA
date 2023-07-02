import java.util.Scanner;

public class hw1 {
    public static void main(String[] arg){
        // triangularNumber(4);
        // printPirmeNumbers(1000);
        // calcMenu();
    }
    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void triangularNumber(int n){
        n=n*(n+1)/2;
        System.out.println(n);
    }

    // 2) Вывести все простые числа от 1 до 1000
    public static void printPirmeNumbers(int n){
        for (int i = 2; i <= n; i++) {
            if( primeNumbers(i)) System.out.println(i);
        }
    }

    public static boolean primeNumbers (int n) {
        for (int i = 2; i*i <= n; i++)
            if( n%i==0) return false;
        return true;    
        }
   
    // 3) Реализовать простой калькулятор
    public static void calcMenu() {
        System.out.println("Select an operation: + , - , * , / ");
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();

        switch(operation) {
            case "+":
            adittion();
            break;
            case "-":
            subtraction();
            break;
            case "*":
            muiltiplication();
            break;
            case "/":
            division();
            break;
        }
    }
    public static void adittion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter a second number: ");
        double y = sc.nextDouble();
        System.out.println(x+y);
        
    }
    private static void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter a second number: ");
        double y = sc.nextDouble();
        System.out.println(x-y);
    }
    private static void muiltiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter a second number: ");
        double y = sc.nextDouble();
        System.out.println(x*y);
    }
    private static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter a second number: ");
        double y = sc.nextDouble();
        System.out.println(x/y);
    }

    }

