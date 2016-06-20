package net.flaviusb.kropaya

import scala.util.parsing.combinator._

object KropayaParser extends RegexParsers {
  override type Elem = Char
  override def skipWhitespace = false
  def variable: Parser[Variable] =
    "\\A((([_+]+[_+:]*)?[a-zA-Z][a-zA-Z0-9_$!?%=-]*)|([~!<>@$^*_='`?★×÷≠⧺⧻§∘•·≢∧∨∪∩□◊◁▷⊃+-]+)|([\\\\])|…)(\\^[+-])?".r ^^ {
      x => Variable(x)
    }
  def expression: Parser[Expression] = variable
}
