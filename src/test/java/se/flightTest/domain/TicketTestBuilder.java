package se.flightTest.domain;

import org.junit.Test;
import se.flight.domain.Flight;
import se.flight.domain.Food;
import se.flight.domain.Ticket;
import se.flight.domain.TicketType;

public class TicketTestBuilder {

    @Test
    public void ticketBuilderTest(){

        Ticket ticket1 =Ticket.build()
                          .withCustomerName("AAAA")
                          .withSeatNumber("10M")
                          .withTicketType(TicketType.BUSINESS)
                          .withFlight(Flight.builder().withFlightName("AirBuss 308")
                                  .withFlightNumber("F777")
                                  .build())
                            .withFood(Food.builder()
                                    .withName("Sea Food")
                                    .withPrice(200)
                                    .build())
                            .withPrice(2000).build();

    }
}
