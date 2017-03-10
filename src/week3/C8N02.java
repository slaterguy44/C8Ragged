
package week3;

import java.util.Scanner;

public class C8N02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a 4 by 4 array row by row: ");
    double[][] array = new double[4][4];
    
    for (int i = 0; i < 4; i++)
      for (int j = 0; j < 4; j++)
        array[i][j] = sc.nextDouble();

    System.out.print("Sum of the elements in the diagonal is " 
        + sumDiagonal(array));
  }
  
  public static double sumDiagonal(double[][] array) {
    double sum = 0;

    for (int i = 0; i < array.length; i++)
        sum += array[i][i];

    return sum;
  }  
}
