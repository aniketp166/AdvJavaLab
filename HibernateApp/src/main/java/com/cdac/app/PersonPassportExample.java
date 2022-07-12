package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
		/* Person p = new Person();
		p.setName("Himanshu");
		p.setEmail("Himanshu@gmail.com");
		p.setDateOfBirth(LocalDate.of(1997, 7, 8));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2015, 9, 10));	
		ps.setExpiryDate(LocalDate.of(2025, , 12));
		ps.setIssuedBy("Govt. of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p); */
		
		Person p = dao.fetchPersonByPassportNo(6);
		System.out.println(p.getName() + " " + p.getEmail()+ " "+ p.getDateOfBirth());
		
//		List<Person> list = dao.fetchPersonsByPassportExpiryYear(2030);
//		for(Person p : list)
//		System.out.println(p.getName() + " " + p.getEmail());
	
	}
}
