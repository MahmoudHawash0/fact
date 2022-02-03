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
public class bookStore {
    public static final int mid = 1 ;
     public static final int East =111 ;
      public static final int west =41 ;
    public static ids getIds(int id ){
        if(id == bookStore.East){
            return new East();
        }
        else if(id == bookStore.west){
            return new west();
        }
        else if(id == bookStore.mid){
            return new mid();
        }
            return null;

    }
}
