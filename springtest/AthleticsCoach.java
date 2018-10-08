package springtest;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class AthleticsCoach implements Coach {
	@Autowired
	@Qualifier("preWorkoutVitamins")
    private Vitamins vitamins;
	@Value("${sport.email}")
	public String email;   
	@Value("${sport.team}")
	public  String team;
    @PostConstruct
    public void method1()
    {
    	System.out.println("post construct method");
    }
    @PreDestroy
    public void method2()
    {
    	System.out.println("pre destroy method");
    }
    public String getEmail() {
		return email;
	}

	//public void setEmail(String email) {
	//	this.email = email;
	//	System.out.println("Inside set email setter");
//	}

	public String getTeam() {
		return team;
	}
   
	//public void setTeam(String team) {
	//	this.team = team;
	//    System.out.println("Inside set team setter");
	//}
    
	public void setVitamins(Vitamins vitamins) {
    	System.out.println("Inside ath coach setter");
		this.vitamins = vitamins;
	}

	public AthleticsCoach() {
    	System.out.println("Inside athletics coach constructor");
    };
    @Autowired
    public AthleticsCoach(@Qualifier("preWorkoutVitamins")Vitamins vitamins)
    {
    	System.out.println("Inside the ath coach with vitamins param");
    }
    @Autowired
	@Override
	public String getDailyTraining() {
		// TODO Auto-generated method stub
		return "go and run fast 8km";
	}
    @Autowired
	@Override
	public String getDailyVitamins() {
		// TODO Auto-generated method stub
		return vitamins.getVitamins();
	}
    @Autowired
    public void simpleMethod()
    {
    	System.out.println("This is a simple method");
    }

}
