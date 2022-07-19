package app.model;

/*
3) Прочитайте о связывании бинов по имени и свяжите AnimalCage c бином Dog через абстрактный
класс Animal.
4) На основе класса Timer создайте бин. Свяжите с AnimalCage.
Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
//        if (timer == null) {
//            timer = new Timer();
//        }
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}