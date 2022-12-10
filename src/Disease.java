public class Disease {
    private String diseaseID;
    private String diseaseName;

    public Disease(String diseaseID, String diseaseName) {
        this.diseaseID = diseaseID;
        this.diseaseName = diseaseName;
    }

    public String getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(String diseaseID) {
        this.diseaseID = diseaseID;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
}
