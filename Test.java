public class Test {
    private  int age;
    private String name;

    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }

    public  static void main(String[] args){
        Test t=new Test();
        t.setName("Mayank");
        t.setAge(21);

        System.out.println(t.getName());
        System.out.println(t.getAge());
    }

}
