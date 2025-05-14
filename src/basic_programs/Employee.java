package basic_programs;

public class Employee {
	
	private String empName;
	private int empSalary;
	
	public Employee(String name,int salary) {
		
		this.empName = name;
		this.empSalary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSalary != other.empSalary)
			return false;
		return true;
	}

	
	
	
}
