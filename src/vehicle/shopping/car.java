
package vehicle.shopping;
import java.util.Scanner;


public class car extends  parkinlot {
    public static void typesofcar(){ 
         Scanner oo=new Scanner(System.in);
        System.out.println("types of car 2 door or 4 door");
        String typeofdoors=oo.next();
        if(typeofdoors=="2 door"){
            System.out.println("avalible cars are 1-scond floor 2-first floor");
            String type=oo.next();
            if(type=="scond floor"){
                System.out.println("scond floor");
            }
        }
        else{
            System.out.println("first floor");
        }
        if(typeofdoors=="4 door"){
            System.out.println("avalible cars are 1-3rd floor 2- 4th floor");
            String type=oo.next();
            if(type=="3rd floor"){ 
                System.out.println("3rd floor ");
                
            }
            else{
                System.out.println("4th floor");
            }
        }
          
    } 
    public static void typesofcar(String spot){
        Scanner oo=new Scanner(System.in);
        System.out.println("what color you need");
        System.out.println("avalible spot are 1- right 2-left");
         spot=oo.next();
        if(spot=="right"){
            System.out.println("right");
        }else{
            System.out.println("left");
        }
    }
    
}
