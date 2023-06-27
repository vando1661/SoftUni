package Java_OOP._07InterfacesAndAbstractionLab.jo03SayHello;

public class Bulgarian extends BasePerson{
    public Bulgarian(String name){
        super(name);
    }
    @Override
    public String sayHello() {
        return "Здравей";
    }
}
