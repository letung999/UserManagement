package deparment;

public class Departments {
    public String getDepartment(int option) {
        /**
         * INFORMATIONTECHNOLOGY("Công Nghệ Thông Tin"),
         *     ELECTRICAL("Điện Tử"),
         *     ACCOUNTING("Kế Toán"),
         *     TELECOMUNICATION("Viễn Thông"),
         *     MARKETTING("Maketing");
         */
        String result = null;
        switch (option) {
            case 1: {
                result = Department.INFORMATIONTECHNOLOGY.getValue();
                break;
            }
            case 2: {
                result = Department.ELECTRICAL.getValue();
                break;
            }
            case 3: {
                result = Department.ACCOUNTING.getValue();
                break;
            }
            case 4: {
                result = Department.TELECOMUNICATION.getValue();
                break;
            }
            case 5: {
                result = Department.MARKETTING.getValue();
                break;

            }
        }
        return result;
    }
}
