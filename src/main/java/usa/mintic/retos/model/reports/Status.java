package usa.mintic.retos.model.reports;

public class Status {

    private Integer completed;
    private Integer cancelled;

    public Status(int completed, int cancelled){
        this.completed=completed;
        this.cancelled=cancelled;
    }


    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
}
