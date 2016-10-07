/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author anunez12
 */
public class Test {

    public static void main(String[] args) {
        int[][] m = new int[5][5];

        m[0][0] = 3;
        m[0][1] = 4;
        m[0][2] = 5;
        m[0][3] = 7;
        m[0][4] = 8;
        m[1][0] = 9;
        m[1][1] = 2;
        m[1][2] = 3;
        m[1][3] = 1;
        m[1][4] = 0;
        m[2][0] = 2;
        m[2][1] = 5;
        m[2][2] = 3;
        m[2][3] = 2;              
        m[2][4] = 1;
        m[3][0] = 6;
        m[3][1] = 4;
        m[3][2] = 2;
        m[3][3] = 3;
        m[3][4] = 1;
        m[4][0] = 6;
        m[4][1] = 5;
        m[4][2] = 4;
        m[4][3] = 3;
        m[4][4] = 1;

        System.out.println(Helper.Mostrar(m)); 
        System.out.println("Recorrido Matriz");
        System.out.println(Helper.recorridoDiagonalPrinipalHaciaArribaa(m, m.length - 1, 0));

    }
}
