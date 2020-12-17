
import java.sql.*;
import java.util.*;

import javax.print.PrintException;

/**
 * 
 */
public class InteractionBD {

    public InteractionBD() {

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
     * 
     */
    private Connection conectBD;

    /**
     * 
     */
    private PreparedStatement request;

    public int[] getCountReponse() {
        int[] countReponseArray = new int[20];
        int i = 0;
        try{
            PreparedStatement pst = conectBD.prepareStatement("SELECT COUNT(*) FROM Questions GROUP BY reponse");
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                //System.out.println(rs.getInt(1));
                countReponseArray[i] = rs.getInt(1);
                i++;
                }
        }catch(SQLException es){
            es.printStackTrace();
        }

      for (int j = i; j < 20; j++) {
        countReponseArray[j] = 1;
      }
        return countReponseArray;
    }





}