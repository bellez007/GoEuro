/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.main;

import com.goeuro.model.Location;
import com.goeuro.utils.CsvWriter;
import com.goeuro.utils.RestConsumer;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.client.ResourceAccessException;

/**
 *
 * @author SAMEH
 */
public class GoEuroTest {

    public static final String BASE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

    public static void main(String[] args) {

        if (args.length == 1) {
            try {
                RestConsumer<Location[]> consumer = new RestConsumer(Location[].class);
                System.out.println("sending the http request to the distant API...");
                Location[] list = consumer.getDataAsObjects(BASE_URL + args[0]);
                System.out.println("Generating the csv file...");
                CsvWriter csvWriter = new CsvWriter();
                csvWriter.writeData(list);

            } catch (ResourceAccessException e) {
                System.out.println("Error while connecting to the distant API");
            } catch (IOException ex) {
                System.out.println("Error while writing the csv file");
            }

        } else {
            System.out.println("Missing user entry");
        }
    }
}
