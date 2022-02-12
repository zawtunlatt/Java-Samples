package com.jsamples.core_java.wrapper_class.app;

public class App {
    int age;
    int salary;
    
    
    // 2022-02-11 - Constructor Introduction
    public App() {
        
    }
    
    private App(int num) {
        age = num;
    }
    
    public App(int age, int sal) {
        this.age = age;
        salary = sal;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Byte Wrapper
        byte byte_value = 10;
        Byte byte_wrapper = Byte.valueOf(byte_value);
        System.out.println(byte_wrapper);
        
        // Short Wrapper
        Short s = 10;
        
        // Integer Wrapper
        int num = 1000;
        Integer wrapperNum = Integer.valueOf(num);
        String age = "25";
        Integer i = Integer.valueOf(age);
        int num2 = i;
        Integer i2 = num2;
        String st = i.toString();
        System.out.println(st);
        
        // Long Wrapper
//        Long l = 35;  // Compile Error => Java can't convert int primitive value to Long Wrapper directly
        Long l = 35L;
        
        // Float Wrapper
//        Float fl = 15.7; // Compile Error => Java can't convert double primitive value to float Wrapper directly
        Float f2 = 23.3f;
        Float fl = (float) 15.7;
        
        // Double Wrapper
        Double d1 = 11.7;
        float f3 = d1.floatValue();
        int i3 = (int) Math.ceil(d1);
        System.out.println("Double to Int cast : " + i3);
        
        // Boolean Wrapper
        boolean flag = true;
        Boolean wrapper_flag = Boolean.valueOf(flag);
        boolean flag2 = wrapper_flag;
        System.out.println(wrapper_flag);
        
        // Character Wrapper
        char c = 'a';
        Character w_c = c;
        Character w_c2 = Character.valueOf(c);
        c = w_c;
        
    }
    
    public void intro_OOP() {
        Bird b = new Bird();
        b.move();
        
        Fish f = new Fish();
        f.move();
    }

}


interface Animal {
    public void move();
}

class Bird implements Animal{
    public void move() {
        System.out.println("Bird move by flying.");
    }
}

class Fish implements Animal {
    public void move() {
        System.out.println("Fish move by swimming.");
    }
    
}