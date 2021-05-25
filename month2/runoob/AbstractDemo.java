

//抽象类 -没有包含足够的信息来描绘一个具体的对象

/*表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口。
抽象类除了不能实例化对象之外，类的其它功能依然存在。
由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
*/


//abstract class
public class AbstractDemo
{
	public static void main(String[] args){
		Employee e = new Employee("Georgs W.", "Houston, TX", 43);

	}
}

public abstract class Employee
{
	private String name;
	private String address;
	private int number;
	public Employee(String name, String address, int number){
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public double computePay(){
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	public void mailCheck(){
		System.out.println("Mailing a check to "+this.name+" "+this.address);
	}
	public String toString(){
		return name+" "+address+" "+number;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String newAddress){
		address = newAddress;
	}
	public int getNumber(){
		return number;
	}
}

public class Salary extends Employee
{

}


//抽象方法
























