public class Nonce1
{
        public static void main(String[] args) throws Exception
        {
                        Thread.sleep(5000);
                        throwExcep1();
                        Thread.sleep(5000);
                        throwExcep1();
                        Thread.sleep(5000);
        }

        public static void throwExcep1() throws Exception
        {
                int nonce88 = 5;
                System.out.println(nonce88);
                try
                {
                        throw new Exception();
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
}
