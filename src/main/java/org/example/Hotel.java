package org.example;

public class Hotel {
    String name;
    Double regularCustomerRate;

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

    public void setRegularCustomerRate(Double regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", regularCustomerRate=" + regularCustomerRate +
                '}';
    }
}
