import java.sql.*;

public class Main 
{


	public static void main(String[] args) {
		

	try
	{

		Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT Champ.codes,Module.codes FROM Champ,Module WHERE Champ.id = Module.id");
		ResultSet rs = pst.executeQuery();




		while(rs.next()) {
  		
  		
			System.out.println("Module : " + rs.getString(1) + "Code : " + rs.getString(2));
  	



	}





	



	}

	catch(SQLException e)

	{
			e.printStackTrace();
	}

	catch(ClassNotFoundException e){

	}


}


}



	

