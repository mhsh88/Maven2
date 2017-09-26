package api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "person")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long ID;
	private String firstName;

	public Person(long ID, String firstName, String lastName, int age) {
		this.age = age;
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	public long getID() {
		return ID;
	}
	@XmlElement
	public void setID(long iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	private String lastName;
	private int age;

	@Override
	public boolean equals(Object obj) {
		if(this.getID() == ((Person) obj).getID()){
			return true;
		}
		
		return false;
	}
}
