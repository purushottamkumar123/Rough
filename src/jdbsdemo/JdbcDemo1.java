package jdbsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class JdbcDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //steps1:Loading a driver
        //class.forName("");
        Class.forName("com.mysql.cj.jdbc.Driver");
        //steps2: Creating a connection
        String user="root";
        String pass="root";
        String url="jdbc:mysql://localhost:3306/9pmbatchselenium";
        Connection conn= DriverManager.getConnection(url,user,pass);

        //steps3:Creating Statement
        Statement st=conn.createStatement();

        //Steps4: Executing query
        //String sql="insert into student value(2,'anshu','civil',79,'puru@gmail.com',943104,'Buddhijivi')";
        //String sql="update student set name ='ganesh' where rno=2";
        //String sql="insert into student value(7,'Vibhaee','electritt',556,'vibha@gmail.com',9431,'Rms colony')";
        //String sql="update student set name ='shanakr' where rno=1";
        //String sql="insert into student value(3,'qwe','bba',33,'weghghg',12333,'asdf')";
       //String sql="insert into student value(3,'qwe','bba',33,'wehg@gmail.com',12333,'asdf  dd')";
       // String sql="update student set rno=4 where branch='bba'";
        String sql="insert int o student value (8,'Manoj','Chemical',90,'Manoj@gmail.com',9431002123,'Barai')";
        //String sql="insert into student value(1,'purushottam','Mechanical',33.3,1)";
       // String sql="insert into student value(2,'Anshu','Civil',33.3,1)";
        //String sql="insert into student value(3,'Vibha','electrical',23.3,2)";
       // String sql="insert into student value(4,'Aditi','Chemical',13.3,3)";
        //String sql="insert into student value(5,'Richa','CS',53.3,4)";
        st.executeUpdate(sql);




    }
}
