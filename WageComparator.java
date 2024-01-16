package Comparators;
//Faith

import java.util.Comparator;
import java.lang.Math;
import App.Company;

public class WageComparator implements Comparator<Company>{

    public int compare(Company c1, Company c2) {
        int c1Gap = Math.abs(c1.avgMaleWage - c1.avgFemWage);
        int c2Gap = Math.abs(c2.avgMaleWage - c2.avgFemWage);

        if (c1Gap < c2Gap) {
            return -1;
        }
        else if (c1Gap == c2Gap) {
            //if fem wage higher, better?
            return 0;
        }
        else {
            return 1;
        }
    }
    
}

