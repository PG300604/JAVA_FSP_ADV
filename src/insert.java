import java.io.*;
import java.sql.*;
class insert {
    public static void main(String args[]) throws IOException {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Enter empid");
        String eno = ds.readLine();

        System.out.println("Enter emp name");
        String ename = ds.readLine();
        System.out.println("Enter emp contact");
        String cno = ds.readLine();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //registering tye4 driver
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            Statement stmt = con.createStatement();
            String q1 = "insert into fsptable values('" + eno + "','" + ename + "','" + cno + "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0) {
                System.out.println("Insert Success");
            } else {
                System.out.println("Insert Unsuccess");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception Occured");
        }
    }
}