
package stingproject;

public class SentenceCount {
    int charCount;
    int vowleCount;
    void charCount(String sentence)
    {
       for(int i=0;i<sentence.length();i++)
       {
           if(sentence.charAt(i)!=' ')
           {
               charCount++;
           }
       }
        System.out.println("Total number of character in that sentence is "+charCount);
    }
    void wordCount(String sentence)
    {
        String[] word=sentence.trim().split("\\s+");
        int wordCount=word.length;
        System.out.println("Word count : "+wordCount);
    }
   void vowelCount(String sentence) 
   {
       for(int i=0;i<sentence.length();i++)
       {
           char ch=Character.toLowerCase(sentence.charAt(i));
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               vowleCount++;
           }
       }
       System.out.println("Vowel count : "+vowleCount);
   }
}
