/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows_10
 */
public class Grade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String names[] = {"Beah", "Bianca", "Lance", "Beah"};
 int count = 0;

 for( int i=0; i<names.length; i++ ){

 if( !names[i].equals("Beah") ){
 continue; //skip next statement
 }
 count++;
 }
 System.out.println("There are " + count + " Beahs in the list");
    }
}
