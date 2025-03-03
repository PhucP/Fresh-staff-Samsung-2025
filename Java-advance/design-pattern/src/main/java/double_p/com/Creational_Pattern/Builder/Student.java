package double_p.com.Creational_Pattern.Builder;

public class Student {
    private String name;
    private int age;
    private String address;
    
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(name, age, address);
        }
    }
}
