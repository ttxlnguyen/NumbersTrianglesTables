package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return null;
    }

    public static String getLargeMultiplicationTable() {

        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        String s = "";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                s += String.format("%3d |", j*i);
            }
            s += "\n";
        }
        return s;
    }
}
