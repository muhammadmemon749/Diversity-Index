//Faith

package Comparators;

import java.util.Comparator;
import App.Company;

public class SafetyComparator implements Comparator<Company> {
    public int compare(Company c1, Company c2) {
        if (c1.numIncidents < c2.numIncidents) {
            return -1;
        }
        else if (c1.numIncidents == c2.numIncidents) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
