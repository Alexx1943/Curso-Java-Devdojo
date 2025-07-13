package Parte17DesignPatterns.Dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {

    public static Set<String> avaibleSeats = new HashSet<>();

    {
        avaibleSeats.add("1A");
        avaibleSeats.add("1B");
    }

    public boolean bookSeats(String seat) {
        return avaibleSeats.remove(seat);
    }


}
