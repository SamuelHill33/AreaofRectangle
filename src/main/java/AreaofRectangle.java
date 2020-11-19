import java.util.Scanner;

public class AreaofRectangle {

    public static int AreaRect(int width, int height) {
        int area = width * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the width of the rectangle");
        int width = sc.nextInt();
        System.out.println("please enter the length of the rectangle");
        int height = sc.nextInt();
        System.out.println("The area of the rectangle is " + AreaRect(width, height));

    }

}
