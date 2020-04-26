

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Karate {
    public static void main(String[] args) {
        Navigation();
        WhereIsJerry();
        Power();





    }
    public static void Power() {

        int Power1;
        int Power2;
        do {
            Power1 = ThreadLocalRandom.current().nextInt(0, 1000);
            Power2 = ThreadLocalRandom.current().nextInt(0, 1000);
            if (Power1 > Power2) {
                System.out.println("It has Power");
            }
            else if(Power1==Power2){
                System.out.println("Try again");
            }
            else System.out.println("NO Power");
        }while (Power1==Power2);
    }
    public static void talk(){
        int count = 10;
        while(count>0){
            if(count%2==0){
                System.out.println("I am a Robottttt "+ count);
            }
            count--;
        }
    }
    public static void Navigation() {

        System.out.println("Whats in front of you ");
        Scanner furniture = new Scanner(System.in);
        String predmet = furniture.nextLine();
        switch (predmet) {
            case "stol":

                System.out.println("Jump");
                break;
            case "stena":
                System.out.println("Go sideways");
                break;
            case "nishto":
                System.out.println("Foward");
                break;
            default:
                System.out.println("Type/stol/stena/nishto");
        }
    }
    public static void WhereIsJerry(){
        int pixels = ThreadLocalRandom.current().nextInt(0, 100 );
        if(pixels%2==0){
            System.out.println("Jerry is found");
            System.out.println("how much hits has the Robot made to this moment");
            Scanner udari = new Scanner(System.in);
            int hit =udari.nextInt();
            nivoBateriq(hit);
            int udar = ThreadLocalRandom.current().nextInt(0, 10 );
            if(udar==5){
                System.out.println("Cant hit ");
            }
            else {
                System.out.println("Rip Jerry");
                bateryChek(hit);
            }
        }
        else System.out.println("Jerry was not found try again");
    }
    public static void nivoBateriq(int shibai ){

        switch (shibai) {
            case 0: {
                System.out.println("Battery is still charged");

                break;
            }
            case 1: {
                System.out.println("Battery is still charged ");
                break;
            }
            case 2: {
                System.out.println("Battery is still charged  ");
                break;
            }
            case 3: {
                System.out.println("Battery is still charged   ");
                break;
            }
            default: {
                System.out.println("Can't hit anymore");
                break;
            }
        }
    }
    public static void bateryChek(int level){
        switch (level) {
            case 0: {
                System.out.println("Has Battery 4/4");
                break;
            }
            case 1: {
                System.out.println("Has Battery 4/3");
                break;
            }
            case 2: {
                System.out.println("Has Battery 4/2");
                break;
            }
            case 3: {
                System.out.println("Has Battery 4/1 ");
                break;
            }
            default: {
                System.out.println("Requires recharge ");
                break;
            }
        }
    }

}