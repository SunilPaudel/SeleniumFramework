package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class ReportingToolHbnUtils {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
		//create a session registry from hibernate.cfg.xml
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		
		//create the metadata from the above created serviceRegistry
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		
		return metadata.getSessionFactoryBuilder().build();
	}
	
	public static SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		
		getSessionFactory().close();
	}

}
