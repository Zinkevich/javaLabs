package by.bntu.fitr.povt.javaLabs.lab11.baristy.individual.model.logic;

public class Vector {
    public static final int INDEX_OF_NON_EXISTEN_ELEMENT = -1;
    public static final int MIN_VALUE = 0;

    private final double[] vector;

    public Vector(double... vector) {
        this.vector = vector;
    }

    public int size(){
        return vector.length;
    }

    public double getElement(int index){
        if (index >= MIN_VALUE && index < vector.length){
            return vector[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getIndexOfElement(double valueOfElement){
        int index = INDEX_OF_NON_EXISTEN_ELEMENT;
        for(int i = 0; i < vector.length; i++) {
            if (valueOfElement == vector[i]) {
                index = i;
                return index;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void setElement(int index, double value){
        if (index >= 0 && index < vector.length){
            vector[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Vector: ");

        for (double element : vector) {
            builder.append(element).append(" ");
        }

        return builder + "";
    }
}
