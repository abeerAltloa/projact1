public class H_w_2 {
    //1
    /*Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility. Why is the following implementation of the PredatoryCreditCard.charge method flawed?
public boolean charge(double price) {
boolean isSuccess = super.charge(price);
if (!isSuccess)
charge(5); // the penalty
return isSuccess;
}*/
                          الحل
    /*العيب انه سيدخل في دواره لا نهائيه والسبب ان كل مرة يعود الى نفس الداله والتلافي الخطأنستدعي دالة super.charge(5)*/

    //2
        /*Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility.
Why is the following implementation of the PredatoryCreditCard.charge method flawed? public boolean charge(double price) {
boolean isSuccess = super.charge(price);
if (!isSuccess)
super.charge(5); // the penalty
return isSuccess;
}
الحل
In either case, you*/
    /*litime  وهنا سيظهر عيب اخر في بعض المرات لن يضيف من متجاوزي القانون ال 5 دولار اذا كان balance  قريبه جدا من   */
}

//3

//public static void main(String[] args) {
//    FibonacciProgression fibonacciProgression=new FibonacciProgression(2,2);
//    fibonacciProgression.printprogression(8);
//}

//5
   /*Can two interfaces mutually extend each other? Why or why not?

/* لا يمكن لواجهين ان تررث كل منهما الاخرى ولكن يمكن ان ترث احداهما الاخرى لانه سيحصل اخطاء عندما ترث كل واحده الاخرى */

//6
 /*What are some potential efficiency disadvantages of having very deep inheritance
     trees, that is, a large set of classes, A, B, C, and so on, such that B extends
      A, C extends B, D extends C, etc.?
R-*/

/*من العيوب الموجودة في الوراثه المتعمقه
 * صعوبه التعديل واستهلاك للوقت والاداء واستهلاك في الذاكرة.....*/

//7

/*What are some potential efficiency disadvantages of having very shallow
 inheritance trees, that is, a large set of classes, A, B, C, and so
 on, such that all of these classes extend a single class, Z?
R-*/
/*
 * من العيوب :قلة اعادة استخدام هذه الكلاسات واذا اردنا استخدام بعض الدوال لابد من اختبار كل كلاس على حده
 * اذا كان هناك تغير على الكلاس الاب سيحدث ذلك التغير على الابناء
 * صعوبة الاداره والتحكم بها
 * هنالك  ايضا صعوبة عند البحث*/

//8 //9 الكوز +انا حليته في السبورة

