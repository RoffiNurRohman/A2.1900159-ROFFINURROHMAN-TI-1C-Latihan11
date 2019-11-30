/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows_10
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
 System.out.println( args[1] );
 }catch( ArrayIndexOutOfBoundsException exp ){
 System.out.println("Exception caught!");
 } 
    }
}
