import java.util.Scanner;

public class HomeWork1 {
    //1
    public static void inputAllBaseType(){
        Scanner a1=new Scanner(System.in);
        System.out.println("Enter a character");
        char input=a1.next().charAt(0);
        System.out.println("The Enter:"+input);

        System.out.println("Enter a boolean(true/flase):");
        boolean input5=a1.nextBoolean();
        System.out.println("The Enter:"+input5);

//        System.out.println("Enter a string");
//        String input4=a1.nextLine();
//        System.out.println("The Enter:"+input4);

        System.out.println("Enter an iteger");
        int input1=a1.nextInt();
        System.out.println("The Enter:"+input1);


        System.out.println("Enter a float");
        float input2=a1.nextFloat();
        System.out.println("The Enter:"+input2);

        System.out.println("Enter a double");
        double input3=a1.nextDouble();
        System.out.println("The Enter:"+input3);
    }
    //3
    public static boolean Multiple(long m,long n){
        if(m==0)
         return false;

        return n%m==0;
    }

    //4
    public static boolean Even(int i){
        if (i==0)
        return true;

        return (i&0)==0;
    }
    //5
    public static int Sum(int k) {
        int sum = 0;
        for (int i = 0; i <= k; i++)
            sum += i;
        return sum;
    }
    //6
    public static int SumOdd(int l) {
        int sum = 0;
        for (int i = 1; i <= l; i+=2)
            sum += i;
        return sum;
    }

    //7
    public static int SumOfSquares(int c) {
        int sum = 0;
        for (int i = 0; i <= c; i++)
            sum += i*i;
        return sum;
    }

    //8
    public static int ConutVowels(String x){
        int count=0;
        for(int i = 0; i <= x.length(); i++){
            char c=Character.toLowerCase(x.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }

        return count;
    }
//9
    public static String removePunctuation(String s){
        StringBuilder sb=new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)||Character.isWhitespace(c)){
                sb.append(c);}
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        //1
        inputAllBaseType();

        //2
        GameEntry []A=new GameEntry[5];
        A[4]=new GameEntry(500);
        GameEntry[]B=A.clone();
        A[4].score=550;
        System.out.println("Score in A[4]:"+A[4].score);
        System.out.println("Score in B[4]:"+B[4].score);

        //3
        long m=5;
        long n=10;

        boolean result=Multiple(m,n);
        System.out.println("is "+n+" muliple "+m+"?"+result);

        //4
        int i=12;
        boolean result2=Even(i);
        System.out.println("is "+i+ "even?"+result2);

        //5
        int k=7;
        int result3=Sum(k);
        System.out.println("The sum= "+result3);

        //6
        int l=12;
        int result4=SumOdd(l);
        System.out.println("The sum odd = "+result4);

        //7
        int c=12;
        int result5=SumOfSquares(c);
        System.out.println("Sum Of Squares = "+result5);

        //8
        String x="Abeer Abdalkhaliq";
        int result6=ConutVowels(x);
        System.out.println("Count of the word: "+result6 );

        //9
        String s="let's try,Mike!";
        String result7=removePunctuation(s);
        System.out.println("the sentence"+s+" the without punctuation is "+result7);

        //10
        Flower vv=new Flower("roes",9,6.5f);
        System.out.println("name: "+vv.getName()+" number Of Flower: "+vv.getNumberOfFlower()+" price: "+vv.getPrice());

        //11
        CreditCard card=new CreditCard("Ali","Alarby","1234567789",4000,1000);
        System.out.println("Customer: "+card.getCustomer()+"Bank: "+card.getBank()+"Account: " +card.getAccount()+"Balance: "+card.getBalance());

        //12
        CreditCard []wallet={new CreditCard("Ali","Alarby","1234567789",4000,1000),new CreditCard("salh","Ameroica","1234567789",7000,8000)};
        for(int ii=1; ii<=16;i++){
            wallet[2].charge(255);
            wallet[1].charge(55);
            wallet[0].charge(277);}
        for(CreditCard g:wallet){
            System.out.println("Custome"+g.getCustomer()+"Bank: "+card.getBank()+"Account: " +card.getAccount()+"Balance: "+card.getBalance());
        }

    }
}
