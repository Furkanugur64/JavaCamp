package kodlama.io.entities;

public class Course {

    public int id;
    public String courseName;
    public double price;



    public Course(int id, String courseName, double price) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;

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

    public double getprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    }

