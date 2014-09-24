package com.goeuro.utils;


import com.google.gson.Gson;


public class GenericJSonParser<T> {
	private Class<T> type ; 
	
	public GenericJSonParser(Class<T> type) {
		this.type = type;
	}
	public T parse(String jsonText){
		Gson gson = new Gson() ; 
		return (T)gson.fromJson(jsonText, type);
	}
} 
