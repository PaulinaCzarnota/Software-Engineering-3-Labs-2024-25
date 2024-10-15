
public class DepartmentTest {

	public static void main(String[] args) {
		Department dep1 = new Department("dep1");
		Student s1 = new Student("s1");
		Account a1 = new Account(1);
		
		dep1.addStudent(s1);
		
		System.out.println(s1.getDepartment().getName());
		
		s1.setAccount(a1);
		
		System.out.println(s1.getAccount().getAccountId());
		
		System.out.println(a1.getStudent().getName());
		
	}

}
