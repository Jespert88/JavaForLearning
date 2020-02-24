import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean quit = false;

        while (!quit) {

            Scanner firstInput = new Scanner(System.in);
            System.out.println("Choose one operator. +  -  /  *  or type quit");
            String choice = firstInput.nextLine();

            if(choice.equals("+")){

                Scanner firstNumber = new Scanner(System.in);
                System.out.println("Enter first number: ");
                String firstValue = firstNumber.nextLine();

                Scanner secondNumber = new Scanner(System.in);
                System.out.println("Enter second number: ");
                String secondValue = secondNumber.nextLine();

                double firstValueToDouble = Double.parseDouble(firstValue);
                double secondValueToDouble = Double.parseDouble(secondValue);

                double total = firstValueToDouble + secondValueToDouble;
                System.out.println(firstValueToDouble + " + " + secondValueToDouble + " = " + total);

            }
            else if (choice.equals("-")) {

                Scanner firstNumber = new Scanner(System.in);
                System.out.println("Enter first number: ");
                String firstValue = firstNumber.nextLine();

                Scanner secondNumber = new Scanner(System.in);
                System.out.println("Enter second number: ");
                String secondValue = secondNumber.nextLine();

                double firstValueToDouble = Double.parseDouble(firstValue);
                double secondValueToDouble = Double.parseDouble(secondValue);

                double total = firstValueToDouble - secondValueToDouble;
                System.out.println(firstValueToDouble + " - " + secondValueToDouble + " = " + total);

            }
            else if (choice.equals("*")) {

                Scanner firstNumber = new Scanner(System.in);
                System.out.println("Enter first number: ");
                String firstValue = firstNumber.nextLine();

                Scanner secondNumber = new Scanner(System.in);
                System.out.println("Enter second number: ");
                String secondValue = secondNumber.nextLine();

                double firstValueToDouble = Double.parseDouble(firstValue);
                double secondValueToDouble = Double.parseDouble(secondValue);

                double total = firstValueToDouble * secondValueToDouble;
                System.out.println(firstValueToDouble + " * " + secondValueToDouble + " = " + total);
            }
            else if (choice.equals("/")) {
                Scanner firstNumber = new Scanner(System.in);
                System.out.println("Enter first number: ");
                String firstValue = firstNumber.nextLine();

                Scanner secondNumber = new Scanner(System.in);
                System.out.println("Enter second number: ");
                String secondValue = secondNumber.nextLine();

                double firstValueToDouble = Double.parseDouble(firstValue);
                double secondValueToDouble = Double.parseDouble(secondValue);

                double total = firstValueToDouble / secondValueToDouble;
                System.out.println(firstValueToDouble + " / " + secondValueToDouble + " = " + total);
            }
            else if (choice.equals("quit") || choice.equals("q")) {
                break;
            }
            else {
                System.out.println("You must choose one of the four options");
            }
        }
    }
}
