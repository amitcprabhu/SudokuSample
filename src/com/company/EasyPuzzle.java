package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class EasyPuzzle {

   /*static int[][] problemArray = {
           {3, 9, 0, 1, 6, 8, 0, 4, 0},
           {2, 0, 0, 0, 0, 5, 6, 7, 0},
           {0, 0, 1, 0, 7, 0, 3, 0, 0},
           {8, 0, 0, 4, 2, 0, 9, 1, 0},
           {0, 2, 0, 8, 5, 6, 0, 3, 0},
           {0, 7, 6, 0, 3, 1, 0, 0, 5},
           {0, 0, 4, 0, 8, 0, 2, 0, 0},
           {0, 6, 3, 5, 0, 0, 0, 0, 9},
           {0, 8, 0, 7, 1, 9, 0, 6, 3},
   };*/

/*    private static final int[][]  problemArray = {
            {0, 0, 0, 2, 6, 0, 7, 0, 1},
            {6, 8, 0, 0, 7, 0, 0, 9, 0},
            {1, 9, 0, 0, 0, 4, 5, 0, 0},
            {8, 2, 0, 1, 0, 0, 0, 4, 0},
            {0, 0, 4, 6, 0, 2, 9, 0, 0},
            {0, 5, 0, 0, 0, 3, 0, 2, 8},
            {0, 0, 9, 3, 0, 0, 0, 7, 4},
            {0, 4, 0, 0, 5, 0, 0, 3, 6},
            {7, 0, 3, 0, 1, 8, 0, 0, 0},

    };

    private static final int[][]  problemArray = {
            {7, 0, 0, 6, 0, 0, 5, 0, 0},
            {1, 0, 0, 7, 8, 0, 9, 2, 0},
            {0, 9, 0, 0, 3, 0, 6, 7, 0},
            {0, 1, 0, 0, 0, 0, 3, 6, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 0, 5, 0, 0, 0, 0, 4, 0},
            {0, 5, 4, 0, 2, 0, 0, 6, 0},
            {0, 8, 3, 0, 5, 7, 0, 0, 2},
            {0, 0, 1, 0, 0, 9, 0, 0, 3}
        };*/


    private static final int[][]  problemArray = {
            {4, 0, 7, 0, 2, 0, 6, 0, 0},
            {0, 6, 2, 3, 0, 8, 0, 9, 1},
            {0, 0, 0, 5, 0, 0, 8, 2, 0},
            {3, 1, 0, 9, 0, 7, 0, 0, 8},
            {2, 0, 0, 4, 8, 3, 0, 0, 7},
            {8, 0, 0, 2, 0, 1, 0, 3, 5},
            {0, 2, 3, 0, 0, 5, 0, 0, 0},
            {6, 4, 0, 7, 0, 2, 5, 8, 0},
            {0, 0, 8, 0, 1, 0, 3, 0, 2}
    };

    public static int printSudoku() {
        for (int[] aProblemArray : problemArray) {
            for (int anAProblemArray : aProblemArray) {
                System.out.print(anAProblemArray + " ");
            }
            System.out.println(" ");
        }

        int count =0;

        for (int[] aProblemArray : problemArray) {
            for (int anAProblemArray : aProblemArray) {
                if (anAProblemArray == 0) {
                    count++;
                }
            }
        }
        System.out.println("Count of zero's : "+count);
        return count;
    }

    public static void solveSudoku(Hashtable<Integer,List<Integer>> htSubSetList) {
        for (int i = 0; i < problemArray.length; i++) {
            for (int j = 0; j < problemArray[i].length; j++) {
                if(i<3){
                    if (j <3) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(1),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                    if (j >=3 && j<6) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(2),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                    if (j >=6 && j<9) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(3),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                }else if(i < 6){
                    if (j <3) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(4),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                    if (j >=3 && j<6) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(5),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                    if (j >=6 && j<9) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(6),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                }else if(i < 9){
                    if (j <3) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(7),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                    if (j >=3 && j<6) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(8),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                    if (j >=6 && j<9) {
                        if (problemArray[i][j] == 0) {
                            int numb = findNumber(htSubSetList.get(9),i,j);
                            problemArray[i][j] = numb;
                        }
                    }
                }
            }
        }
    }

    public static Hashtable<Integer,List<Integer>> createSubsets() {
        List<Integer> a1, a2, a3, a4, a5, a6, a7, a8, a9;
        a1 = new ArrayList<>();
        a2 = new ArrayList<>();
        a3 = new ArrayList<>();
        a4 = new ArrayList<>();
        a5 = new ArrayList<>();
        a6 = new ArrayList<>();
        a7 = new ArrayList<>();
        a8 = new ArrayList<>();
        a9 = new ArrayList<>();

        Hashtable<Integer, List<Integer>> lst = new Hashtable<>();

        for (int i = 0; i < EasyPuzzle.problemArray.length; i++) {
            for (int j = 0; j < EasyPuzzle.problemArray[i].length; j++) {
                if(i<3){
                    if (j <3) {
                        a1.add(EasyPuzzle.problemArray[i][j]);
                    }
                    if (j >=3 && j<6) {
                        a2.add(EasyPuzzle.problemArray[i][j]);
                    }
                    if (j >=6 && j<9) {
                        a3.add(EasyPuzzle.problemArray[i][j]);
                    }
                }else if(i >=3 && i<6){
                    if (j <3) {
                        a4.add(EasyPuzzle.problemArray[i][j]);
                    }
                    if (j >=3 && j<6) {
                        a5.add(EasyPuzzle.problemArray[i][j]);
                    }
                    if (j >=6 && j<9) {
                        a6.add(EasyPuzzle.problemArray[i][j]);
                    }
                }else if(i >=6 && i<9){
                    if (j <3) {
                        a7.add(EasyPuzzle.problemArray[i][j]);
                    }
                    if (j >=3 && j<6) {
                        a8.add(EasyPuzzle.problemArray[i][j]);
                    }
                    if (j >=6 && j<9) {
                        a9.add(EasyPuzzle.problemArray[i][j]);
                    }
                }
            }
        }

        lst.put(1,a1);
        lst.put(2,a2);
        lst.put(3,a3);
        lst.put(4,a4);
        lst.put(5,a5);
        lst.put(6,a6);
        lst.put(7,a7);
        lst.put(8,a8);
        lst.put(9,a9);
        return lst;
    }

    public static int findNumber(List<Integer> currentBlockList, int hIndex, int vIndex) {
        int val = 0;
        List<Integer> allNumbs = new ArrayList<>(9);

        List<Integer> hArrayList = new ArrayList<>();
        List<Integer> vArrayList = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            if(!currentBlockList.contains(i)){
                allNumbs.add(i);
            }
        }

        for (int i = 0; i < 9 ; i++) {
            hArrayList.add(problemArray[hIndex][i]);
        }
        for (int i = 0; i < 9; i++) {
            vArrayList.add(problemArray[i][vIndex]);
        }

        for (int i:vArrayList){
            allNumbs.remove(new Integer(i));
        }
        for (int i:hArrayList){
            allNumbs.remove(new Integer(i));
        }

        if(allNumbs.size()==1){
            val =allNumbs.stream().findFirst().get();
        }
        return val;
    }

}
