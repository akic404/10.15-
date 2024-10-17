public class Animal {
    String AnimalName,sound;


    void cry(){
        System.out.println(sound);
    }
    String getAnimalName() {
        return AnimalName;
    }
}

class Cat extends Animal{

     Cat(){
        this.sound = "喵，哈~~~~~~";
        this.AnimalName = "猫";
    }
}
class Dog extends Animal{
    Dog(){
        this.sound = "汪汪汪";
        this.AnimalName = "狗";
    }
}