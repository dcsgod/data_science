class outer
{
    static int x=10;
    int y=20;
    static class inner
    {
        int z=6;
       void innerDisplay()
        {
            System.out.println(x);
            //System.out.println(y);
            System.out.println(z);

        }
    }
    void outerDisplay()
    {
        inner i = new inner();
        i.innerDisplay();
        System.out.println("outer display");
    }
}
class testtt1
{
     public static void main(String[] args)
    {
       // outer o = new outer();
       // o.outerDisplay();
        outer.inner i=new outer.inner();
        i.innerDisplay();
    }
        
}