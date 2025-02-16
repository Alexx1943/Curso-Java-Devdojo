package Parte07ClassesUtilitarias.DFormatacao;

import java.time.ZoneId;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId africaZone = ZoneId.of("Africa/Cairo");
        System.out.println(africaZone);

    }
}
