package rockpaperscissorgame;

public class RockPaperScissor {
    String game(int num)
    {
        if(num==0)
        {
            return "rock";
        }
        else if(num==1)
        {
            return "paper";
        }
        else if(num==2)
        {
            return "scissor";
        }
        return "inavlis number";
    }
    
}
