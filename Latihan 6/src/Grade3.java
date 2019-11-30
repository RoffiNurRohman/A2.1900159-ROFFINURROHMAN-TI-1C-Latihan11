/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows_10
 */
public class Grade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String names[] = {"Beah", "Bianca", "Lance", "Belle",
 "Nico", "Yza", "Gem", "Ethan"};
 String searchName = "Yza";
 boolean foundName = false;
 for( int i=0; i< names.length; i++ ){
if( names[i].equals( searchName )){
 foundName = true;
 break;
 }

 }

 if( foundName ){
 System.out.println( searchName + " found!" );
 }
 else{
 System.out.println( searchName + " not found." );
 }
    }
}
