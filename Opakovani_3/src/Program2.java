import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        double mediana;
        List<Double> allMyNums = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Count of numbers: ");
        int count = input.nextInt();
        System.out.println("Enter numbers");
        for (int i = 0; i < count; i++) {
            double cisla = input.nextDouble();
            allMyNums.add(cisla);
        }
        Collections.sort(allMyNums);
        if (allMyNums.size() % 2 == 0) {
            mediana = (allMyNums.get(allMyNums.size() / 2 - 1)) / (allMyNums.get(allMyNums.size() / 2));

        } else {
            mediana = (allMyNums.get(allMyNums.size() / 2));
        }
        System.out.println(mediana);
    }
}
