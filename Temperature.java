import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp[] = new double[30];
        double sum = 0;
        System.out.println("Enter temperatures for 30 days:");
        for (int i = 0; i < 30; i++) {
            temp[i] = sc.nextDouble();
        }
        double highest = temp[0];
        double lowest = temp[0];
        int hotDays = 0;
        for (int i = 0; i < 30; i++) {
            sum += temp[i];
            if (temp[i] > highest) {
                highest = temp[i];
            }
            if (temp[i] < lowest) {
                lowest = temp[i];
            }
            if (temp[i] > 35) {
                hotDays++;
            }
        }
        double average = sum / 30;
        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);
        System.out.println("Average Temperature: " + average);
        System.out.println("Number of Hot Days (>35): " + hotDays);
    }
}