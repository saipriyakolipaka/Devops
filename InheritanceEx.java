class Animal{
void sound(){
System.out.println("Animal makes sounds");
}
}
class Dog extends Animal{
void  barks(){
System.out.println("Dog is an animal");
}
}
public class InheritanceEx{
public static void main(String[] args){
Dog d=new Dog();
d.sound();
d.barks();
}
}
