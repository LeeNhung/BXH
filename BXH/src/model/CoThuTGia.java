
package model;

import java.io.Serializable;


public class CoThuTGia implements Serializable  {
    private String id;
    private CoThu ct;
    private Float diemdd;
    private Float tgelo;

    public CoThuTGia() {
        super();
    }

    public CoThuTGia(CoThu ct, Float diemdd, Float tgelo) {
        super();
        this.ct = ct;
        this.diemdd = diemdd;
        this.tgelo = tgelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CoThu getCt() {
        return ct;
    }

    public void setCt(CoThu ct) {
        this.ct = ct;
    }

    public Float getDiemdd() {
        return diemdd;
    }

    public void setDiemdd(Float diemdd) {
        this.diemdd = diemdd;
    }

    public Float getTgelo() {
        return tgelo;
    }

    public void setTgelo(Float tgelo) {
        this.tgelo = tgelo;
    }

    
    
}
