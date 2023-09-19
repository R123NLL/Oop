package oop.Person;

public class Program {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[0].setName("Denis");
        persons[0].setHeight(186);
        persons[0].setWeight(81);
        persons[1].setName("Eve");
        persons[1].setHeight(170);
        persons[1].setWeight(65);
        persons[2].setName("Jesse");
        persons[2].setHeight(1);
        persons[2].setWeight(5);

//        for (int i = 0; i < persons.length; i++) {
//            int minWeight = Integer.MAX_VALUE;
//            if (persons[i].getWeight() < minWeight) {
//                minWeight = persons[i].getWeight();
//            }
//            if (persons[i].getWeight()>=minWeight)
//                persons[i].show();
//        }

        for (int i = 0; i < persons.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[j].getWeight() < persons[minIndex].getWeight()) {
                    minIndex = j;
                }
            }
            // Swap the elements
            Person temp = persons[i];
            persons[i] = persons[minIndex];
            persons[minIndex] = temp;
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].show());
        }


    }
}
