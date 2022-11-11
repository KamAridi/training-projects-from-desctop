package com.aridi.jdbc.starter;

import com.aridi.jdbc.starter.util.ConnectionManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobRunner {
    public static void main(String[] args) throws SQLException, IOException {
        //saveImage();
        getImage();

    }
    private static void getImage() throws SQLException, IOException {
        String sql = "SELECT image FROM bookings.aircrafts WHERE aircraft_code = '773'";

        try(Connection connection = ConnectionManager.open();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                byte[] image = resultSet.getBytes("image");
                Files.write(Path.of("resources","samolet_new.jpg"), image, StandardOpenOption.CREATE);
            }
        }
    }





















    private static void saveImage() throws SQLException, IOException {

        String sql = "UPDATE bookings.aircrafts SET image = ? WHERE aircraft_code = '773'";


        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setBytes(1,
            Files.readAllBytes(Path.of("resources","samolet.jpg")));
            preparedStatement.executeUpdate();
        }
    }

}
