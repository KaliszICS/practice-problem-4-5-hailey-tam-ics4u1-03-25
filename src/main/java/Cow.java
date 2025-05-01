/**
 * Creates a cow with a specific name, age in years and weight in pounds
 */
class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * 
     * @param name a String that represents the cow's name
     * @param age an integer that represent the cow's age in years
     * @param weight a double that reperesents the cow's weight in pounds
     */
    public Cow(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * gets the cow's name
     * @return returns the cow's name as a String
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gets the cow's age
     * @return returns the cow's age in years as an integer
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Gets the cow's weight in pounds
     * @return returns the cow's weight in pounds as a double
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * returns a string representation of the cow in the format of:
     * name, age - weight
     * @return returns a string that contains the cow's name, age and weight
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.weight;
    }

    /**
     * Checks to see if two cows are the same 
     * @param a object to compare to
     * @return returns true if both cows have the same name, age, and weight, otherwise false
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass() ){
            return false;
        }
        Cow cow = (Cow)obj;
        if (cow.getName().equals(this.name) && cow.getAge() == this.age && cow.getWeight() == this.weight){
            return true;
        }
        return false;
    }
}
