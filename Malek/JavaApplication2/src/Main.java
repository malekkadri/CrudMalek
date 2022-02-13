
import Service.ServiceUsers;
import Service.ServiceUsers;
import users.Users;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Malik
 */

public class Main {
    public static void main(String[] args) {
        ServiceUsers su = new ServiceUsers();
        su.ajouter(new Users(7,"jamil","kadri","male@k.e","1234","malik"));
        su.modifier(new Users(7,"libi","libi","male@k.e","1234","libya"));
        //su.supprimer(new Users(7,"jamil","kadri","male@k.e","1234","malik"));
        System.out.println(su.afficher());
        //ServiceUsers2 sp2 = new ServiceUsers2();
        //sp2.ajouter(new Users("Omar", "Omar"));
    }
}
