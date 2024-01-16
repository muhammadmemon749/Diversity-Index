//Faith

package Comparators;

import java.util.Comparator;
import java.lang.Math;
import App.Company;

public class GRatioComparator implements Comparator<Company> {
    public int compare(Company c1, Company c2) {
        double c1Difference = Math.abs(c1.percentM - c1.percentF);
        double c2Difference = Math.abs(c2.percentM - c2.percentF);

        if (c1Difference < c2Difference) {
            return -1;
        }
        else if (c1Difference == c2Difference) {
            //if more females than males, better?
            return 0;
        }
        else {
            return 1;
        }
    }
}
