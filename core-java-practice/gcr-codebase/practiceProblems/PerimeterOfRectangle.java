package gcrCodebase;

import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        int perimeter = 2 * (l + b);
        System.out.println("Perimeter = " + perimeter);
    }
}
