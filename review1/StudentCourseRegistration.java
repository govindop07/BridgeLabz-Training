
import java.util.HashMap;
import java.util.LinkedList;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException() {
        super("Courses limit is exceeded");
    }
}

class Student extends Person {

    private int studentRollNo;
    private LinkedList<String> courses = new LinkedList<>();
    private LinkedList<String> grades = new LinkedList<>();

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentRollNo = studentId;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void enrollCourse(String course) throws CourseLimitExceededException {
        if (courses.size() >= 4) {
            throw new CourseLimitExceededException();
        }
        courses.add(course);
        grades.add("Grades not assigned yet");
    }
    
    public void dropCourse(String course) {
    	int index = courses.indexOf(course);
    	if(index == -1) System.out.println("The student is not enrolled in " + course);
    	courses.remove(index);
    	grades.remove(index);
    }

    public void giveGrade(String course, String grade) {
        int index = courses.indexOf(course);
        if (index != -1) {
            grades.set(index, grade);
        } else {
        	System.out.println("The student is not assigned in " + course);
        }
    }

    public void displayDetails() {
        System.out.println("Student Roll No.: " + studentRollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses that the student is assigned in:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + " : " + grades.get(i));
        }
    }
}

interface RegistrationService {
    void registerStudent(Student student);
    void enrollStudent(int studentRollNo, String course) throws CourseLimitExceededException;
    void dropCourse(int studentRollNo, String course);
    void giveGrade(int studentRollNo, String course, String grade);
    void displayStudent(int studentRollNo);
}

class RegistrationServiceImpl implements RegistrationService {

    private HashMap<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void registerStudent(Student student) {
        studentMap.put(student.getStudentRollNo(), student);
    }

    @Override
    public void enrollStudent(int studentRollNo, String course) throws CourseLimitExceededException {
        Student student = studentMap.get(studentRollNo);
        if (student != null) {
            student.enrollCourse(course);
        }
    }
    
    @Override
    public void dropCourse(int studentRollNo, String course) {
    	Student student = studentMap.get(studentRollNo);
    	if(student != null) {
    		student.dropCourse(course);
    	}
    }

    @Override
    public void giveGrade(int studentRollNo, String course, String grade) {
        Student student = studentMap.get(studentRollNo);
        if (student != null) {
            student.giveGrade(course, grade);
        }
    }

    @Override
    public void displayStudent(int studentRollNo) {
        Student student = studentMap.get(studentRollNo);
        if (student != null) {
            student.displayDetails();
        }
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        RegistrationService service = new RegistrationServiceImpl();

        Student s1 = new Student(101, "Govind", 21);
        service.registerStudent(s1);

        try {
            service.enrollStudent(101, "core-java-practice");
            service.enrollStudent(101, "oops-practice");
            service.enrollStudent(101, "dsa-practice");
            service.enrollStudent(101, "collection-practice");
        } catch (CourseLimitExceededException e) {
            System.out.println(e);
        }

        service.giveGrade(101, "core-java-practice", "A");
        service.giveGrade(101, "oops-practice", "B");
        service.dropCourse(101, "dsa-practice");

        service.displayStudent(101);
    }
}


//anagram string
//show inheritence
//demonstrate try catch finally
