//Faith

package Comparators;

import java.util.Comparator;
import java.util.ArrayList;
import App.Company;

public class GenderComparator implements Comparator<Company>{
    ArrayList<Company> wageRanking;
    ArrayList<Company> ratioRanking;

    public GenderComparator(ArrayList<Company> w, ArrayList<Company> r) {
        wageRanking = w;
        ratioRanking = r;
    }


    public int compare(Company c1, Company c2) {
        int c1Score = wageRanking.indexOf(c1) + ratioRanking.indexOf(c1);
        int c2Score = wageRanking.indexOf(c2) + ratioRanking.indexOf(c2);

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
