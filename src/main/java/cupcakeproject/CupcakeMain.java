/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeproject;

import datasource.UserDBMapper;
import entities.User;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lene_
 */
public class CupcakeMain {
    
    public static void main(String[] args) {
            UserDBMapper um = new UserDBMapper();
            User user = um.createUser("Adam", "password", 100, "adam@mail.dk");
//            System.out.println(user);
//              User user = um.getUser("Lene","1234");
              System.out.println(user);
              
    }
    
}
