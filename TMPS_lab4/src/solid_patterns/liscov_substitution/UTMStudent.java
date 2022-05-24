package solid_patterns.liscov_substitution;

public class UTMStudent implements Student{
    int yearOfStudy;
    long avgMark=9;

    @Override
    public void study() {
        System.out.println("Studying so hard");
    }

    @Override
    public void setYearOfStudy(int year) {
        yearOfStudy=year;
    }

    @Override
    public long getAvg() {
        return avgMark;
    }
}
