package members.v1;

import java.util.Objects;

public class Residence {
    private int zipCode;
    private String settlement;
    private String address;

    public Residence() {
    }

    public Residence(int zipCode, String settlement, String address) throws InvalidZipCodeException {
        ZipCodeValidator zipCodeValidator = new ZipCodeValidator();
        if (zipCodeValidator.isValid(zipCode)) {
            this.zipCode = zipCode;
        } else {
            throw new InvalidZipCodeException("Zip code must be between 1000 and 9999.");
        }
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

    public int getZipCode() {
        return zipCode;
    }

    public String getSettlement() {
        return settlement;
    }

    public String getAddress() {
        return address;
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
