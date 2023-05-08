/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.database.repositories;

import java.util.List;
import nika.home.learnweb.database.entities.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author NIKS
 */
public interface CarRepo extends CrudRepository<Car, Integer> {

    public List<Car> findByMake(String make);
    public Page<Car> findAll(Pageable pageable);
    public Page<Car> findAllByMake(String make, Pageable pageable);


}