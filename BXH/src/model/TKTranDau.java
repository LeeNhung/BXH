
package model;


public class TKTranDau extends TKCoThu{
    private String ID;
    private String TenDoiThu;
    private Float tangGiamElo;

    public TKTranDau() {
        super();
    }

    public TKTranDau( String TenDoiThu, Float tangGiamElo) {
        this.TenDoiThu = TenDoiThu;
        this.tangGiamElo = tangGiamElo;
    }

    public String getTenDoiThu() {
        return TenDoiThu;
    }

    public void setTenDoiThu(String TenDoiThu) {
        this.TenDoiThu = TenDoiThu;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Float getTangGiamElo() {
        return tangGiamElo;
    }

    public void setTangGiamElo(Float tangGiamElo) {
        this.tangGiamElo = tangGiamElo;
    }
    
}
