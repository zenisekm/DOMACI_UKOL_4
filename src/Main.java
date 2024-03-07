import com.engeto.ja.Plant;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {




        Plant plant1 = new Plant("Jihlavanka", LocalDate.now(),LocalDate.now(),7);

        System.out.println(plant1.getWateringInfo());

    }
}