/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.database.repositories;

import nika.home.learnweb.database.entities.Car;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author NIKS
 */
public interface AuctionInfoRepo extends CrudRepository<Car, String> {
    
}
