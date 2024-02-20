package exercise1;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo( Student other )
	{
		return this.name.compareTo( other.name );
	}
	
	@Override
	public String toString()
	{
		return name + " " + age;
	}
}
