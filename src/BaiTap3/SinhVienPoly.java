package BaiTap3;

/**
 *
 * @author Acer
 */
public class SinhVienPoly {
    // attributes
  public String HoTen;
  public String NganhHoc;

  // constructor
  public SinhVienPoly(String HoTen, String NganhHoc) {
    this.HoTen = HoTen;
    this.NganhHoc = NganhHoc;
  }

  // methods
  // get diem (abstract method)
  public abstract double getDiem();

  // get hoc luc
  public String getHocluc() {
    if (this.getDiem() < 5) {
      return "Yeu";
    }
    if (this.getDiem() < 6.5) {
      return "Trung binh";
    }
    if (this.getDiem() < 7.5) {
      return "Kha";
    }
    if (this.getDiem() < 9) {
      return "Gioi";
    }
    return "Xuat sac";
  }

   public void Xuat() {
     System.out.println("Ho ten: " + this.HoTen + "Nganh hoc: " + this.NganhHoc );
   }
}
