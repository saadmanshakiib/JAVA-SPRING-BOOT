package net.engineering.journalApp.Entity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class JournalEntry {
    private long id;
    private String title;
    private String content;

    public void setId(long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }

    public long getId(){ return this.id;}
    public String getTitle(){return this.title;}
    public String getContent(){return this.content;}
}
