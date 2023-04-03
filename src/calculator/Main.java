package calculator;

import java.util.Scanner;


//Extending parent class
public class Main extends Calculator {

    //Variable Declaration
    char ans;

    public static void main(String[] args) {

        //Declaring main class object
        Main main = new Main();

        //Declaring parent class object
        Calculator calculator = new Calculator();

        //Declaring scanner object
        Scanner scanner = new Scanner(System.in);

        //do while loop
        do {
            System.out.print("Please enter first number : ");
            int a = scanner.nextInt();
            System.out.print("Please enter second number : ");
            int b = scanner.nextInt();
            System.out.print("Please enter a symbol : ");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(a, b, symbol);
            System.out.print("Would you like to do more calculation, please enter \"Y\" or \"N\" : ");
            main.ans = scanner.next().charAt(0);
        } while (main.ans == 'Y' || main.ans == 'y');
        System.out.println("Thank you..!!");

        //Closing scanner object
        scanner.close();
    }

}


