/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.goeuro.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SAMEH
 */
public class Location {
    @SerializedName("_id")
    private Long id ; 
    @SerializedName("name")
    private String name ; 
    @SerializedName("type")
    private String type ; 
    @SerializedName("geo_position")
    private GeoPos geoPos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


 

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    public GeoPos getGeoPos() {
        return geoPos;
    }

    public void setGeoPos(GeoPos geoPos) {
        this.geoPos = geoPos;
    }

    @Override
    public String toString() {
        return   id + "#" + name  + "#" + type + "#" + geoPos;
    }

    

}
