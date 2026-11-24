class Course{
    String courseName;
    int duration;
    double fees;

    Course(String courseName, int duration, double fees){
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }
    void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fees: ₹" + fees);
    }
}
class Main30{
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        c1.displayCourseDetails();
        Course c2 = new Course("Python Programming", 4, 12000);
        c2.displayCourseDetails();
    }
}