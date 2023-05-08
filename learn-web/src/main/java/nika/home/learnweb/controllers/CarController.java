/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.controllers;

import java.io.FileNotFoundException;
import nika.home.learnweb.utilities.Utility;
import java.util.List;
import java.util.Optional;
import nika.home.learnweb.database.entities.Car;
import nika.home.learnweb.database.repositories.CarRepo;
import nika.home.learnweb.utilities.FileUtility;
import nika.home.learnweb.utilities.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NIKS
 */
@RestController
@RequestMapping("/class1")
public class CarController {

    @Autowired
    private CarRepo carRepo;

    @PostMapping("/method1")
    public String testMethod(@RequestParam String name, @RequestParam int age) {
        System.out.println(name);
        System.out.println(age);
        return "Hello World";
    }

    @GetMapping("/method2")
    public String testMethod2() {
        return "Hello World 2";
    }

    @PostMapping("/savecar")
    public Car saveCar(@RequestBody Car car) {
        Validator.validator(car);
        Car savedCar = carRepo.save(car);
        return savedCar;

    }

    @DeleteMapping("/deletecar")
    public void deleteCar(@RequestParam int id) throws FileNotFoundException {
        Utility.print(id);
        Optional<Car> result = carRepo.findById(id);
        if (!result.isPresent()) {
            throw new RuntimeException("Bad");
        } else {
            carRepo.deleteById(id);
        }
        Car car = result.get();
        Utility.print(car);
        FileUtility.toTxt(car);
    }

    @PostMapping("/getcar")
    public Car getCar(@RequestParam int id) {
        Optional<Car> result = carRepo.findById(id);
        return result.get();
    }

    @PostMapping("/searchcar")
    public List<Car> searchCar(@RequestParam String make) {
        List<Car> result = carRepo.findByMake(make);
        return result;
    }

    @GetMapping("/getall")
    public Page<Car> getAll(@RequestParam Integer pageNo, Integer pageSize) {
        Pageable firstPageWithTwoElements = PageRequest.of(pageNo, pageSize);
        Page<Car> getAll = carRepo.findAll(firstPageWithTwoElements);
        return getAll;
    }

    @GetMapping("/getallbymake")
    public Page<Car> getAllByMake(@RequestParam String make, Integer pageNo, Integer pageSize) {
        Pageable pageParams = PageRequest.of(pageNo, pageSize);
        Page<Car> getAllByMake = carRepo.findAllByMake(make, pageParams);
        return getAllByMake;
    }

}
