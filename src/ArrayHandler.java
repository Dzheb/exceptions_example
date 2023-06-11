import java.util.Arrays;

public class ArrayHandler {
    private final String[][] test;
    int maxLength = 4;

    public ArrayHandler(String[][] test) {
        this.test = test;
    }

    public int arrayHandle() throws MyArrayDataException, MyArraySizeException {
            boolean jLengthOk = false;
            int jNotOk = 0;
            for (int j = 0; j < maxLength; j++) {
                if (this.test[j].length > maxLength) {
                    jLengthOk = true;
                    jNotOk = j;
                    break;
                }
            }
            if (this.test.length > this.maxLength)
                throw new MyArraySizeException(String.format("Количество " +
                        "столбцов массива превышает лимит %d", maxLength));
            if (jLengthOk)
                throw new MyArraySizeException(String.format("Размер строки" +
                        " %d превышает лимит %d", jNotOk, maxLength));
            System.out.println(Arrays.deepToString(this.test));
            int sumTest = 0;
            for (int i = 0; i < maxLength; i++) {
               for (int j = 0; j < maxLength; j++) {
                    try {
                       sumTest += Integer.parseInt(this.test[i][j]);
                    } catch (NumberFormatException e) {
                       throw new MyArrayDataException(String.format("Ошибка" +
                               " типа Integer в строке %d столбце %d", i, j));
                    }
              }
           }
        return (sumTest);
    }
}
