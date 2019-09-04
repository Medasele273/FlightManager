package se.flight.domain;

import java.util.Objects;

public class Flight {

    private final int NUMBER_OF_SEATS=10;

    private String flightName;
    private String flightNumber;

    private Flight(){

    }

    private Flight(Builder builder){
        this.flightName= Objects.requireNonNull(builder.flightName,"flightName should not be null");
        this.flightNumber= Objects.requireNonNull(builder.flightNumber,"flightNumber should not be null");
    }

  /*  public int getNumberOfSeats(){
        return numberOfSeats;
    }*/
    public String getFlightNumber(){
        return flightNumber;
    }
    public String getFlightName(){
        return flightName;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements se.flight.commonBuilder.Builder<Flight>{

        private String flightName;
        private String flightNumber;

        public Flight.Builder withFlightNumber(String flightNumber){
            this.flightNumber=flightNumber;
            return this;
        }

        public Flight.Builder withFlightName(String flightName){
            this.flightName=flightName;
            return this;
        }
        @Override
        public Flight build() {
            return new Flight(this);
        }
    }
}
