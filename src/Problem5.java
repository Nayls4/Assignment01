
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int num = input.nextInt();
        int count = 0;
        int count2 = 0;
        while(num <1 || num >10)
        {
            System.out.println("Number not between 1 and 10"); 
            System.out.println("Please enter a number between 1 and 10");
            num = input.nextInt();
        }
        for(; count != num; count++)
        {
            System.out.print("*");
            for(; count2 != num - 1; count2++)
            {
                System.out.print("*");
            }
            System.out.println("");
            count2 = 0;
        }
        System.out.println("");
        }
}
