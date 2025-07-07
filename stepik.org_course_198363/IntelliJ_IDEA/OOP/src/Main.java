
public class Main {
    public static void main(String[] args) {
//Создадим класс Кошка, у которой будет свои характеристики:
// цвет, кличка и возраст. Также кошка сможет мяукать и будет функция,
// которая будет выводить всю информацию о ней.

        Cat cat=new Cat();
        cat.info();
        cat.sayMyau();

        Cat cat1=new Cat("черный","hui",2);
        cat1.info();

    }
}