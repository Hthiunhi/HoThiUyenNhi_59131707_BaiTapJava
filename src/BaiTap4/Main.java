package BaiTap4;
/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        
        ChuyenXe noithanh1 = new ChuyenXeNoiThanh("01","Cao Thi Hong Phan","N-001",2000000,12,720);
        ChuyenXe noithanh2 = new ChuyenXeNoiThanh("02","Doan Thanh Nam","N-002",3800000,12,720);
        ChuyenXe noithanh3 = new ChuyenXeNoiThanh("03","Nguyen Huyen My","N-003",2200000,120,720);
        
        QLCX.Themcx(noithanh1);
        QLCX.Themcx(noithanh2);
        QLCX.Themcx(noithanh3);
        
        ChuyenXe ngoaithanh1 = new ChuyenXeNgoaiThanh("01","Do Nhat Minh","NG-01",7000000,"Nha Trang - SaiGon",1);
        ChuyenXe ngoaithanh2 = new ChuyenXeNgoaiThanh("02","Pham Huu Huy","NG-02",8100000,"Nha Trang - Da Nang",2);
        ChuyenXe ngoaithanh3 = new ChuyenXeNgoaiThanh("03","Tran Quoc Toan","NG-03",500000,"Nha Trang - Ha Noi",6);
        
        QLCX.Themcx(ngoaithanh1);
        QLCX.Themcx(ngoaithanh2);
        QLCX.Themcx(ngoaithanh3);
        
        QLCX.Xuatcx();
        System.out.println("\nTong doanh thu noi thanh: " + QLCX.TongDoanhThuNoiThanh() + "\nTong doanh thu ngoai thanh: " + QLCX.TongDoanhThuNgoaiThanh()
        + "\nTong doanh thu cac chuyen xe: " + QLCX.TongDoanhThuChuyenXe());
    }
}
