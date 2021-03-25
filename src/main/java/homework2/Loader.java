package homework2;

public class Loader {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};

        int summaElementov = myArray(arr);
        System.out.println("Сумма всех элементов массива = " + summaElementov);

    }

    public static int myArray(String[][] arr) throws MyArrayDataException {
        int summа = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Не правильный размер массива");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Не правильный размер массива");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summа = summа + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Составьте массив только из цифр");
                }
            }

        }
        return summа;
    }

}