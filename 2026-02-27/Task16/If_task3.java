class If_task3{
	public static void main(String args[]){
		int marks=63;
		
		if((marks>=75) && (marks<=100)){
			System.out.println("Grade:A");
	}else if((marks>=65) && (marks<75)){
			System.out.println("Grade:B");
		}else if((marks>=55) && (marks<65)){
			System.out.println("Grade:C");
		}else if((marks>=45) && (marks<55)){
			System.out.println("Grade:S");
		}else if(marks<45)
			System.out.println("Grade:F");
	}
}
			
