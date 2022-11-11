
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VongDau;


public class VongDauDAO extends DAO{
    public VongDauDAO(){
        super();
    }
    
    public ArrayList<VongDau> getVongDauDaDau() throws SQLException{
        ArrayList<VongDau> vongdau = new ArrayList<>();
        String sql = "SELECT * FROM tblvongdau";
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                VongDau vd = new VongDau();
                vd.setID(rs.getString("id"));
                vd.setName(rs.getString("ten"));
                vd.setTime(rs.getDate("thoigian"));
                vd.setAddress(rs.getString("diadiem"));
                vongdau.add(vd);
            }
//            conn.close();
            
        }catch (SQLException  e) {
            e.printStackTrace();
        }
        return vongdau;
    } 
}
