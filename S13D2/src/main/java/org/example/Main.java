package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi) {

        String sayiStr = String.valueOf(Math.abs(sayi));
        int uzunluk = sayiStr.length();

        for (int i=0; i<uzunluk; i++){
            if(sayiStr.charAt(i) != sayiStr.charAt(uzunluk-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int sayi) {

        if(sayi >= 0) {
            int toplam = 0;
            for(int i=1; i< sayi ; i++){
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            return toplam == sayi;
        }
        return false;
    }

    public static String numberToWords(int sayi) {
        String sayiStr = String.valueOf(sayi);
        int uzunluk = sayiStr.length();
        StringBuilder result = new StringBuilder();

        if (sayi < 0) {
            return "Invalid Value";
        }
        for (int i = 0; i < uzunluk; i++) {
            char digit = sayiStr.charAt(i);
            switch (digit) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;
                case '2':
                    result.append("Two ");
                    break;
                case '3':
                    result.append("Three ");
                    break;
                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
                default:
                    return "Invalid Value";
            }
        }
        return result.toString().trim();
    }

}

