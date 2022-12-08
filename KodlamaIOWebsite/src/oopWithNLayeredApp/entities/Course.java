package oopWithNLayeredApp.entities;

public class Course {
    private int id;
    private String courseName;
    private double price;
    private Instructor courseInstructor;
    private Category courseCategory;

    public Course() {
    }

    public Course(int id, String courseName, double price, Instructor courseInstructor, Category courseCategory) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.courseInstructor = courseInstructor;
        this.courseCategory = courseCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instructor getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(Instructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }
}
