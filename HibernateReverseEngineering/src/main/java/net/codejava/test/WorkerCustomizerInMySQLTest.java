package net.codejava.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.codejava.mysql.customizemodel.Worker;


public class WorkerCustomizerInMySQLTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
		        .configure() // configures settings from hibernate.cfg.xml
		        .build();
		try {
		    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
		    StandardServiceRegistryBuilder.destroy(registry);
		}
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		
		session.beginTransaction();		
		
		// Database Operations Logic:
		Worker worker = new Worker();
		worker.setName("workerName1");
		worker.setMonthlyPay(10000);
		worker.setYearlyPay(120000);
		worker.setVocationWithPay(20);
		
		session.save(worker);
		
		Worker worker2 = session.get(Worker.class, 2);
		System.out.println(worker2);		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		System.out.println("Update Data Base Successfully !");		
	}
}
