class Human
{
	int age;
	 String name;
	
	public Human()
	{
		age=12;
		name="John";
		//System.out.println("in constructor");
	}
	public Human(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void display(){
		System.out.println(this.age+3);
	}
}

public class constructorprac {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		Human obj1=new Human(12,"lik");
		//System.out.println(obj.name);
		//System.out.println(obj.getName()+" : "+obj.getAge());
		
		//obj.SetAge(30);
		//obj.setName("Reddy");
		

		System.out.println(obj1.getName()+" : "+obj1.getAge());
		obj.display();

	}
}