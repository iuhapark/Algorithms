package MemberOOP;

public class Member {
    private String username;
    private String password;
    private String pwAgain;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    //Kauf지수에서 사용하는 생성자
    public Member(double height, double weight) {
        this.weight = weight;
        this.height = height;
    }

    //회원가입에서 사용하는 생성자
    public Member(String username, String password, String pwAgain, String name,
                  String ssn, String phoneNumber, String address,
                  String job) {
        this.username = name;
        this.password = password;
        this.pwAgain = pwAgain;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getpwAgain() {
        return this.pwAgain;
    }

    public void setpwAgain(String pwAgain) {
        this.pwAgain = pwAgain;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getssn() {
        return this.ssn;
    }

    public void setssn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

//    @Override
//    public String toString() {
//        return "MemberModel{" +
//                "username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", pwAgain='" + pwAgain + '\'' +
//                ", userName='" + userName + '\'' +
//                ", ssn='" + ssn + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", address='" + address + '\'' +
//                ", job='" + job + '\'' +
//                '}';
//    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "username='" + username + '\'' +
                ", passWord='" + password + '\'' +
                ", pwAgain='" + pwAgain + '\'' +
                ", userName='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
//                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
//                ", bmi=" + bmi +
//                ", bodyMass='" + bodyMass + '\'' +
                '}';
    }
}