import java.util.Scanner;

public class programRectangle {
    public static void main(String[] args) {
        float width = 10;
        float height = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: " + width);
        width = scanner.nextFloat();

        System.out.println("Enter height: " + height);
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
