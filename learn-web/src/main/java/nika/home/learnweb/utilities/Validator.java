/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.utilities;

import nika.home.learnweb.database.entities.Car;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Year;

/**
 *
 * @author NIKS
 */
public class Validator {

    public static void validator(Car car) {
        int year = Year.now().getValue();
        if (car.getMake().isEmpty()) {
            throw new RuntimeException("Empty make is not allowed!");
        }
        if (car.getModel().isEmpty()) {
            throw new RuntimeException("Empty model is not allowed!");
        }
        if (car.getYear() < 2010) {
            throw new RuntimeException("Under 2010 is not allowed!");
        } else if (car.getYear() > year) {
            throw new RuntimeException("Cars from future are not allowed!");
        }
    }

}
