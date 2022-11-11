
package model;

import java.io.Serializable;
import java.util.Date;


public class CoThu implements Serializable{
    private String ID;
    private String name;
    private int namsinh;
    private String quoctich;
    private Float elo;
    private String des;

    public CoThu() {
        super();
    }

    public CoThu(String name, int namsinh, String quoctich, Float elo, String des) {
        super();
        this.name = name;
        this.namsinh = namsinh;
        this.quoctich = quoctich;
        this.elo = elo;
        this.des = des;
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

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public Float getElo() {
        return elo;
    }

    public void setElo(Float elo) {
        this.elo = elo;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
}
