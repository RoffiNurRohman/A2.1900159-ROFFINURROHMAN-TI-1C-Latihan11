/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows_10
 */
public class Grade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outerLoop:
 for( int i=0; i<5; i++ ){
 for( int j=0; j<5; j++ ){
 System.out.println("Inside for(j) loop"); //message1
 if( j == 2 ) continue outerLoop;
 }

 System.out.println("Inside for(i) loop"); //message2
 }
    }
}
