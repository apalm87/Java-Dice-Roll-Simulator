import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DiceRollSim
{

   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      Random r = new Random();

      //store the number of total input Rolls, also used on denominator on division
      ArrayList<Integer> total = new ArrayList<Integer>();

      //counter arrays to help with the numerator on division
      ArrayList<Integer> two = new ArrayList<Integer>();
      ArrayList<Integer> three = new ArrayList<Integer>();
      ArrayList<Integer> four = new ArrayList<Integer>();
      ArrayList<Integer> five = new ArrayList<Integer>();
      ArrayList<Integer> six = new ArrayList<Integer>();
      ArrayList<Integer> seven = new ArrayList<Integer>();
      ArrayList<Integer> eight = new ArrayList<Integer>();
      ArrayList<Integer> nine = new ArrayList<Integer>();
      ArrayList<Integer> ten = new ArrayList<Integer>();
      ArrayList<Integer> eleven = new ArrayList<Integer>();
      ArrayList<Integer> twelve = new ArrayList<Integer>();

      //counting stars
      ArrayList<String> starCount2 = new ArrayList<String>();
      ArrayList<String> starCount3 = new ArrayList<String>();
      ArrayList<String> starCount4 = new ArrayList<String>();
      ArrayList<String> starCount5 = new ArrayList<String>();
      ArrayList<String> starCount6 = new ArrayList<String>();
      ArrayList<String> starCount7 = new ArrayList<String>();
      ArrayList<String> starCount8 = new ArrayList<String>();
      ArrayList<String> starCount9 = new ArrayList<String>();
      ArrayList<String> starCount10 = new ArrayList<String>();
      ArrayList<String> starCount11 = new ArrayList<String>();
      ArrayList<String> starCount12 = new ArrayList<String>();

      //Number of rolls
      int numRolls = 0;
      
      //Die 1, 2, and total
      int die1 = 0;
      int die2 = 0;
      int dieTotal = 0;

      //division totals per number
      double twoTotal = 0;
      double threeTotal = 0;
      double fourTotal = 0;
      double fiveTotal = 0;
      double sixTotal = 0;
      double sevenTotal = 0;
      double eightTotal = 0;
      double nineTotal = 0;
      double tenTotal = 0;
      double elevenTotal = 0;
      double twelveTotal = 0;
      
      //Program intro      
      System.out.println("Welcome to the dice throwing simulator!");
      
      //ask for user input
      System.out.print("How many dice rolls would you like to simulate?");
      numRolls = in.nextInt();
      in.nextLine(); //buffer
      System.out.println();
      
      //print input results
      System.out.println("DICE ROLLING SIMULATION RESULTS");
      System.out.println("Each \"*\" represents 1% of the total number of rolls.");
      System.out.println("Total number of rolls = " + numRolls + ".");

      //add total dice roll to the total array
      for(int i = 0; i < numRolls; i++)
      {
         die1 = r.nextInt(6) + 1;
         die2 = r.nextInt(6) + 1;
         dieTotal = die1 + die2;
         total.add(dieTotal);
      }

      //check for total of numbers of 2-12 in the total array and add elements in their own arrays based on how
      //many times the number appears on the total array list.
      for (Integer i : total)
      {
         if (i==2)
         {
            two.add(1);
         }
         if (i==3)
         {
            three.add(1);
         }
         if (i==4)
         {
            four.add(1);
         }
         if (i==5)
         {
            five.add(1);
         }
         if (i==6)
         {
            six.add(1);
         }
         if (i==7)
         {
            seven.add(1);
         }
         if (i==8)
         {
            eight.add(1);
         }
         if (i==9)
         {
            nine.add(1);
         }
         if (i==10)
         {
            ten.add(1);
         }
         if (i==11)
         {
            eleven.add(1);
         }
         if (i==12)
         {
            twelve.add(1);
         }
      }

      //division to find the percentage of each number that appears on the total array
      twoTotal = (double)two.size() / (double) total.size();
      threeTotal = (double)three.size() / (double) total.size();
      fourTotal = (double)four.size() / (double) total.size();
      fiveTotal = (double)five.size() / (double) total.size();
      sixTotal = (double)six.size() / (double) total.size();
      sevenTotal = (double)seven.size() / (double) total.size();
      eightTotal = (double)eight.size() / (double) total.size();
      nineTotal = (double)nine.size() / (double) total.size();
      tenTotal = (double)ten.size() / (double) total.size();
      elevenTotal = (double)eleven.size() / (double) total.size();
      twelveTotal = (double)twelve.size() / (double) total.size();

      //add star count to the number arrays, one * equals 1% or .01
      //for loops takes the total numbers and subtracts by .01 until the totals reach 0.
      for(double i = twoTotal ; i > 0; i -=.01)
      {
         starCount2.add("*");
      }

      for(double i = threeTotal ; i > 0; i -=.01)
      {
         starCount3.add("*");
      }

      for(double i = fourTotal ; i > 0; i -=.01)
      {
         starCount4.add("*");
      }

      for(double i = fiveTotal ; i > 0; i -=.01)
      {
         starCount5.add("*");
      }

      for(double i = sixTotal ; i > 0; i -=.01)
      {
         starCount6.add("*");
      }

      for(double i = sevenTotal ; i > 0; i -=.01)
      {
         starCount7.add("*");
      }

      for(double i = eightTotal ; i > 0; i -=.01)
      {
         starCount8.add("*");
      }

      for(double i = nineTotal ; i > 0; i -=.01)
      {
         starCount9.add("*");
      }

      for(double i = tenTotal ; i > 0; i -=.01)
      {
         starCount10.add("*");
      }

      for(double i = elevenTotal ; i > 0; i -=.01)
      {
         starCount11.add("*");
      }

      for(double i = twelveTotal ; i > 0; i -=.01)
      {
         starCount12.add("*");
      }

      //print results
      System.out.print("2:");
      for(String i : starCount2)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("3:");
      for(String i : starCount3)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("4:");
      for(String i : starCount4)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("5:");
      for(String i : starCount5)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("6:");
      for(String i : starCount6)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("7:");
      for(String i : starCount7)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("8:");
      for(String i : starCount8)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("9:");
      for(String i : starCount9)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("10:");
      for(String i : starCount10)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("11:");
      for(String i : starCount11)
      {
         System.out.print(i);
      }
      System.out.println();

      System.out.print("12:");
      for(String i : starCount12)
      {
         System.out.print(i);
      }
      System.out.println();

      //end of theprogram
      System.out.println();
      System.out.println("Thank you for using the dice throwing simulator. Goodbye!");
      
   }//end main

}//end class