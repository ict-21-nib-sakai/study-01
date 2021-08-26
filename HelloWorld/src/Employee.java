/**
 * 従業員クラス
 */
public class Employee {
    /** 氏名 */
    private String name;

    /** 年齢 */
    private int age;

    /** 住所 */
    private String address;

    /** 性別 */
    private int gender;

    /** 役職 */
    private String position;

    /**
     * 従業員の氏名を代入
     *
     * @param String name
     * @return this
     */
    public Employee setName(String name) {
        this.name = name;

        return this;
    }

    /**
     * @return String 従業員の氏名
     */
    public String getName() {
        return this.name;
    }

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
