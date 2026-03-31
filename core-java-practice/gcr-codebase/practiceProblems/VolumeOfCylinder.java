package gcrCodebase;

import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        int pi = 22 / 7;
        int volume = pi * r * r * h;

        System.out.println("Volume of Cylinder = " + volume);
    }
}
