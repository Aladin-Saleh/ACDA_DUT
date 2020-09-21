import java.sql.*;

public class Requete 
{

	public Requete()
	{
		
	try
	{

		Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT Champ.codes,Module.codes FROM Champ,Module WHERE Champ.id = Module.id");
		ResultSet rs = pst.executeQuery();




		while(rs.next()) {
  		
  		
			System.out.println("Module : " + rs.getString(2) + "| Code : " + rs.getString(1));
  	



	}





	



	}

	catch(ClassNotFoundException e)
	{

	}

	catch(SQLException e)

	{
			e.printStackTrace();
	}

	}


}