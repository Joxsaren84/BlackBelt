package ru.joxaren.impotant.reflectionexamples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("ru.joxaren.impotant.reflectionexamples.Employee");

        /*
        Class employeeClass2 = Employee.class;
        Employee employee = new Employee();
        Class employeeClass3 = employee.getClass();
        */

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id is: " + someField.getType());
        System.out.println("*********");

        Field[] fields = employeeClass.getFields();
        for (Field f : fields){
            System.out.println("Type of field " + f.getName() + " is " + f.getType());
        }
        System.out.println("*********");

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field f : allFields){
            System.out.println("Type of field " + f.getName() + " is " + f.getType());
        }
        System.out.println("------------------------------");

        Method method = employeeClass.getMethod("increaseSalary");
        System.out.println("Info about method " + method.getName() +":");
        System.out.println("Return type: " + method.getReturnType());
        System.out.println("Parameter types: " + Arrays.toString(method.getParameterTypes()));
        System.out.println("*********");

        Method method2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Info about method " + method2.getName() +":");
        System.out.println("Return type: " + method2.getReturnType());
        System.out.println("Parameter types: " + Arrays.toString(method2.getParameterTypes()));
        System.out.println("*********");

        Method[] methods = employeeClass.getMethods();
        for (Method m : methods){
            System.out.println("Info about method " + m.getName() +":");
            System.out.println("Return type: " + m.getReturnType());
            System.out.println("Parameter types: " + Arrays.toString(m.getParameterTypes()));
            System.out.println("* * * * *");
        }
        System.out.println("*********");

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method m : allMethods){
            System.out.println("Info about method " + m.getName() +":");
            System.out.println("Return type: " + m.getReturnType());
            System.out.println("Parameter types: " + Arrays.toString(m.getParameterTypes()));
            System.out.println("* * * * *");
        }
        System.out.println("*///////*");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method m : allMethods2){
            if(Modifier.isPublic(m.getModifiers())) {
                System.out.println("Info about method " + m.getName() + ":");
                System.out.println("Return type: " + m.getReturnType());
                System.out.println("Parameter types: " + Arrays.toString(m.getParameterTypes()));
                System.out.println("* * * * *");
            }
        }
        System.out.println("*********");

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor1 has parameters " + constructor1.getParameterCount() +
                " with types " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("*********");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor2 has parameters " + constructor2.getParameterCount() +
                " with types " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("*********");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor c : constructors){
            System.out.println("Constructor has parameters " + c.getParameterCount() +
                    " with types " + Arrays.toString(c.getParameterTypes()));
            System.out.println("* * * * *");
        }



    }
}
