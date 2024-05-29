package encapsulation;

class StudentDetailsMain {

	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails();
		sd.setNam("Ashwini");
		sd.setDept("CSE");
		sd.setEmailid("ash@gmail.com");
		System.out.println(sd.getNam());
		System.out.println(sd.getDept());
		System.out.println(sd.getEmailid());
		

	}

}
