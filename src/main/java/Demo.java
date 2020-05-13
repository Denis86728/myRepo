public class Demo {

    int value1;
    int value2;

    public Demo() {
        value1 = 10;
        value2 = 20;
    }

    public void display(){
        System.out.println("Value 1 === " + value1);
        System.out.println("Value 2 === " + value2);
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.display();
    }
}
