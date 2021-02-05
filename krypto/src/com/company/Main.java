package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner scanIn = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Encrypt \n2.Decrypt \n3.End");
            choice = scanIn.nextInt();
            switch (choice) {
                case 1:
                    swapMe();
                    break;
                case 2:
                    unswapMe();
                    break;
            }
        }
        while(choice != 3);
    }
    public static void swapMe(){
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Insert text to encryption:");
        String swapped = scanIn.nextLine();
        swapped = swapped.toLowerCase();
        swapped = swapped.replace('a','~');
        swapped = swapped.replace('b','`');
        swapped = swapped.replace('c','<');
        swapped = swapped.replace('d','>');
        swapped = swapped.replace('e',';');
        swapped = swapped.replace('f',':');
        swapped = swapped.replace('g','"');
        swapped = swapped.replace('h','[');
        swapped = swapped.replace('i',']');
        swapped = swapped.replace('j','{');
        swapped = swapped.replace('k','}');
        swapped = swapped.replace('l','|');
        swapped = swapped.replace('m','/');
        swapped = swapped.replace('n','@');
        swapped = swapped.replace('o','%');
        swapped = swapped.replace('p','#');
        swapped = swapped.replace('q','^');
        swapped = swapped.replace('r','$');
        swapped = swapped.replace('s','(');
        swapped = swapped.replace('t','*');
        swapped = swapped.replace('u',')');
        swapped = swapped.replace('v','&');
        swapped = swapped.replace('w','4');
        swapped = swapped.replace('x','_');
        swapped = swapped.replace('y','-');
        swapped = swapped.replace('z','+');
        swapped = swapped.replace('!','=');
        swapped = swapped.replace('.','5');
        swapped = swapped.replace(',','9');
        swapped = swapped.replace('?','3');
        System.out.println("Encrypted message is:");
        System.out.println(swapped);
    }
    public static void unswapMe(){
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Insert text to decryption:");
        String unswapped = scanIn.nextLine();
        unswapped = unswapped.replace('~','a');
        unswapped = unswapped.replace('`','b');
        unswapped = unswapped.replace('<','c');
        unswapped = unswapped.replace('>','d');
        unswapped = unswapped.replace(';','e');
        unswapped = unswapped.replace(':','f');
        unswapped = unswapped.replace('"','g');
        unswapped = unswapped.replace('[','h');
        unswapped = unswapped.replace(']','i');
        unswapped = unswapped.replace('{','j');
        unswapped = unswapped.replace('}','k');
        unswapped = unswapped.replace('|','l');
        unswapped = unswapped.replace('/','m');
        unswapped = unswapped.replace('@','n');
        unswapped = unswapped.replace('%','o');
        unswapped = unswapped.replace('#','p');
        unswapped = unswapped.replace('^','q');
        unswapped = unswapped.replace('$','r');
        unswapped = unswapped.replace('(','s');
        unswapped = unswapped.replace('*','t');
        unswapped = unswapped.replace(')','u');
        unswapped = unswapped.replace('&','v');
        unswapped = unswapped.replace('4','w');
        unswapped = unswapped.replace('_','x');
        unswapped = unswapped.replace('-','y');
        unswapped = unswapped.replace('+','z');
        unswapped = unswapped.replace('=','!');
        unswapped = unswapped.replace('5','.');
        unswapped = unswapped.replace('9',',');
        unswapped = unswapped.replace('3','?');
        System.out.println("Decrypted message is:");
        System.out.println(unswapped);
    }
}
