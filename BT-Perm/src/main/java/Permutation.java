
public class Permutation {

    public static void main(String args[]) {

        final String MESSAGE = "Permutation of ";

        int ex1 = 123;
        int ex2 = 200;
        int ex3 = 909;
        Permutation permutation = new Permutation();
        String numberToBePermutedEx1 = String.valueOf(ex1);
        String numberToBePermutedEx2 = String.valueOf(ex2);


        System.out.println(MESSAGE + numberToBePermutedEx1);
        permutation.permutation(numberToBePermutedEx1, 0, numberToBePermutedEx1.length() - 1);

        System.out.println(MESSAGE + numberToBePermutedEx2);
        permutation.permutation(numberToBePermutedEx2, 0, numberToBePermutedEx2.length() - 1);

        System.out.println(MESSAGE + ex3);
        permutation.permutation(String.valueOf(ex3), 0, numberOfDigits(ex3) - 1);
    }

    // Method that does the permutation, str is the string to be permuted, startIndex is the starting index of the string, endIndex is the ending index of the string
    private void permutation(String str, int startIndex, int stopIndex) {
        if (startIndex == stopIndex) {
            System.out.println(str);
        } else {
            for (int i = startIndex; i <= stopIndex; i++) {
                str = swapChar(str, startIndex, i);
                permutation(str, startIndex + 1, stopIndex);
                str = swapChar(str, startIndex, i);
            }
        }
    }

    // Method for swapping characters
    public String swapChar(String str, int i, int j) {
        char temp;
        char[] chArray = str.toCharArray();
        temp = chArray[i];
        chArray[i] = chArray[j];
        chArray[j] = temp;
        return String.valueOf(chArray);
    }

    // Method for counting number of digits of a given number
    public static int numberOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}