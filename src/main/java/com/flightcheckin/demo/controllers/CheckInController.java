package com.flightcheckin.demo.controllers;

import com.flightcheckin.demo.dto.Reservation;
import com.flightcheckin.demo.dto.ReservationUpdateRequest;
import com.flightcheckin.demo.integration.ReservationRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class CheckInController {
    @Autowired
    ReservationRestClient restClient;

    @RequestMapping("/showStartCheckIn")
    public String showStartCheckIn(){
        return "startCheckIn";
    }
    @RequestMapping("/startCheckIn")
    public String startCheckIn(@RequestParam("reservationId") Integer reservationId, ModelMap modelMap){

        Reservation reservation = restClient.findReservation(reservationId);
        modelMap.addAttribute("reservation",reservation);

        return "displayReservationDetails";

    }
    @RequestMapping("/completeCheckIn")
    public String completeCheckIn(@RequestParam("reservationId") Integer reservationId,@RequestParam("numberOfBags") int numberOfBags){

        ReservationUpdateRequest  reservationUpdateRequest= new  ReservationUpdateRequest();
        reservationUpdateRequest.setID(reservationId);
        reservationUpdateRequest.setChecked_In(true);
        reservationUpdateRequest.setNumber_Of_Bags(numberOfBags);
        restClient.updateReservation(reservationUpdateRequest);
        return "checkInConfirmation";

    }

}
