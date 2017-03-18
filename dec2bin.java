
/**
 * @date 2017. 3. 17.
 * @file dec2bin.java
 * @author Jho
 */

import java.util.Scanner;

public class dec2bin {

       public static void main(String[] args) {
             // TODO Auto-generated method stub
             Scanner scan = new Scanner(System.in);
            
             // Scan a integer to convert
             int iNum;
             do
             {
                    System.out.print("Enter a postive integer >> ");
                    iNum = scan.nextInt();
             } while(iNum<0||iNum>2147483647);
            
             // Print a intger in binary representaion
             int iCount = 0;
             int iTemp = 0;
             int iPoint = 0;
             for(int j=31;j>=0;j--)
             {
                    iTemp = (iNum>>>j)%2;
                    if(iTemp==1)
                           iCount++;
                    System.out.print(iTemp);
                    if (++iPoint%4 == 0)
                           System.out.print(" ");
             }
            
             // Print a count of '1'
             System.out.println();
             if(iCount == 0)     System.out.println("There is no '1'. ");
             if(iCount == 1)     System.out.print("There is one '1'.");
             else                System.out.print("There are " + iCount + " '1's. ");
            
       }

}
