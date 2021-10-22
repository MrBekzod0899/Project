package module;

import module.enums.AnimalTypes;

import java.util.Arrays;

public class Animal {
    private String name;
    private Integer age;
    private AnimalTypes animalTypes;
    private String[]foods;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AnimalTypes getAnimalTypes() {
        return animalTypes;
    }

    public void setAnimalTypes(AnimalTypes animalTypes) {
        this.animalTypes = animalTypes;
    }

    public String[] getFoods() {
        return foods;
    }

    public void setFoods(String[] foods) {
        this.foods = foods;
    }


}
