package Comparetor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MainComparator {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(129, "ankit", 10000);
		Employee e2=new Employee(133, "satya", 18000);
		Employee e3=new Employee(128, "raj", 15000);
		Employee e4=new Employee(120, "amit", 20000);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al);
		for(Employee i:al)
			System.out.println(i);
		
		Comparator <Employee> com = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				
				return (int) (e2.getSlary()-e1.getSlary());
			}
		
		};
		Collections.sort(al, com);
		for(Employee i2:al)
			System.out.println(i2);
		/*Collections.sort(al, new SalaryComparator());
		for(Employee e:al)
		System.out.println("employee salary in decending order::" +e);

		Collections.sort(al, new IdComparator());
		for(Employee ee:al)
			System.out.println(ee);
		
		Collections.sort(al, (a, b)->{
		    return a.getName().compareTo(b.getName());
		    
		});
		//for(Employee d:al)
	    	System.out.println(al);*/
	}

}
