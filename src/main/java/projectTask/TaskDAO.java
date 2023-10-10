package projectTask;

import java.sql.*;
import java.util.*;
import projectTask.DatabaseConnection;

public class TaskDAO {
   private Connection connection;
   
   public TaskDAO(Connection conn) {
	   super();
   }
   
   
   public boolean create(Task task) {
	   
	  String sql=  "INTSERT INTO db_agenda( id ,nom , description, date_echeance) VALUE( " 
			  + task.getId() + " , '" + task.getNom() + "' , '" + task.getDescription() + "' , " 
			  + task.getDateEcheance() + ")";
	  
	  try {
		  Statement state = this.connection.createStatement();
		  state.executeUpdate(sql);
		  return true;
	  }
	  catch (SQLException e) {
		  System.out.println(e);
		  return false;
	  }
   }
   
   public boolean delete(Task task) {
	   String sql= "DELETE FROM db_agenda WHERE id =?";
		  
		  try {
			  PreparedStatement statement  = connection.prepareStatement(sql);
			  statement.setInt(1,task.getId());
			  statement.executeUpdate();
			  return true;
		  }
		  catch(SQLException e){
				  System.out.println(e);
				  return false;
			  }	  
   }
   
   
   public boolean update(Task task) {
	   String sql = " UPDATE db_agenda SET" + "ID = " + task.getId() + " ,NOM = " + task.getNom()
			   + " ,DESCRIPTION = " + task.getDescription() + " ,Date Echeance = " + task.getDateEcheance()
			   + "WHERE ID =?";
	   
	   try {
		   
		   PreparedStatement statement = this.connection.prepareStatement(sql);
		   statement.setInt(1, task.getId());
		   statement.executeUpdate();
		   return true;
	   }
	   catch(SQLException e){
		   System.out.println(e);
		   return false;
	   }
   }
   
   
}
