import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class FixGenerator {

    public static void generator(ArrayList list) {
        int teamCount = list.size();
        int matchPerRound = 0;
        int roundCount = 0;
        LinkedHashSet<String> set = new LinkedHashSet<>();
        Random rnd = new Random();

        matchPerRound = teamCount / 2;
        roundCount = (teamCount * (teamCount - 1) / matchPerRound);
        for (int i = 0; i < roundCount; i++) {
            ArrayList<String> tempList = new ArrayList<>(list);
            while (set.size() != (i + 1) * 3) {
                int teamCounts = tempList.size();
                int randIndex1 = rnd.nextInt(teamCounts);
                int randIndex2 = rnd.nextInt(teamCounts);
                String team1 = tempList.get(randIndex1);
                String team2 = tempList.get(randIndex2);
                if (!team1.equals(team2) && !set.contains(team1 + "  vs  " + team2)) {
                    set.add(team1 + "  vs  " + team2);
                    tempList.remove(team1);
                    tempList.remove(team2);
                }
            }
        }
        int itemCount = 0;
        for (String item : set) {
            System.out.println(item);
            itemCount++;
            if (itemCount % 3 == 0)
                System.out.println("##############################################################################");
        }
    }
}
