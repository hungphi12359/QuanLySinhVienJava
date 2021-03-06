package com.mycompany.duan1.X;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XJdbc {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;database=QuanLySinhVien2";
    private static String username = "sa";
    private static String password = "";
 public static Connection conn;
static {
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException ex) {
        throw new RuntimeException(ex);
    }
}
  public  static  Connection getConnection() throws SQLException{
         try {
             Connection cons = null;
             Class.forName(driver);
             cons = DriverManager.getConnection(dburl, username, password);
             return cons;
         } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
         }
         return null;
  }
//       public static void main(String[] args)throws SQLException {
//        Connection c = getConnection();
//        System.out.println("Ket noi thanh cong");
//        c.close();
//    }
  
    public static PreparedStatement getStmt(String sql, Object...args) throws SQLException{
        Connection connection = DriverManager.getConnection(dburl, username, password);
        PreparedStatement pstmt = null;
        if(sql.trim().startsWith("{")){
            pstmt = connection.prepareCall(sql);
        }
        else{
            pstmt = connection.prepareStatement(sql);
        }
        for(int i=0;i<args.length;i++){
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }
    public static void update(String sql, Object...args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            try {
                stmt.executeUpdate();
            } 
            finally{
                stmt.getConnection().close();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Th???c hi???n c??u l???nh SQL truy v???n (SELECT) ho???c th??? t???c l??u truy v???n d??? li???u
     * @param sql l?? c??u l???nh SQL ch???a c?? th??? ch???a tham s???. N?? c?? th??? l?? m???t l???i g???i th??? t???c l??u
     * @param args l?? danh s??ch c??c gi?? tr??? ???????c cung c???p cho c??c tham s??? trong c??u l???nh sql
     */    
    public static ResultSet query(String sql, Object...args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            return stmt.executeQuery();
        } 
        catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public static Object value(String sql, Object...args) {
        try {
            ResultSet rs = XJdbc.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   
    
}
