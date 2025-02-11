package PRactice_Problem_07;
class Student {
    public int ID;
    public String Name;
    public String Program;

    public Student(int id, String name, String program) {
        this.ID = id;
        this.Name = name;
        this.Program = program;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name);
        System.out.println("Program: " + this.Program);
    }
}


class CourseOffering {
    public int StudentID;
    public int InstructorID;
    public int CourseID;
    public String Time;
    public int SectionNo;
    public int RoomId;
    public int Year;
    public String Semester;


    public CourseOffering(int studentID, int instructorID, int courseID, String time, int sectionNo, int roomId, int year, String semester) {
        this.StudentID = studentID;
        this.InstructorID = instructorID;
        this.CourseID = courseID;
        this.Time = time;
        this.SectionNo = sectionNo;
        this.RoomId = roomId;
        this.Year = year;
        this.Semester = semester;
    }


    public void displayCourseOfferingDetails() {
        System.out.println("Course Offering Details:");
        System.out.println("Student ID: " + this.StudentID);
        System.out.println("Instructor ID: " + this.InstructorID);
        System.out.println("Course ID: " + this.CourseID);
        System.out.println("Time: " + this.Time);
        System.out.println("Section No: " + this.SectionNo);
        System.out.println("Room ID: " + this.RoomId);
        System.out.println("Year: " + this.Year);
        System.out.println("Semester: " + this.Semester);
    }
}


class Instructor {
    public int ID;
    public String Name;
    public String Department;
    public String Title;


    public Instructor(int id, String name, String department, String title) {
        this.ID = id;
        this.Name = name;
        this.Department = department;
        this.Title = title;
    }


    public void displayInstructorDetails() {
        System.out.println("Instructor Details:");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name);
        System.out.println("Department: " + this.Department);
        System.out.println("Title: " + this.Title);
    }
}

class Course {
    public int ID;
    public String Syllabus;
    public String Title;
    public String Credits;
    public String Prerequisite;


    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.ID = id;
        this.Syllabus = syllabus;
        this.Title = title;
        this.Credits = credits;
        this.Prerequisite = prerequisite;
    }

    public void displayCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("ID: " + this.ID);
        System.out.println("Syllabus: " + this.Syllabus);
        System.out.println("Title: " + this.Title);
        System.out.println("Credits: " + this.Credits);
        System.out.println("Prerequisite: " + this.Prerequisite);
    }
}


class PracticeProblem07 {
    public static void main(String[] args) {

        Student student = new Student(101, "John Doe", "Computer Science");
        student.displayStudentDetails();


        CourseOffering courseOffering = new CourseOffering(101, 201, 301, "2023-10-01", 1, 501, 2023, "Fall");
        courseOffering.displayCourseOfferingDetails();


        Instructor instructor = new Instructor(201, "Dr. Smith", "Computer Science", "Professor");
        instructor.displayInstructorDetails();


        Course course = new Course(301, "Introduction to Programming", "CS101", "3", "None");
        course.displayCourseDetails();
    }
}