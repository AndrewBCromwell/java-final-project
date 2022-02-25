# Final Project

This is the final project for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

## Introduction
During the introduction, I learned how to use the Git Bash command line to get from file to file and create new files. I also made a GitHub repository to share the things that that I have made. I can use Git Bash to update this repository with any changes that I made in Visual Studio Code.

I also learned how to use Markdown, which is like a simplified form of HTML, to make words *italic,* **bold,** and ~~struck through.~~ In addition, I can make

* lists
* tables
* `code blocks`
* and Emojis :smile:

## Chapter 1
In chapter 1 I learned that in Java you need to put all of the code you have in file inside {} that appear after a class that has the same name as the file. The name must start with a capital letter. Inside the class you can make multiple methods, each with a name, but the program will always start executing at the class called main. It looks like this, `public static void main(String[] args) {}`. The code for a method goes inside the {}.

In Java, before you can assign a value to a variable, you must declare what datatype that variable will hold. For example, `int x;` will allow you to store whole numbers in the variable x, `double x;` will allow you to hold decimal numbers in x, and `String x;` will allow you to store words in x.

If you want text to appear in the console window you would use `System.out.println("Your message here");` or `System.out.print("Your message here");`. `println` means that the next text to appear will be on the next line down, whereas `print` will allow the next text to appear on the same line. Instead of typing in a message, you can use a variable outside of the quotation marks and the value assigned to the variable will appear. You can even do something like `"message part 1" + variable + "message part 2"` to have the value of the variable appear in the middle of what you wrote.

To get user input you need `import java.util.Scanneer;`at the start of your code file, outside of the class. Before you use the scanner you need to put `Scanner scanner = new Scanner(System.in);` in your method. Use `scanner.nextDouble();` if you need a decimal from the user, `nextInt` if you need a whole number, and `nextLine` if you need a string. After getting all the input you need, you must put `scanner.close();` in your method.

## Chapter 2
In Chapter 2, I learned about variable scope. A variable's scope is the code block in which the variable is declared, that is, between the {} that it is declared in. For example, a variable declared in one method can not be used in another method and a variable declared inside a loop can not be used after the loop ends. This is why variable that get adjusted in a loop are still usually declared before it starts. 

I also learned the difference between primitive and class data types. With primitive data types, such as *__int__*, _**char**_, **_boolean_**, and __*double*__, you can use the arithmetic operators `+ - * / %` to work with the number related data types and the relational operators `== > < >= <=` to compare any of these variables to other variables or literals of the same data type. Class data types, such as *__String__* and _**Bigdecimal**_, use reference variables, where the variable holds the address of a location in memory that holds the data. You should not use the regular operators with these variables, instead you should use methods built into the classes. You would use `varName.multipy(otherBigDecimal);` to multiply BigDecimal values and would use `varName.equals("Some string value");` to check if two strings are the same.

The *__Math__* class was also introduced, which when imported allows you to use other math operations. For example `Math.pow(value1, value2)` will raise the first value to the power of the second value and `Math.sqrt(value)` will take the square root of the value. You can also use `Math.PI` to return the mathematic value of Pi.