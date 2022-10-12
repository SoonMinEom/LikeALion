package OnClass.c221013.practice2.domain;

public class Hospital{


    private String id;
    private String address;
    private String district;
    private String code;
    private String emergency;
    private String name;

    public Hospital(String id, String address, String district, String code, String emergency, String name) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.code = code;
        this.emergency = emergency;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCode() {
        return code;
    }

    public String getEmergency() {
        return emergency;
    }

    public String getName() {
        return name;
    }
}
