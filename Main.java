//Faith

package App;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company abc = new Company("ABC", 50000, 45000, 49.8, 50.2, 60.0, 10);
        Company good = new Company("good co.", 100000, 100000, 47.0, 53.0, 23.6, 1);
        Company bad = new Company("bad inc.", 15000, 90000, 39.5, 60.5, 31.1, 5);

        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(abc);
        companies.add(good);
        companies.add(bad);

        Ranker ranker = new Ranker(companies);
        ranker.rankGenderWages();
        /*int rank = 1;
        for (Company a : ranker.genderWageRanking) {
            System.out.println(rank + ". " + a.name);
            rank++;
        }

        System.out.println();*/
        ranker.rankGenderRatio();
        /*rank = 1;
        for (Company a : ranker.genderRatioRanking) {
            System.out.println(rank + ". " + a.name);
            rank++;
        }*/

        System.out.println();
        ranker.rankGenderOverall();
        int rank = 1;
        for (Company a : ranker.genderOverallRanking) {
            System.out.println(rank + ". " + a.name);
            rank++;
        }

        System.out.println();
        ranker.rankMinorityRatio();
        rank = 1;
        for (Company a : ranker.minorityRatioRanking) {
            System.out.println(rank + ". " + a.name);
            rank++;
        }

        System.out.println();
        ranker.rankSafety();
        rank = 1;
        for (Company a : ranker.safetyRanking) {
            System.out.println(rank + ". " + a.name);
            rank++;
        }

        System.out.println();
        ranker.rankOverall();
        rank = 1;
        for (Company a : ranker.overallRanking) {
            System.out.println(rank + ". " + a.name);
            rank++;
        }
    }
}
