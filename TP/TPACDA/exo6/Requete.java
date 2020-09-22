import java.sql.*;

public class Requete 
{

/*
		
		PreparedStatement pst = cnx.prepareStatement("SELECT Module.codes, Champ.codes FROM Champ,Module WHERE Champ.id = Module.id");
		ResultSet rs = pst.executeQuery();
		*/


	public int nbrModule()//Récupere le nombre de module dans la db
	{
		int countMdl = 0;
		try
		{
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT COUNT(codes) FROM Module");
		ResultSet rs = pst.executeQuery();

		while(rs.next())
		countMdl =  rs.getInt(1);
		System.out.println(countMdl);
		}

		catch(ClassNotFoundException e)
	{

	}

	catch(SQLException e)

	{
			e.printStackTrace();
	}

	return countMdl;

		
		
	}




	public String Module(/*int nbrModule*/)
	{
		String mdl = "";
		int i = 1;
		try
		{

		Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT Module.codes FROM Champ,Module WHERE Champ.id = Module.id");
		ResultSet rs = pst.executeQuery();




		while(rs.next()) 
		{

		System.out.println("Module : " + rs.getString(2));
		mdl = rs.getString(1);

		}
	}

	catch(SQLException e)
	{
		e.printStackTrace();
	}

	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}


	return mdl;

	}









	

}

	


	


