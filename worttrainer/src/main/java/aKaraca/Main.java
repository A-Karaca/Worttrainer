package aKaraca;

public class Main {


    public static void main(String[] args) {

        SpellingTrainer spellingTrainer = new SpellingTrainer();
        try {
            spellingTrainer.selectItem(6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(spellingTrainer.getStats());
        try {
            System.out.println(spellingTrainer.getCurrentItem()[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            spellingTrainer.compareItem("Katze");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(spellingTrainer.getStats());


        spellingTrainer.randomizeItem();
        try {
            System.out.println(spellingTrainer.getCurrentItem()[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            spellingTrainer.compareItem(System.console().readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(spellingTrainer.getStats());

    }
}