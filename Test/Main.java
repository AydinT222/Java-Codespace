import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.print("Enter in the number of milliseconds you want to calculate: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int value = Integer.parseInt(br.readLine()); // why wont you CAST TO INT
            int s_value = value / 1000;
            int hours = s_value / 3600;
            int mins = (s_value % 3600) / 60;
            int seconds = (s_value % 3600) % 60;
            int milli = value % 1000;
            System.out.println("Returning value: "
                + hours + " hours, "
                + mins + " minutes, "
                + seconds + " seconds, and "
                + milli + " milliseconds.");
        } catch (Exception e) {
            if (e.hashCode() == 349885916) {
                System.out.println("You must enter in a number!");
            } else {
                System.out.println(e.getMessage());
            }
            System.exit(1);
        }
    }
}