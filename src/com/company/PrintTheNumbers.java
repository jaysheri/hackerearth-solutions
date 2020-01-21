package com.company;

import java.util.Scanner;

public class PrintTheNumbers {
  public static void main(String[] args) {
    //
    int n;
    int[] a ;

    Scanner scanner = new Scanner(System.in);
    String number= scanner.nextLine();
    n=Integer.parseInt(number);

    if (1 <= n && n <= 100) {
      a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
      }
      for (int i = 0; i < n; i++){
        System.out.print(a[i]+" ");
      }
    }
  }
}
