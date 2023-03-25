# Hospital Package:Contains code from the inheritance lab. I have done the following:

and implement a set of classes that define the employees of a hospital: doctor, nurse,
and surgeon.
1. Implement a parent class HospitalEmployee contains two protected instance
variables: String name and int number. Set up the constructor. Implement the getter and
setter methods for each instance variable. Add the toString method.

2. Add the following method to the parent class:
public void work()
{
System.out.println (name + " works for the hospital.");
}



1.Implement two subclasses: Nurse, and Doctor. Besides the inherited variables, Doctor
has a new instance variable for specialty, Nurse has a new variable numOfPatients.
Implement constructor and override the toString method for these two classes.
2. Now we need to create another class represent surgeon. Consider where you should
put this class in the hierarchy. Besides the inherited variables, this class should have a
new instance variable operating, which indicates the surgeon is on operating or not.
Complete the constructor and toString method for Surgeon class.
3. Now run the tester program Hospital.java provided (Document > Homework >
InheritanceLab.zip). Make sure everything is all good before moving on.


Override the work() method in each of the three subclasses . Besides printing out
that this person works for the hospital, add some more information of this person.
Reference the expected output below:

# Testing: I have done the following:

Part 2 (Implementing Unit Test Using JUnit - JAVA Programming):

Step 1: Download the zip file “CS612JunitTestingLab” JAVA Eclipse project from the
“Homework” folder in Course Documents in Blackboard. Be sure to unzip this project.

Step 2: Open Eclipse in your own VM (the VM that you created in Assignment 1) or your own
desktop installation and import the “CS612JunitTestingLab” project by going to: File > Import
> General > Projects From Folder or Archive. Next, navigate to the directory where you
unzipped the “CS612JunitTestingLab” project and import it.
Step 3: Watch and implement the unit tests created in the video below. The project you just
added to Eclipse contains the class the presenter in the video is testing, you just need to follow
along and implement the unit tests as he implements them in the video.
Step 4: Implement unit tests for the divide() method. Write tests for both positive and negative
test cases. Negative test cases means you are testing method input that could cause an error,
positive test cases means testing method input where the method behaves as expected.
https://www.youtube.com/watch?v=I8XXfgF9GSc
> 
> 
> 

# DOM: Contains java classes to validate XML and XSD Schema

Part 3 XML (Programming - JAVA or Python):


Read the second chapter on XML of Dr. Lixin Tao’s tutorial “htmlXmlTutorial.pdf” to learn XML,
DTD, XML Schema, and XSLT. This pdf can be found in “Documents > Course Materials >
Resources Folder”

● The role of XML in enterprise data integration and presentation-independent data
structure specification

● Well-formedness of XML files, specifying XML dialects with DTD and XML Schema,
namespace, validating XML instance files against their syntax specification with SAX and
DOM technologies; XML file transformation into various forms including HTML

● Create an XML Document. You can model any kind of object you want in this document. ●
Create a Schema to validate your XML document.

● Create a DTD to validate your XML document.

● Create a JAVA or Python based XML DOM parser to parse and validate your XML
document against the Schema.

○ You must use JAVA or Python standard library packages or modules you can not
install and use third party libraries. If I can’t run it you will not get credit for this
part of the assignment.

○ The parser source code file should be named DomParserSchema (if
implemented in JAVA) or dom_parser_schema (if implemented in Python).

● Create a JAVA or Python based XML DOM parser to parse and validate your XML
document against the DTD.

○ You must use JAVA or Python standard library packages or modules you can
not install and use third party libraries.

○ The parser source code file should be named DomParserDTD (if implemented in
JAVA) or dom_parser_dtd (if implemented in Python).
