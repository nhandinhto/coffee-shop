/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.HoaDon;

/**
 *
 * @author Nhan
 */
public class HoaDonDAO {
    public static ArrayList<HoaDon> layDsHoaDon()
    {
        ArrayList<HoaDon> dsHD = new ArrayList<>();
        try {
            String sqlSelect = "Select * from HOADON";
            SQLServerProvider provider = new SQLServerProvider();
            provider.Open();
            ResultSet rs = provider.executeQuery(sqlSelect);
            while(rs.next())
            {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString("MAHD"));
                hd.setMaKH(rs.getString("MAKH"));
                hd.setMaBan(rs.getString("MABAN"));
                hd.setMaNV(rs.getString("MANV"));
                hd.setNgayLap(rs.getDate("NGAYLAP"));
                hd.setGiamGia(rs.getFloat("GIAMGIA"));
                hd.setThanhTien(rs.getFloat("THANHTIEN"));
                hd.setTienBan(rs.getFloat("TIENBAN"));
                dsHD.add(hd);
            }
            provider.Close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return dsHD;
    }
}
