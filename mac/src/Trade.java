import java.util.UUID;

public class Trade {

    private Integer id;
    private String direction;

    public Trade(Integer id, String direction) {
        this.id = id;
        this.direction = direction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
