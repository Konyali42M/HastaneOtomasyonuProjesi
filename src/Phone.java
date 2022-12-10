public class Phone {
    private int countryCode;
    private int cityCode;
    private int phoneNumber;
    private String phoneType;

    public Phone(int countryCode, int cityCode, int phoneNumber, String phoneType) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
}
