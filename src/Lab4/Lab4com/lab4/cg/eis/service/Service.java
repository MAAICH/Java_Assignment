package Lab4com.lab4.cg.eis.service;

public class Service implements ServiceInterface {
	@Override
	public void service1() 
	{
		
	}
	@Override
	public void healthInsurance() 
	{
		
	}
	@Override
	public void lifeInsurance() {
		
	}
	@Override
	public void retirement() {	 
		int salary=0;
		if(salary>10000)
		{
			System.out.println("you are valid for retirement insurance");
		}
	}
	
}
