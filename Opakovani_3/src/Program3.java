import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        double sum = 0;
        double prumer = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Count of numbers: ");
        int count = input.nextInt();
        System.out.println("Enter numbers");
        for (int i = 0; i < count; i++) {
            double cisla = input.nextDouble();
            sum += cisla;
        }
        prumer = sum/count;
        System.out.println(prumer);
    }
}
