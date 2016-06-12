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

class TypeConstraint {}

class Quantifier(name: String, constraints: Array[TypeConstraint]) {}

case class Forall(name: String, constraints: Array[TypeConstraint]) extends Quantifier(name, constraints) {}
case class Exists(name: String, constraints: Array[TypeConstraint]) extends Quantifier(name, constraints) {}
case class Fresh(name: String, constraints: Array[TypeConstraint]) extends Quantifier(name, constraints) {}
case class Mu(name: String, constraints: Array[TypeConstraint]) extends Quantifier(name, constraints) {}
case class Lambda(name: String, constraints: Array[TypeConstraint]) extends Quantifier(name, constraints) {}

trait Law {}

case class Thing(name: String, quantifier_block: Array[Quantifier], expose: Array[String], laws: Array[Law]) extends Law {}

class In extends Law {}

class Pattern extends Law {}

