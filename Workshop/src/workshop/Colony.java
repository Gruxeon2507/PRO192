/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Colony extends Organization{
   private String place;
   public Colony(){
       super(0);
       place="";
   }
   public Colony(int size, String place){
       super(size);
       this.place=place;
   }
   public void comunicateByTool(){
       
   }
}
