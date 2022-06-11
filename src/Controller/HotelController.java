package Controller;
import Models.Hotels;
import java.util.Scanner;
import java.util.ArrayList;
public class HotelController{
    static ArrayList<Hotels> hotelList = new ArrayList<Hotels>();
    public static void hotel(){
        System.out.println("Enter Your Choice....");
        System.out.println("1. Register your account"+
        "2. Login to our account");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1:
                System.out.println("Enter Your Hotel Name:");
                String name = scanner.nextLine();
                Hotels hotel = new Hotels(name);
                hotelList.add(hotel);
            case 2:
                System.out.println("Select Your hotel from the list");
                HotelController.display();
                System.out.println("Enter Your Choice....");
                System.out.println("1.Add food");
                System.out.println("2.Remove food");
                choice = Integer.parseInt(scanner.nextLine());
                switch(choice){
                    case 1:

                }
        }
    }
    public static void display(){
        for(Hotels hotel:hotelList){
            System.out.println(1+"."+hotel.getName());
        }
    }
}