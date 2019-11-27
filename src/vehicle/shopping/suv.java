
package vehicle.shopping;
import java.util.Scanner;


public class suv extends  parkinlot {
     public static void typesofsuv(){
         Scanner oo=new Scanner(System.in);
         System.out.println("avalible type 1-first floor 2-second floor");
         String type=oo.next();
         if(type=="-first floor "){
             System.out.println("-first floor  it is");
         }else{
             System.out.println("second floor");
         }
        
     }
     public static void typesofsuv(String spot){
         Scanner oo=new Scanner(System.in);
          System.out.println("color avalible 1- right 2-left");
         spot=oo.next();
         if(spot=="right"){
             System.out.println("right");
         }else{
             System.out.println("left");
         }
     }
    
}
