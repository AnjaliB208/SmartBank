# SmartBank

SmartBank is a simple console-based Java application that simulates a core banking system.
It has been developed as a practice project to demonstrate OOP concepts, modular design, and exception handling in Java.

<h3>Features</h3>

<ul>
  <li>Create new accounts (Savings and Current)</li>
  <li>Deposit money</li>
  <li>Withdraw money (with rules like minimum balance for Savings)</li>
  <li>Display individual account details</li>
  <li>Display all accounts</li>
  <li>Input validation and error handling for smooth user experience</li>
</ul>

<h3>Technologies Used</h3>

<ul>
  <li>Java SE 8+</li>
  <li>Collections Framework (ArrayList)</li>
  <li>Scanner for console input</li>
</ul>

<h3>How To Run</h3>

<ol>
  <li>Clone or download the project files.</li>
  <li>Compile all .java files: <br><code>javac MainApp.java</code> </li>
  <li>Run the application: <br><code>java MainApp</code></li>
  <li>Follow the on-screen menu to use the application.</li>
</ol>

<h3>Project Structure</h3>

<ul>
  <li>Account (abstract class) : Base class with common properties and methods</li>
  <li>SavingsAccount / CurrentAccount : Subclasses with specific withdrawal behavior</li>
  <li>Bank : Handles account storage and operations</li>
  <li>MainApp : Menu-driven application entry point</li>
</ul>















