package BaiTap3;

/**
 *
 * @author Acer
 */
public class SinhVienIT extends SinhVienPoly{
 
  public double DiemJava;
  public double DiemCSS;
  public double DiemHTML;

  public SinhVienIT(String HoTen, String NganhHoc, double DiemJava, double DiemCSS, double DiemHTML) {
    super(HoTen, NganhHoc);
    this.DiemJava = DiemJava;
    this.DiemCSS = DiemCSS;
    this.DiemHTML = DiemHTML;
  }

  @Override
  public double getDiem() {
    return (2 * this.DiemJava + this.DiemHTML + this.DiemCSS) / 4;
  };

    String getHocLuc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
