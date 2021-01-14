public class QLCB {
	private List<CanBo> dscb;
	
	public QLCB(){
		 dscb = new ArrayList<CanBo>(100);
	}
}
public Date stringToDate(String ngayStr) {
		Date ngayDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayDate = sdf.parse(ngayStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi dinh dang ngay thang!!");

		}
		return ngayDate;
	}
	public int nam(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String yearStr = sdf.format(date);
		int year = Integer.parseInt(yearStr);
		return year;
	}
	
	2 xâu có giống nhau hay không sử dụng phương thức
			equal: str1.equal(str2) 
			
	int compareTo(String other)
	result = str1.compareTo(str2);
	Nếu result = 0 hai xâu là giống nhau
	Nếu result > 0 kết luận str1 > str2
	Nếu result < 0 kết luận str1 < str2

Kiểm tra kiểu của một đối tượng 
Ví dụ: if ( obj instanceof String) 

public class Course {
	private String name;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String name) {
		this.name = name;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getName() {
		return name;
	}
	public void addList(Scanner sc) {
//		System.out.println("Nhap ten khoa hoc: ");
//		name = sc.nextLine();
		System.out.println("Moi nhap so hoc sinh can them: ");
		int n = sc.nextInt(); sc.nextLine();
		for(int i=0 ; i< n ; i++) {
			System.out.println("Hoc sinh thu " + (i+1));
			addStudent(sc.nextLine());
		}
	}
	public void printList() {
		System.out.println("Khoa hoc: " + name + " co " + numberOfStudents + "hoc sinh :");
		for(String hs : students) {
			if(hs != null)
				System.out.println(hs);
			
		}
	}

}	