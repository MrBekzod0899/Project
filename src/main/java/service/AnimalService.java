package service;

import module.Animal;

import java.util.Arrays;

public class AnimalService {

    private Animal[] animals=new Animal[3];
    private int index=0;
    public  void  addAnimal(Animal animal){
        animals[index++]=animal;

    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
