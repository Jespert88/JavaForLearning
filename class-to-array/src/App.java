import java.util.ArrayList;
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
        Integer convertAge = Integer.parseInt(userAge);

        Person personObj = new Person(userNameVal, userLastnameVal, convertAge);
        ArrayList<Person> people = new ArrayList<>();
        people.add(personObj);
        System.out.println(people);

    }
}
