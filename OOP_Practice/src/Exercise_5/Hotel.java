package Exercise_5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<People> Peoples;

    public Hotel() {
        Peoples = new ArrayList<>();
    }

    public void add(People People) {
        this.Peoples.add(People);
    }

    public boolean delete(String passport) {
        People People = this.Peoples.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (People == null) {
            return false;
        } else {
            this.Peoples.remove(People);
            return true;
        }
    }

    public int calculator(String passport) {
        People People = this.Peoples.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (People == null) {
            return 0;
        }
        return People.getRoom().getPrice() * People.getNumberRent();
    }

    public void show() {
        this.Peoples.forEach(p -> System.out.println(p.toString()));
    }
    
}