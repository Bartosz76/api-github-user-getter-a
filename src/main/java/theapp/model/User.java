package theapp.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {

    private int id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private String creationDate;
    private BigDecimal calculations;

    public User() {
    }

    public User(int id, String login, String name, String type, String avatarUrl, String creationDate, BigDecimal calculations) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.creationDate = creationDate;
        this.calculations = calculations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getCalculations() {
        return calculations;
    }

    public void setCalculations(BigDecimal calculations) {
        this.calculations = calculations;
    }
}
