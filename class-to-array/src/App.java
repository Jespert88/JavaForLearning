import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("What are your name: ");
        String userNameVal = name.nextLine();

        Scanner lastname = new Scanner(System.in);
        System.out.println("What are your lastname: ");
        String userLastnameVal = lastname.nextLine();

        Scanner age = new Scanner(System.in);
        System.out.println("What are your age: ");
        String userAge = age.nextLine();
        int convertAge = Integer.parseInt(userAge);

        Person CreateNewPerson = new Person(userNameVal, userLastnameVal, convertAge);
        String convertedToString = CreateNewPerson.toString();

        ArrayList<String> people = new ArrayList<String>();
        people.add(convertedToString);

        System.out.println(people);

    }

}
