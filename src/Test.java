/**
 * Created by Emil Käck on 2017-03-13.
 */
public class Test {
    public static void main(String[]arg){
        // Skriver ut två kort meedd hjälp av klassen Kort
        Kort kort1 = new Kort();
        kort1.färg = Kort.spader;
        kort1.nummer = Kort.dam;
        Kort kort2 = new Kort();
        kort2.färg = Kort.klöver;
        kort2.nummer = 7;
        System.out.println(kort1.toString());
        System.out.println(kort2.toString());
    }
}
