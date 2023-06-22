package Java_OOP._02WorkingWithAbstraction_Exercise.jo04TrafficLights;

public class TrafficLight {
    private Color currentColor;
    public TrafficLight(Color currentColor){
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }
    public  void  changeColor(){
        switch (currentColor){
            case RED :
                this.currentColor = Color.GREEN;
                break;
            case GREEN:
                this.currentColor = Color.YELLOW;
                break;
            case YELLOW:
                this.currentColor = Color.RED;
                break;
        }

    }
}
