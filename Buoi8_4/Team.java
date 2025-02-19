package Buoi8_4;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String nameMember;
    private List<Champion> champions;

    public Team(String nameMember) {
        this.nameMember = nameMember;
        this.champions = new ArrayList<>();
    }
    public  void addChampion(Champion champion){
        if (champions.size()<5){
            champions.add(champion);
        }
        else {
            System.out.println("Mot team chi co 5 tuong!");
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "nameMember='" + nameMember + '\'' +
                ", champions=" + champions +
                '}';
    }
}
