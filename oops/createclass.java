public class createclass {
    int age = 20;
    String name = "sowjanya";
    String a = "kfme";
    int energy = 9;
    double attendance = 89.9;
    String mood = "bored";
    void skipclass() {
        if (energy < 10) {
            System.out.println("I am getting sleep");
        } else {
            System.out.println("I am ready to do the work");
        }
    }
    void taketest() {
        if (attendance < 50) {
            System.out.println("You are in condonation list");
        } else {
            System.out.println("Your attendance is safe");
        }
    }
    void sleep() {
        if (mood.equals("bored")) {
            System.out.println("I am feeling sleepy");
        } else {
            System.out.println("I am very active");
        }
    }
    void study() {
        if (mood.equals("ambitious")) {
            System.out.println("I am going to study to achieve that ambitious goal");
        }
    }
    void eat() {
        if (energy <= 5) {
            System.out.println("I am hungry");
        } else {
            System.out.println("My tummy is full");
        }
    }
    public static void main(String[] args) {
        createclass obj = new createclass();
        obj.skipclass();
        obj.taketest();
        obj.sleep();
        obj.study();
        obj.eat();
    }
}