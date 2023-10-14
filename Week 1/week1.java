import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class week1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // DateOfBirth(reader);

        interest(reader);
        
        feetToMiles(reader);

        Hello(reader);

        Maths(reader);

        Age(reader);

        reader.close();
    }

    static void Hello(Scanner reader) {

        System.out.println("Hello World");
        System.out.println("Enter name:");

        String name = reader.nextLine();
        System.out.println("Hello " + name);
        
    }

    static void Maths(Scanner reader) {
        System.out.println("Enter width:");
        String width = reader.nextLine();

        System.out.println("Enter height:");
        String height = reader.nextLine();

        System.out.println("Area = " + Integer.valueOf(width) * Integer.valueOf(height));
        System.out.println("Perimeter = " + 2 * (Integer.valueOf(width) + Integer.valueOf(height)));

        System.out.println("Enter first number:");
        String num1 = reader.nextLine();

        System.out.println("Enter second number:");
        String num2 = reader.nextLine();

        System.out.println("Average = " + (Integer.valueOf(num1) + Integer.valueOf(num2)) / 2);

        System.out.println("Enter first number:");
        String firstNum = reader.nextLine();

        System.out.println("Enter second number:");
        String secondNum = reader.nextLine();

        System.out.println(firstNum + " " +secondNum);
        System.out.println(secondNum + " " + firstNum);

    }

    static void Age(Scanner reader) {
        System.out.println("Enter your age:");
        String age = reader.nextLine();
        Integer ageInt = Integer.valueOf(age);

        final int CURRENT_YEAR = 2023;

        System.out.println(CURRENT_YEAR - ageInt);
        
    }

/*     static void DateOfBirth(Scanner reader) {
        System.out.println("Enter your DOB:");
        String dob = reader.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  

        long diffInDays = ChronoUnit.DAYS.between(now, dtf.format(date));

        System.out.println(diffInDays);
    } */

    static void feetToMiles(Scanner reader) {

        System.out.println("How many feet");
        String ans = reader.nextLine();
        Integer feet = Integer.valueOf(ans);

        System.out.println("There are " + feet / 5280 + " miles in " + ans + " feet");
        

    }

    static void interest(Scanner reader) {

        System.out.println("Enter a deposit: ");
        String deposit = reader.nextLine();

        System.out.println("You will earn " + Integer.valueOf(deposit) * 1.01 + " in a year.");
    }
}