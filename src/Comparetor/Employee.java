package Comparetor;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double slary;
	
	public Employee(int id, String name, double slary) {
		super();
		this.id = id;
		this.name = name;
		this.slary = slary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSlary() {
		return slary;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", slary=" + slary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getId()>o.getId())
			return 1;
		else
			
		return -1;
	}
	

}
