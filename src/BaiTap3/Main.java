package BaiTap3;

/**
 *
 * @author Acer
 */
public class Main {
   public static void Main(String[] args) {
    SinhVienPoly PoLy = new SinhVienBIZ("Phan Huu Nghia", "BIZ", 8, 9);
    SinhVienIT IT = new SinhVienIT("Tran Quoc Thang", "CNTT", 5, 6, 7);
    SinhVienBiz BIZ = new SinhVienBIZ("Phan Huu Nghia", "BIZ", 10, 4);
    
    PoLy.Xuat();
    System.out.println("Diem: " + PoLy.getDiem() + "\nHoc luc: " + PoLy.getHocLuc() + "\n");
    IT.Xuat();
    System.out.println("Diem: " + IT.getDiem() + "\nHoc luc: " + IT.getHocLuc() + "\n");
    BIZ.Xuat();
    System.out.println("Diem: " + BIZ.getDiem() + "\nHoc luc: " + BIZ.getHocLuc() + "\n");
  } 
}
