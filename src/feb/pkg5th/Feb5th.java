/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feb.pkg5th;

import java.util.Scanner;

/**
 *
 * @author rciarl8967
 */
public class Feb5th {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        System.out.println("Choose to calculate one of these please:");
        System.out.println(" 1- Area of square");
        System.out.println(" 2- Area of rectangle");
        System.out.println(" 3- Area of circle");
        option = input.nextInt();

        if (option == 1) {
            System.out.println("What is the length of the square?");
            double lengthSquare = input.nextDouble();
            double areaSquare = lengthSquare * lengthSquare;
            System.out.println("The area of the square is: " + areaSquare);
        }

        if (option == 2) {
            System.out.println("What is the length of the rectangle?");
        
        double lengthRectangle = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        double widthRectangle = input.nextDouble();
        double areaRectangle = lengthRectangle * widthRectangle;
        System.out.println("The area of the rectangle is:" + areaRectangle);
    }
        if (option == 3) {
            System.out.println("What is the radius of the circle? ");
            double radiusCircle = input.nextDouble();
            double areaCircle = 3.14 * radiusCircle * radiusCircle;
            System.out.println("The area of the circle is: " + areaCircle);

        }

    }
}
