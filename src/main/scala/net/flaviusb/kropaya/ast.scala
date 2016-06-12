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

case class Type-constraint() {}

class Quantifier(name: String, constraints: Array[Type-constraint]) {}

case class Forall(name: String) extends Quantifier(name) {}
case class Exists(name: String) extends Quantifier(name) {}
case class Fresh(name: String) extends Quantifier(name) {}
case class Mu(name: String) extends Quantifier(name) {}
case class Lambda(name: String) extends Quantifier(name) {}

trait Law {}

case class Thing extends Law {}

case class In extends Law {}

case class Pattern extends Law {}

