package io.zipcoder.pets;

abstract class Pet {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    abstract public String speak();

}
