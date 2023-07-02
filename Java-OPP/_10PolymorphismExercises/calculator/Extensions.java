package Java_OOP._10PolymorphismExercises.calculator;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return  new InputInterpreter(engine);
    }
}
