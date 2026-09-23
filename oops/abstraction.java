abstract class Animal{
    abstract void sound();

}
class dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
/*Animal a =new animal();
/*so we are inheriting the abstract method and calling it */
/*this is where abstract method is used where to implementationis provide by the subclass*/
public class abstraction{
    public static void main(String[] args){
        dog d=new dog();
        d.sound();
    }
}