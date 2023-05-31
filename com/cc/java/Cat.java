package com.cc.java;

public class Cat {

public String name;
public String furColor;
public int age; // int ist hier ein primitiv

// rechtsklick -> source action -> generate constructor  

public Cat(String name, String furColor, int age) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
}

// rechtsklick -> source action -> generate getter  

public String getName() {
    return name;
}

public String getFurColor() {
    return furColor;
}

public int getAge() { 
    return age;
}

}
