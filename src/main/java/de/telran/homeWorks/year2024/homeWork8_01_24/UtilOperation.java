package de.telran.homeWorks.year2024.homeWork8_01_24;

public class UtilOperation <T extends Number> {
    private T type;

    public T add(T arg1, T arg2) {
        if (arg1 == null || arg2 == null)
            return null;
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return (T) (Integer)((Integer)arg1+(Integer)arg2);
        } else if (arg1 instanceof Double && arg2 instanceof Double) {
            return (T) (Double) ((Double) arg1 + (Double) arg2);
        } else {
            throw new IllegalArgumentException("Тип не распознан");
        }
    }
    public T sub(T arg1, T arg2) {
        if (arg1 == null || arg2 == null)
            return null;
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return (T) (Integer) ((Integer) arg1 - (Integer) arg2);
        } else if (arg1 instanceof Double && arg2 instanceof Double) {
            return (T) (Double) ((Double) arg1 - (Double) arg2);
        } else {
            throw new IllegalArgumentException("Тип не распознан");
        }
    }
    public T mult(T arg1, T arg2) {
        if (arg1 == null || arg2 == null)
            return null;
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return (T) (Integer) ((Integer) arg1 * (Integer) arg2);
        } else if (arg1 instanceof Double && arg2 instanceof Double) {
            return (T) (Double) ((Double) arg1 * (Double) arg2);
        } else {
            throw new IllegalArgumentException("Тип не распознан");
        }
    }
    public T div(T arg1, T arg2) {
        if (arg1 == null || arg2 == null)
            return null;
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return (T) (Integer) ((Integer) arg1 / (Integer) arg2);
        } else if (arg1 instanceof Double && arg2 instanceof Double) {
            return (T) (Double) ((Double) arg1 / (Double) arg2);
        } else {
            throw new IllegalArgumentException("Тип не распознан");
        }
    }
    public T sqr(T arg1) {
        if (arg1 instanceof Integer) {
            return (T) (Integer) ((Integer) arg1 * (Integer) arg1);
        } else if (arg1 instanceof Double) {
            return (T) (Double) ((Double) arg1 * (Double) arg1);
        } else {
            throw new IllegalArgumentException("Тип не распознан");
        }
    }
}