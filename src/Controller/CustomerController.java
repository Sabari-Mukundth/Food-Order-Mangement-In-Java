package Controller;

import Models.Customers;
import Models.DeliveryBoy;
import Models.Food;
import Models.Hotels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerController {
    static Scanner scanner = null;
     static List<Customers> customersList = null;
    public static void customer() {
        scanner = new Scanner(System.in);
        customersList = new ArrayList<>();
        System.out.println("Enter the Choose : ");
        System.out.println("1. Register Customer" +
                "2. Login Customer" +
                "3. Delete Customer" );
        int Choice = scanner.nextInt();
        switch (Choice) {
            case 1 -> registerUser();
            case 2 -> loginUser();
            case 3 -> deleteUser();
            default -> System.out.println("Please enter the Right Choice");
        }

    }

    private static void deleteUser() {
        System.out.println("please enter the your name : ");
        String name = scanner.next();
        boolean customersNameFound = false;
        int index = -1;
        for (Customers customer : customersList) {
            index++;
            if (customer.getCustomerName().equals(name)) {
                customersNameFound = true;
                break;
            }
        }
        if (!customersNameFound) {
            System.out.println("Invalid Customer name");
            return;
        }
        customersList.remove(index);

    }

    private static void loginUser() {
        System.out.println("please enter the your name : ");
        String name = scanner.next();
        boolean customersNameFound = false;
        for (Customers customers : customersList) {
            if (customers.getCustomerName().equals(name)) {
                customersNameFound = true;
                break;
            }
        }
        if (!customersNameFound) {
            System.out.println("Invalid Customer name");
            return;
        }
        System.out.println("Please enter the Choose Hotel name Displayed bellow : ");
        int count = 1;
        for (Hotels hotel : HotelController.hotelList) {
            System.out.printf("%d. %30s", count++, hotel.getName());
        }
        int Choice = scanner.nextInt();
        Hotels selectedHotel = null;
        try {
            selectedHotel = HotelController.hotelList.get(Choice - 1);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("You had entered Wrong Choice");
            return;
        }
        List<Food> cart = new ArrayList<>();
        while (true) {
            System.out.println("Please enter the Choose Food name Displayed bellow : ");
            count = 1;

            for (Food food : selectedHotel.getFoodItems()) {
                System.out.printf("%d. %30s", count++, food.getName());
            }
            Choice = scanner.nextInt();
            try {
                cart.add(selectedHotel.getFoodItems().get(Choice));
            } catch (Exception ArrayIndexOutOfBoundsException) {
                System.out.println("Please enter the right choice");
            }
            System.out.println("Please enter the Choose Delivery Boy name Displayed bellow : ");
            count = 1;
            for (DeliveryBoy deliveryBoy : DeliveryBoyController.deliveryBoyList) {
                System.out.printf("%d. %30s", count++, deliveryBoy.getName());
            }
            Choice = scanner.nextInt();
            DeliveryBoy deliveryBoy = null;
            try {
                deliveryBoy = DeliveryBoyController.deliveryBoyList.get(Choice - 1);
            } catch (Exception ArrayIndexOutOfBoundsException) {
                System.out.println("Please enter the right choice");
            }
        }
    }
    private static void registerUser() {
        System.out.println("Enter the Customer Name : ");
        String name = scanner.next();
        customersList.add(new Customers(name));
        loginUser();
    }
}
