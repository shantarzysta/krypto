package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        String swapped = new String();
        String unswapped = new String();
        System.out.println("Insert text to encryption");
        String message = new String(scanIn.nextLine());
        swapped = swapMe(message);
        System.out.println(swapped);
        unswapped = unswapMe(swapped);
        System.out.println(unswapped);

    }
    public static String swapMe(String message){
        String swapped = new String(message);
        swapped =swapped.replace('a','~');
        swapped =swapped.replace('b','`');
        swapped =swapped.replace('c','<');
        swapped =swapped.replace('d','>');
        swapped =swapped.replace('e',';');
        swapped =swapped.replace('f',':');
        swapped =swapped.replace('g','"');
        swapped =swapped.replace('h','[');
        swapped =swapped.replace('i',']');
        swapped =swapped.replace('j','{');
        swapped =swapped.replace('k','}');
        swapped =swapped.replace('l','|');
        swapped =swapped.replace('m','/');
        swapped =swapped.replace('n','@');
        swapped =swapped.replace('o','%');
        swapped =swapped.replace('p','#');
        swapped =swapped.replace('q','^');
        swapped =swapped.replace('r','$');
        swapped =swapped.replace('s','(');
        swapped =swapped.replace('t','*');
        swapped =swapped.replace('u',')');
        swapped =swapped.replace('v','&');
        swapped =swapped.replace('w','4');
        swapped =swapped.replace('x','8');
        swapped =swapped.replace('y','9');
        swapped =swapped.replace('z','0');
        swapped =swapped.replace('!','2');
        swapped =swapped.replace('.','3');
        swapped =swapped.replace(',','7');
        swapped =swapped.replace('?','1');
        return swapped;
    }
    public static String unswapMe(String swapped){
        String unswapped = new String(swapped);
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
        unswapped = unswapped.replace('8','x');
        unswapped = unswapped.replace('9','y');
        unswapped = unswapped.replace('0','z');
        unswapped = unswapped.replace('2','!');
        unswapped = unswapped.replace('3','.');
        unswapped = unswapped.replace('7',',');
        unswapped = unswapped.replace('1','?');
        return unswapped;
    }
}
