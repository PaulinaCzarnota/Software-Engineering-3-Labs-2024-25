/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author c21306503
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Student {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String name;

	/** 
	 * @return the name
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/** 
	 * @param name the name to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setName(String name) {
		// begin-user-code
		this.name = name;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Department department;

	/** 
	 * @return the department
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Department getDepartment() {
		// begin-user-code
		return department;
		// end-user-code
	}

	/** 
	 * @param department the department to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDepartment(Department department) {
		if (department == null)
			return;
		if	(this.department == null){
			this.department = department;
			this.department.addStudent(this);
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Account account;

	/** 
	 * @return the account
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Account getAccount() {
		// begin-user-code
		return account;
		// end-user-code
	}

	/** 
	 * @param account the account to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAccount(Account account) {
		if (account == null)
			return;
		if (this.account == null) {
			this.account = account;
			this.account.setStudent(this);
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param name
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Student(String name) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
		
		this.name = name;
	}
}