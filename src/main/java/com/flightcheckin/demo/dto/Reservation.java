package com.flightcheckin.demo.dto;



public class Reservation {
    private Integer id;

    private Boolean Checked_In;
    private int Number_Of_Bags;

    private Passenger passenger;
    private flight flight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getChecked_In() {
        return Checked_In;
    }

    public void setChecked_In(Boolean checked_In) {
        Checked_In = checked_In;
    }

    public int getNumber_Of_Bags() {
        return Number_Of_Bags;
    }

    public void setNumber_Of_Bags(int number_Of_Bags) {
        Number_Of_Bags = number_Of_Bags;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public com.flightcheckin.demo.dto.flight getFlight() {
        return flight;
    }

    public void setFlight(com.flightcheckin.demo.dto.flight flight) {
        this.flight = flight;
    }
}
