import java.sql.*;


public class vote 
{

public static void main(String[] args) {
		int somme = 0;

	
	
	
	try
	{

		Connection cnx = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
		Class.forName("org.mariadb.jdbc.Driver");

		PreparedStatement pst = cnx.prepareStatement("SELECT Point FROM Vote WHERE Competiteur = ?");
		pst.setString(1,args[0]);
		ResultSet rs = pst.executeQuery();

		PreparedStatement pst2 = cnx.prepareStatement("SELECT Votant FROM Vote WHERE Competiteur = ?");
		pst2.setString(1,args[0]);
		ResultSet rs2 = pst2.executeQuery();



		while(rs.next() && rs2.next()) {
  		
  		System.out.println(rs2.getString(1)+ " " + rs.getInt(1));

  			somme += rs.getInt(1);	

			}
			System.out.println("----------------------------");

			System.out.println(somme);



	}

	catch(SQLException e)

	{
			e.printStackTrace();
	}

	catch(ClassNotFoundException e){

	}


}


}