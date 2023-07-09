package Java_OOP._11ReflectionLab;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> clazz = Reflection.class;
        Method[] methods = clazz.getDeclaredMethods();
        Comparator<Method> comparator = Comparator.comparing(Method::getName);



        Set<Method> getters = new TreeSet<>(comparator);
        Set<Method> setters = new TreeSet<>(comparator);
        for (Method method:methods) {
            String methodName = method.getName();
            if(methodName.contains("get")){
                getters.add(method);
            } else if (methodName.contains("set")) {
                setters.add(method);
            }
        }

        Set<Field> fields  = Arrays.stream(clazz.getDeclaredFields())
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Field::getName))));
        for (Field field : fields) {
            int modifier = field.getModifiers();
            if(!Modifier.isPrivate(modifier)){
                System.out.println(field.getName() + " must be private!");

            }
        }

        for (Method getter : getters) {
            int modifier = getter.getModifiers();
            if(!Modifier.isPublic(modifier)){
                System.out.println(getter.getName() + " have to be public!");
            }
            //System.out.println(getter.getName() + " will return class " + getter.getReturnType().getName());
        }
        for (Method setter : setters){
            int modifier = setter.getModifiers();
            if(!Modifier.isPrivate(modifier)){
                System.out.println(setter.getName() + " have to be private!");
            }
            //System.out.println(setter.getName() + " and will set field of class " + setter.getParameterTypes()[0].getName());
        }
    }
}
