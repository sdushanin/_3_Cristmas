/**
 * Разработано 22.08.2018
 * Новогодний подарок
 * @author Stas
 * @version
 */



import Sweets.Sweets;
import Sweets.Cake;
import Sweets.Candy;
import Sweets.Chokolate;

public class CristmasGift {
    public static void main(String[] args) {

        Cake cake = new Cake("торт",1,1,1);
        Candy candy=new Candy("трюфель",2,2,2);
        Chokolate chokolate=new Chokolate("альпен гольт",3,3,3);
        Sweets[] box = {cake,candy,chokolate};
        for (Sweets somePar : box) {
            System.out.println(somePar.toString());
        }
        //сумма подарка
        int cena = cake.getPrice()+candy.getPrice()+chokolate.getPrice();
        System.out.println(" общая цена = " + cena);

        //Вес подарка
        int ves=cake.getWes()+candy.getWes()+chokolate.getWes();
        System.out.println(" общий вес = "+ves);
    }
}