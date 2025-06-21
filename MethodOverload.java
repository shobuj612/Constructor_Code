public class MethodOverload {
    public static void main(String[] args) {
       System.out.println("hi overload");
        System.out.println(myMethod(10.10F, 20.21F));
        System.out.println(myMethod(12.123d, 21.124d));
        System.out.println(myMethod(10.141414, 12.12121240));
         System.out.println(myMethod(10, 20)); 
        // overload means method name will be same but the return type and the variable
        // must be different
        // if two method has same return type then the number of variable will must be
        // different
        // diffeten variable name but the same return type and the same number of
        // variable cause the error
        //
    }

    // this is method overload
    public static int myMethod(int x, int y) {
        return x + y;
    }

    // this is method overload
    public static double myMethod(double x, double y) {
        return x + y;
    }

    // this is method overload
    public static float myMethod(float x, float y) {
        return x + y;
    }

    public long myMethod(long x,long y){
        return x+y;
    }

    // this will be cause the error because the same return type and the same number
    // of the variable
    // public static float myMethod(float p,float q){
    // return p+q;
    // }

}
