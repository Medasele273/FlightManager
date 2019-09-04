package se.flight.domain;

import java.util.Objects;

public class Ticket {

    private String seatNumber;
    private TicketType ticketType;
    private String customerName;
    private Food food;
    private Flight flight;
    private double price;

    private Ticket(){

    }

    private Ticket(Builder builder){
        this.seatNumber= Objects.requireNonNull(builder.seatNumber,"seatNumber should not be null");
        this.ticketType= Objects.requireNonNull(builder.ticketType,"ticketType should not be null");
        this.customerName= Objects.requireNonNull(builder.customerName,"customerName should not be null");
        this.food= Objects.requireNonNull(builder.food,"food should not be null");
        this.flight= Objects.requireNonNull(builder.flight,"price should not be null");
        this.price= Objects.requireNonNull(builder.price,"price should not be null");
    }

    public String getSeatNumber(){
        return seatNumber;
    }

    public String getCustomerName(){
        return customerName;
    }

    public TicketType getTicketType(){
        return ticketType;
    }
    public Food getFood(){
        return food;
    }

    public Flight getFlight(){
        return flight;
    }

    public double getPrice(){
        return price;
    }

    public static Builder build(){
        return new Builder();
    }

    public static class Builder implements se.flight.commonBuilder.Builder<Ticket>{

        private String seatNumber;
        private TicketType ticketType;
        private Food food;
        private String customerName;
        private Flight flight;
        private double price;

        public Ticket.Builder withSeatNumber(String seatNumber){
            this.seatNumber =seatNumber;
            return this;
        }

        public Ticket.Builder withTicketType(TicketType ticketType){
            this.ticketType=ticketType;
            return this;
        }

        public Ticket.Builder withFood(Food food){
            this.food=food;
            return this;
        }

        public Ticket.Builder withFlight(Flight flight){
            this.flight=flight;
            return this;
        }

        public Ticket.Builder withCustomerName(String customerName){
            this.customerName=customerName;
            return this;
        }

        public Ticket.Builder withPrice(double price){
            this.price=price;
            return this;
        }

        @Override
        public Ticket build() {
            return new Ticket(this);
        }
    }
}
