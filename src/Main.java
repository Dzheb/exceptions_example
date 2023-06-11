public class Main {
    public static void main(String[] args) {
        int maxI = 4;
        int maxJ = 4;
        String[][] testArray = {{"8", "16", "4", "4","5"},
                {"15", "t", "8", "11"}, {"17", "8", "7", "8"},
                {"3", "9", "18", "14"}};
        try {
            ArrayHandler result = new ArrayHandler(testArray);
            System.out.println(String.format("Сумма элементов" +
                    " массива: %d", result.arrayHandle()));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}