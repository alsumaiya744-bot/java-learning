
package StringTimeDuration;

public class main {
    public static void main(String[] args) {
        String sentence="Today our topic is thread";
        for(int i=0;i<sentence.length();i++)
        {
            char se=sentence.charAt(i);
            if(se !=' ')
            {
                
                try {
                    Thread.sleep(3000);
                    System.out.println(se);
                } catch (InterruptedException ex) {
                    System.getLogger(main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        }
    }
}
