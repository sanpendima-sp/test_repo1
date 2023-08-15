package com.sampledemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD_Operations {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database");

            // Create
            createPerson(connection, 1, "Alice");
            createPerson(connection, 2, "Bob");

            // Read
            readPerson(connection, 1);

            // Update
            updatePerson(connection, 2, "Updated Bob");

            // Delete
            deletePerson(connection, 1);

            // Read all
            readAllPersons(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createPerson(Connection connection, int id, String name) throws SQLException {
        String query = "INSERT INTO persons (id, name) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            int rowsInserted = statement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
        }
    }

    private static void readPerson(Connection connection, int id) throws SQLException {
        String query = "SELECT * FROM persons WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Retrieved Person: ID=" + resultSet.getInt("id") + ", Name=" + resultSet.getString("name"));
                } else {
                    System.out.println("Person not found.");
                }
            }
        }
    }

    private static void updatePerson(Connection connection, int id, String newName) throws SQLException {
        String query = "UPDATE persons SET name = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newName);
            statement.setInt(2, id);
            int rowsUpdated = statement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
        }
    }

    private static void deletePerson(Connection connection, int id) throws SQLException {
        String query = "DELETE FROM persons WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");
        }
    }

    private static void readAllPersons(Connection connection) throws SQLException {
        String query = "SELECT * FROM persons";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                System.out.println("\nAll Persons:");
                while (resultSet.next()) {
                    System.out.println("ID=" + resultSet.getInt("id") + ", Name=" + resultSet.getString("name"));
                }
            }
        }
    }
}
