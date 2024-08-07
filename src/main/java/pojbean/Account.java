package pojbean;

import java.util.Date;

public class Account {
    private long id;
    private String onwerName;
    private Double balance;
    private Date accesTimes;
    private boolean locked;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOnwerName() {
        return onwerName;
    }

    public void setOnwerName(String onwerName) {
        this.onwerName = onwerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getAccesTimes() {
        return accesTimes;
    }

    public void setAccesTimes(Date accesTimes) {
        this.accesTimes = accesTimes;
    }
}
