package ru.job4j;

public class Mechanism {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.autoDrive();
        Lada lada = new Lada();
        lada.autoDrive();
        Giguli g1 = new Giguli();
        g1.getLada();
        NtStatic not1 =  new NtStatic();
        not1.nonStaticMetod();

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

    class StaticMetodAuto{
    public static void staticAuto(){
        System.out.println("Статик метод");
    }
    }

    class ExSaticMtd extends StaticMetodAuto{
      //   public void staticAuto()
      public static void staticAuto() {
          Auto auto = new Auto();
          System.out.println("not");
      }
   }
class NtStatic{
    public void nonStaticMetod(){
        new Auto().autoDrive();
        System.out.println("print notStaticMetod");
        new ExSaticMtd().staticAuto();
    }
}





