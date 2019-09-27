
public class Student_1 {
	String name;
	//int m1,m2,m3,total,average,grade;
	Address address;

	public Student_1(String name, Address address) {
		this.name = name;

		this.address = address;
	}
	/*public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The marks are "+m1+" "+m2+" "+m3);
	}
	public void total()
	{
		int total=m1+m2+m3;
		System.out.println("The total is "+total);
	}
	public void average()
	{
		int avg=total/3;
		System.out.println("The average is "+avg);
	}*/

	@Override
	public String toString() {
		return "Student_1 [name=" + name + ", address=" + address + "]";
	}
	
	
	
}
