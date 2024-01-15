public class UbderGraduateStudent extends Student {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public UbderGraduateStudent(String name, int age,String major){
        super(name, age);
        this.major= major;

    }

    @Override
    public String toString() {
        return "UbderGraduateStudent{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }
}
