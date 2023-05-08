/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nika.home.learnweb.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author NIKS
 */
@Entity
public class AuctionInfo {

    private String date;
    private String location;
    private String lane;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lotNumber;

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getLane() {
        return lane;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
