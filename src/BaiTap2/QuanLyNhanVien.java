package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class QuanLyNhanVien {
   ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    
    @Override
    public void Them(NhanVien nv) {
        listNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (int i=0; i < listNhanVien.size(); i++) {
            System.out.println("Nhan vien thu: "+(i+1));
            System.out.println(listNhanVien.get(i).getThongTin());
     
        }
        
    }
}
