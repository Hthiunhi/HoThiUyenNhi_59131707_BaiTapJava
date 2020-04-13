package BaiTap4;
/**
 *
 * @author Acer
 */
public abstract  class ChuyenXe {
    public String MaSoChuyen;
    public String HoTenTaiXe;
    public String SoXe;
    public double DoanhThu;
    
    public ChuyenXe(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu){
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }
     public void Xuat(){
         System.out.println("Ma so chuyen xe: " + this.MaSoChuyen + "\nHo va ten tai xe: " + this.HoTenTaiXe + "\nSo xe: "
         + this.SoXe + "\nDoanh thu: " + this.DoanhThu);
    }
}
