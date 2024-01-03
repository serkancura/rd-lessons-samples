package org.rd.lessons.lesson8;

public class MultiDimension {

    public static void main(String[] args) {

        int[][] matris = new int[3][3];
        matris[0][0] = 1;
        matris[0][1] = 3;
        int matris_degiskeni = matris[2][1];

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                System.out.print( matris[satir][sutun] + "   " );
            }
            System.out.println();
        }
    }
}


