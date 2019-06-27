package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

// ä»¥å‰çš„å¾ªçŽ¯æ–¹å¼?
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }

// ä½¿ç”¨ lambda è¡¨è¾¾å¼ä»¥åŠå‡½æ•°æ“ä½?functional operation)
        players.forEach((player) -> System.out.print(player + "; "));
        System.out.print("-------------------------------" );
        System.out.print("-------------------------------");
        System.out.print("-------------------------------");
        System.out.print("-------------------------------");
        System.out.print("-------------------------------");
 System.out.print("-------------------------------");


        /* åœ?Java 8 ä¸­ä½¿ç”¨åŒå†’å·æ“ä½œç¬?double colon operator) */

    }
}
