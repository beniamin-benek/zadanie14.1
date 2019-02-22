class Computer implements Comparable<Computer> {

    private String name;
    private double cpuSpeed;
    private double amountOfRam ;

    public Computer(String name, double cpuSpeed, double amountOfRam) {
        this.name = name;
        this.cpuSpeed = cpuSpeed;
        this.amountOfRam = amountOfRam;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", amountOfRam=" + amountOfRam +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getAmountOfRam() {
        return amountOfRam;
    }

    public void setAmountOfRam(double amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    @Override
    public int compareTo(Computer o) {

        if (this.cpuSpeed > o.cpuSpeed)
            return 1;
        else if (this.cpuSpeed < o.cpuSpeed)
            return -1;
        else if (this.cpuSpeed == o.cpuSpeed)
            if (this.amountOfRam > o.amountOfRam)
                return 1;
            else if (this.amountOfRam < o.amountOfRam)
                return -1;
            else
                return this.name.compareTo(o.name);

        return 0;
    }

}