package Buoi8_ArrayList_LOL;

import java.util.List;

public class Team {
    private String teamName;
    private List<Champion> champions;

    public Team(String teamName, List<Champion> champions) {
        this.teamName = teamName;
        this.champions = champions;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Champion> getChampions() {
        return champions;
    }

    public void setChampions(List<Champion> champions) {
        this.champions = champions;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", champions=" + champions +
                '}';
    }
}
