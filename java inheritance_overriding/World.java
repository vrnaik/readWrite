package practice;

public class World {
	
	public World()
	{
		
	}

	public static void main(String []args)
	{
		Dog dog = new Dog("jocky",2,"yes","bark",4);
		
//		dog.name = "joky";
//		dog.eyes = 2;
//		dog.legs = 4;
//		dog.tail = "yes";
//		dog.talk = "bark";
		
		dog.speaking();
		
	}
	
}
