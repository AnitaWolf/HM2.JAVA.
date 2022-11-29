public class Main {
    public static void main(String[] args) {
        print1(25, 60);
        System.out.println(mul(10, 3));
        Cat cat=new Cat(5,"charli");
        System.out.println("name="+cat.getName()+"age=" + cat.getAge());
        cat.setAge(10);
        cat.setName("Tom");
       cat.printOut();

    }

    static void print1(int a, int b) {
        System.out.println("a=" + a + "b=" + b);
    }
    static int mul(int a, int b) {
        return a * b;
    }
}










