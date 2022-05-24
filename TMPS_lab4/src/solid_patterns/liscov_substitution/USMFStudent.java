package solid_patterns.liscov_substitution;

public class USMFStudent implements Student{
    int yearOfStudy;
    long avgMark=10;

    @Override
    public void study() {
        System.out.println("Studying super mega ultra hard");
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
