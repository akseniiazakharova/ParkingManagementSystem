package aufgabe_new; // 1. Пакет должен быть в самой первой строке!
import java.util.ArrayList;
import java.util.List;

import newprojekt.newProjekt;

public class Configuration {

    // Та самая ФУНКЦИЯ расчета (calculateTotal). Тут в первой строке мы пишем все что она принимает: скидки, товары, опции на товар из других классов
    public double calculateTotal(Product product, List<Option> selectedOptions) {
        double total = product.basePrice;

        // Считаем сумму всех выбранных опций
        for (Option opt : selectedOptions) {
        	//Опция, у которой берем наценку
            total += opt.priceModifier;
        }

        return total;
    }

    // Точка запуска программы
    public static void main(String[] args) {
        Configuration app = new Configuration();

        // 1. Создаем товар
        Product myBag = new Product("Handgefertigte Tasche", 50.0);
        Product pullower = new Product("Pullower", 40);

        // 2. Выбираем опции (например, кожа и красный цвет)
        List<Option> choices = new ArrayList<>();
        choices.add(new Option("Leder", 25.0));    // Доплата за кожу
        choices.add(new Option("Rote Farbe", 25.0)); // Цвет бесплатно

        // 3. Вызываем функцию расчета
        double finalPrice = app.calculateTotal(myBag, choices);
        double finalPrice2 = app.calculateTotal(pullower, choices);

        // 4. Выводим результат
        System.out.println("Produkt: " + myBag.name);
        System.out.println("Gesamtpreis inkl. Personalisierung: " + finalPrice + "€");
        System.out.println("Produkt: " + pullower.name + finalPrice2);
    }
}
