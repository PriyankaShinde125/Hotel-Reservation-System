package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class HotelReservation {
    private static final int ADD_NEW_HOTEL = 1;
    private static final int GET_CHEAPEST_HOTEL = 2;
    List<Hotel> hotels;

    public HotelReservation() {
        hotels = new ArrayList<>();
        hotels.add(new Hotel("Lakewood", 110.0));
        hotels.add(new Hotel("Bridgewood", 160.0));
        hotels.add(new Hotel("Ridgewood", 220.0));

    }

    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        HotelReservation hotelReservation = new HotelReservation();
        System.out.println("Enter your choice : " +
                "\n1 : Add new hotel" +
                "\n2 : Get cheapest hotel");
        int choice = sc.nextInt();
        switch (choice) {
            case ADD_NEW_HOTEL:
                hotelReservation.addNewHotel();
                break;
            case GET_CHEAPEST_HOTEL:
                hotelReservation.getCheapestHotelForGivenDateRanges();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private void getCheapestHotelForGivenDateRanges() throws CustomException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dMMMyyyy");
        System.out.println("Enter start date and end date");
        String start = sc.next();
        String end = sc.next();
        Period period;
        try {
            LocalDate startDate = LocalDate.parse(start, formatter);
            LocalDate endDate = LocalDate.parse(end, formatter);
            period = Period.between(startDate, endDate);
        } catch (DateTimeParseException e) {
            throw new CustomException(ExceptionType.INVALID_DATE_INPUT);
        }
        int numberOfDays = Math.abs(period.getDays()) + 1;
        hotels.forEach(hotel -> hotel.setTotalRate(numberOfDays));
        Hotel cheapestHotel = hotels.stream()
                .min(Comparator.comparing(Hotel::getTotalRate)).get();
        System.out.println(cheapestHotel);
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
