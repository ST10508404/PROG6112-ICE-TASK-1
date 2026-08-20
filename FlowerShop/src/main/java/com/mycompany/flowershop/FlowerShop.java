
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
            System.out.println("Please Enter Sales for: ");
            salesEntries[days][flowers] = input.nextInt();
          }
      }
      input.close();
    }
    void displaySales()
    {
      int total = 0;
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
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]); 
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             case 1: 
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             case 2: 
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]); 
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             case 3:
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);  
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             case 4:
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             case 5: 
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             case 6: 
             total = 0;
             System.out.println("Monday");
             for(int flower = 0; flower < 2; flower++)
             {
              System.out.print("\t" + salesEntries[day][flower]);  
              total += salesEntries[day][flower];
             }
             System.out.print("\t" + total);
             break;
             default:
              System.out.println("Wrong amount of days");
             break;
         }
         System.out.println("------------------------------------------------");
      }
    }
    void calculateBouquetSales()
    {
       int totalRoses =0, totalTulips = 0, totalLillies = 0, totalSales = 0;
       
       for(int day = 0; day < 0; day++){
         for(int flower = 0; flower < 2; flower++)
         {
           switch(flower)
           {
               case 0:
                totalRoses += salesEntries[day][flower];
                totalSales += salesEntries[day][flower];
               break;
               case 1:
                totalTulips += salesEntries[day][flower];
                totalSales += salesEntries[day][flower];
               break;
               case 3:
                totalLillies += salesEntries[day][flower];
                totalSales += salesEntries[day][flower];
               break;
           }    
         }
       }
      System.out.println("TOTAL");
      System.out.print("\t" + totalRoses);
      System.out.print("\t" + totalTulips);
      System.out.print("\t" + totalLillies);
      System.out.print("\t" + totalSales);
      System.out.println("");
      System.out.println("");
      System.out.println("Total sales for Roses: R" + totalRoses);
      System.out.println("Total sales for Tulips: R" + totalTulips);
      System.out.println("Total sales for Tulips: R" + totalLillies);
      System.out.println("");
    }
    void calculateDailySales()
    {
       int[] dailyTotals = new int[7];
       for(int day = 0; day < 6; day++)
       {
           for(int flower = 0; flower < 2; flower++)
           {
              dailyTotals[day] += salesEntries[day][flower];
           }
           switch(day)
           {
               case 0:
                   System.out.println("Total sales for Monday: R " + dailyTotals[day]);
               break;
               case 1:
                   System.out.println("Total sales for Tuesday: R " + dailyTotals[day]);
               break;
               case 2:
                   System.out.println("Total sales for Wednesday: R " + dailyTotals[day]);
               break;
               case 3:
                   System.out.println("Total sales for Thursday: R " + dailyTotals[day]);
               break;
               case 4:
                   System.out.println("Total sales for Friday: R " + dailyTotals[day]);
               break;
               case 5:
                   System.out.println("Total sales for Saturday: R " + dailyTotals[day]);
               break;
               case 6:
                   System.out.println("Total sales for Sunday: R " + dailyTotals[day]);
               break;
           }
       }
    }
    void calculateTotalSales()
    {
        int totalSales = 0;
   
      for(int day = 0; day < 6; day++)
       {
         for(int flower = 0; flower < 2; flower++)
           {
              totalSales += salesEntries[day][flower];
           }   
       }
      System.out.println(""); 
      System.out.println("Overall Total Sales: R " + totalSales);
    }
    public static void main(String[] args)
    {
       
       
    }
}
