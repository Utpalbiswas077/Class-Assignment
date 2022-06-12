package OPPs;

class studentdeatils {
	// instance variable
	
	int studentId;
	String studentName;
	String studentAddres;
	long phNo;
	public void setData(int id,String name,String address,long ph)
	{
		studentId=id;
		studentName=name;
		studentAddres=address;
		phNo=ph;
		
	}
	public void getData()
	{
		System.out.println("studentid: "+studentId+" "+"studentname: "+studentName+" "+"studentaddress: "+studentAddres+" "+"studentphonenumber: "+phNo);
		
	}
}
 public class students
{
	public static void main(String[] args)
	{
		studentdeatils utpal=new studentdeatils();
		
		utpal.setData(105,"utpal Biswas", "murshidabad",982455550);
		utpal.getData();
		
	}
}
