
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
    }
    public static void main(String[] args)
    {
       FlowerShop flowers = new FlowerShop();
       flowers.displaySales();
    }
}
