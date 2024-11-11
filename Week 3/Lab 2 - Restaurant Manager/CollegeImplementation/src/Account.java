/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author c21306503
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Account {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int accountId;

	/** 
	 * @return the accountId
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getAccountId() {
		// begin-user-code
		return accountId;
		// end-user-code
	}

	/** 
	 * @param accountId the accountId to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAccountId(int accountId) {
		// begin-user-code
		this.accountId = accountId;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Student student;

	/** 
	 * @return the student
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Student getStudent() {
		// begin-user-code
		return student;
		// end-user-code
	}

	/** 
	 * @param student the student to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStudent(Student student) {
		if (student == null) 
			return;
		if (this.student == null) {
			this.student = student;
			this.student.setAccount(this);
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param accountId
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Account(int accountId) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
		
		this.accountId = accountId;
	}
}