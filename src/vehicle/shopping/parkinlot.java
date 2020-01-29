package vehicle.shopping;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class parkinlot {

    //Association    
    public car car;
    public motor motor;
    public suv suv;

    int dolar = 123000;

    public int getprice() {
        return price;
    }

    String carname;
    static int price;
    int tiers;
    boolean spot;

    static int price0() {
        price++;
        System.out.println(price);
        return price + price;
    }

    public static void main(String[] args) {
        Scanner oo = new Scanner(System.in);
        int discount = 20;
        System.out.println("welcome to our parking");
        System.out.println("lucky for naw we have dicount for new costmors");
        System.out.println("we have take your name first then your salary and your income ");
        String cuname = JOptionPane.showInputDialog(null, "enter your name please");
        String cunamesall = JOptionPane.showInputDialog(null, "enter your salary please");
        String cunameinc = JOptionPane.showInputDialog(null, "enter your income please");

        int cunamesal = Integer.parseInt(cunamesall);
        int cunamein = Integer.parseInt(cunameinc);
        int cuinfoAsall = cunamesal + cunamein;
        JOptionPane.showMessageDialog(null, " your name is " + cuname + " " + " and your most income of the year is  " + cuinfoAsall, "information about our client", INFORMATION_MESSAGE);

        System.out.println("what is the type of vehicle you  park?");
        System.out.println("1- car 2- suv 3- motor ");
        System.out.println("pleas type the vihecle who you park");
        String type = oo.next();
        if ("car".equals(type)) {
            parkinlot obj = new parkinlot();

        }
        if ("suv".equals(type)) {
            parkinlot obj = new parkinlot();
        }
        if ("motor".equals(type)) {
            parkinlot obj = new parkinlot();
        }
        System.out.println("also for the price is very low ");
        int result = parkinlot.price0();
        parkinlot test = new parkinlot();
        test.setprice(2000);

        System.out.println("old discount");
        morediscount(discount);
        System.out.println(" new discount");

    }

    public void setprice(int newprice) {
        price = newprice;
    }

    public static void morediscount(int u) {
        System.out.println("Value of a before discount is " + u);
        u = u + 1;
        System.out.println("Value of a after discount is " + u);
    }
}
