import java.time.LocalDate;
//animal.java

// Hope Nanthavongdouangsy 9/30/2025
public class Animal {
// Attributes
        private String animalID;
        private LocalDate birthDate; // Represents the ISO 8601 date (YYYY-MM-DD)
        private String color;
        private int weight;
        private String origin;
        private LocalDate arrivalDate; // Represents the ISO 8601 date (YYYY-MM-DD)
        private String name;
        private String aniSound;
        private String sex;
        private int numofAnimals;

        // --- Getters ---

        public String getAnimalID() {
            return animalID;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public String getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }

        public String getOrigin() {
            return origin;
        }

        public LocalDate getArrivalDate() {
            return arrivalDate;
        }

        public String getName() {
            return name;
        }

        public String getAniSound() {
            return aniSound;
        }

        public String getSex() {
            return sex;
        }

        public int getNumofAnimals() {
            return numofAnimals;
        }

        // --- Setters ---

        public void setAnimalID(String animalID) {
            this.animalID = animalID;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public void setArrivalDate(LocalDate arrivalDate) {
            this.arrivalDate = arrivalDate;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAniSound(String aniSound) {
            this.aniSound = aniSound;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setNumofAnimals(int numofAnimals) {
            this.numofAnimals = numofAnimals;
        }
    }
