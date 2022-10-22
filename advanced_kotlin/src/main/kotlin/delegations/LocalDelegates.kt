package delegations


fun localDelegatedProperties() {
    val lazy by lazy { initLate() }
}

fun initLate(): String {
    throw java.lang.UnsupportedOperationException("not implementedß-")
}
