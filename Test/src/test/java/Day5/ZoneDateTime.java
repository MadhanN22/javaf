package Day5;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class ZoneDateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Zone ID (e.g. Asia/Tokyo): ");
        String zone = sc.nextLine();
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Current Date and Time in " + zone + ": " + zdt);
        sc.close();
    }
}
