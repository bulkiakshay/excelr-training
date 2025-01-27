class PS001 {

	protected int id;
	protected String firstName;
	protected String lastName;
	protected String address;
	
	public PS01(){}
	
	public PS01(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName(){
		return firstName+" "+lastName;
	}
	
	public void sendMessage(){
		System.out.println("Salary added successfully...");
	}	
}


class FullTimeEmployee extends PS01{
	
	private double basic;
	private double bonus;

	public FullTimeEmployee(){
  }

	public FullTimeEmployee(int id, String firstName, String lastName, double basic, double bonus, String address) {
		super(id,firstName, lastName,address);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public double computeSal(){
		return basic + bonus;
	}
	
	public void showDetails(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + getFullName());
		System.out.println("Grand Total : " + computeSal());
		System.out.println("Address : " + address);
	}	
	
}

 class EmployeeDemo1 {

	public static void main(String[] args) {
FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101,"SACHIN","TENDULKAR",6000,2000,"50-50, EAST, MUMBAI");
		fullTimeEmployee.showDetails();
		fullTimeEmployee.sendMessage();
	
	
	}
}

