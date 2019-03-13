package connect;

import java.sql.*;

public class Zboruri {


    public void findAll() throws SQLException {
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        ps = connection.prepareStatement("SELECT * FROM zboruri;");
        rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("ID:" + rs.getInt(3) + " Data plecare:" + rs.getTimestamp(1)+" Data sosire:" + rs.getTimestamp(2) + " Plecare:" + rs.getString(4)+" Sosire:" + rs.getString(2));
        }
    }
    public void insert() throws SQLException {
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps = null;
        String abc = "Bucuresti";
        String xyz = "Chisinau";

        Timestamp a=Timestamp.valueOf("2019-09-17 12:00:09") ;
        Timestamp b=Timestamp.valueOf("2019-09-17 14:00:09") ;
        int c=42;

        ps=connection.prepareStatement("INSERT INTO zboruri (data_plecare,data_sosire,idzboruri,plecare,sosire)" + " VALUES (?,?,?,?,?)");
        ps.setTimestamp(1, a);
        ps.setTimestamp(2, b);
        ps.setInt(3, c);
        ps.setString(3, abc);
        ps.setString(3, xyz);
        ps.executeUpdate();
    }


}
