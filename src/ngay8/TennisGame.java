package ngay8;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String result = "";
        int tempScore=0;
        if (player1Score==player2Score) {
            result = sameScore(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            result = checkWin(player1Score,player2Score);
        }
        else
        {
            result = continueGame(player1Score,player2Score);
        }
        return result;
    }

    private static String sameScore(int tempScore) {
        String result;
        switch (tempScore)
        {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    private static String checkWin(int player1Score, int player2Score) {
        String result;
        int minusResult = player1Score-player2Score;
        if (minusResult==1) result ="Advantage player1";
        else if (minusResult ==-1) result ="Advantage player2";
        else if (minusResult>=2) result = "Win for player1";
        else result ="Win for player2";
        return result;
    }

    private static String continueGame(int player1Score, int player2Score) {
        String result="";
        int tempScore;
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { result+="-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    result+="Love";
                    break;
                case 1:
                    result+="Fifteen";
                    break;
                case 2:
                    result+="Thirty";
                    break;
                case 3:
                    result+="Forty";
                    break;
            }
        }
        return result;
    }
}

