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

## Chapter 3
Chapter 3 talked about the `if, else if, else` structure, which I already knew from a previous course, but it also introduced the switch statement. You form a switch statement like this:
```
switch(variable){
    case value1:
        do this ...
        break;
    case value2:
        do this ...
        break;
    etc.
    .
    .
    default:
        do this ...
}
```
The switch statement checks the value of the variable and preforms the code in the case that corresponds with that value. If non of the values match, the default runs. This allows you to avoid needing to do something like `if...else if...else if...else if...else` .

We discussed the **for loop**, which only runs a certain number of times, the **while loop**, which only runs if a condition is true but continues running until the condition is not true, and the **do-while loop**, which always runs at least once and then runs again if the condition is true. If you want to start the next round of the loop without preforming the rest of the code in the loop, use `continue;`. If you want to end the loop early, use `break;`. `continue` and `break` should go inside an if or switch statement within the loop.

## Chapter 4
In chapter 4 I learned about __*classes*__. I have also been learning about classes in the __*.NET*__ course I am taking, and there are some differences between it and Java. In Java, we have been putting multiple classes in a single file. Only one of these classes is allowed to be declared as `public`, and that is the class that has the same name as the file. This may be possible in .NET, but in that course we have only been making one class per file and putting a `using` statement at the top of any file that needs to use the class from that file.
 
A class is a template for creating an object, and thus should include fields, a.k.a. instance variables, to hold values that will be specific to the object that gets created. There must be a constructor, which is a method with the same name as the class, that gets called when an object is created to give values to the fields. There should also be getter and setter methods for these variables, which you form like this:
 
```Java
public returntype getInstanceVariableName(){
    return instanceVariableName;
}
 
public void setInstanceVariableName(datatype parameterName){
    // some validation code
    this.instanceVariableName = parameterName;
}
```
 
In .NET we can simply use a property like:
 
```C#
public datatype PropertyName{ get; set; }
```
 
There are also methods that use the values stored in the fields, as well as arguments provided for the method's parameters from where the method was called, to either do something or return a value to wherever the method was called from. When defining a method, you must specify the return type before the method's name, void if there is no return.
 
More than one object can be made from the same class. For example, a car is a type of thing, but your car is a specific instance of that type of thing. Car would be a class and your car would be an object.

## Chapter 5
In chapter 5 I learned about arrays, which can hold multiple values of the other data types, such as ints, doubles, strings, and even objects of a types that you have created yourself. However, you can only store one type of data in a single array.

There are a couple of ways to declare an array. One way is to assign the values that will be stored in the array immediately, like this:

`int[] myArray = {value1, value2, value3};`

The other way is to specify how many values can be stored in the array, like this:

`int[] myArray = new int[3];`

The number inside the second pair of [] is the number of values that can be stored in the array. After an array is created, you can not change the number of values that the array holds, although you can change a value held in one of the positions.

To use or change the value at a specific index of an array you would use `arrayName[x]`, where x is the index of the value you want. The first value is at index `0`, and the last value is at index `arrayName.length - 1`. You will often see people use `for(int i = 0; i < myArray.length; i++)` to loop as many times as there are elements in the array and use i as an index to use the current value of interest. You can also use a for-each loop, like this `for(datatype currentValue : myArray)`, to loop through each value in the array, with each iteration of the loop assigning the next value in the array to currentValue.

Chapter 5 also showed other methods that can be used on strings, including, but not limited to, `length()` which gives the number of characters in the string (use length without () to get the number of values in an array), `charAt(index)` which gives the character at the specified index of the string, `indexOf(anotherString)` which gives the index of the first time the other string appears in the string, and `compareTo(anotherString)` which gives the integer value that is the difference between the first character of each string. If `compareTo` returns a negative value, the first string comes alphabetically before the other, and vice versa.

## Final Project User Stories
- As a **LEGO collector**, I want to **add a LEGO set to a display shelf** so that I can **look at them and show them to visitors**. (MVP)
- As a **LEGO collector**, I want to **change the order of displayed LEGO sets** so that I can **put them in a more appealing layout**. (Stretch goal)
- As a **LEGO collector**, I want to **replace a LEGO set** so that I can **display the sets I most want to display at the time**. (Stretch goal because could be done without special method, just would take more than one step)
- As a **LEGO collector**, I want to **remove a LEGO set form display** so that I can **make room for a set that I want to display but am not ready to yet**. (MVP)
- As a **LEGO collector**, I want to **show the information about the sets I am displaying** so that **visitors can see what they are**. (MVP)
- As a **LEGO collector**, I want to **update the data associated with certain sets if the data is wrong** so that I can **make sure the data is accurate**. (MVP)
- As a **LEGO collector**, I want to **sort my LEGO sets by name, series, set number, or number of pieces**. (MVP)
- As a **LEGO collector**, I want to **make custom builds by combining pieces from multiple LEGO sets** so that I can **show my creativity**. (stretch goal)
- As a **LEGO collector**, I want to **find the total number of LEGO pieces on the display shelf**. (stretch goal)


## Class Diagram

| +LegoSet |
| -------- |
| -name: String<br>-setNumber: int<br>-numberOfPieces: int|
| <\<create>> +LegoSet()<br> <\<create>> +LegoSet(name: String, setNumber: int, numberOfPieces: int)<br> +getName(): String<br> +setName(name: String): void<br> -validateName(name: String): void<br> +getSetNumber(): int<br> +setSetNumber(setNumber: int): void<br> -validateSetNumber(setNumber: int): void<br> +getNumberOfPieces(): int<br> +setNumberOfPieces(numberOfPieces: int): void<br> -validateNumberOfPieces(numberOfPieces: int): void<br> +toString(): String<br> +compareTo(other: LegoSet): int|