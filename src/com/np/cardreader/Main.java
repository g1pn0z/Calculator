package com.np.cardreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Arabic exp = new Arabic();
        Rome expRome = new Rome();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher("");

        String inToDo = null;
        //String pagesStr = null;
        System.out.println("Введите простое математическое выражение в одну строку:");
        while(true) {
            try {
                inToDo = reader.readLine();
                matcher = pattern.matcher(inToDo);
                //pagesStr = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inToDo.contains("+")) {
                System.out.print("Результат выражение(+): ");
                if(matcher.find()){
                    exp.numberA = Integer.parseInt(matcher.group(0));
                    matcher.find();
                    exp.numberB = Integer.parseInt(matcher.group(0));
                    if((exp.numberA > 0)&&(exp.numberA <= 10)&&(exp.numberB > 0)&&(exp.numberB <= 10)){
                        System.out.println(exp.plus(exp.numberA, exp.numberB));
                    }else{
                        System.out.println("Калькулятор работает с числами от 1 до 10");
                    }
                }
                if((inToDo.contains("I"))||(inToDo.contains("V"))||(inToDo.contains("X"))){
                    inToDo = inToDo.trim();
                    inToDo = inToDo.toUpperCase();
                    inToDo = inToDo.replaceAll("\\s+","");
                    inToDo = inToDo.replace("+",":");
                    String[] romeNum = inToDo.split(":");
                    expRome.numberA = expRome.decoder(romeNum[0]);
                    expRome.numberB = expRome.decoder(romeNum[1]);
                    System.out.println(expRome.encoder(expRome.plus(expRome.numberA,expRome.numberB)));
                }
                break;
            }
            if (inToDo.contains("-")) {
                System.out.print("Результат выражения(-): ");
                if(matcher.find()){
                    exp.numberA = Integer.parseInt(matcher.group(0));
                    matcher.find();
                    exp.numberB = Integer.parseInt(matcher.group(0));
                    if((exp.numberA > 0)&&(exp.numberA <= 10)&&(exp.numberB > 0)&&(exp.numberB <= 10)){
                        System.out.println(exp.minus(exp.numberA, exp.numberB));
                    }else{
                        System.out.println("Калькулятор работает с числами от 1 до 10");
                    }
                }
                if((inToDo.contains("I"))||(inToDo.contains("V"))||(inToDo.contains("X"))){
                    inToDo = inToDo.trim();
                    inToDo = inToDo.toUpperCase();
                    inToDo = inToDo.replaceAll("\\s+","");
                    inToDo = inToDo.replace("-",":");
                    String[] romeNum = inToDo.split(":");
                    expRome.numberA = expRome.decoder(romeNum[0]);
                    expRome.numberB = expRome.decoder(romeNum[1]);
                    System.out.println(expRome.encoder(expRome.minus(expRome.numberA,expRome.numberB)));
                }
                break;
            }
            if (inToDo.contains("*")) {
                System.out.print("Результат выражения(*): ");
                if(matcher.find()){
                    exp.numberA = Integer.parseInt(matcher.group(0));
                    matcher.find();
                    exp.numberB = Integer.parseInt(matcher.group(0));
                    if((exp.numberA > 0)&&(exp.numberA <= 10)&&(exp.numberB > 0)&&(exp.numberB <= 10)){
                        System.out.println(exp.multiply(exp.numberA, exp.numberB));
                    }else{
                        System.out.println("Калькулятор работает с числами от 1 до 10");
                    }
                }
                if((inToDo.contains("I"))||(inToDo.contains("V"))||(inToDo.contains("X"))){
                    inToDo = inToDo.trim();
                    inToDo = inToDo.toUpperCase();
                    inToDo = inToDo.replaceAll("\\s+","");
                    inToDo = inToDo.replace("*",":");
                    String[] romeNum = inToDo.split(":");
                    expRome.numberA = expRome.decoder(romeNum[0]);
                    expRome.numberB = expRome.decoder(romeNum[1]);
                    System.out.println(expRome.encoder(expRome.multiply(expRome.numberA,expRome.numberB)));
                }
                break;
            }
            if (inToDo.contains("/")) {
                System.out.println("Результат выражения(/): ");
                if(matcher.find()){
                    exp.numberA = Integer.parseInt(matcher.group(0));
                    matcher.find();
                    exp.numberB = Integer.parseInt(matcher.group(0));
                    if((exp.numberA > 0)&&(exp.numberA <= 10)&&(exp.numberB > 0)&&(exp.numberB <= 10)){
                        System.out.println(exp.devide(exp.numberA, exp.numberB));
                    }else{
                        System.out.println("Калькулятор работает с числами от 1 до 10");
                    }
                }
                if((inToDo.contains("I"))||(inToDo.contains("V"))||(inToDo.contains("X"))){
                    inToDo = inToDo.trim();
                    inToDo = inToDo.toUpperCase();
                    inToDo = inToDo.replaceAll("\\s+","");
                    inToDo = inToDo.replace("/",":");
                    String[] romeNum = inToDo.split(":");
                    expRome.numberA = expRome.decoder(romeNum[0]);
                    expRome.numberB = expRome.decoder(romeNum[1]);
                    System.out.println(expRome.encoder(expRome.devide(expRome.numberA,expRome.numberB)));
                }
                break;
            }
            else {
                System.out.println("Попробуйте снова:) Введите простое математическое выражение в одну строку:");
            }
        }

    }

}
