/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.NhanVien;
/**
 *
 * @author Nhan
 */
public class NhanVienDAO {
    public static ArrayList<NhanVien> layDsNhanVien(){
        ArrayList<NhanVien> dsNV = new ArrayList<>();
        try {
            String sqlSelect ="Select * From NHANVIEN";
            SQLServerProvider provider = new SQLServerProvider();
            provider.Open();
            ResultSet rs = provider.executeQuery(sqlSelect);
            while(rs.next())
            {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setHotenNV(rs.getString("HOTENNV"));
                nv.setMaCV(rs.getString("MACV"));
                nv.setGioiTinh(rs.getString("GIOITINH"));
                nv.setNgaySinh(rs.getDate("NGAYSINH"));
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setCa(rs.getInt("CA"));
                
                dsNV.add(nv);
            }
            provider.Close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return dsNV;
    }
    
}
