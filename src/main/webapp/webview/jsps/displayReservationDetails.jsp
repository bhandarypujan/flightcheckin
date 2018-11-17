<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reservation Details</title>
</head>
<body>
<pre>
<h2>Flight Details:</h2>
Airlines : ${reservation.flight.operatingAirlines}
Flight Number : ${reservation.flight.flightNumber}
Departure City : ${reservation.flight.departureCity}
Airlines : ${reservation.flight.arrivalCity}
Airlines : ${reservation.flight.dateOfDeparture}
Airlines : ${reservation.flight.estimatedDepartureTime}

<h2>Passenger Details:</h2>
First Name : ${reservation.passenger.first_Name}
Middle Name : ${reservation.passenger.middle_Name}
Last Name : ${reservation.passenger.last_Name}
Email : ${reservation.passenger.email}
Phone : ${reservation.passenger.phone}

<form action="completeCheckIn" method="post">
    Enter the number of bags to check in :<input type="text" name="numberOfBags">
    <input type="hidden" value="${reservation.id}" name="reservationId">
    <input type="submit" value="Check In">
</form>
</pre>
</body>
</html>