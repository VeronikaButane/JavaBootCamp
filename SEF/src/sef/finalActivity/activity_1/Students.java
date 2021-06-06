package sef.finalActivity.activity_1;

public class Students extends Person{

    private String name;
    private String schoolName;

    public Students() {
        this.name = "Lucy";
        this.schoolName = "Boston University";
    }

    public Students(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String announce(){
        super.announce();
        return "I am studying in university " + schoolName + ".";
    }


}
