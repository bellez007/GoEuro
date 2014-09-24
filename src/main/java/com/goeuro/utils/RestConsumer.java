/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goeuro.utils;


import org.springframework.web.client.RestTemplate;

/**
 *
 * @author SAMEH
 * @param <T>
 */

public class RestConsumer<T> {

    private GenericJSonParser<T> parser;
    RestTemplate restTemplate;


    
    public RestConsumer(Class<T> type) {
        parser = new GenericJSonParser<>(type) ; 
        restTemplate = new RestTemplate() ; 
    }
    
    public T getDataAsObjects(String url) {
        String response = restTemplate.getForObject(url, String.class, new Object[]{});
        return parser.parse(response);
    }

}
