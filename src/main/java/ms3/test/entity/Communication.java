package ms3.test.entity;

import ms3.test.entity.type.CommunicationType;

import javax.persistence.*;

@Entity(name = "Communication")
@Table(name = "Communication")
public class Communication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    CommunicationType type;
    String value;
    boolean preferred;

    public Communication() {
    }

    public Communication(CommunicationType type, String value, boolean preferred) {
        this.type = type;
        this.value = value;
        this.preferred = preferred;
    }

    public CommunicationType getType() {
        return type;
    }

    public void setType(CommunicationType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }
}