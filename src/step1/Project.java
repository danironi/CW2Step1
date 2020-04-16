package step1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Project implements Comparable<Project> {

    private String title;
    private Date start, end;

    public Project(String title, Date start, Date end) {
        this.title = title;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy");
        return "Project title: " + title + "\nStarting date: " + simpleDateFormat.format(start) + "\nEnding date: " + simpleDateFormat.format(end);
    }

    public String getTitle() {
        return title;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public int compareTo(Project project) {
        return this.title.compareTo(project.title);
    }
}

