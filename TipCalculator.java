
/*
Lina Breunlin
CIS 1633 AA Java
October 13, 2019
This program calculates a 15%, 20% and 25% for a restaurant meal at different price points incremented by $10 from original price

Test Data

Inputs (baseprice)          Outputs (price, 15%, 20%, 25% respectively)      Passed?
 10...100                    1.50, 2.00, 2.50....15.00, 20.00,25.00             Y
 15.50...105.50              2.32, 3.10, 3.88......15.83,21.10, 26.38           Y
123....213                   18.45,24.60,30.75....31.95,42.60,53.25             Y
5                            Error Message                                      Y
-10                          Error Message                                      Y
Five                         Error Message                                      Y
ggg                          Error Message                                      Y
*/


package tipcalculator;
import java.util.Scanner;



public class TipCalculator {

    public static void main(String[] args) {
         
     //declare variables
     
     double basePrice = 0.0;
     double newPrice = 0.0;
     int i =0;
     int j =0;
     double tipAmount = 0.0;
     double percent = 0.0;
     
     //declare constants
     
     final double PERCENT_JUMP = 0.05;
     final int TIP_CATEGORY = 10;
     final int PERCENT_CATEGORY = 3;
     final double PERCENT = 0.15;
     final double PRICE_JUMP = 10.00;

     
     //get user input
    
    Scanner in = new Scanner (System.in);
    
    System.out.print ("Please enter the base price of your meal:");

    //test that input data is valid
    
   if (in.hasNextDouble()) 
    {
        basePrice = in.nextDouble();
        
               if (basePrice >= 10)
               {
                    System.out.println();
   
                    System.out.println("-----------------------------------------------------------------");

                    System.out.println("    -----| Artichoke Grill Complimentary Tip Calculator |-----           ");
   
                    System.out.println("-----------------------------------------------------------------");
 
                    System.out.println(" " + "Price"  +  "              "  +  "15%" + "               " + "20%" + "               " + "25%");
   
                    System.out.println("-----------------------------------------------------------------");
   
                    System.out.println(); 
                   
                   /*
                    Outer Loop
                    i = LCV
                    TIP_CATEGORY = SV (want 10 different price points. TIP_CATEGORY initialized to 10)
                    compare i to TIP_CATEGORY and increment by 1 for each loop iteration to get 10 different price points
                    */

                      for (i = 1; i <= TIP_CATEGORY; ++i)
                        { 
                          newPrice = basePrice;
                          
                          percent = PERCENT;
                            
                          System.out.printf ("$" + "%6.2f",newPrice); //display base prices
                          
                          System.out.print ("      ");                  
                            
                              /*
                                Inner Loop
                                j = LCV
                                PERCENT_CATEGORY = SV (PERCENT_CATEGORY initialized to 3. Want 3 different percent points that
                                get 0.05 added each time for 15, 20 and 25%)
                                compare j to PERCENT_CATEGORY and increment by 1
                              */
                              
   
                            for (j=1; j<=PERCENT_CATEGORY; j++)
                                {
                                  
                                 tipAmount = basePrice * percent;
                                 
                                System.out.print ("      ");
                                
                                System.out.printf ("$" + "%5.2f",tipAmount);

                                System.out.print ("      ");

                                percent = percent + PERCENT_JUMP;

                                }   
  
                           basePrice = basePrice + PRICE_JUMP; //add 10 to base price for next set of tips so that it is set for next loop iteration
                           
                           System.out.println();
                           
                           System.out.println();
                        }
                   System.out.println("-----------------------------------------------------------------------------");
                   
                   System.out.println("Thank you for dining at the Artichoke Grill. We hope to see you again soon!");
                   
                   System.out.println("-----------------------------------------------------------------------------");
                }
               else
                {
                   System.out.println("Error. $10.00 is the minumum meal price.");
                }
    }         
    else 
     {
        System.out.println ("Error. Meal price must be a number.");  
     } 
   
   }
}

