package Buoi8_ArrayList_LOL;

public class SummonRift {
    private Team team1;
    private Team team2;
    private String startTime;

    public SummonRift(Team team1, Team team2, String startTime) {
        this.team1 = team1;
        this.team2 = team2;
        this.startTime = startTime;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "team1=" + team1 +
                ", team2=" + team2 +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}
