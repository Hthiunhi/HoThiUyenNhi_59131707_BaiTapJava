
package BaiTap1;
import java.util.Scanner;

public class NhanVien {
//Khai bao cac thuoc tinh
    private String Ten;
    private String Tuoi;
    private String DiaChi;
    private double Luong;
    private int Tongsogiolam;
    
    NhanVien(){
        Ten="Ho Thi Uyen Nhi";
        Tuoi="20";
        DiaChi="Ninh Hòa";
        Luong=6000000;
        Tongsogiolam=880;
    }
    
    public NhanVien(String Ten, String Tuoi, String DiaChi, double Luong, int Tongsogiolam){
        this.Ten=Ten;
        this.Tuoi=Tuoi;
        this.DiaChi=DiaChi;
        this.Luong=Luong;
        this.Tongsogiolam=Tongsogiolam;
        
    }

    String getTen(){
         return Ten;
    }
    void setTen(String Ten){
         this.Ten=Ten;
    }
    String getTuoi(){
         return Tuoi;
    }
    void setTuoi(String Tuoi){
         this.Tuoi=Tuoi;
    }
    String getDiaChi(){
         return DiaChi;
    }
    void setDiaChi(String DiaChi){
         this.DiaChi=DiaChi;
    }
    double getLuong(){
         return Luong;
    }
    void setLuong(double Luong){
         this.Luong=Luong;
    }
    int getTongsogiolam(){
         return Tongsogiolam;
    }
    void setTongsogiolam(int Tongsogiolam){
         this.Tongsogiolam=Tongsogiolam;
    }
    void Nhapthongtin(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Ten nhan vien:");
       Ten=sc.nextLine();
       System.out.print("Tuoi nhan vien:");
       Tuoi=sc.nextLine();
       System.out.print("Dia chi cua nhan vien:");
       DiaChi=sc.nextLine();
       System.out.print("Luong nhan vien:");
       Luong=sc.nextDouble();
       System.out.print("Tong so gio lam:");
       Tongsogiolam=sc.nextInt();
    }
    void Xuatthongtin(){
       System.out.println("Ten cua nhan vien:"+Ten);
       System.out.println("Tuoi cua nhan vien:"+Tuoi);
       System.out.println("Dia chi cua nhan vien:"+DiaChi);
       System.out.println("Luong nhan vien:"+Luong);
       System.out.println("tong so gio lam:"+Tongsogiolam); 
       System.out.println("Tien thuong:"+TinhThuong());
       System.out.println("Tong luong nhan vien:"+(Luong+TinhThuong()));
    }
     double TinhThuong(){
        double Thuong;
            if(Tongsogiolam>=200)
                Thuong=Luong*0.2;
            else if(Tongsogiolam>=100 && Tongsogiolam<200)
                Thuong=Luong*0.1;
            else Thuong=0;
            return Thuong;
        }
}
