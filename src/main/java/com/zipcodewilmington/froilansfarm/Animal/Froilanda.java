package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Flyable;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

import java.util.ArrayList;
import java.util.List;

public class Froilanda implements Pilot, Person {

        Froilanda froilanda;
        List<Edible> foodEaten = new ArrayList<Edible>();
        List<Person> froilandaFamily = new ArrayList<Person>();

        public Froilanda() {
            super();
            this.froilanda = new Froilanda();

        }

        public void eatEdible(Edible food) {
                if (isHungry()) {
                    foodEaten.add(food);
                }
            }


        public List<Edible> getFoodEaten() {
            return foodEaten;
        }


        public void feedFarmAnimals(Eater animal, Edible food) {
            froilanda.feedFarmAnimals(animal, food);
        }

        public boolean isHungry() {
            if (foodEaten.isEmpty()) {
                return true;
            } return false;
        }

        public List reproduce(Integer increaseBy) {
            for (int i = 0; i < increaseBy; i++) {
                froilandaFamily.add(new Froilanda());
            } return froilandaFamily;
        }

        public String makeNoise() {
            return "Welcome to Froilan's farm. I'm Froilanda; the rootinest, tootinest pilot down in these parts!";
        }

    public void flyAirCraft(Flyable airCraft) {

    }

    public void ceaseFlying(Flyable airCraft) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }
}
