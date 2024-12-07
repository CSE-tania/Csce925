package homework01;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Collect user information
        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your Age (in years): ");
        int age = input.nextInt();  // Input user's age

        // Calculating birth year
        int currentYear = 2024;  // Assuming current year is 2024
        int birthYear = currentYear - age;

        System.out.print("Enter your Phone Number (without dashes or parentheses): ");
        String phone = input.next();  // Input phone number

        System.out.print("Enter your Major: ");
        String major = input.next();  // Input major

        System.out.print("Enter your Year (Freshman, Sophomore, Junior, Senior): ");
        String year = input.next();  // Input academic year

        System.out.print("Enter Today's Date (mm/dd/yyyy): ");
        String date = input.next();  // Input today's date

        // Additional user questions
        input.nextLine();  // Consume the leftover newline
        System.out.print("What's your favorite hobby? ");
        String hobby = input.nextLine();  // Input hobby

        System.out.print("What's your dream travel destination? ");
        String dreamDestination = input.nextLine();  // Input dream destination

        System.out.print("What's your lucky number? ");
        int luckyNumber = input.nextInt();  // Input lucky number

        // Convert date to European format (dd.mm.yyyy)
        String[] dateParts = date.split("/");
        String europeanDate = dateParts[1] + "." + dateParts[0] + "." + dateParts[2];

        // Format phone number
        String formattedPhone = "(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6);

        // Display the formatted information
        System.out.println("\n----- User Information -----");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " (Birth Year: " + birthYear + ")");
        System.out.println("Phone: " + formattedPhone);
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
        System.out.println("Today's Date (European format): " + europeanDate);
        System.out.println("Favorite Hobby: " + hobby);
        System.out.println("Dream Travel Destination: " + dreamDestination);
        System.out.println("Lucky Number: " + luckyNumber);

        // Interesting intro about the user
        System.out.println("\nInteresting Facts:");
        System.out.println(firstName + " " + lastName + " is " + age + " years old and pursuing " + major + " as a " + year + ".");
        System.out.println(firstName + " loves to " + hobby + " and dreams of visiting " + dreamDestination + " one day.");
        System.out.println("Their lucky number is " + luckyNumber + ", and you can contact them at " + formattedPhone + ".");
       
        // Close scanner
        input.close();
    }

	



	}


