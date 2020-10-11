/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Reservation;
import java.sql.ResultSet;

/**
 *
 * @author Radhi Mighri
 */
public interface ReservationService {
        public void addReservation(Reservation r);
        public void delReservation(Reservation r);
        public void EditReservation(Reservation r);
        public ResultSet getAllReservation();
        public ResultSet getAllReservationWhere(String etat);
}
