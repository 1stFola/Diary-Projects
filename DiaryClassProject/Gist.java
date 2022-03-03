package DiaryClassProject;

import java.time.LocalDateTime;

public class Gist {

    private String title;
    private LocalDateTime time = LocalDateTime.now();
    private String gist;



    public Gist(String gistTitle, String gistProper){
        title = gistTitle;
        gist = gistProper;

    }


    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }
}
