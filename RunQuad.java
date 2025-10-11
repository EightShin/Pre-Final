import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press R (Rectangle), S (Square), P (Parallelogram), H (Rhombus), or T (Trapezoid): ");
        String choice = input.next().toUpperCase();

        Quadrilateral quad;

        switch (choice) {
            case "R":
                quad = new Rectangle();
                break;
            case "S":
                quad = new Square();
                break;
            case "P":
                quad = new Parallelogram();
                break;
            case "H":
                quad = new Rhombus();
                break;
            case "T":
                quad = new Trapezoid();
                break;
            default:
                System.out.println("Invalid choice!");
                input.close();
                return;
        }
        quad.showDescription();
        input.close();
    }
}