public class Customer {

    public int id;
    public String name;
    public int age;
    public int num1;
    public int num2;
    public int num3;
    public int num4;
    public int num5;
    public int num6;

    public Customer(int id, String name, int age, int num1, int num2, int num3, int num4, int num5, int num6) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5 +
                ", num6=" + num6 +
                '}';
    }
}
