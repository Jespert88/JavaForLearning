import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try{
            Scanner firstInput = new Scanner(System.in);
            System.out.println("What do you wanna convert?");
            System.out.println("Press 1  (Kg --> pounds)");
            System.out.println("Press 2  (Pounds --> kg)");
            String choice = firstInput.nextLine();

            // Kg to pounds
            if (choice.equals("1")) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter kg: ");

                String userVal = input.nextLine();
                double convertUserVal = Double.parseDouble(userVal);

                double pounds = 2.2046;
                double kg = convertUserVal * pounds;

                System.out.println(convertUserVal + "kg" + " = " + kg + " pounds");
            }

            // Pounds to kg
            else if (choice.equals("2")) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter pounds: ");

                String userVal = input.nextLine();
                double convertUserVal = Double.parseDouble(userVal);

                double pound = 0.454; //gram
                double kg = convertUserVal * pound; //pounds in kg

                System.out.println(convertUserVal + " kg " + " = " + kg + " pounds");
            }

            else {
                System.out.println("Wrong input, try again!");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
