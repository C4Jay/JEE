import java.util.List;

public class SportsmanList {
    private Sportsman sportsman;
    private List<Sportsman> sportsmanList;

    public void PushSportsman(Sportsman sportsman) {
        List<Sportsman> sportsmanList = this.getSportsmanList();
        sportsmanList.add(sportsman);
        this.setSportsmanList(sportsmanList);
    }


    public List<Sportsman> getSportsmanList() {
        return sportsmanList;
    }

    public void setSportsmanList(List<Sportsman> sportsmanList) {
        this.sportsmanList = sportsmanList;
    }


    public SportsmanList(Sportsman sportsman) {
        this.sportsman = sportsman;
    }


    public Sportsman getSportsman() {
        return sportsman;
    }

    public void setSportsman(Sportsman sportsman) {
        this.sportsman = sportsman;
    }
}
