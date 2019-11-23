
package vehicle.shopping;
import java.util.Scanner;
public interface VehicleShopping{
    int dolar=123000;
    public abstract int getwheel();
    
    public abstract void setwheel(int numwheel);
    
    double getspeed();
    double setspeed(double speed);
}

/**
 *
 * @author DELL
 */
public class VehicleShopping {
     public int getprice(){
        return price;
    }
     
    String carname;
    static int price;
    int tiers;
    boolean loan;
     static int price0(){
        price++;
        System.out.println(price);
        return price+price;
    }

    public static void main(String[] args) {
        Scanner oo=new Scanner(System.in);
        int discount=20;
        System.out.println("welcome to our shop");
        System.out.println("what is the type of vehicle you need?");
        System.out.println("1- car 2- suv 3- motor ");
        System.out.println("pleas type the onr who you need");
        String type=oo.next();
        if("car".equals(type)){
              VehicleShopping obj=new VehicleShopping();
        }
        if("suv".equals(type)){
           VehicleShopping obj=new VehicleShopping(); 
        }
         if("motor".equals(type)){ 
             VehicleShopping obj=new VehicleShopping();
         } 
        System.out.println("also for the price is very low ");   
      int result=VehicleShopping.price0();
      VehicleShopping test=new VehicleShopping();
      test.setprice(2000);
      
        System.out.println("old discount");
        morediscount(discount);
        System.out.println(" new discount");
        
    }
  public void setprice(int newprice){
        price=newprice;
    }
  public static void morediscount ( int u ) {
System.out.println ( "Value of a before discount is "+u);
u= u+1;
System.out.println ( "Value of a after discount is "+u);
  }  
}
