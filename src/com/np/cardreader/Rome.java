package com.np.cardreader;

public class Rome {
    int numberA;
    int numberB;
    String romeNumA;
    String romeNumB;
    String [] arrayRome = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
            "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
            "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
            "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
            "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
            "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX",
            "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
            "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX",
            "C"};

    public int decoder(String numberIn){
        int numberOut = 0;
        try{
            for(int i = 0; i<arrayRome.length;i++){
                if(numberIn.equals(arrayRome[i])){
                    numberOut = i;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex){
            System.out.println("Ошибка преобразования из строки в число");
        }
        return numberOut;
    }

    public String encoder(int numberInTo){
        String numberOutRome = "";
        try{
            numberOutRome = arrayRome[numberInTo];
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex){
            System.out.println("Ошибка преобразования из числа в строку");
        }
        return numberOutRome;
    }

    public int plus(int numberA, int numberB){
        return numberA + numberB;
    }

    public int minus(int numberA, int numberB){
        return numberA - numberB;
    }

    public int multiply(int numberA, int numberB){
        return numberA * numberB;
    }

    public int devide(int numberA, int numberB){
        return numberA / numberB;
    }

}
