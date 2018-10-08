package springtest;

import org.springframework.stereotype.Component;

@Component
public class BcaaVitamins implements Vitamins {

	@Override
	public String getVitamins() {
		// TODO Auto-generated method stub
		return "get your bcaa vitamins";
	}

}
