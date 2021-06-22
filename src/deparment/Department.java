package deparment;

public enum Department {
    INFORMATIONTECHNOLOGY("Công Nghệ Thông Tin"),
    ELECTRICAL("Điện Tử"),
    ACCOUNTING("Kế Toán"),
    TELECOMUNICATION("Viễn Thông"),
    MARKETTING("Maketing");

    private String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
