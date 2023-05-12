/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.controllers;

import nika.home.learnweb.database.repositories.AuctionInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NIKS
 */
@RestController
@RequestMapping("/class2")
public class AuctionInfoController {

    @Autowired
    private AuctionInfoRepo repo;

    @PostMapping("/getall")
    public String testMethod(@RequestParam String name, @RequestParam int age) {
        System.out.println(name);
        System.out.println(age);
        
        return "Hello World";
        
    }
}
