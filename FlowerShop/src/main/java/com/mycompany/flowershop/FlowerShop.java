
package com.mycompany.flowershop;
import java.util.*;
public class FlowerShop 
{
    int[][] salesEntries = new int[7][3];
    Scanner input = new Scanner(System.in);
    void enterSales()
    {
      for(int days = 0; days < salesEntries.length - 1; days++)
      {
          for(int flowers = 0; flowers < 2; flowers++)
          {
            salesEntries[days][flowers] = input.nextInt();
          }
      }
      input.close();
    }
    void displaySales()
    {
      System.out.println("=============================================");
      System.out.println("\tFLOWER SHOP WEEKLY SALES REPORT");
      System.out.println("=============================================");
      System.out.println("\tDAY          ROSES    TULIPS    LILIES    TOTAL");
      System.out.println("------------------------------------------------");
      for(int day = 0; day < 6;day++)
      {
         switch(day)
         {
             case 0: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             case 1: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             case 2: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             case 3: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             case 4: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             case 5: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             case 6: 
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);   
             }
             break;
             default:
              System.out.println("Wrong amount of days");
             break;
         }
         System.out.println("------------------------------------------------");
      }
    }
    public static void main(String[] args)
    {
       
       
    }
}
