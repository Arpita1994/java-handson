package oops;

public class EmployeeHashCodeEqualsTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(20, 190);
		Employee e2 = new Employee(20, 190);
		System.out.println(e1 == e2);

		System.out.println(e1.equals(e2));

		System.out.println(e1.equals(new EmployeeHashCodeEqualsTest()));

		System.out.println(e1.hashCode() + " " + e2.hashCode());
	}

}
