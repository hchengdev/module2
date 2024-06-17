package com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        if (m_score1==m_score2)
        {
            final int LOVE_ALL = 0;
            final int FIFTEEN_ALL = 1;
            final int THIRTY_ALL = 2;
            final int FORTY_ALL = 3;
            switch (m_score1)
            {
                case LOVE_ALL:
                    score = "Love-All";
                    break;
                case FIFTEEN_ALL:
                    score = "Fifteen-All";
                    break;
                case THIRTY_ALL:
                    score = "Thirty-All";
                    break;
                case FORTY_ALL:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else {
            if (m_score1 >= 4 || m_score2 >= 4)
            {
                int minusResult = m_score1-m_score2;
                if (minusResult==1){
                    return "Advantage player1";
                }
                else if (minusResult ==-1) {
                    return "Advantage player2";
                }
                else if (minusResult>=2) {
                    return "Win for player1";
                }
                else {
                    return "Win for player2";
                }
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    int tempScore = (i == 1) ?  m_score1 :  m_score2;
                    switch(tempScore)
                    {
                        case 0:
                            score+="Love";
                            break;
                        case 1:
                            score+="Fifteen";
                            break;
                        case 2:
                            score+="Thirty";
                            break;
                        case 3:
                            score+="Forty";
                            break;
                    }
                    if (i == 1) {
                        score += "-";
                    }
                }
            }
        }
        return score;
    }
}