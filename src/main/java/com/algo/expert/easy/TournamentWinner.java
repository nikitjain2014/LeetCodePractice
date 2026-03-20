package com.algo.expert.easy;
import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions,ArrayList<Integer> results){
        String currentBestTeam="";
        HashMap<String,Integer> scores=new HashMap<String,Integer>();
        scores.put(currentBestTeam,0);
           for(int i=0;i<competitions.size();i++){
            ArrayList<String> competition=competitions.get(i);
            String homeTeam=competition.get(0);
            String awayTeam=competition.get(1);
            int result=results.get(i);
             String winningTeam=result==1?homeTeam:awayTeam;
                if(!scores.containsKey(winningTeam)){
                    scores.put(winningTeam,3);}
                else {
                scores.put(winningTeam, scores.get(winningTeam) + 3);
                }
                if(scores.get(winningTeam)>scores.get(currentBestTeam)){
                currentBestTeam=winningTeam;
                }
    }
        return currentBestTeam;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions=new ArrayList<ArrayList<String>>();
        ArrayList<String> group1=new ArrayList<>();
        group1.add("html");
        group1.add("c#");

        ArrayList<String> group2=new ArrayList<>();
        group2.add("c#");
        group2.add("python");

        ArrayList<String> group3=new ArrayList<>();
        group3.add("python");
        group3.add("html");

        competitions.add(group1);
        competitions.add(group2);
        competitions.add(group3);

        ArrayList<Integer> results=new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);
        System.out.println("Winner:"+tournamentWinner(competitions,results));

    }
}
