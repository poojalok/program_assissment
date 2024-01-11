import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program_assessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the time in 12-hour format (hh:mm:ss AM/PM): ");
        String inputTime = scanner.nextLine();

        try {
           
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(inputTime);

           
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            String militaryTime = outputFormat.format(date);

           
            System.out.println("Military Time: " + militaryTime);
        } catch (ParseException e) {
            System.out.println("Invalid input format. Please enter the time in the correct format.");
        }
    }
}
