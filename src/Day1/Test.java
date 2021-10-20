package Day1;

public class Test {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
				System.out.println(emp1.getEmpId());
				System.out.println(emp1.getName());
				System.out.println(emp1.getAge());
				emp1.setEmpId(456789);
				emp1.setName("Manoj");
				emp1.setAge(23);
				
				System.out.println(emp1.getEmpId());
				System.out.println(emp1.getName());
				System.out.println(emp1.getAge());
				
				
			emp2.setEmpId(587961);
				emp2.setName("Sonu");
				emp2.setAge(24);
				
				System.out.println();
				System.out.println(emp2.getEmpId());
				System.out.println(emp2.getName());
				System.out.println(emp2.getAge());
				
				Employee emp3 = new Employee(678459, "Promod", 25);
				
				System.out.println();
				System.out.println(emp3.getEmpId());
				System.out.println(emp3.getName());
				System.out.println(emp3.getAge());
				
				emp3.setContactNo("7008020943");
				System.out.println(emp3.getContactNo());
				
					

			}


			}


