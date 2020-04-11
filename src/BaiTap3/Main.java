package BaiTap3;

/**
 *
 * @author Acer
 */
public class Main {
   public static void Main(String[] args) {
    SinhVienIT IT = new SinhVienIT("Nguyen Van A", "CNTT", 9, 10, 10);
    SinhVienBiz BIZ = new SinhVienBiz("Nguyen Van B", "Biz", 5, 6);
    IT.Xuat();
    System.out.println("diem: " + IT.getDiem());
    System.out.println("hoc luc: " + IT.getHocluc());
    BIZ.Xuat();
    System.out.println("diem: " + BIZ.getDiem());
    System.out.println("hoc luc: " + BIZ.getHocluc());
  } 
}
