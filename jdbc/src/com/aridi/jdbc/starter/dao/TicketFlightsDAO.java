package com.aridi.jdbc.starter.dao;

import com.aridi.jdbc.starter.entity.TicketFlights;
import com.aridi.jdbc.starter.exception.DaoException;
import com.aridi.jdbc.starter.util.ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TicketFlightsDAO {
    private static final TicketFlightsDAO INSTANCE = new TicketFlightsDAO();
    private static final String DELETE_SQL = "DELETE FROM bookings.ticket_flights WHERE ticket_no = ?";
    private static final String SAVE_SQL = "INSERT INTO bookings.ticket_flights" +
            "(ticket_no, flight_id, fare_conditions, amount) VALUES (?, ?, ?, ?)";

    private TicketFlightsDAO(){
    }

    public static TicketFlightsDAO getInstance(){
        return INSTANCE;
    }

    public static TicketFlights save(TicketFlights ticketFlights){
        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE_SQL)) {

            preparedStatement.setString(1, ticketFlights.getTicketNo());
            preparedStatement.setInt(2, ticketFlights.getFlightId());
            preparedStatement.setString(3, ticketFlights.getFare_conditions());
            preparedStatement.setBigDecimal(4, ticketFlights.getAmount());

            preparedStatement.executeUpdate();

            return ticketFlights;

        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    public static boolean delete(String ticketNo){
        try(Connection connection = ConnectionManager.open();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) {

            preparedStatement.setString(1, ticketNo);
            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}
