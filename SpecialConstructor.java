public class SpecialConstructor {
    public static void main(String[] args) {
        // this is to called the getInstance()
        Singleton singleton=Singleton.getInstance();
        System.out.println("print the singleton from the main method"+" "+singleton);
        // this is to pass the singleton object
        CheckSingleton.useSingleton(singleton);

        Singleton hi=Singleton.useParameter("iqram");
        System.out.println("print this useParameter retrun value"+" "+hi);
        hi.showMessage();
        Singleton ss=Singleton.useParameter(Singleton.hiPrint());
        System.out.println("this is by hiprint()"+" "+ss);
        
    }
    
}
class Singleton{
    private static Singleton instance;
    private String msg;
    // this is constructor for the class
    private Singleton(){
        System.out.println("\"hi singleton");

    }

    private Singleton(String msg){
        this.msg=msg;
        System.out.println("print the msg from the parameter constructor"+" "+msg);
    }
    // this is the method
    public static Singleton getInstance(){
        if (instance==null) {
            instance=new Singleton();
        }
        return instance;
    }

    public static Singleton useParameter(String msg){
        if(instance!=null){
            instance=new Singleton(msg);
        }
        return instance;
    } 

    public static String hiPrint(){
        return "well come Bangladesh";
    }

    public void showMessage(){
        System.out.println("show the message"+" "+msg);
    }

}
class CheckSingleton{

    public static void useSingleton(Singleton s){
        System.out.println("print this singleton from the useSingleton()"+" "+s);
    }
}
