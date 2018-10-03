package vn.codegym.QuyenLeSy;

public class Human {
    private String name;
    private boolean gender;
    private int age;

    public Human(String name, boolean gender){
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public boolean getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void say(String words){
        System.out.println(words);
    }

    public void eat(Apple food){
        food.weight--;
    }

    public void sleep(){
        System.out.println("zzZZ");
    }

}


