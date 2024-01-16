//Faith

package Comparators;

import java.util.Comparator;
import java.util.ArrayList;
import App.Company;

public class OverallComparator implements Comparator<Company>{
    ArrayList<Company> genderRanking;
    ArrayList<Company> diversityRanking;
    ArrayList<Company> safetyRanking;

    public OverallComparator(ArrayList<Company> g, ArrayList<Company> d, ArrayList<Company> s) {
        genderRanking = g;
        diversityRanking = d;
        safetyRanking = s;
    }

    public int compare(Company c1, Company c2) {
        int c1Score = genderRanking.indexOf(c1) + diversityRanking.indexOf(c1) + safetyRanking.indexOf(c1);
        int c2Score = genderRanking.indexOf(c2) + diversityRanking.indexOf(c2) + safetyRanking.indexOf(c2);

        if(c1Score < c2Score) {
            return -1;
        }
        else if (c1Score == c2Score) {
            return 0;
        }
        else {
            return 1;
        }

    }
}
