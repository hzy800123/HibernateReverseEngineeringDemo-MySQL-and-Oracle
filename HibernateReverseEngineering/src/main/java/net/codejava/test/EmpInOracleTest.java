package net.codejava.test;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.codejava.oracle.model.Dept;
import net.codejava.oracle.model.Emp;

public class EmpInOracleTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
		        .configure("hibernate_Oracle.cfg.xml") // configures settings from hibernate_Oracle.cfg.xml
		        .build();
		try {
		    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			System.out.println(ex);
		    StandardServiceRegistryBuilder.destroy(registry);
		}
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		
		session.beginTransaction();		
		
		// Database Operations Logic:
		Emp emp = new Emp();
		emp.setEmpno((short)2);
		emp.setEname("John");
		emp.setJob("ANALYST");
		emp.setMgr((short)7698);
		emp.setHiredate(new Date());
		emp.setSal(new BigDecimal(10000));
		emp.setDept(new Dept((byte)20));
		
		session.save(emp);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		System.out.println("Update Data Base Successfully !");

	}

}
