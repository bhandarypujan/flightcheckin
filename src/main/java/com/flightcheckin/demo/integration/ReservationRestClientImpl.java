package com.flightcheckin.demo.integration;

import com.flightcheckin.demo.dto.Reservation;
import com.flightcheckin.demo.dto.ReservationUpdateRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ReservationRestClientImpl implements ReservationRestClient {
    @Override
    public Reservation findReservation(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Reservation reservation = restTemplate
                .getForObject("http://localhost:8080/reservation/" + id, Reservation.class);


        return reservation;
    }


    @Override
    public Reservation updateReservation(ReservationUpdateRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        Reservation reservation = restTemplate.
                postForObject("http://localhost:8080/reservations/", request, Reservation.class);

        return reservation;
    }
}
