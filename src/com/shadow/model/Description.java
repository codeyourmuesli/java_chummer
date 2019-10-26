package com.shadow.model;

public class Description {

	private String name;

	private String alias;

	private Metatyp metatyp;

	private String eyeColor;

	private Lifestyle lifestyle;


	private int age;

	private String sex;

	private int weight;

	private double height;

	private String hairColor;

	private String skinColor;

    private String mugshot;
	private String description;
	private String background ;
	private String notes;

    /**
     * Constructor with all parameters
     * @param name
     * @param alias
     * @param metatyp
     * @param eyeColor
     * @param lifestyle
     * @param age
     * @param sex
     * @param weight
     * @param height
     * @param hairColor
     * @param skinColor
     * @param mugshot
     * @param description
     * @param background
     * @param notes
     */
    public Description(String name, String alias, Metatyp metatyp, String eyeColor, Lifestyle lifestyle, int age,
                       String sex, int weight, double height, String hairColor, String skinColor, String mugshot,
                       String description, String background, String notes) {
        this.name = name;
        this.alias = alias;
        this.metatyp = metatyp;
        this.eyeColor = eyeColor;
        this.lifestyle = lifestyle;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.mugshot = mugshot;
        this.description = description;
        this.background = background;
        this.notes = notes;
    }

    /**
     * Empty constructor
     */
    public Description(){

    }

    @Override
    public String toString() {
        return "Description{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", metatyp=" + metatyp +
                ", eyeColor='" + eyeColor + '\'' +
                ", lifestyle=" + lifestyle +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", mugshot='" + mugshot + '\'' +
                ", description='" + description + '\'' +
                ", background='" + background + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
