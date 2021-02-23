package ru.job4j;

public class Mechanism {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.autoDrive();
        Lada lada = new Lada();
        lada.autoDrive();
        Giguli g1 = new Giguli();
        g1.getLada();

        class NotStatic{
            public void nonStaticMetod(){
                new Auto().autoDrive();
                System.out.println("print notStaticMetod");
            }
        }
    }
 }

    class Auto {
        public void autoDrive() {
            System.out.println("I am automobile");
        }
    }

    class Lada extends Auto{
        @Override
        public void autoDrive() {
            super.autoDrive();
            System.out.println("I love Lada 21083");
        }
    }
      class Giguli{
        public void getLada() {
           // Auto.autoDrive();
            Lada lada = new Lada();
            lada.autoDrive();

         System.out.println("Giguli its Victory");
            new Auto().autoDrive();

        }
    }



