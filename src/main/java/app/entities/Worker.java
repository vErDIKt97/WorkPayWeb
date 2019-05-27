package app.entities;

import java.util.Objects;

public class Worker {

    private String name = null;
    private Integer sells = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSells() {
        return sells;
    }

    public void setSells(Integer sells) {
        this.sells = sells;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sells='" + sells + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Worker user = (Worker) obj;
        if (!Objects.equals(name, user.name)) return false;
        return Objects.equals(sells, user.sells);
    }
}
