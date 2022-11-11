package com.aridi.jdbc.starter.entity;

import java.math.BigDecimal;

public class TicketFlights {
    private String ticketNo;
    private int flightId;
    private String fare_conditions;
    private BigDecimal amount;

    public TicketFlights(String ticketNo, int flightId,
                         String fare_conditions, BigDecimal amount) {
        this.ticketNo = ticketNo;
        this.flightId = flightId;
        this.fare_conditions = fare_conditions;
        this.amount = amount;
    }


    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFare_conditions() {
        return fare_conditions;
    }

    public void setFare_conditions(String fare_conditions) {
        this.fare_conditions = fare_conditions;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TicketFlights{" +
                "ticketNo='" + ticketNo + '\'' +
                ", flightId=" + flightId +
                ", fare_conditions='" + fare_conditions + '\'' +
                ", amount=" + amount +
                '}';
    }
}
