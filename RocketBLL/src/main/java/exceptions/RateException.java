package exceptions;

public class RateException extends Exception {
rocketDomain.RateDomainModel RateDomainModel;
	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)

public rocketDomain.RateDomainModel getRateDomainModel() {
	return RateDomainModel;
}

public void setRateDomainModel(rocketDomain.RateDomainModel rateDomainModel) {
	RateDomainModel = rateDomainModel;
	
}

public RateException(rocketDomain.RateDomainModel rateDomainModel) {
	super();
	RateDomainModel = rateDomainModel;
}
}
