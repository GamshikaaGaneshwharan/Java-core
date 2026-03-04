class If_task4{
	public static void main(String args[]){
		int employeeSalary=60000;
		double tax;
		double netSalary;
		
		System.out.println("Basic salary : "+ employeeSalary );
		
		if(employeeSalary>100000){
			tax=employeeSalary*0.03;
		}else{
			tax=employeeSalary*0.01;
		}
		netSalary=employeeSalary-tax;
		System.out.println("Tax  : "+ tax);
		System.out.println("NetSalary : "+ netSalary);
	}
}
		