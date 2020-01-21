package com.company;

import java.util.Scanner;

public class CountDivisors {
  public static void main(String[] args) {
    //
    int l,r,k, j=0;

    Scanner scanner= new Scanner(System.in);
    l = scanner.nextInt();
    r = scanner.nextInt();
    k = scanner.nextInt();

    if(1<=l && l<=r && r<=1000)
    {
      if (1<=k && k<=1000)
      {
        for (int i=l; i<=r; i++)
        {
          if (i%k==0)
          {
            j++;
          }
        }
        System.out.println(j);
      }
    }
  }
}
