package springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("sportContext.xml");				
		// get the bean from spring container
		Coach theCoach = context.getBean("athleticsCoach", Coach.class);
		System.out.println(theCoach.getDailyVitamins());
		System.out.println("the email is " + theCoach.getEmail());
		System.out.println("the team is " +  theCoach.getTeam());
		context.close();
	}

}
