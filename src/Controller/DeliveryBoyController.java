package Controller;

import Models.Customers;
import Models.DeliveryBoy;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliveryBoyController {
    static Scanner scanner = null;
    static List<DeliveryBoy> deliveryBoyList = null;

    public static void deliveryBoy() {
        scanner = new Scanner(System.in);
        deliveryBoyList = new ArrayList<>();
        System.out.println("Enter the Choose : ");
        System.out.println("1. Register Customer" +
                "2. Login Customer" +
                "3. Order Food");
        int Choice = scanner.nextInt();
        switch (Choice) {
            case 1 -> registerdeliveryBoy();
            case 2 -> logindeliveryBoy();
            default -> System.out.println("Please enter the Right Choice");
        }
    }

    private static void logindeliveryBoy() {
        System.out.println("Please Enter the name");
        String Name = scanner.nextLine();
        boolean isFound = false;
        for(DeliveryBoy deliveryBoy : deliveryBoyList) {
            if(deliveryBoy.getName().equals(Name)) {
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.println("Invalid Delivery Boy");
            return ;
        }
    }

    private static void registerdeliveryBoy() {
        System.out.println("Please Enter the name");
        String Name = scanner.nextLine();
        deliveryBoyList.add(new DeliveryBoy(Name));
    }
}
