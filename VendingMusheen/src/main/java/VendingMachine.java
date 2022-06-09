import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("                           I'm a machine that vends stuff, dude. What do you want from me?");
        System.out.println("                                               ------------------------");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               =========================");
        System.out.println("                                               | ==============   []   |");
        System.out.println("                                               | ==============        |");
        System.out.println("                                               |_______________________|");
        System.out.println("                                               ||                     ||");

        Scanner userInput = new Scanner(System.in);
        System.out.println("                                     I don't have all day, make a decision already..");
        userInput.nextLine();
    }
}
