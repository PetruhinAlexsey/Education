//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    String w="good1";
//    if (w=="good"){
//        System.out.println("good");
//    }else {
//        System.out.println("bed");
//    }
//    Задача:
//    Если сейчас с 6 до 11 - это утро,
//    с 12 до 17 - это день, с 18 до 22 - это вечер,
//    а все остальное - ночь.
//        int clock = 23;
//        if ((clock >= 6) && (clock <= 11)) {
//            System.out.println("Утро");
//        } else if ((clock >= 12) && (clock <= 17)) {
//            System.out.println("День");
//        } else if ((clock >= 18) && (clock <= 22)) {
//            System.out.println("вечер");
//        } else {
//            System.out.println("Ночь");
//        }
//Циклы
//        for (int i=1;i<=20;i++){
//            System.out.println(i);
//        }
//        int i = 10;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);
        System.out.println(maxDig(3.22,3.22));
    }

    static double maxDig(double a, double b) {
        if (a < b) {
            return b;
        } else if (a > b) {
            return b;
        } else{return 0;}
    }

}

