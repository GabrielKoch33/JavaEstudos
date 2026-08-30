package org.gabriel.devdojo;
import java.util.Scanner;

public class AulaTiposVariaveis {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        Scanner ler = new Scanner(System.in);
        final byte sizeByte    = 127;        //-128
        final int sizeInt      = 2147483647; // -2147483648
        final short sizeShort  = 32767;      // -32768
        final long sizeLong    = 9000000000000000000L;
        char numToLetter       = 65;         //in the ASCII table, 65 means 'A'

        // === casting ===================================== //
        final int castLong     = (int) 12000000000000L; // Java vai converter long -> int na força (RUIM)
        final double castFloat = (int) 458.45F;         // Java vai converter float -> double na força     (BOM)
        // === prática de converter tipos na força bruta === //

        String varText = "String não é tipo primitivo pois é uma classe!";
    }
}
