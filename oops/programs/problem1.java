public class problem1{
    public static void main(String[] args){
        int rev=0;
        for(int i=10890;i>0;i=i/10){
            rev=(10*rev)+i%10;
        }
        System.out.println(rev);
    }

}