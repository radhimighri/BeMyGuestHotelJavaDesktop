/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.User;
import java.sql.ResultSet;

/**
 *
 * @author Radhi Mighri
 */
public interface UserService {
        public void addUser(User u);
        public void delUser(User u);
        public void EditUser(User u);
        public ResultSet getAllUser();
        public ResultSet getAllUserWhere(String etat);
        public ResultSet Login(String username,String pwd);
    
}
