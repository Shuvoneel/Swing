/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author OLEE
 */
public class SaleDAO {

    public int save(Sale sale) {
        String sql = "insert into sales(sale_no,p_id,c_id,p_qnty,p_price) values(?,?,?,?,?)";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sale.getSaleNo());
            ps.setInt(2, sale.getProduct().getId());
            ps.setInt(3, sale.getCust().getId());
            ps.setDouble(4, sale.getP_qty());
            ps.setDouble(5, sale.getPrice());
            ps.execute();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    //Getting exsting sales number from db
    
    public List<Integer> getSalesNums() {
        List<Integer> salesNums = new ArrayList<>();
        String sql = "select * from sales";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                salesNums.add(rs.getInt(1));
            }
        } catch (Exception e) {
            
        }

        return salesNums;
    }
    
    //For generating ramdom and unique number
    
    public int getUniqueSaleNo(){
        int saleNo = (int)(Math.random()*1000000);
        System.out.println(getSalesNums());
        while(getSalesNums().contains(saleNo)){
            saleNo = new Random(6).nextInt();
        }
        return saleNo;
        
    }
    

    
}
