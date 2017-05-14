
class Bob {


  def hey(statement: String): String = {
    if (statement.matches(".*[A-Z].*") &&
        statement == statement.toUpperCase()) return "Whoa, chill out!"
    else if (statement.endsWith("?")) return "Sure."
    else if (statement.trim.isEmpty) return "Fine. Be that way!"
    else return "Whatever."
  }

}
