package com.hackerrank;

import java.util.Scanner;

public class LoopsII {
  public static void main(String[] args) {
    //
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int a = 0, b = 0, n=0;
    for (int i = 0; i < t; i++) {
      a = in.nextInt();
      b = in.nextInt();
      n = in.nextInt();
      int sum=0;

      if (0<=t && t<=500 && 0<=a&& a<=50&& 0<=b&& b<=50 && 1<=n&& n<=15)
      {
        sum= (a + ((int)(Math.pow(2,0))*b));
        for (int j=1; j<=n; j++)
        {
          System.out.print(sum+" ");
          sum = sum + ((int)(Math.pow(2,j))*b);
        }
        System.out.println(" ");
      }
    }

  }
}
