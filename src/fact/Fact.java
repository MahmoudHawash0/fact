/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

/**
 *
 * @author HOODAA
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bookStore b = new bookStore();
        ids db = b.getIds(1);
    }
    
}
