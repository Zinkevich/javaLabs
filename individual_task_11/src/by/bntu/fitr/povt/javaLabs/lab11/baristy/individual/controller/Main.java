package by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.controller;

import by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.model.logic.Vector;
import by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.model.logic.Worker;
import by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.view.Printer;

//import java.util.Random;

public class Main {
    public static final double DOUBLE1 = -1.2;
    public static final double DOUBLE2 = 3.5;
    public static final double DOUBLE3 = -8.9;
    public static final double DOUBLE4 = 3.0;
    //public static final int RANGE_MIN = -10;
    //public static final int RANGE_MAX = 10;


    public static void main(String[] args) {
        //Random random = new Random();
        //double a = RANGE_MIN + (RANGE_MAX - RANGE_MIN)* random.nextDouble();
        Vector vector = new Vector(DOUBLE1, DOUBLE2, DOUBLE3, DOUBLE4);
        Printer.print("Max element in vector = " + Worker.getMaxElementOfVector(vector));
        Printer.print("Sum before last positive element = " + Worker.sumBeforeLastPositiveElements(vector));
    }
}
