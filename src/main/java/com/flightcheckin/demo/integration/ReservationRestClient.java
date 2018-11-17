package com.flightcheckin.demo.integration;

import com.flightcheckin.demo.dto.Reservation;
import com.flightcheckin.demo.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

    public Reservation findReservation(Integer id);

    public Reservation updateReservation(ReservationUpdateRequest request);



}
