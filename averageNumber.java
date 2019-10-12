import java.util.Scanner;

public class averageNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, total = 0, count = 0;

        double average;

        String x = "Enter any amount of integers: ";
        System.out.println(x);
        int number;

        while ((number = input.nextInt()) != 0) {
            total += number;
            count++;
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        average = (double) total / count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.printf("The average is: " + average);
    }
}