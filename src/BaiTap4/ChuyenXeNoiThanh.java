package BaiTap4;

/**
 *
 * @author Acer
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
    public int SoTuyen;
    public int SoKm;
    
    public ChuyenXeNoiThanh(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu, int SoTuyen, int SoKm) {
        super(MaSoChuyen,HoTenTaiXe,SoXe,DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SoKm = SoKm;
    }

    @Override
    public void Xuat(){
        super.Xuat(); 
        System.out.println("So tuyen xe: " + this.SoTuyen + "\nSo km di duoc: " + this.SoKm + "\n");
    }
}
