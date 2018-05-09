package mita.demo_app;

import java.util.List;

public class Job {

    String id;
    String from;
    String to;
    String status;
    List<Package> packageList;

    public Job() {
    }

    public Job(String id, String from, String to, String status, List<Package> packageList) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.status = status;
        this.packageList = packageList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }
}
