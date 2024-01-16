//Faith

package Comparators;

import java.util.Comparator;
import java.lang.Math;
import App.Company;

public class DiversityComparator implements Comparator<Company>{
    public int compare(Company c1, Company c2) {
        double c1Difference = Math.abs(30 - c1.percentMinority);
        double c2Difference = Math.abs(30 - c2.percentMinority);

        if (c1Difference < c2Difference) {
            return -1;
        }
        else if (c1Difference == c2Difference) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
