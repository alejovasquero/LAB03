package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	private ArrayList<Person> historial;
	
	public Registry(){
		historial = new ArrayList<>();
	}
    public RegisterResult registerVoter(Person p) {
		RegisterResult result = RegisterResult.VALID;
		if(isPersonRegistred(p)){
			result = RegisterResult.DUPLICATED;
		} else if (!p.isAlive()){
			result = RegisterResult.DEAD;
		} else if(p.getAge()<0){
			result = RegisterResult.INVALID_AGE;
		} else if(p.getAge()<18){
			result = RegisterResult.UNDERAGE;
		}
		else{
			historial.add(p);
		}
        // TODO Validate person and return real result.
        return result;
    }
	private boolean isPersonRegistred(Person p){
		boolean result = false;
		for(Person persona:historial){
			if(persona.getId()==p.getId()){
				result = true;
				break;
			}
		}
		return result;
	}
}