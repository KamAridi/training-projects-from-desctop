package com.aridi.jdbc.starter;

import com.aridi.jdbc.starter.dao.TicketFlightsDAO;
import com.aridi.jdbc.starter.entity.TicketFlights;

import java.math.BigDecimal;

public class DaoRunner {
    public static void main(String[] args) {

        System.out.println(TicketFlightsDAO.delete("0005435999777"));
    }

    private static void save() {
        TicketFlights ticketFlights = new TicketFlights
                ("0005435999777", 19539, "Economy", BigDecimal.TEN);
        TicketFlights save = TicketFlightsDAO.save(ticketFlights);
        System.out.println(save);
    }
}
