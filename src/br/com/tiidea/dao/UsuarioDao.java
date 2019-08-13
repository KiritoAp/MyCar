/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tiidea.dao;

import br.com.tiidea.classe.Usuario;
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
public class UsuarioDao {

    public boolean checkLogin(String Login, String Senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM cliente WHERE Login = ? and Senha = ?");
            stmt.setString(1, Login);
            stmt.setString(2, Senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(Usuario u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (Login,Senha,Nome,DataNascimento,Sexo,CPF,Telefone,Email,Endereco,QuantidadeCarro,CEP,Estado,Cidade,Bairro,Numero,Complemento)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, u.getLoginUser());
            stmt.setString(2, u.getPasswordUser());
            stmt.setString(3, u.getNameUser());
            stmt.setString(4, u.getDateUser());
            stmt.setInt(5, u.getGenderUser());
            stmt.setString(6, u.getCpfUser());
            stmt.setString(7, u.getPhoneUser());
            stmt.setString(8, u.getEmailUser());
            stmt.setString(9, u.getAddressUser());
            stmt.setString(10, u.getAmountCarUser());
            stmt.setString(11, u.getCepUser());
            stmt.setString(12, u.getCountryUser());
            stmt.setString(13, u.getCityUser());
            stmt.setString(14, u.getDistrictUser());
            stmt.setString(15, u.getNumberHouseUser());
            stmt.setString(16, u.getComplementHouseUser());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Veiculo> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> cars = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Veiculo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setIdCar(rs.getInt("idVeiculo"));
                veiculo.setBrandCar(rs.getString("Marca"));
                veiculo.setModelCar(rs.getString("Modelo"));
                veiculo.setPlateCar(rs.getString("Placa"));
                veiculo.setYearCar(rs.getInt("Ano"));
                cars.add(veiculo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cars;

    }

    public List<Veiculo> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> cars = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo WHERE idCliente LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculo car = new Veiculo();

                car.setIdCar(rs.getInt("idVeiculo"));
                car.setModelCar(rs.getString("Modelo"));
                car.setYearCar(rs.getInt("Ano"));
                car.setPlateCar(rs.getString("Placa"));
                car.setBrandCar(rs.getString("Marca"));
                cars.add(car);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cars;

    }

    public void update(Usuario u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET Nome = ? ,Login = ?,Senha = ? WHERE idCliente = ?");
            stmt.setString(1, u.getNameUser());
            stmt.setString(2, u.getLoginUser());
            stmt.setString(3, u.getPasswordUser());
            stmt.setInt(4, u.getIdUser());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(Usuario u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE idCliente = ?");
            stmt.setInt(1, u.getIdUser());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public List<Usuario> getIdUser (Usuario u) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> users = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE Login = ?, Senha = ? LIKE ?");
            String desc = null;
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario user= new Usuario();

                user.setIdUser(rs.getInt("idCliente"));
                user.setNameUser(rs.getString("Nome"));
                user.setEmailUser(rs.getString("Email"));
                user.setCpfUser(rs.getString("CPF"));
                users.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return users;
        
    }

}
