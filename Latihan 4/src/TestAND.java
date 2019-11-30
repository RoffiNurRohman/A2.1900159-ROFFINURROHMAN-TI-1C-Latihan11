/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows_10
 */
public class TestAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
 int j = 10;
 boolean test= false;

 //demonstrasi &&
 test = (i > 10) && (j++ > 9);
 System.out.println(i);
 System.out.println(j);
 System.out.println(test);

 //demonstrasi &
 test = (i > 10) & (j++ > 9);
 System.out.println(i);
 System.out.println(j);
 System.out.println(test);
    }
}
