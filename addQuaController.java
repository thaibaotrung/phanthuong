/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5cnpm;

import com.mycompany.helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author oOOo
 */
public class addQuaController {
    public boolean insert(quaService q) throws Exception{
        String sql = "insert into phatqua(hoTen, tuoi, qua, giatien) values(?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
             pstmt.setString(1, q.getHoTen());
              pstmt.setInt(2, q.getTuoi());
              pstmt.setString(3, q.getTenqua());
              pstmt.setInt(4, q.getGiatien());
                   return pstmt.executeUpdate() > 0;
        }
    }
}
