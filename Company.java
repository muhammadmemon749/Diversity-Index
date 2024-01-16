package App;
public class Company {
    public String name;
    public int avgMaleWage;
    public int avgFemWage;
    public double percentM;
    public double percentF;
    public double percentMinority;
    public int numIncidents;

    Company(String n, int m, int f, double pM, double pF, double pMin, int i) {
        name = n;
        avgMaleWage = m;
        avgFemWage = f;
        percentM = pM;
        percentF = pF;
        percentMinority = pMin;
        numIncidents = i;
    }

}
