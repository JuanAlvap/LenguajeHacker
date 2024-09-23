package main;

import java.util.Scanner;

public class Main {
    /*
        Escriba un programa que reciba un texto y transforme lenguaje natural a "lenguaje hacker"
        (conocido realmente como "leet" o "1337"). Este lenguaje se caracteriza por sustituir caracteres
        alfanuméricos.
        - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/ ) con el alfabeto y 
        los números en "leet".
        (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String text;
        System.out.print("""
                           Welcome to Lenguaje Hacker
                           Please type the text to convert: """);
        text = read.next();
        int counter = 0;
        while (!"".equals(text.substring(counter))){
            counter++;
        }
        String convertedText = "";
        int exponentiation = counter-1;
        for (int i = 0; i < counter; i++) {
            switch(text.substring(i, i+1)){
                case "L":
                    convertedText = convertedText + "1";
                break;
                case "R":
                    convertedText = convertedText + "2";
                    break;
                case "E":
                    convertedText = convertedText + "3";
                    break;
                case "A":
                    convertedText = convertedText + "4";
                    break;
                case "S":
                    convertedText = convertedText + "5";
                    break;
                case "b":
                    convertedText = convertedText + "6";
                    break;
                case "T":
                    convertedText = convertedText + "7";
                    break;
                case "B":
                    convertedText = convertedText + "8";
                    break;
                case "g":
                    convertedText = convertedText + "9";
                    break;
                case "o":
                    convertedText = convertedText + "0";
                    break;
                default:
                    convertedText = convertedText + text.substring(i, i+1);
            }
        }
        System.out.println("Text before: " + text);
        System.out.println("Converted Text: "+convertedText);
    }
}