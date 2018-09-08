package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int count;

        Hashtable<Integer,List<Integer>> htSubSetList;

        do{
            htSubSetList = EasyPuzzle.createSubsets();
            EasyPuzzle.solveSudoku(htSubSetList);
            count = EasyPuzzle.printSudoku();
            System.out.println("------------------------------------------");
        }while (count!=0);
    }
}