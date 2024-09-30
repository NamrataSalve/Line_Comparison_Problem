import java.util.Scanner;

/*
All code for finding length or check equality and line comparison
27-sep-2024
 */
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First point x-coordinate, x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter First point y-coordinate, y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter Second point x-coordinate, x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter Second point y-coordinate y2: ");
        int y2 = sc.nextInt();
        System.out.println("Length of Line " + "(" + x1 + "," + y1 + ")" + "  " + "(" + x2 + "," + y2 + ")" + " is: " + getDistance(x1, y1, x2, y2));
    }
        static double getDistance(int x1, int y1, int x2, int y2)//Function to calculate the distance
        {
            return Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1)));//Formula
        }

}
