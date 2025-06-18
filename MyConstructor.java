
class India{
    String x="Kolkata";
    String y=" + Mumbai";
    
    public India() {
        System.out.println("I want to live in the pakistan");
    }
    public India(String x, String y) {
        this.x = x;
        this.y = y;
        System.out.println("this is called by the subclass" +" "+ x +" " +y);
    }
    public void myMethod(){
        System.out.println("this is india"+" "+ x + " " + y);
    }
    public String add(){
        return x+" "+" " +y;
    }

    public int sum(int x,int y){
        return x+y;
    }
}

class Pakistan extends India {
    String distance;
    String distance1 ;
    public Pakistan(){

    }
   public Pakistan(String p,String q,String distance,String distance1){
       // this is the super keyword to call the parent class constructor
       // super() must be in the firstline 
        super(p,q);
       // super(); // thi is no arg consstructor
       this.distance=distance;
       this.distance1=distance1;
       System.out.println("this is called by the bangladesh"+" "+p+" "+q+" "+" "+distance+" "+distance1);
   }

   @Override
   // method signature must be same but he codeblock will be different
   public void myMethod(){
    // super keyword is used to call the parent class field or method;
    super.myMethod();// this is parentclass method
    int x=10;
    System.out.println("show this in the terminal"+" "+x);
    super.myMethod();// this is parentclass method
   }

   @Override
   public String add(){
    System.out.println("This is parentClass method"+super.add());
    return distance+" "+ " " +distance1;
   }
 // this is method overload .that means the change of the method signature
   public int  add(int x,int y){
    return x+y;
   }

   
}
// this is another class
class Bangladesh extends Pakistan{
        String farzana,sakila;

        public Bangladesh(){

        }
    public Bangladesh(String iqram,String josim,String faruk,String jahid,String farzana,String sakila){
        super(iqram,josim,faruk,jahid);// constructor pakistan has four parameter
        this.farzana=farzana;
        this.sakila=sakila;
    }

}



public class MyConstructor {

    public static void main(String[] args) {
        // i want to make the constructor of the India
        India india=new India();
        India india2=new India("Moharsatra","kashmir");
        india.myMethod();// by the defalut constructor object
        System.out.println("this is called by the default Constructor Object"+" " + " " +india.add());
        System.out.println("this is the parameter constructro"+india2.add());
        india2.myMethod();
        System.out.println("this is called without the reference variable"+" "+new India("Dehli","Bengaluru").add());
        System.out.println("this is method with parameter call by the defalut constructor"+" "+ " " +india.sum(10, 20));
        System.out.println("this is parameter method called by parameter Constructor"+" " + " " + india2.sum(40, 50));
        System.out.println("this is calling without reference variable:"+" "+new India().sum(120, 150));

       // i have to call the extended method

       // now make the constructor of the pakeistan
       Pakistan pakistan=new Pakistan();//this is defalut constructor object
       System.out.println("this is the Pakistan Part");
       pakistan.myMethod();
       System.out.println("this call by the default pakistan Constructor without makaking any referece variable:"+" "+ new Pakistan().add(45,30));
       System.out.println("this call by the parameter pakistan Constructor without makaking any referece variable:"+" "+ new Pakistan("karachi","lahore","Beluchistan","faluza").add(45,30));
       System.out.println("this call by the parameter pakistan Constructor without makaking any referece variable:"+" "+ new Pakistan("karachi","lahore","Beluchistan","faluza").add());
       

       // this is the  Bangladesh part

        Bangladesh bangladesh=new Bangladesh();
        //Bangladesh bangladesh2=new Bangladesh();
        System.out.println("this is the method of pakistan or Inddia:"+" "+bangladesh.add(13, 13));
        System.out.println("this is the method from the india or pakistam"+" "+new Bangladesh().x);
        System.out.println("this is the method of the india or the pakistan:"+" "+new Bangladesh().sum(21, 21));
        System.out.println("this is the method of the india or the pakistan for hashcode"+" "+new Bangladesh("Dhaka","Jessore","Madaripur","Khulna","Rajshahi","cumilla").hashCode());
        System.out.println("this is the method of the india or the pakistan"+" "+new Bangladesh("Dhaka","Jessore","Madaripur","Khulna","Rajshahi","cumilla").add(30, 30));
    }
}
