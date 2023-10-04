package lec14.코틀린에서_다양한클래스를_다루는_방법


fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()

    }
}
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),

}