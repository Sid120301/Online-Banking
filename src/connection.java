package banking;

import java.sql.*;

public class connection {

        Connection c;
        Statement s;
        public connection(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Sid@8338");
                s =c.createStatement();



            }catch(Exception e){
                System.out.println(e);
            }
        }
    }


