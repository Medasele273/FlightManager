package se.flight.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {

    private TicketType ticketType;

    private List<Food> businessMenu = new ArrayList<>();
    private List<Food> economyMenu = new ArrayList<>();

    private Menu(){

    }

    private Menu(Builder builder){
        this.ticketType= Objects.requireNonNull(builder.ticketType,"ticketType should not null");
        this.businessMenu= Objects.requireNonNull(builder.businessMenu,"businessMenu should not null");
        this.economyMenu= Objects.requireNonNull(builder.economyMenu,"economyMenu should not null");
    }

    public TicketType getTicketType(){
        return ticketType;
    }

    public List<Food> getBusinessMenu(){
        return businessMenu;
    }

    public List<Food> getEconomyMenu(){
        return economyMenu;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements se.flight.commonBuilder.Builder<Menu>{

         private TicketType ticketType;
         private List<Food> businessMenu;
         private List<Food> economyMenu;

         public Menu.Builder withTicketType(TicketType ticketType){
             this.ticketType=ticketType;
             return this;
         }

         public Menu.Builder withBusinessMenu(List<Food> businessMenu){
             this.businessMenu=businessMenu;
             return this;
         }

         public Menu.Builder withEconomyMenu(List<Food> economyMenu){
             this.economyMenu=economyMenu;
             return this;
         }

        @Override
        public Menu build() {
            return new Menu(this);
        }
    }
}
