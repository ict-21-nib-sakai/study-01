/**
 * 従業員クラス
 */
public class Employee {
    /** 氏名 */
    String name;

    /** 年齢 */
    int age;

    /** 住所 */
    String address;

    /** 性別 */
    int gender;

    /** 役職 */
    String position;

    /**
     * 入社
     */
    public void enter() {
        // TODO データベースに従業員情報を INSERT

        System.out.println(
            String.format("従業員 %s を入社", name)
        );
    }

    /**
     * 退職
     */
    public void leave() {
        // TODO データベースから従業員情報を DELETE

        System.out.println(
            String.format("従業員 %s を退職", name)
        );
    }
}
