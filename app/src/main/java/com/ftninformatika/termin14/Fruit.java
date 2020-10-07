package com.ftninformatika.termin14;

public class Fruit {

    public static Fruit[] fruits = new Fruit[]{
            new Fruit(0, "Orange", "narandyaste je boje", "Orange.jpg", 4.5f),
            new Fruit(1,"Limun", "Zute je boje", "Limun.jpeg", 3.0f),
            new Fruit(2, "Jabuka", "Crvene je boje", "Jabuka.jpg", 3f)
    };

    private int id;
    private String name;
    private String description;
    private String imageFilename;
    private float rating;

    public Fruit(int id, String name, String description, String imageFilename, float rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageFilename = imageFilename;
        this.rating = rating;
    }

    public static Fruit[] getFruits() {
        return fruits;
    }

    public static void setFruits(Fruit[] fruits) {
        Fruit.fruits = fruits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
