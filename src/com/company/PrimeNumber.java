package com.company;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    //
    String s;
    int x;

    Scanner scanner= new Scanner(System.in);
    s=scanner.nextLine();

    x =Integer.parseInt(s);

    if (1<=x && x<=1000) {
      for (int i=2; i<=x; i++)
      {
        int j;
        for (j=2; j<=i-1; j++)
        {
          if (i % j == 0)
          {
            break;
          }
        }
        if (i==j)
        {
          System.out.print(i+" ");
        }
      }
    }

  }
}
