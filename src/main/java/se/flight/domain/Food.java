package se.flight.domain;

import java.util.Objects;

public class Food {

    private String name;
    private double price;

    private Food(){

    }

    private Food(Builder builder){
        this.name= Objects.requireNonNull(builder.name,"name should not null");
        this.price= Objects.requireNonNull(builder.price,"price should not null");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements se.flight.commonBuilder.Builder<Food>{

        private String name;
        private double price;


        public Food.Builder withName(String name){
            this.name=name;
            return this;
        }

        public Food.Builder withPrice(double price){
            this.price=price;
            return this;
        }

        @Override
        public Food build() {
            return new Food(this);
        }
    }
}
