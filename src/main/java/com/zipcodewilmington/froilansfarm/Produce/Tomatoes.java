package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Tomato;

import java.util.List;


    public class Tomatoes implements Edible {

        private List<Tomato> Tomatoes;

        public List<Tomato> getTomatoes() {
            return Tomatoes;
        }

        public void setTomatoes(List<Tomato> tomatoes) {
            Tomatoes = tomatoes;
        }
        public void addTomatoes(List<Tomato> tomatoes){

            Tomatoes.addAll(tomatoes);
        }
}
