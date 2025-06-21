public class DifferentPattern {
    public static void main(String[] args) {
        Animal animal1=FactoryClass.getAnimal("dog");// then by return it turn to Animal animal1=new Dog();
        animal1.speak();

        Animal animal2=FactoryClass.getAnimal("cat");// then by return it turn to Animal animal1=new Cat();
        animal2.speak();
        
    }
    
}
// this is interface 
interface Animal{
    void speak();
}
// this is class to implement this interface
class Dog implements Animal{
    // interface method must be public
   public void speak(){
  System.out.println("show the dog");
    }
}

// this is another class

class Cat implements Animal{
    public void speak(){
        System.out.println("show the cat");
    }
}

// this is factory class
class FactoryClass{
    public static Animal getAnimal(String type){
        if("dog".equalsIgnoreCase(type)) return new Dog();// this is constructor for making object
        if("cat".equalsIgnoreCase(type)) return new Cat();
        return null;
    }
    
}
