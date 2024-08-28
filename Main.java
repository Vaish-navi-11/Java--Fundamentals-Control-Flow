import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int n = sc.nextInt();

        String val, day;
        if (n > 0)
            val = "Positive";
        else if (n == 0)
            val = "Negative";
        else
            val = "Zero";
        System.out.println("Input is "+val);

        switch (n) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid";
        }
        System.out.println("Today is "+day);

        System.out.println("Numbers up to input : ");
        for (int i = 1; i <= n; i++) {
            System.out.print( i + " ");
        }

        System.out.println("\nNumbers in decrement : ");
        int j = n;
        while (j != 0) {
            System.out.print(j + " ");
            j--;
        }

        System.out.print("\nPerforming do while : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 3);

    }
}
