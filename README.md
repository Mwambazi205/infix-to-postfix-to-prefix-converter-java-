# infix-to-postfix-to-prefix-converter-java-

🚀 Overview

This project demonstrates how to convert mathematical expressions from infix notation into:

- 🔹 Postfix (Reverse Polish Notation)
- 🔹 Prefix (Polish Notation)

The implementation uses a stack-based algorithm, a fundamental concept in data structures and compiler design.

---

⚙️ Features

- Convert infix → postfix
- Convert infix → prefix
- Handles operator precedence and associativity
- Supports parentheses "()"
- Simple and efficient Java implementation

---

🧠 Key Concepts

- Stack Data Structure
- Expression Parsing
- Operator Precedence Rules
- Algorithm Design

---

📊 Flowchart

"Flowchart" (docs/flowchart.png)

---

🧾 Pseudocode

🔹 Infix to Postfix

Create empty stack
Create empty output

Scan expression left to right:
  If operand → add to output
  If '(' → push to stack
  If ')' → pop until '('
  If operator:
      pop while precedence <= stack top
      push operator

Pop remaining stack to output

🔹 Infix to Prefix

Reverse expression
Swap '(' and ')'
Convert to postfix
Reverse result → prefix

---

▶️ How to Run

Compile

javac InfixConversion.java

Run

java InfixConversion

---

📌 Example

Input:

A+(B*C-(D/E^F)*G)*H

Output:

Postfix: ABC*DEF^/G*-H*+
Prefix : +A*-*BC*/D^EFGH

---

📁 Project Structure

src/        → Java source code  
docs/       → Flowcharts & notes  

---

🎯 Use Cases

- Learning data structures (Stacks)
- Compiler design basics
- Expression evaluation systems

---

👨‍💻 Author

Grace Mwambazi

---

📜 License

MIT License

