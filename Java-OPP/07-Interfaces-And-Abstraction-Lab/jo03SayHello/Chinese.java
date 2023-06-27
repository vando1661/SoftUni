package Java_OOP._07InterfacesAndAbstractionLab.jo03SayHello;

public class Chinese extends BasePerson{
    public Chinese(String name){
       super(name);
    }
    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
