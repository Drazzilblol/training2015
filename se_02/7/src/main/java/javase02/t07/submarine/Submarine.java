package javase02.t07.submarine;

/**
 * Created by Drazz on 20.10.2015.
 */
@SubmarineAnnotation(name = "U-122")
public class Submarine {

    class SubmarineEngine {
        public void run() {

            System.out.print("Вж");
            for (int i = 0; i < 200; i++) {
                try {
                    System.out.print("ж");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void accelerate() {
        SubmarineEngine engine = new SubmarineEngine();
        engine.run();
    }
}