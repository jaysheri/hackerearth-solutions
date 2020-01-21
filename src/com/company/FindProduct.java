package com.company;

import java.util.Scanner;

public class FindProduct {

  public static void main(String[] args) {
    int n;
    int[] a ;

    Scanner scanner = new Scanner(System.in);
    String number= scanner.nextLine();
    n=Integer.parseInt(number);

    if(1<=n && n<=1000){
      a= new int[n];
    for (int i=0;i<n;i++)
    {
      a[i]= scanner.nextInt();
    }
    long product=1;
    int exp = (int) Math.pow(10, 9);

    for (int i=0;i<n;i++)
    { if(1<= a[i] && a[i]<=1000 ){
      product = (product * a[i]) % (exp + 7);}
    }
      System.out.println(product);
    }

  }
}
