package net.flaviusb.kropaya

/*
thing
- quantifier block
- name
- expose
- 'laws' - internal definitions
  - ∈
  - patterns
    - LHS of patterns must always be ⊞.
    - If RHS is ⊞ we have an arrow in the space of value
    - If RHS is ⊟ we have an arrow in the space of computation
  - things

quantifier block
- variables \w constraints
- scope where variables are live

∈

≃

pattern 

path expressions - eg referring inside of things - currenly we use #

→

⊞⊟

*/

trait Expression

class TypeConstraint extends Law with Expression {}

class Quantifier(introducing: Variable, constraints: Array[TypeConstraint]) {}

case class Forall(introducing: Variable, constraints: Array[TypeConstraint]) extends Quantifier(introducing, constraints) {}
case class Exists(introducing: Variable, constraints: Array[TypeConstraint]) extends Quantifier(introducing, constraints) {}
case class Fresh(introducing: Variable, constraints: Array[TypeConstraint]) extends Quantifier(introducing, constraints) {}
case class Mu(introducing: Variable, constraints: Array[TypeConstraint]) extends Quantifier(introducing, constraints) {}
case class Lambda(introducing: Variable, constraints: Array[TypeConstraint]) extends Quantifier(introducing, constraints) {}

trait Law {}

case class Thing(name: String, quantifier_block: Array[Quantifier], expose: Array[String], laws: Array[Law]) extends Law {}

class Pattern extends Law {}

case class Variable(name: String) extends Expression
