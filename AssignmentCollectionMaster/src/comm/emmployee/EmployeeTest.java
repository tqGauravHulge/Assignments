package comm.emmployee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		alEmp.add(e1);
		alEmp.add(e2);

		Collections.sort(alEmp, new NameComparator());

		for (Employee i : alEmp) {
			System.out.println(i.getId() + " " + i.getName());
		}
	}
}
