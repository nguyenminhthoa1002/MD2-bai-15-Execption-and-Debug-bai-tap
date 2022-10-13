package baiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0;
        try {
            System.out.println("Enter side a: ");
            a = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter side b: ");
            b = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter side c: ");
            c = Float.parseFloat(scanner.nextLine());
        } catch (Exception exception) {
            System.err.println("Please enter number");
        }
        if (a+b<c||a+c<b||b+c<a||a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("This is NOT 3 side of a Triangle ");
        } else {
            System.out.println("This is 3 side of a Triangle ");
        }
    }
}