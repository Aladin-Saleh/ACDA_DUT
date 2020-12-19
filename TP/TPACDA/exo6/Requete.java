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
		//System.out.println(countMdl);
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




	public void Module(String[] module)
	{

		int i = 0;

		try
		{
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT codes FROM Module");
		ResultSet rs = pst.executeQuery();

		while(rs.next()){

		module[i] =  rs.getString(1);
		//System.out.println(module[i]);

		i++;

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



	public int getIDModule(String module)
	{

		int id = 0;
		try
		{

			Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

			PreparedStatement pst = cnx.prepareStatement("SELECT id FROM Module WHERE codes = (?)");
			pst.setString(1,module);
			ResultSet rs = pst.executeQuery();

			while(rs.next())
			{
				//System.out.println(module + " : " + rs.getInt(1));
				id = rs.getInt(1);

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


		return id;




	}


	public int nbrChamp(int id)//Récupere le nombre de champ dans la db
	{
		int countChmp = 0;
		try
		{
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT COUNT(codes) FROM Champ WHERE id = (?)");
		pst.setInt(1,id);
		ResultSet rs = pst.executeQuery();

		while(rs.next())
		countChmp =  rs.getInt(1);
		//System.out.println("Champ nbr : " + countChmp);
		}

		catch(ClassNotFoundException e)
	{

	}

	catch(SQLException e)

	{
			e.printStackTrace();
	}

	return countChmp;

		
		
	}





	public void getChamp(String[] module,int id)
	{

		int i = 0;

		try
		{
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		
		PreparedStatement pst = cnx.prepareStatement("SELECT codes FROM Champ WHERE id = (?)");
		pst.setInt(1,id);
		ResultSet rs = pst.executeQuery();

		while(rs.next()){

		module[i] =  rs.getString(1);
		//System.out.println(module[i]);

		i++;

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

	


	


