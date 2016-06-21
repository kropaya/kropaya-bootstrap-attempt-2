package net.flaviusb.kropaya

import scala.util.parsing.combinator._

import scala.language.postfixOps

object KropayaParser extends RegexParsers {
  override type Elem = Char
  override def skipWhitespace = false
  def variable: Parser[Variable] =
    "\\A((([_+]+[_+:]*)?[a-zA-Z][a-zA-Z0-9_$!?%=-]*)|([~!<>@$^*_='`?★×÷≠⧺⧻§∘•·≢∧∨∪∩□◊◁▷⊃+-]+)|([\\\\])|…)(\\^[+-])?".r ^^ {
      x => Variable(x)
    }
  def ws: Parser[String] = "[ ]+".r ^^ { _ => "" }
  def bracketed_expression: Parser[Expression] = "(" ~ ws ~ expression ~ ws ~ ")" ^^ { case "(" ~ _ ~ x ~ _ ~ ")" => x }
  def application: Parser[Expression] = expression_part ~ (((ws ~ expression_part) ^^ {case _ ~ arg => arg })+) ^^ {
    case fn ~ args => Application(fn, args)
  }
  def expression_part: Parser[Expression] = bracketed_expression | variable
  def expression: Parser[Expression] = application | expression_part
}
