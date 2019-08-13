/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tiidea.dao;
import br.com.tiidea.classe.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author 801501279
 */
public class VeiculoDao {
    

     public void create(Veiculo u) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {                                                               
            stmt = con.prepareStatement("INSERT INTO veiculo (fkidcliente,Placa,Marca,Modelo,Ano,Adaptado)VALUES(?,?,?,?,?,?)");         
            stmt.setObject(1, u.getFkidcliente());  
            stmt.setString(2, u.getPlateCar());
            stmt.setString(3, u.getBrandCar());
            stmt.setString(4, u.getModelCar());
            stmt.setInt(5, u.getYearCar());
            stmt.setString(6, u.getAdapted());
               
            
           
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    
    
}
