import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mile = 1.609344; //1 mile = 1.609344 kilometers.
        double km = 0.621371192; //1 kilometer = 0.621371192 miles.
        Scanner firstInput = new Scanner(System.in);
        System.out.println("What do you wanna convert?");
        System.out.println("Press 1 (mile in km)");
        System.out.println("Press 2 (km in mile)");

        String inputVal = firstInput.nextLine();
        switch(inputVal)
        {
            case "1":
                Scanner mileInput = new Scanner(System.in);
                System.out.println("Enter miles: ");
                String mileInputVal = mileInput.nextLine();

                // Formula to convert mile into km.
                double convertMileToKm = Double.parseDouble(mileInputVal);
                System.out.println(convertMileToKm);
                double firstCal = convertMileToKm / 5;
                double calValue = firstCal * 8;
                System.out.println(convertMileToKm + " miles = " + calValue + " km");
                break;
            case "2":
                Scanner kmInput = new Scanner(System.in);
                System.out.println("Enter km: ");
                String kmInputVal = kmInput.nextLine();

                // Formula to convert km into mile.
                double convertKmToMile = Double.parseDouble(kmInputVal);
                System.out.println(convertKmToMile);
                double kmFirstCal = convertKmToMile / 8;
                double kmCalValue = kmFirstCal * 5;
                System.out.println(convertKmToMile + " km = " + kmCalValue + " miles");
                break;
            default:
                System.out.println("You must enter 1 or 2..");
                System.out.println("Ending program");

        }
    }
}
