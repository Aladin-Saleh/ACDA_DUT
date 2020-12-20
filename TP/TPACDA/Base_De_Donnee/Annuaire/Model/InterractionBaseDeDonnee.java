import java.sql.*;
import java.util.*;


/**
 * 
 */
public class InterractionBaseDeDonnee {




   private PreparedStatement pst;
    /**
     * 
     */
    private Connection conectBD;


    public InterractionBaseDeDonnee()
    {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        }catch(Exception ex){
                System.out.println("Dommage : "+ex);
        }
 
        try{
            
            conectBD = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh","saleh", "aladin.saleh");
            }
            catch(SQLException ex){

                System.out.println("SQLException: "+ex.getMessage());
            }
    }

    /**
     * @param nom
     */
    public void addUser(String nom,String num) {
        // TODO implement here
        try{
            PreparedStatement pst = conectBD.prepareStatement("INSERT INTO ACDA33(NameUser,NumUser) VALUES(?,?)");
            pst.setString(1, nom);
            pst.setString(2, num);

            ResultSet rs = pst.executeQuery();
        }catch(SQLException es){
            es.printStackTrace();
        }
        System.out.println("addName");

    }

    

    /**
     * @param num
     */
    public void updateUserName(String num,String nName) 
    {
        System.out.println("updateUName");

        // TODO implement here
        try{
            PreparedStatement pst = conectBD.prepareStatement("UPDATE ACDA33 SET NameUser = ? WHERE NumUser = ?");
            pst.setString(1, nName);
            pst.setString(2, num);
            pst.executeUpdate();
        }catch(SQLException es){
            es.printStackTrace();
        }
    }

    /**
     * @param username
     */
    public void updateUserNum(String username,String nNum) 
    {
        System.out.println("updateUNum");
        // TODO implement here
        try{
            //PreparedStatement pst = conectBD.prepareStatement("UPDATE ACDA33 SET NumUser ="+nNum+" WHERE NameUser ="+username);
            PreparedStatement pst = conectBD.prepareStatement("UPDATE ACDA33 SET NumUser =? WHERE NameUser =?");
            pst.setString(1, nNum);
            pst.setString(2, username);
            pst.executeUpdate();
        }catch(SQLException es){
            es.printStackTrace();
        }
    }

    public boolean isNameExist(String usernum)
    {
        int count = 0;
        try{
            PreparedStatement pst = conectBD.prepareStatement("SELECT COUNT(NameUser) FROM ACDA33 WHERE NameUser = ?");
            pst.setString(1, usernum);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                count = rs.getInt(1);
                System.out.println(count);
            }
        }catch(SQLException es){
            es.printStackTrace();
        }
        if(count == 1 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isNumExist(String usernume)
    {
        int count = 0;
        try{
            PreparedStatement pst = conectBD.prepareStatement("SELECT COUNT(NumUser) FROM ACDA33 WHERE NumUser = ?");
            pst.setString(1, usernume);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                count = rs.getInt(1);
                System.out.println(count);
            }
        }catch(SQLException es){
            es.printStackTrace();
        }
        if(count == 1 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getNumUser(String username)
    {
        String num="";
        try{
            PreparedStatement pst = conectBD.prepareStatement("SELECT NumUser FROM ACDA33 WHERE NameUser = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                num = rs.getString(1);
                System.out.println(num);
            }
        }catch(SQLException es){
            es.printStackTrace();
        }
        return num;
    }

    public String getNameUser(String usernum)
    {
        String name="";
        try{
            PreparedStatement pst = conectBD.prepareStatement("SELECT NameUser FROM ACDA33 WHERE NumUser = ?");
            pst.setString(1, usernum);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                name = rs.getString(1);
                System.out.println(name);
            }
        }catch(SQLException es){
            es.printStackTrace();
        }
        return name;
    }


    
}