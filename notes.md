# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
The App.java class is the entry point to the program. The project itself seems to take command-line arguments to show hidden files or turn off color. The main method in this should create multiple options under an object called TruffulaOptions. Those options will then be passed to TruffulaPrinter and call printTree to display the directory tree.


## ConsoleColor.java
ConsoleColor goes and creates an enum storing colors as ANSI codes which can change the texts color within a terminal. The RESET value goes and resets all the color changes made. The getCode and toString methods both return the stored code so it can be used as a variable. 

## ColorPrinter.java / ColorPrinterTest.java
ColorPrinter prints text to a private PrintStream using the current ConsoleColor. The current color can be changed by setCurrentColor then print to display the text. I think the unfinished method print(String message, boolean reset) should print the current color code, print the message and also print ConsoleColor.RESET so it resets the terminal text. 

ColorPrinterTest looks like standard JUnit testing whcih checks to see if ColorPrinter.println() prints the colored text correctly as well as reset the color afterward. The ByteArrayOutputSteam is a new concept to me and I will be learning what that is through this process. 

## TruffulaOptions.java / TruffulaOptionsTest.java
TruffulaOptions is where all the logic will be held for storing the user's settings. It will determine which folders to print and whether hidden files should be included or if the text should be a different color. Its where private final File root, private final boolean showHidden, and private final boolean useColor are located. 

TruffularOptionsTest is another JUnit test file the helps verify the TruffulaOptions(String[] args) constructor is correctly reading the command-line arguments and saves the proper color and hidden file settings. 


## TruffulaPrinter.java / TruffulaPrinterTest.java
TruffulaPrinter is the main class which builds and prints the file tree, it takes in teh user's TruffulaOptions as well as ColorPrinter to format the text to the console. It recursively goes and visits every folder inside the chosen root.                                      

TruffulaPrinterTest is another Junit test file which creates a temporary folder system and then calls TruffulaPrinter to print the same folder structure. It also checks the OS of the system its being ran on before moving forward. 

## AlphabeticalFileSorter.java
