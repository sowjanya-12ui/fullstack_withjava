class Calculator{
    int add(int a ,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class overload{
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(8,9));
        System.out.println(c.add(7,8,9));
    }
}