/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import users.Users;
import utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Malik
 */
public class ServiceUsers implements IService<Users> {
    
    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(Users t) {
        try {
            String req = "INSERT INTO users (id,name,family,email,password,login) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, t.getId());
            pst.setString(2, t.getName());
            pst.setString(3, t.getFamily());
            pst.setString(4, t.getEmail());
            pst.setString(5, t.getPassword());
            pst.setString(6, t.getLogin());
            pst.executeUpdate();
            System.out.println("User ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(Users a) {
        try {
            String req = "DELETE FROM users where id=" + a.getId();
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("User supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Users t) {
        try {
            String req = "UPDATE users SET name=?,family=?,email=?,password=?,login=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, t.getName());
            pst.setString(2, t.getFamily());
            pst.setString(3, t.getEmail());
            pst.setString(4, t.getPassword());
            pst.setString(5, t.getLogin());
            pst.setInt(6, t.getId());
            pst.executeUpdate();
            System.out.println("Users modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
     public List<Users> afficher() {
        List<Users> list = new ArrayList<>();
        
        try {
            String req = "SELECT * FROM users";
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return list;
    }
}
   
      
