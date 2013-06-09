package tdd.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class List {
    public static void main(String[] args) throws Exception {
    	main(new String[] {"List.class"});
    		if(args.length!=1)
                    throw new Exception("Voce precisa informar o nome da classe como unico parametro");
            Class<?> clazz = Class.forName(args[0]);
            printClassInformation(clazz);
            printClassAttributes(clazz);
            printClassMethods(clazz);
    }
    
    public static void printClassInformation(Class<?> clazz) throws Exception {
            System.out.println("Class Name: " + clazz.getName());
    }
    
    public static void printClassAttributes(Class<?> clazz) throws Exception {
            for(Field f : clazz.getDeclaredFields()){
                    System.out.format("\t--Private Attribute Name: %s, Attribute Type: %s\n",
                    		f.getName(), f.getType().getName());
            }
    }
    
    public static void printClassMethods(Class<?> clazz) throws Exception {
    	for(Method m : clazz.getMethods()){
    		System.out.format("\tMethod Name: %s, Return Type: %s, Parameter Types: %s\n",
    				m.getName() ,m.getReturnType().getName(), m.getParameterTypes().toString());
        }
    }
}