package SquareEveryDigit;

public class SquareEveryDigit {

        public int squareDigits(int n) {

            char[] digits = String.valueOf(n).toCharArray();


            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < digits.length; i++) {
                int j = Character.digit(digits[i], 10);
                sb.append(j*j);
            }

            Integer squared = Integer.valueOf(String.valueOf(sb));
            int result = squared;

            return result;

        }

}
