package com.telusko.session8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Aliens {
	public HashMap<Integer,Alien> alienMap = null;
	
	public Aliens(){
		alienMap = new HashMap<Integer,Alien>(); 
	}

	public HashMap<Integer, Alien> getAlienMap() {
		return alienMap;
	}

	public void setAlienMap(HashMap<Integer, Alien> aliens) {
		this.alienMap = aliens;
	}
	
	public void add(Alien alien) {
		if(alienMap.containsKey(alien.getAid())) {
			System.out.println(" Object Already Exists ");
		}else {
			alienMap.put(alien.getAid(), alien);
		}		
	}
}
