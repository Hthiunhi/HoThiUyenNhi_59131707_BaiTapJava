package BaiTap3;

/**
 *
 * @author Acer
 */
public class Main {
   public static void Main(String[] args) {
    SinhVienIT IT = new SinhVienIT("Tran Quoc Thang", "CNTT", 5, 6, 7);
    SinhVienBiz BIZ = new SinhVienBIZ("Phan Huu Nghia", "BIZ", 8, 9);
    IT.Xuat();
    System.out.println("diem: " + IT.getDiem());
    System.out.println("hoc luc: " + IT.getHocluc());
    BIZ.Xuat();
    System.out.println("diem: " + BIZ.getDiem());
    System.out.println("hoc luc: " + BIZ.getHocluc());
  } 
}
