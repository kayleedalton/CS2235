public class Duck {
    String commonName;
    String endangeredStatus;
    String scientificName;

    public Duck(String commonName, String endangeredStatus, String scientificName) {
        this.commonName = commonName;
        this.endangeredStatus = endangeredStatus;
        this.scientificName = scientificName;
    }
    public String duckInfo() {
        return(this.commonName + " " + "("+this.scientificName + ") " + " Endangered Status:" + this.endangeredStatus);
    }
}
