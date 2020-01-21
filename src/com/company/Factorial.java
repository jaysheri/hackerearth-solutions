package com.company;

import java.util.Scanner;

public class Factorial<number> {
public static void main(String[] args){


  int x , product=1;

  Scanner scanner = new Scanner(System.in);
  x= scanner.nextInt();

  if (1<=x&& x<=10){
  for (int i=1; i<=x; i++){
   product = i * product;
  }
    System.out.println(product);
}}}
