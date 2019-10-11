package ms3.test.entity.type;

public enum CommunicationType {
    HOME("Home"),
    CELL("Cell"),
    WORK("Work"),
    EMAIL("Email");

    private String type;

    CommunicationType(String type) {
        this.type = type;
    }
}