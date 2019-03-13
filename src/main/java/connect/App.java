package connect;

import java.sql.SQLException;

public class App
{
    public static void main( String[] args ) throws SQLException
    {
        Zboruri zb = new Zboruri();
        zb.findAll();
        zb.insert();
        zb.findAll();

    }
}
