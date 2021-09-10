/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.Kho;
/**
 *
 * @author Nhan
 */
public class KhoDAO {
    public static ArrayList<Kho> layDsKho(){
        ArrayList<Kho> dsNL = new ArrayList<>();
        try {
            SQLServerProvider provider = new SQLServerProvider();
            provider.Open();
            String sqlSelect = "Select * from KHO";
            ResultSet rs = provider.executeQuery(sqlSelect);
            while(rs.next())
            {
                Kho k = new Kho();
                k.setDvt(rs.getString("DVT"));
                k.setGia(rs.getFloat("GIA"));
                k.setMaNL(rs.getString("MANL"));
                k.setMaNV(rs.getString("MANV"));
                k.setNgayNhap(rs.getDate("NHAYNHAP"));
                k.setNgayXuat(rs.getDate("NGAYXUAT"));
                k.setSlNhap(rs.getInt("SLNHAP"));
                k.setSlXuat(rs.getInt("SLXUAT"));
                k.setTenNL(rs.getString("TENNL"));
                dsNL.add(k);
            }
            provider.Close();
        } catch (Exception e) {
        }
        return dsNL;
    }
}
