public class Cat {
    private String name;
    private int age;


    public Cat(int age, String name) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void printOut() {
        System.out.println("name:" + name + "age:" + age);
    }
}