package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class View {

    Scanner scan = new Scanner(System.in);

    public View() {
        System.out.println("Welcome to the calculator! \nWe can add, subtract, multiply and divide.");
    }

    public int provideFirstNumber() {
        System.out.println("Enter first number");
        //if (scan.hasNextInt()){
        assert scan.hasNextInt();
        int a = scan.nextInt();
            return a;
      //  } else {

            //throw new AssertionError("Please provide a number");
       // }

    }

    public int provideSecondNumber() {
        System.out.println("Enter second number");
        int b = scan.nextInt();
        return b;
    }

    public String provideSign() throws IOException {
        System.out.println("Enter +, -, * or /");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String sign = reader.readLine();
        //String sign = scan.next();
        return sign;
    }

    public void result(double a, double b, String sign, double result){
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }

    public boolean isDigit(Object obj){
       // assert obj. : "Please, provide a number";
        return true;
    }


    public boolean close() {
        System.out.println("Do you want to calculate something else? Enter y or n");
        String answer = scan.next();
        if (answer.equals("n")) {
            System.out.println("Bye!");
            scan.close();
            return true;
        }
        else if (answer.equals("y"))
            return false;
        else {
            System.out.println("Calculator has to be closed");
            return true;
        }
    }
}
