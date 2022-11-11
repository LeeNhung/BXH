
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.TKTranDau;


public class TKTranDauDAO extends DAO{

    public TKTranDauDAO() {
        super();
    }
    
    public ArrayList<TKTranDau> getTKTranDau(Date d, String IDCoThu)throws SQLException{
        
        ArrayList<TKTranDau> tktrandau = new ArrayList<>();
        String sql = "select f.trandau_id , f.tanggiamelo "+
//",(select a.ten from covua.tbltrandau b,  covua.tblcothu a, covua.tblvongdau c, covua.tblcothuthamgia f "+
//"where  a.id != ? and a.id = f.cothu_id and  c.id = b.vongdau_id and b.id = f.trandau_id and c.thoigian <= ? "+
//"and b.id in (select trandau_id from covua.tblcothuthamgia where cothu_id = ? )) as tendoithu "+
"from covua.tbltrandau b,  covua.tblcothu a, covua.tblvongdau c, covua.tblcothuthamgia f "+
"where  a.id = ? and a.id = f.cothu_id and  c.id = b.vongdau_id and b.id = f.trandau_id and c.thoigian <= ?";
        
        String sql1 = "select a.ten  as tendoithu from covua.tbltrandau b,  covua.tblcothu a, covua.tblvongdau c, covua.tblcothuthamgia f " +
"where  a.id !=? and a.id = f.cothu_id and  c.id = b.vongdau_id and b.id = f.trandau_id and c.thoigian <= ?" +
"and b.id in (select trandau_id from covua.tblcothuthamgia where cothu_id = ? ) ;";
        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
                        
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt.setString(1, IDCoThu );
            pstmt.setString(2,sdf.format(d) );
//            pstmt.setString(3,  IDCoThu );
//            pstmt.setString(4, IDCoThu );
//            pstmt.setString(5, sdf.format(d) );
            
            pstmt1.setString(1,  IDCoThu );
            pstmt1.setString(2, sdf.format(d) );
            pstmt1.setString(3, IDCoThu );
            ResultSet rs = pstmt.executeQuery();
            ResultSet rs1 = pstmt1.executeQuery();
            while (rs.next()) {
                TKTranDau tktd = new TKTranDau();
                tktd.setID(rs.getString("trandau_id"));
                tktd.setTangGiamElo(rs.getFloat("tanggiamelo"));
                
                if(rs1.next()){               
                tktd.setTenDoiThu(rs1.getString("tendoithu"));
                
//                tktrandau.add(tktd);
                }
                tktrandau.add(tktd);
            }
        }catch (Exception  e) {
            e.printStackTrace();
        }            
        return tktrandau;

    }
    
}
