class phone
{
  void call ()
  {
      System.out.println("you are calling.......");
  }

  void sms()
  {
      System.out.println("SMS has been sent...");
  }

}

interface camera {
    void click();
    void record();
}

interface musicPlayer {
    void play();
    void pause();
    void stop();
}

class Smartphone extends phone implements camera, musicPlayer
{

    @Override
    public void click()
    {
        System.out.println("you are clicking.......");
    }

    @Override
    public void record()
    {
        System.out.println("you are Recording.......");
    }

    @Override
    public void play()
    {
        System.out.println("Music is playing.......");
    }

    @Override
    public void pause()
    {
      System.out.println("Music is paused......");
    }

    @Override
    public void stop()
    {
        System.out.println("Music is stopped.......");
    }

}





public class Interface_third
{
  public static void main(String []args)
  {

      camera S1 = new Smartphone();
      S1.record();
      musicPlayer m1= new Smartphone();
      m1.play();

  }
}
