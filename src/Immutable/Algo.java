package Immutable;

public class Algo {
    static void main() {
        int[] array = new int[50];



    }

    int findnumber(int[] array, int number){
        int result = 0;

        for (int i = 0; i < array[number + 1]; i++) {
            result = array[i] + array[i - 1] + array[i - 2] + array[i - 3];
        }

        return result;
    }

}
