class hondaCity {
    static long price = 10;
    int a, b;
}

public class StaticPractice_1 {

    static double onRoad(String city) {
        switch (city) {
            case "Delhi":
                return hondaCity.price + hondaCity.price * 0.1;
            case "Punjab":
                return hondaCity.price + hondaCity.price * 0.09;
            default:
                return hondaCity.price;
        }
    }

    public static void main(String[] args) {
        hondaCity h1 = new hondaCity();
        System.out.println(onRoad("Delhi"));
       
    }
}