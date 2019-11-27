
package vehicle.shopping;

import java.util.Scanner;


public class motor extends  parkinlot {
     public static void typesofsuv(){
         Scanner oo=new Scanner(System.in);
         System.out.println("avalible type 1-2 tiers 2- 4 tiers");
         String type=oo.next();
         if(type=="2 tiers"){
             System.out.println("2 tiers is");
         }else{
             System.out.println("4 tiers");
         }
        
     }
     public static void typesofsuv(String spot){
         Scanner oo=new Scanner(System.in);
          System.out.println("color avalible 1- right 2-left");
          spot=oo.next();
         if(spot=="rigth"){
             System.out.println("right it is");
         }else{
             System.out.println("left");
         }
     }
    
}
