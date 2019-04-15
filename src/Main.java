public class Main {

    public static void zad1() {
        System.out.println("Zad 1:");
        boolean warun = true;
        char znak = 'a';
        int liczba = 12;
        long liczba1 = 1234;
        float liczba2 = 1234.2f;
        double liczba3 = 12345.12;
        String tekst = "Nauka programowania, pozdrawiam";
        System.out.println(warun);
        System.out.println(znak);
        System.out.println(liczba);
        System.out.println(liczba);
        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println(liczba3);
        System.out.println(tekst);
    }

    public static void zad2() {
        int a = 5;
        int b = 4;

        System.out.println("Zad 2: \nSuma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
        System.out.println("Iloraz: " + (a / b));
        System.out.println("Reszta z dzielenia jedna przez drugą: " + (a % b));
    }

    public static void zad3() {
        double temperaturaC = 5.0;
        double temperaturaF = 32;

        double cDoF = 1.8 * temperaturaC + 32;
        float FdoC = (float) ((temperaturaF - 32) / 1.8);

        System.out.println("Zad 3:\nTemperatura w stopniach Celsjusza: " + temperaturaC + " => Temperatura w stopniach Fahrenheita: " + cDoF);
        System.out.println("Temperatura w stopniach Fahrenheita: " + temperaturaF + " => Temperatura w stopniach Celsjusza: " + FdoC);
    }

    public static void zad4() {
        int a = 2222;
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = (a / 100) % 10;
        int e = (a / 1000) % 10;
        int suma = b + c + d + e;
        int srednia = suma / 4;
        System.out.println("Zad4:\nSuma cyfr tej liczby to: " + suma);
        System.out.println("Srednia cyfr tej liczby to: " + srednia);
    }

    public static void zad2_1() {
        int a = 10;
        int b = 14532;
        int c = -123890;
        int max, min;

        max = a > b ? a : b;
        max = max > c ? max : c;

        min = a > b ? b : a;
        min = min > c ? c : min;

        System.out.println("Zad2_1:\nNajwiÍksza z tych liczb to: " + max);
        System.out.println("Najmniejsza z tych liczb to: " + min);
    }

    public static void zad2_2() {
        double masa = 80.3;
        double wzrost = 180.0;
        double bmi = masa / ((wzrost / 100) * (wzrost / 100));

        if (bmi < 18.5) {
            System.out.println("Zad2_2:\nNiedowaga");
        } else if (bmi > 24.9) {
            System.out.println("Zad2_2:\nNadwaga");
        } else {
            System.out.println("Zad2_2:\nWaga prawid≥owa");
        }
    }


    public static void main(String[] args) {

        zad1();
        System.out.println("");
        zad2();
        System.out.println("");
        zad3();
        System.out.println("");
        zad4();
        System.out.println("");
        zad2_1();
        System.out.println("");
        zad2_2();

    }
}