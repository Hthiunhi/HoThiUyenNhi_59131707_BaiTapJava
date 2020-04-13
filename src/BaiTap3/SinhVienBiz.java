/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Acer
 */
public class SinhVienBiz extends SinhVienPoly{  
  public double DiemMarketing;
  public double DiemSales;

  public SinhVienBiz(String HoTen, String NganhHoc, double DiemMarketing, double DiemSales) {
    super(HoTen, NganhHoc);
    this.DiemMarketing = DiemMarketing;
    this.DiemSales = DiemSales;
  }

  @Override
  public double getDiem() {
    return (2 * this.DiemMarketing + this.DiemSales) / 3;
  }; 
}
