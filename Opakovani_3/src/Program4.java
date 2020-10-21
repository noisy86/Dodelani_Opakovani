import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        ArrayList<Double> allMyNums = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Count of numbers: ");
        int count = input.nextInt();
        System.out.println("Enter numbers");
        for (int i = 0; i < count; i++) {
            double cisla = input.nextDouble();
            allMyNums.add(cisla);
        }
        boolean t = true;
        while (t == true){
            System.out.println("Enter num: ");
            double test = input.nextDouble();
            if (allMyNums.contains(test)){
                System.out.println(allMyNums.indexOf(test) + 1);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
