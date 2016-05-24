package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class rate_test {
	@Test
	public void return_test() throws RateException{
		ArrayList<RateDomainModel> TestAL = new ArrayList<RateDomainModel>();
		int TestCreditScore = 800;
		RateBLL TestBLL = new RateBLL();
		TestBLL.getRate(TestCreditScore);
	}
	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void exception_test() throws RateException{
		ArrayList<RateDomainModel> TestAL = new ArrayList<RateDomainModel>();
		int FailCreditScore = 0;
		RateBLL TestBLL = new RateBLL();
		TestBLL.getRate(FailCreditScore);
	}
	@Test
	public void test() {
		assert(1==1);
	}

}
