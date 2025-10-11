import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press R for Rectangle or S for Square: ");
        String choice = input.next().toUpperCase();

        if (choice.equals("R")) {
            Rectangle r = new Rectangle();
            r.showDescription();
        } else if (choice.equals("S")) {
            Square s = new Square();
            s.showDescription();
        } else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}