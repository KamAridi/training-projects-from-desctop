package com.aridi.jdbc.starter;

import com.aridi.jdbc.starter.util.ConnectionManager;

import java.sql.*;

public class JdbcRunner2 {
    public static void main(String[] args) throws SQLException {

        String ticket_no = "0005435212351";

        deleteTicket(ticket_no);
    }
    private static void deleteTicket(String ticket_no) throws SQLException {
        String sql = "DELETE FROM bookings.boarding_passes WHERE ticket_no = ?";
        String sql2 = "DELETE FROM bookings.ticket_flights WHERE ticket_no = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement29 = null;

        try {
            connection = ConnectionManager.open();
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement29 = connection.prepareStatement(sql2);


            preparedStatement.setString(1, ticket_no);
            preparedStatement29.setString(1, ticket_no);

            preparedStatement.executeUpdate();
            if (false) {
                throw new RuntimeException();
            }
            preparedStatement29.executeUpdate();

            connection.commit();

        } catch (Exception e){
            if (connection != null) {
                connection.rollback();
            }
            throw new RuntimeException(e);

        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (preparedStatement29 != null) {
                preparedStatement29.close();
            }
        }
    }
}