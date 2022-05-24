package solid_patterns.liscov_substitution;

public class ULIMStudent implements Student{
    int yearOfStudy;
    long avgMark=1;

    @Override
    public void study() {
        System.out.println("Studying?");
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
