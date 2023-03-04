import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chicken = 6; // куриных бедер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп.На одного человека:");
        System.out.println((water/eaters) + " миллилитров(а) воды");
        System.out.println((potatoes/eaters) + " картофелин(a/ы)");
        System.out.println((chicken/eaters) + " куриных(ое) бедёр(ро)");
        System.out.println((spices/eaters) + " ложек(ки/ка) специй");



    }
}
