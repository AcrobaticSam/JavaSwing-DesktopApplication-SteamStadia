package swing;
import java.sql.*;
class Dbconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public Dbconnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/game","root","");
            st=con.createStatement();
        }catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
    public void getData(){
        try{
            String query = "select * from data";
            rs=st.executeQuery(query);
            
        }catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
    public void setData(String sql)
    {
        try
        {
            st.executeUpdate(sql);
            getData();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean match(String a,String b) throws SQLException
    {
            String query = "select * from data";
            rs=st.executeQuery(query);
            System.out.println("Records :");
            while(rs.next()){
                String u=rs.getString("Username");
                String p=rs.getString("Password");
                System.out.println(u+" "+p);
                    System.out.println(a+" "+b);
                if(u.equals(a) && p.equals(b))
                {
                    
                    return true;
                }
            }
        return false;
    }
        public boolean match(String a,int n) throws SQLException
    {
            String u = null;
            String query = "select * from data";
            rs=st.executeQuery(query);
            System.out.println("Records :");
            while(rs.next()){
                if(n==1)
                {
                u=rs.getString("Username");
                if(u.equals(a))
                {
                    return true;
                }
                }
                else if(n==2)
                {
                u=rs.getString("Password");
                   if(u.equals(a))
                {
                    return true;
                }
                }
              
            }
        return false;
    }
}
