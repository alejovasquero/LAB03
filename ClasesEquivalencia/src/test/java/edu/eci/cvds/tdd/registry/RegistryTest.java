package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void deberiaEstarDuplicado() {
		//public Person(String name, int id, int age, Gender gender, boolean alive)
        Person person = new Person("Loaiza",123456789,25,Gender.UNIDENTIFIED,true);

        RegisterResult result = registry.registerVoter(person);
		
		result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED,result);
    }
	
	@Test
    public void deberiaEstarMuerto() {
        Person person = new Person("Loaiza",12456789,25,Gender.UNIDENTIFIED,false);

        RegisterResult result = registry.registerVoter(person);		

        Assert.assertEquals(RegisterResult.DEAD,result);
    }
	
	@Test
    public void deberiaSerMenorDeEdad() {
        Person person = new Person("Loaiza",12345689,17,Gender.UNIDENTIFIED,true);

        RegisterResult result = registry.registerVoter(person);		

        Assert.assertEquals(RegisterResult.UNDERAGE,result);
		
		person = new Person("Loaiza",123456798,16,Gender.UNIDENTIFIED,true);
		
		result = registry.registerVoter(person);	
		
		Assert.assertEquals(RegisterResult.UNDERAGE,result);
		
		person = new Person("Loaiza",123456,0,Gender.UNIDENTIFIED,true);
		
		result = registry.registerVoter(person);	
		
		Assert.assertEquals(RegisterResult.UNDERAGE,result);
    }
	
	@Test
    public void deberiaTenerEdadInvalida() {
        Person person = new Person("Loaiza",1234,-1,Gender.UNIDENTIFIED,true);

        RegisterResult result = registry.registerVoter(person);		

        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
		
		person = new Person("Loaiza",456798,-2,Gender.UNIDENTIFIED,true);
		
		result = registry.registerVoter(person);	
		
		Assert.assertEquals(RegisterResult.INVALID_AGE,result);
		
    }
	
	@Test
    public void deberiaSerValido() {
        Person person = new Person("Loaiza",666,18,Gender.UNIDENTIFIED,true);

        RegisterResult result = registry.registerVoter(person);		

        Assert.assertEquals(RegisterResult.VALID,result);
		
		person = new Person("Loaiza",111,19,Gender.UNIDENTIFIED,true);
		
		result = registry.registerVoter(person);	
		
		Assert.assertEquals(RegisterResult.VALID,result);
		
    }
    // TODO Complete with more test cases
}