import java.util.Scanner;
public class sedmi {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter cislo");

        int delitelne = myObj.nextInt();  // Read user input

        if (delitelne % 7 == 0)
            System.out.println("cislo" + "  " + delitelne + "  " + "je delitelne 7");
        else
            System.out.println("neni");
    }
}
