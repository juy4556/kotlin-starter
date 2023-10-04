package lec14.코틀린에서_다양한클래스를_다루는_방법;

// 추가적인 클래스를 상속받을 수 없다.
// 인터페이스는 구현할 수 있으며, 각 코드가 싱글톤이다.
public enum JavaCountry {

    KOREA("KO"),
    AMERICA("US");

    private final String code;

    JavaCountry(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
