public class Cat {
    private String colorCat="red";
    private String nameCat="Ebaniko";
    private int age=5;

    public Cat(String colorCat, String nameCat, int age) {
        this.colorCat = colorCat;
        this.nameCat = nameCat;
        this.age = age;
    }
    public Cat() {

    }

    public void sayMyau(){
        System.out.println("Myau");
    }

    public void info(){
        System.out.println(colorCat);
        System.out.println(nameCat);
        System.out.println(age);
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
