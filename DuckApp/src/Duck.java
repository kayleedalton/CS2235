public class Duck {
    String commonName;
    String endangeredStatus;
    String scientificName;
    String imageURL;

    public Duck(String commonName, String endangeredStatus, String scientificName, String imageURL) {
        this.commonName = commonName;
        this.endangeredStatus = endangeredStatus;
        this.scientificName = scientificName;
        this.imageURL = imageURL;
    }
    public String duckInfo() {
        return(this.commonName + " " + "("+this.scientificName + ") " + " Endangered Status: " + this.endangeredStatus);
    }
}

