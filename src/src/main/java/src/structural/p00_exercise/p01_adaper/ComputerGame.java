package src.structural.p00_exercise.p01_adaper;

public class ComputerGame {
    private final String name;
    private final PegiAgeRating pegiAgeRating;
    private final Double budgetInMillionsOfDollars;
    private final Integer minimumGpuMemoryInMegabytes;
    private final Integer diskSpaceNeededInGB;
    private final Integer ramNeededInGb;
    private final Integer coresNeeded;
    private final Double coreSpeedInGhz;

    public ComputerGame(final String name,
                        final PegiAgeRating pegiAgeRating,
                        final Double budgetInMillionsOfDollars,
                        final Integer minimumGpuMemoryInMegabytes,
                        final Integer diskSpaceNeededInGB,
                        final Integer ramNeededInGb,
                        final Integer coresNeeded,
                        final Double coreSpeedInGhz) {
        this.name = name;
        this.pegiAgeRating = pegiAgeRating;
        this.budgetInMillionsOfDollars = budgetInMillionsOfDollars;
        this.minimumGpuMemoryInMegabytes = minimumGpuMemoryInMegabytes;
        this.diskSpaceNeededInGB = diskSpaceNeededInGB;
        this.ramNeededInGb = ramNeededInGb;
        this.coresNeeded = coresNeeded;
        this.coreSpeedInGhz = coreSpeedInGhz;
    }

    public String getName() {
        return name;
    }

    public PegiAgeRating getPegiAgeRating() {
        return pegiAgeRating;
    }

    public Double getBudgetInMillionsOfDollars() {
        return budgetInMillionsOfDollars;
    }

    public Integer getMinimumGpuMemoryInMegabytes() {
        return minimumGpuMemoryInMegabytes;
    }

    public Integer getDiskSpaceNeededInGB() {
        return diskSpaceNeededInGB;
    }

    public Integer getRamNeededInGb() {
        return ramNeededInGb;
    }

    public Integer getCoresNeeded() {
        return coresNeeded;
    }

    public Double getCoreSpeedInGhz() {
        return coreSpeedInGhz;
    }
}
