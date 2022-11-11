
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class TranDau implements Serializable{
    private String ID;
    private String ten;
    private Date thoigian;
    private String des;
    private ArrayList<CoThuTGia> ctThamGia;

    public TranDau() {
        super();
        ctThamGia = new ArrayList<>();
    }

    public TranDau(String ten, Date thoigian, String des, ArrayList<CoThuTGia> ctThamGia) {
        super();
        this.ten = ten;
        this.thoigian = thoigian;
        this.des = des;
        ctThamGia = new ArrayList<>();
    }
    
    public ArrayList<CoThuTGia> getCtThamGia() {
        return ctThamGia;
    }

    public void setCtThamGia(ArrayList<CoThuTGia> ctThamGia) {
        this.ctThamGia = ctThamGia;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
}