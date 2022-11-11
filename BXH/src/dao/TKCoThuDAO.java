
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.TKCoThu;



public class TKCoThuDAO extends DAO{

    public TKCoThuDAO() {
        super(); 
    }
    
    public ArrayList<TKCoThu> getTKCoThu(Date d) throws SQLException{
        ArrayList<TKCoThu> tkcothu = new ArrayList<>();
        String sql = "SELECT a.id, a.ten, a.namsinh, a.quoctich, "+
"(select sum(diemdatduoc) from covua.tblcothuthamgia b, covua.tblvongdau c, covua.tbltrandau d "+
"where a.id = b.cothu_id and  c.id = d.vongdau_id and d.id = b.trandau_id "+
"and c.thoigian <= ?)as tongdiem, "+
"(select (sum(tanggiamelo)+hesoelo) from covua.tblcothuthamgia b, covua.tblvongdau c, covua.tbltrandau d "+
"where a.id = b.cothu_id and  c.id = d.vongdau_id and d.id = b.trandau_id "+
"and c.thoigian <= ?) as elotucthoi "+
"from covua.tblcothu a order by tongdiem desc, elotucthoi desc;";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sdf.format(d) );
            pstmt.setString(2, sdf.format(d) );
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                TKCoThu tktd = new TKCoThu();
                tktd.setID(rs.getString("id"));
                tktd.setName(rs.getString("ten"));
                tktd.setNamsinh(rs.getInt("namsinh"));
                tktd.setQuoctich(rs.getString("quoctich"));
                tktd.setTongDiem(rs.getFloat("tongdiem"));
                tktd.setEloTucThoi(rs.getFloat("elotucthoi"));
                tkcothu.add(tktd);
            }
        }catch (Exception  e) {
            e.printStackTrace();
        }
        return tkcothu;
    }
}
