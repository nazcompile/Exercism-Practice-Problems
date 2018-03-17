fun transcribeToRna(dna: String): String {
    return dna.map { it.translate() }.joinToString(separator = "")
}

fun Char.translate(): Char = when {
    this == 'C' -> 'G'
    this == 'G' -> 'C'
    this == 'T' -> 'A'
    this == 'A' -> 'U'
    else -> this
}
