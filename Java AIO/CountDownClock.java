public class CountDownClock extends Thread
{
    private int start;
    public CountDowClock(int start)
    {
        this.start = start;
    }
    public void run()
    {
        for(int t = start; t >= 0; t--)
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
        }
    }
}