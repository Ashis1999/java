import java.util.*;
class autoMorphic{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for given a range");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        boolean res=morphic.AutoMorphic(num1,num2);
        if(res==true){
            System.out.println(res);

    }
}
class morphic{
    static boolean AutoMorphic(int num){
        int count=0;
        int square=num1*num1;

        while(num1!=0){
        if(num1%10!=square%10){
            System.out.println(res);
            
        }
        num1=num1/10;
            square=square/10;
    }


        return true;


    
    }
}