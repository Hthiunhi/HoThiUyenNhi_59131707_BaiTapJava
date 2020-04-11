package BaiTap2;

import BaiTap1.NhanVien;
/**
 *
 * @author Acer
 */
public class Main {
    /**
     * @param args the command line arguments
     */
     public static void Main(String[] args) {
        NhanVien nv1 = new NhanVien("Phan","20","Phu Yen", 6000, 540);
        NhanVien nv2 = new NhanVien("Phong","20","Quang Ngai", 5000, 200);
        NhanVien nv3 = new NhanVien("Cao","38","Quy Nhon", 4400, 700);
        NhanVien nv4 = new NhanVien("Duc","22","Ninh Hoa", 5700, 410);
        NhanVien nv5 = new NhanVien("Tai","22","Da Nang", 1777, 630);
        var qlnv = new QuanLyNhanVien();
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
}
