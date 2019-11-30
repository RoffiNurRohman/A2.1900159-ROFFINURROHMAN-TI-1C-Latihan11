/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows_10
 */
public class ArraySample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Elemen 512 x 128 dari integer array
 int[][] twoD = new int[512][128];
// karakter array 8 x 16 x 24
 char[][][] threeD = new char[8][16][24];
// String array 4 baris x 2 kolom
 String[][] dogs = {{ "terry", "brown" },
 { "Kristin", "white" },
 { "toby", "gray"},
 { "fido", "black"}
 };
 System.out.print( dogs[0][0] );

    }
}
