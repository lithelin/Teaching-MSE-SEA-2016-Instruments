package ch.heigvd.res.lab00;

/**
 * This is a very simple class used to demonstrate the specify-implement-validate
 * cycle. All methods used in the JUnit test are defined, so the test class will
 * compile. There is a bug in the add method, so one of the tests is expected
 * to fail.
 * 
 * If you look at the class named ch.heigvd.res.lab01.ApplicationTest, you will
 * find an executable specification for this class. The test methods specify
 * the expected behavior for this class.
 * 
 * @author Olivier Liechti
 */

public class Trumpet implements IInstrument {

  private int soundVolume = 80;
  private String color = "golden";
  private String sound = "pouet";

  public Trumpet() {
    super();
  }


  public int getSoundVolume(){
    return soundVolume;
  }

  public String play() {
    return sound;
  }

  public String getColor(){
    return color;
  }
}
