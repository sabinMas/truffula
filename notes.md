# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
The App.java class is the entry point to the program. The project itself seems to take command-line arguments to show hidden files or turn off color. The main method in this should create multiple options under an object called TruffulaOptions. Those options will then be passed to TruffulaPrinter and call printTree to display the directory tree.


## ConsoleColor.java
ConsoleColor goes and creates an enum storing colors as ANSI codes which can change the texts color within a terminal. The RESET value goes and resets all the color changes made. The getCode and toString methods both return the stored code so it can be used as a variable. 

## ColorPrinter.java / ColorPrinterTest.java

## TruffulaOptions.java / TruffulaOptionsTest.java

## TruffulaPrinter.java / TruffulaPrinterTest.java

## AlphabeticalFileSorter.java