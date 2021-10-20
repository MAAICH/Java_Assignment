package Day1;

public class Employee {
	
	private int empId; 
	private String name;
	private int age;
	private String contactNo;


	// Constructor
	public Employee() {}

	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.name = name;
		this.age = age;
		
	}

	// Getters & Setters

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int EmpId) {
		this.empId = EmpId;
	}
	public String getName() {
		return name;
	}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public String getContactNo() {
			return contactNo;
		}

		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", contactNo=" + contactNo + "]";


		}

	}


