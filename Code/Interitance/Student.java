 class Student extends Person {
    private int studentId;
    Student(String n, int id) {
        super(n);
        studentId = id;
    }
    public void setStudentId(int id) {
        studentId = id;
    }
    public int getStudentId() {
        return studentId;
    }
	public boolean equals(Object o){
		if (o!=null && o instanceof Student){
			Student s=(Student) o;
			if (studentId==s.studentId)
				return true;
		}
		return false;
    }
	public static void main(String[] args){
		Student std1=new Student("somchai", 1001);
		Student std2=new Student("somsri", 1001);
		System.out.println(std1.equals(std2));
	}
}
