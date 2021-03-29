package org.zhyuliuk.array.entity;

import org.zhyuliuk.array.exception.ArrayException;

import java.util.Arrays;

public class NumberArray {
    private int[] arr;

    public NumberArray(int[] arr)  {

        this.arr = Arrays.copyOf(arr, arr.length);}

    


    public int size() {
        return arr.length;
    }

    public int getElementByIndex(int index) throws IndexOutOfBoundsException {

        return arr[index];

    }

    public void setElementByIndex(int index, int replacement) throws IndexOutOfBoundsException {
        arr[index] = replacement;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public void setArr(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public String toString() {
        return "Array{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberArray array = (NumberArray) o;
        return Arrays.equals(arr, array.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}
