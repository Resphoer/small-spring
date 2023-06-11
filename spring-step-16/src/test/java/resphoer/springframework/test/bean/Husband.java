package resphoer.springframework.test.bean;

public class Husband {
    private Wife wife;

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String queryWife() {
        return "Husband.wife";
    }
}
