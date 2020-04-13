package BaiTap4;
/**
 *
 * @author Acer
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
     public String NoiDen;
    public int SoNgayDiDuoc;
    
    public ChuyenXeNgoaiThanh(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu, String NoiDen, int SoNgayDiDuoc) {
        super(MaSoChuyen,HoTenTaiXe,SoXe,DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }

    @Override
    public void Xuat(){
        super.Xuat(); 
        System.out.println("Noi den: " + this.NoiDen 
            + "\nSo Ngay Di Duoc: " + this.SoNgayDiDuoc + "\n");
    } 
}
