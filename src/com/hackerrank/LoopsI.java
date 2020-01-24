package com.hackerrank;

import java.util.Scanner;

public class LoopsI {
  public static void main(String[] args) {
    //Hello World Hi There!!
    Scanner scanner= new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    for (int i=1; i<11; i++)
    {
      int product = N*i;
      System.out.println(N+" x "+i+" = "+product);
    }
  }
}
