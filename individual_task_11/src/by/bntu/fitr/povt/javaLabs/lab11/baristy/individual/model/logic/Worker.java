package by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.model.logic;

public class Worker {
    public static final int INDEX_OF_FIRST_ELEMENT = 0;

    public static double getMaxElementOfVector(Vector vektor) {

        double maxElement = vektor.getElement(INDEX_OF_FIRST_ELEMENT);

        for (int i = 0; i < vektor.size(); i++) {
            if (maxElement < vektor.getElement(i)) {
                maxElement = vektor.getElement(i);
            }
        }
        return maxElement;
    }


    public static double getLastPositiveElement(Vector vektor) {

        double firstPositive = -1;

        for (int i = 0; i < vektor.size(); i++) {
            if (vektor.getElement(i) > 0) {
                firstPositive = vektor.getElement(i);
            }
        }

        return firstPositive;
    }

    public static double sumBeforeLastPositiveElements(Vector vektor) {

        double sumOfElemets = 0;

        double firstPositive = getLastPositiveElement(vektor);
        int indexOfFirstPositive = vektor.getIndexOfElement(firstPositive);

        for (int i = 0; i < indexOfFirstPositive; i++) {
            sumOfElemets += vektor.getElement(i);
        }
        return sumOfElemets;
    }

}
