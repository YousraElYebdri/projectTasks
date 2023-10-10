package projectTask;

import java.sql.*;

public class DatabaseConnection {
	// Informations de connexion à la base de données
	private static final String URL = "jdbc:mysql://localhost:3306/db_agenda"; // URL de la base de données
	private static final String USER = "taskproject"; // Nom d'utilisateur de la base de données
	private static final String PWD = "taskporjectwpd"; // Mot de passe de la base de données
	
	 public static Connection getConnection() {
	        try {
	            return DriverManager.getConnection(URL, USER, PWD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Erreur lors de la connexion à la base de données.");
	        }
	    }

}
