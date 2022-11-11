
package model;


public class TKCoThu extends CoThu{
    private Float tongDiem;
    private Float tongDiemDoiThu;
    private Float EloTucThoi;

    public TKCoThu() {
        super();
    }

    public TKCoThu(Float tongDiem, Float tongDiemDoiThu, Float EloTucThoi) {
        super();
        this.tongDiem = tongDiem;
        this.tongDiemDoiThu = tongDiemDoiThu;
        this.EloTucThoi = EloTucThoi;
    }

    public Float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(Float tongDiem) {
        this.tongDiem = tongDiem;
    }

    public Float getTongDiemDoiThu() {
        return tongDiemDoiThu;
    }

    public void setTongDiemDoiThu(Float tongDiemDoiThu) {
        this.tongDiemDoiThu = tongDiemDoiThu;
    }

    public Float getEloTucThoi() {
        return EloTucThoi;
    }

    public void setEloTucThoi(Float EloTucThoi) {
        this.EloTucThoi = EloTucThoi;
    }
    
    
    
}
