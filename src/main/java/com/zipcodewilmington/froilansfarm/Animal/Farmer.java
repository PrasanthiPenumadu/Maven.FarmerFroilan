package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.Crops;
    import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;

    import com.zipcodewilmington.froilansfarm.FoodStorage;
    import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;

    import com.zipcodewilmington.froilansfarm.Produce.*;
    import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

    import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

    import com.zipcodewilmington.froilansfarm.Farm;
    import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;


    import java.util.ArrayList;
    import java.util.List;





    public class Farmer implements Person, Botanist, Rider, Driver {




        Farm farm;

        List<Edible> foodEaten = new ArrayList<Edible>();
        List<Farmer> froilanFarmers = new ArrayList<Farmer>();

        public Farmer(Person person, Farm farm) {
            super();
            this.farm = farm;
        }

        public Farmer() {
            super();
        }

        public String makeNoise() {
            return "Hey there y'all Sassafrases! Welcome to mah farm!";
        }

        FoodStorage foodStorage = new FoodStorage();


        public void foodStore(Tomatoes tomatoes) {
            foodStorage.add(tomatoes);
        }

        public List<Edible> harvest() {
            //insert condition to check if plants are ready for harvest.
            List<Edible> harvestCrops = new ArrayList<Edible>();
            Tomatoes tomatoes = new Tomatoes();
            StringBeans stringbeans = new StringBeans();
            Cucumbers cucumbers = new Cucumbers();
            EarOfCorn corn = new EarOfCorn();
            harvestCrops.add(tomatoes);
            harvestCrops.add(stringbeans);
            harvestCrops.add(cucumbers);
            harvestCrops.add(corn);
            return harvestCrops;
        }


        public void plant(Crops crops, CropRow cropRow) {

        }

        public void drive(Driveable vehicle) {

        }

        public void ceaseDrive(Driveable vehicle) {

        }

        public void mount(Rideable rideable) {

        }

        public void dismount(Rideable rideable) {

        }

        public void feedFarmAnimals(Eater animal, Edible food) {

        }

        public List reproduce(Integer increaseBy) {
            return null;
        }

        public void eatEdible(Edible food) {

        }

        public boolean isHungry() {
            return false;
        }

        public List<Edible> getFoodEaten() {
            return null;
        }
    }



