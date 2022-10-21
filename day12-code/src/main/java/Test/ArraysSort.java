package Test;

import java.util.*;

class Dog implements Comparable<Dog>{
    int size;
    int weight;

    public Dog(int s, int w){
        size = s;
        weight = w;
    }

    @Override
    public int compareTo(Dog o) {
        return this.size-o.size;
    }
}

class DogSizeComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.size-o2.size;
    }
}

class DogWeightComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.weight - o2.weight;
    }
}

public class ArraysSort {
    public static void main(String[] args) {
        Dog d1 = new Dog(2, 50);
        Dog d2 = new Dog(1, 30);
        Dog d3 = new Dog(3, 40);

        Dog[] dogArray = {d1, d2, d3};
        List<Dog> dogList=new ArrayList<>(Arrays.asList(dogArray));
        printDogs(dogArray);
        Collections.sort(dogList);
        dogList.forEach(p->System.out.println(p.size+", "+ p.weight));
        Arrays.sort(dogArray);
        System.out.println("****************************************************");
        Arrays.sort(dogArray, new DogSizeComparator());
        printDogs(dogArray);

        Arrays.sort(dogArray, new DogWeightComparator());
        printDogs(dogArray);
    }

    public static void printDogs(Dog[] dogs){
        for(Dog d: dogs)
            System.out.print("size="+d.size + " weight=" + d.weight + " ");

        System.out.println();
    }
}