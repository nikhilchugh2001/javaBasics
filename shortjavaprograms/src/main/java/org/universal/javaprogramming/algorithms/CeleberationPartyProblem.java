package org.universal.javaprogramming.algorithms;

import java.io.*;
import java.util.*;

public class CeleberationPartyProblem{

  static int getGroups(float[] children) {

    int lastChild = children.length;
    int currentChild=1;
    int startingPoint=0;
    int groups=0;

    while(currentChild<lastChild){

        if(children[currentChild]-children[startingPoint]>1){
            startingPoint=currentChild ;
            groups++;
        }


        if(currentChild==lastChild-1){
            groups++;
        }
        currentChild++;
    }


    return groups;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    float[] children = new float[n];

    for (int i = 0; i < n; i++) {
        children[i] = in.nextFloat();
    }

    System.out.println(getGroups(children));

  }
}