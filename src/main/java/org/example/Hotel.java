package org.example;

public class Hotel {
    String name;
    Double regularCustomerRate;
    Double totalRate;

    public Hotel() {
    }

    public Hotel(String name, Double regularCustomerRate) {
        this.name = name;
        this.regularCustomerRate = regularCustomerRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public Double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(int numberOfDays) {
        this.totalRate = regularCustomerRate * numberOfDays;
    }

    public void setRegularCustomerRate(Double regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }


    @Override
    public String toString() {
        return "{" +
                "Hotel='" + name + '\'' +
                ", Total Rate=" + totalRate +
                '}';
    }
}
