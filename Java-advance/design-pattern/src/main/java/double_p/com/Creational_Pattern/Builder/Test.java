package double_p.com.Creational_Pattern.Builder;

public class Test {
    public static void main(String[] args) {
        Student student = new Student.Builder().setName("PhucP")
                                                .setAge(24)
                                                //.setAddress("Your heart")
                                                .build();
        System.out.println(student.toString());
    }
}
