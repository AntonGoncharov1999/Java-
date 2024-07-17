import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Modifire mod = new Modifire();
        mod.textModifier();
    }
}

class Modifire{

    void textModifier(){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        // a - приоброзование строки в масиа символов и удаление лишних пробелов
        char[] charArray = str.toCharArray();

        int a = 0;
        int b = 0;
        for (int i = 0; i < charArray.length; i++){
            if (i == charArray.length - 1) {
                a++;
            } else if (charArray[i] == ' ' & charArray[i + 1] == ' '){

            } else {
                a++;
            }
        }

        char [] arr2 = new char[a];

        for (int i = 0; i < charArray.length; i++){
            if (i == charArray.length - 1) {
                arr2[b] = charArray[i];
                b++;
            } else if (charArray[i] == ' ' & charArray[i + 1] == ' '){
            } else {
                arr2[b] = charArray[i];
                b++;
            }
        }

        // b - оброботка минуса

        char z;
        char t;
        int ln = 0;
        int n = 0;
        int g = 0;
        int h = 0;
        int j = 0;
        int r = 0;

        for (int i =0; i < arr2.length ; i++){
            if (arr2[i] == '-'){
                z = arr2[i - 1];
                t = arr2[i + 1];
                arr2[i - 1] = t;
                arr2[i + 1] = z;
            }
        }

        for (int i =0; i < arr2.length ; i++){
            if (arr2[i] == '-'){
                n++;
            }else{
                ln++;
            }
        }


        char [] arr3 = new char [arr2.length - n];

        for(int i =0; i < arr2.length ; i++){
            if (arr2[i] == '-'){
            }else{
                arr3[g] = arr2[i];
                g++;
            }
        }

        // c - работа с плюсом
        for(int ii = 0; ii < arr3.length ; ii++){
            if (arr3[ii] == '+'){
                arr3[ii] = '!';
            }
        }

        // d - оброботка чисел и преоброзование в канечный результат

        // суммирование
        for(int i = 0; i < arr3.length ; i++){
            if (arr3[i] == '0'){
                h = h + 0;
            } else if (arr3[i] == '1') {
                h = h + 1;
            } else if (arr3[i] == '2') {
                h = h + 2;
            } else if (arr3[i] == '3') {
                h = h + 3;
            } else if (arr3[i] == '4') {
                h = h + 4;
            } else if (arr3[i] == '5') {
                h = h + 5;
            } else if (arr3[i] == '6') {
                h = h + 6;
            } else if (arr3[i] == '7') {
                h = h + 7;
            } else if (arr3[i] == '8') {
                h = h + 8;
            } else if (arr3[i] == '9') {
                h = h + 9;
            }
        }
        // удаление чисел
        for (int ii = 0; ii < arr3.length; ii++){
            if (
                    arr3[ii] == '0' | arr3[ii] == '1' | arr3[ii] == '2' | arr3[ii] == '3' | arr3[ii] == '4' |
                    arr3[ii] == '5' | arr3[ii] == '6' | arr3[ii] == '7' | arr3[ii] == '8' | arr3[ii] == '9'
                ) {  } else{
                j++;
            }
        }
        char[] modArr = new char[j];

        for(int i = 0; i < arr3.length ; i++) {
            if (
                    arr3[i] == '0' | arr3[i] == '1' | arr3[i] == '2' | arr3[i] == '3' | arr3[i] == '4' |
                            arr3[i] == '5' | arr3[i] == '6' | arr3[i] == '7' | arr3[i] == '8' | arr3[i] == '9'
            ) {

            } else{
                modArr[r] = arr3[i];
                r++;
            }
        }
        String f = new String(modArr);
        if (h != 0){
            f = f + ' ' + h;
            System.out.println(f);
        }else {
            System.out.println(f);
        }

    }

}