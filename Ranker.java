//Faith

package App;

import java.util.ArrayList;
import Comparators.*;

public class Ranker {
    ArrayList<Company> companies;
    ArrayList<Company> genderWageRanking;
    ArrayList<Company> genderRatioRanking;
    ArrayList<Company> genderOverallRanking;
    ArrayList<Company> minorityRatioRanking;
    ArrayList<Company> safetyRanking;
    ArrayList<Company> overallRanking;

    Ranker(ArrayList<Company> companies) {
        this.companies = companies;
        genderWageRanking = new ArrayList<Company>(companies);
        genderRatioRanking = new ArrayList<Company>(companies);
        genderOverallRanking = new ArrayList<Company>(companies);
        minorityRatioRanking = new ArrayList<Company>(companies);
        safetyRanking = new ArrayList<Company>(companies);
        overallRanking = new ArrayList<Company>(companies);
    }

    void rankGenderWages() {
        genderWageRanking.sort(new WageComparator());
    }

    void rankGenderRatio() {
        genderRatioRanking.sort(new GRatioComparator());
    }

    void rankGenderOverall() {
        genderOverallRanking.sort(new GenderComparator(genderWageRanking, genderRatioRanking));
    }

    void rankMinorityRatio() {
        minorityRatioRanking.sort(new DiversityComparator());
    }

    void rankSafety() {
        safetyRanking.sort(new SafetyComparator());
    }

    void rankOverall() {
        overallRanking.sort(new OverallComparator(genderOverallRanking, minorityRatioRanking, safetyRanking));
    }

}