package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
      String n;
      String m;

Scanner scanner = new Scanner(System.in);
 n= scanner.nextLine();
m = scanner.nextLine();
 int x= Integer.parseInt(n);
      if (0<=x && x<=10 && 1<=m.length() && m.length()<=15) {
          x = x * 2;
          System.out.println(x);
          System.out.println(m);
        }
      }

    }

