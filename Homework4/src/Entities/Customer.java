package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	public int Id;
	public String firstNameString;
	public String lastNameString;
	public Date dateOfBirthDate;
	public String nationalityIdString;
}
