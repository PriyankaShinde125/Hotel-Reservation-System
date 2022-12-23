package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
    List<Hotel> hotels;

    public HotelReservation() {
        hotels = new ArrayList<>();
    }

    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addNewHotel();
        hotelReservation.printHotels();
    }

    private void addNewHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hotels do you want to add ? ");
        int numberOfHotels = sc.nextInt();
        for (int i = 0; i < numberOfHotels; i++) {
            System.out.println("Enter hotel name ");
            String name = sc.next();
            System.out.println("Enter rate for regular customer");
            Double regularCustomerRate = sc.nextDouble();
            hotels.add(new Hotel(name, regularCustomerRate));
        }
    }

    private void printHotels() {
        System.out.println(hotels);
    }
}
