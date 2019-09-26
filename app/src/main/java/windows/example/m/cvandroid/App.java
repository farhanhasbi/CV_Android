package windows.example.m.cvandroid;

public class App {
    private String code_name;
    private String summary;
    private String photo;

    public String getName() {
        return code_name;
    }

    public void setName(String code_name) {
        this.code_name = code_name;
    }

    public String getFrom() {
        return summary;
    }

    public void setFrom(String summary) {
        this.summary = summary;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}