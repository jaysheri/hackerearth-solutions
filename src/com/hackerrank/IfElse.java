package com.hackerrank;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    //


  int x;
  Scanner scanner=new Scanner(System.in);
  x=scanner.nextInt();

  if (x%2 == 0)
  {
    if (2 <= x && x <= 5) System.out.println("Not Weird");
    if (6 <= x && x <= 20) System.out.println("Weird");
    if (x>=20) System.out.println("Not Weird");
  }
  else
  {
      System.out.println("Weird");
  }
}
}
