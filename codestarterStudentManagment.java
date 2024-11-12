public class Student{
    private String name;
    private int id;
    private int[] grades;
    
    public Student(){
        name = "Unknown";
        id = 0;
        this.grades = new int[0];
    }
    public Student(String name, int id, int[] grades){
        this.name = name;
        this.id = id;
        setgrades(grades);
    
    }
    public String getname(){
        return name;
    }
    public String setname(String name){
        this.name = name;
        return name;
    }
    public int getid(){
        return id;
    }
    public int setid(int id){
        if(id < 0){
            this.id = id;
        }
        return id;
    }
    public int[] getgrades(){
        return grades;
    }
    public int[] setgrades(int[] grades){
        for (int i = 0; i < grades.length; i++){
        if(grades[i] >= 0 || grades[i] <= 100){
        this.grades = grades;
        }
        else
        {
            System.out.println("Error, ignore that grade");
        }
    }
        return grades;
    }
    public static int calculateAverage(int[] grades){
        for(int i = 0; i < grades.length; i++){
        if (grades.length == 0){
            return 0;
        }
        else
        {
            System.out.println(grades[i]/grades.length);
        }
        } 
        return 0;
        
    }
    public class StudentManagement {
    private Student[] students;
    private int studentCount;
    
    public StudentManagement() {
        this.students = new Student[3];
        this.studentCount = 1;
    }
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
        else
        {
            System.out.println("Array is full");
        }
    }
    public void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println("Name: " + student.getname());
            System.out.println("ID: " + student.getid());
            System.out.println("Average Grade: " + student.calculateAverage());
        }
    }
    }
}
