import java.util.Scanner;

public class Main {
    //5
    public static void ArrayPrint(int x3[]){

        for(int i=0;i<x3.length;i++)
            System.out.println("x="+x3[i]);
    }
    //6
    public static int[] ArrayInput(){
        Scanner b=new Scanner(System.in);
        System.out.println("Enter size of arry");
       int size= b.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elment of array");
        for (int i=0;i<size;i++)
            arr[i]=b.nextInt();
        //b.close();
        return arr;

    }
    public static void main(String[] args) {
        //1
        System.out.println("Hello world program");

        //2
        for(int i=0;i<11;i++)
            System.out.println("num="+i);

        //3
        int x[]={9,8,7,6,5,4};
        for(int i=0;i<x.length;i++)
            System.out.println("x="+x[i]);

        //4
        Scanner x2=new Scanner(System.in);
        System.out.println("Enter size arry");
        int size=x2.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of the arry");
        for(int i=0;i<size;i++)
            array[i]= x2.nextInt();
        for(int i=0;i<size;i++)
            System.out.println("array="+array[i]);

       //5
        int x3[]={8,6,2,0,1};
        ArrayPrint(x3);

        //6
        int []x4=ArrayInput();
        for(int i=0;i<x4.length;i++)
            System.out.println("Elmant="+x4[i]);

        //7
        Student students[] =new Student[3];
        students[0]=new Student("ALi",20);
        students[1]=new Student("Salh",21);
        students[2]=new Student("Abdalkhaliq",22);
        for(int i=0;i<students.length;i++)
            System.out.println("Name Student"+i+"= "+students[i].getName()+" , "+"Age Student"+i+"=  "+students[i].getAge());
    }
}
