package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int count=-1;

        Hashtable<Integer,List<Integer>> htSubSetList;

        count = EasyPuzzle.printSudoku();
        while (count!=0){
            htSubSetList = EasyPuzzle.createSubsets();
            EasyPuzzle.solveSudoku(htSubSetList);
            count = EasyPuzzle.printSudoku();
            System.out.println("------------------------------------------");
        }
    }
}