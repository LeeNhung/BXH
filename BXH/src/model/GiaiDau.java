
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class GiaiDau implements Serializable{
    private String ID;
    private String name;
    private Date namTC;
    private int lanTC;
    private String address;
    private String des;
    private ArrayList<VongDau> vongdau;
    private BTC btc;

    public GiaiDau() {
        super();
        vongdau = new ArrayList<>();
    }

    public GiaiDau(String name, Date namTC, int lanTC, String address, String des,BTC btc, ArrayList<VongDau> vongdau) {
        super();
        this.name = name;
        this.namTC = namTC;
        this.lanTC = lanTC;
        this.address = address;
        this.des = des;
        this.btc = btc;
        vongdau = new ArrayList<>();
    }

    public ArrayList<VongDau> getVongdau() {
        return vongdau;
    }

    public void setVongdau(ArrayList<VongDau> vongdau) {
        this.vongdau = vongdau;
    }

    public BTC getBtc() {
        return btc;
    }

    public void setBtc(BTC btc) {
        this.btc = btc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNamTC() {
        return namTC;
    }

    public void setNamTC(Date namTC) {
        this.namTC = namTC;
    }

    public int getLanTC() {
        return lanTC;
    }

    public void setLanTC(int lanTC) {
        this.lanTC = lanTC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
}

