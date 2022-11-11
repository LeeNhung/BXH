
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class VongDau implements Serializable{
    private String ID;
    private String name;
    private Date time;
    private String address;
    private ArrayList<TranDau> trandau;

    public VongDau() {
        super();
        trandau = new ArrayList<>();
    }

    public VongDau(String name, Date time, String address, ArrayList<TranDau> trandau) {
        super();
        this.name = name;
        this.time = time;
        this.address = address;
        trandau = new ArrayList<>();
    }

    public ArrayList<TranDau> getTrandau() {
        return trandau;
    }

    public void setTrandau(ArrayList<TranDau> trandau) {
        this.trandau = trandau;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
