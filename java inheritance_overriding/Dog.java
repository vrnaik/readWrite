package practice;

public class Dog extends Animal {

	String talk;
	String tail;
	
	public Dog(String name,int eyes,String tail, String talk,int leg)
	{ 
		super.name = name;
		super.eyes = eyes;
		super.legs = leg;
		this.talk = talk;
		this.tail = tail;
	}
		public void speaking(){		
			System.out.println("hello my name is "+name+" and i can "+talk+" i have "+eyes+" eyes and "+legs+" legs.");
		}
		
	
	

	
	

}
