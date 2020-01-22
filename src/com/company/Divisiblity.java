package com.company;

import java.util.Scanner;

public class Divisiblity {
  public static void main(String args[] ) {

  Scanner s = new Scanner(System.in);
  int N = 0;
  N = s.nextInt();

  int[] data = new int[N];
  for(int i=0; i<N; i++){
    data[i] = s.nextInt();
  }

    // Write your code here
    // ans =
    if (1 <= N && N <= 100000) {
      for (int i = 0; i < N; i++) {
        if (1 <= data[i] && data[i] <= 10000) {
          if (data[N - 1] % 10 == 0) {
            System.out.println("Yes");
            break;
          } else {
            System.out.println("No");
            break;
          }
        }
      }
    }
  }
}
