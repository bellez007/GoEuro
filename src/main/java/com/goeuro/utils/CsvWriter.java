/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.utils;

import au.com.bytecode.opencsv.CSVWriter;
import com.goeuro.model.Location;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SAMEH
 */
public class CsvWriter {

    public final String FILE_PATH = "GoEuroTest.csv";
    public final String COLS_SIGNATURE = "id#name#type#latitude#longitude" ;

    
    
    
    
    public void writeData(Location[] data) throws IOException {
        
        
        CSVWriter writer = new CSVWriter(new FileWriter(FILE_PATH),',',' ');
        String[] columns = COLS_SIGNATURE.split("#");
        writer.writeNext(columns);
        List<String[]> entries = new ArrayList<>() ; 
        for (Location fullLocation : data) {
            entries.add(fullLocation.toString().split("#")) ; 
        }
        writer.writeAll(entries);
        writer.close();
    }

}
