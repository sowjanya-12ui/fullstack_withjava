public class first{
    public static void main(String[] args){
        class animal{
            void sound(){
                System.out.println("the animal sounds");
            }
        }
        class dog extends animal{
            //override
            void sound(){
                System.out.println("the dog barks");
            }
        }
        animal obj=new animal();
        obj.sound();
        dog obj1=new dog();
        obj1.sound();
    }
}