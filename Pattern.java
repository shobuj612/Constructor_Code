public class Pattern {
    public static void main(String[] args) {
Address address1=AddressFactory.getAddress("jahid");// here to return the constructor to make the object
Address address2=AddressFactory.getAddress("faruk");// here to return the constructor to make the object
Address address3=AddressFactory.getAddress("russel");// here to return the constructor to make the object
Address address4=AddressFactory.getAddress("faysal");// here to return the constructor to make the object
        System.out.println("this is the name"+" "+address1.address());
        System.out.println("this is the union"+" "+address2.address());
        System.out.println("this is the thana"+" "+address3.address());
        System.out.println("this is the zilla"+" "+address4.address());
    }
    
}

interface Address{
    String address();
}
class Name implements Address{
    String name;
    
    public Name(String name) {
        this.name = name;
    }

    public String address(){
        return name;
    }
}
class Union implements Address{
    String union;
    
    public Union(String union) {
        this.union = union;
    }

    public String address(){
        return union;
    }
    
}
class Thana implements Address{
    String thana;
    
    public Thana(String thana) {
        this.thana = thana;
    }

    public String address(){
        return thana;
    }
}
class Zilla implements Address{
    String zilla;
    
    public Zilla(String zilla) {
        this.zilla = zilla;
    }

    public String address(){
        return zilla;
    }
}
// thi is factory class
class AddressFactory{
   static  String[] array={"jahid","faruk","russel","faysal"};
   // this is factory method
    public static Address getAddress(String iqram){
        
        if(iqram.equalsIgnoreCase(array[0])) return new Name("farzana");
        if(iqram.equalsIgnoreCase(array[1])) return new Union("darmapash");
        if(iqram.equalsIgnoreCase(array[2])) return new Thana("durgapur");
        if(iqram.equalsIgnoreCase(array[3])) return new Zilla("mohongonj");
        return null;
        
    }
}
