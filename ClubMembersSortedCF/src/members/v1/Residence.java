package members.v1;

import java.util.Objects;

public class Residence {
    private int zipCode;
    private String settlement;
    private String address;

    public Residence() {
    }

    public Residence(int zipCode, String settlement, String address) {
        this.zipCode = zipCode;
        this.settlement = settlement;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Residence residence = (Residence) o;
        return zipCode == residence.zipCode && Objects.equals(settlement, residence.settlement) && Objects.equals(address, residence.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipCode, settlement, address);
    }

    @Override
    public String toString() {
        return "Residence{" +
                "zipCode=" + zipCode +
                ", settlement='" + settlement + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
