import module.Animal;
import module.enums.AnimalTypes;
import service.AnimalService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        AnimalService animalService = new AnimalService();
        for (int j = 0; j < 3; j++) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("enter animal name:");
            String name = scanner.nextLine();
            animal.setName(name);

            System.out.print("enter animal age:");
            Integer age = scanner.nextInt();
            animal.setAge(age);

            System.out.println("AnimalTypes:");
            System.out.println("1: \t\t\t" + AnimalTypes.FISH);
            System.out.println("2: \t\t\t" + AnimalTypes.BIRDS);
            System.out.println("3: \t\t\t" + AnimalTypes.MAMMALS);
            System.out.println("4: \t\t\t" + AnimalTypes.INVERTEBRATES);

            System.out.println("enter AnimalTypes:");
            int animaltype = scanner.nextInt();
            switch (animaltype) {
                case 1:
                    animal.setAnimalTypes(AnimalTypes.FISH);
                    break;
                case 2:
                    animal.setAnimalTypes(AnimalTypes.BIRDS);
                    break;
                case 3:
                    animal.setAnimalTypes(AnimalTypes.MAMMALS);
                    break;
                case 4:
                    animal.setAnimalTypes(AnimalTypes.INVERTEBRATES);
                    break;
                default:
                    System.out.println("Not found animaltypes");
                    break;
            }
            String[] foods = animal.getFoods();
            foods = new String[2];
            for (int i = 0; i < 2; i++) {
                scanner = new Scanner(System.in);
                System.out.println("enter animal's foods");
                foods[i] = scanner.nextLine();
            }
            animal.setFoods(foods);
            animalService.addAnimal(animal);

        }
        System.out.println(animalService.getAnimals().length);
        System.out.println("List animal");
        int index = 0;
        for (Animal animal1 : animalService.getAnimals()) {
            System.out.println(++index + ":Card");
            System.out.print("name:" + animal1.getName());
            System.out.print("age:" + animal1.getAge());
            System.out.print("type:" + animal1.getAnimalTypes());
            for (int i = 0; i < animal1.getFoods().length; i++) {
                System.out.println(i + 1 + ":animal foods");
                System.out.println(animal1.getFoods()[i]);

            }
        }
    }

}
