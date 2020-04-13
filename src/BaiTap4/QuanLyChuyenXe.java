/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class QuanLyChuyenXe{
    public ArrayList<ChuyenXe> DSCX = new ArrayList<>();
    
    public void Themcx(ChuyenXe n){
        DSCX.add(n);
    }
    public void Xuatcx(){
        for(int i=0; i < DSCX.size(); i++)
            DSCX.get(i).Xuat();
    }
    
    public double TongDoanhThuNoiThanh(){
        double sum = 0;
        for(ChuyenXe n : DSCX){
            if(n instanceof ChuyenXeNoiThanh)
                sum += n.DoanhThu;
        }
        return sum;
    }
    public double TongDoanhThuNgoaiThanh(){
        double Sum = 0;
        for(ChuyenXe n : DSCX){
            if(n instanceof ChuyenXeNgoaiThanh)
                Sum += n.DoanhThu;
        }
        return Sum;
    }
    public double TongDoanhThuChuyenXe(){
        double Sum = 0;
        for(ChuyenXe n : DSCX)
            Sum += n.DoanhThu;
        return Sum;
    }
}
