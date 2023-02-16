## Unit testing with maven, mockito, parameterized test and jacoco report
***

### Libraries & Tools
> **JDK**: <em>16.0.2</em><br/>
> **IntelliJ IDEA**: <em>17.0.5</em><br/>
> **Maven**: <em>3.8.1</em><br/>
> **JUnit5-Jupiter-Engine**: <em>5.9.2 - Testing Framework</em><br/>
> **Junit-jupiter-params**: <em>5.9.2 - Parameterized tests enables us to execute a single test method multiple times with different parameters.</em><br/>
> **Junit-bom**: <em>5.9.2 - is JUnit's Bill Of Materials (BOM). When including this BOM, it will ensure to align and manage all JUnit 5 dependency versions</em><br/>
> **Mockito**: <em>5.1.1- Framework allows the creation of test double objects (mock objects)</em><br/>
> **Jacoco**: <em>0.8.7 - Plugin provides code coverage metrics for Jav</em><br/>
> **Surefire**: <em>3.0.0-M7 -  used during the test phase of the build lifecycle to execute the unit tests of an application.</em><br/> 

### Test scenario
1) Write unit tests for Feline, Cat, Lion, Alex classes
2) Generate the jacoco test coverage report

### Run Tests and Jacoco report

>1) Double click ctrl<br/>
>2) Enter "mvn test"<br/>
>3) Double click ctrl<br/>
>4) Enter "mvn verify"<br/>

**There are two ways to open the jacoco report**

1) The jacoco report in the html page

After that the folder "target" will be created. Find file "index.html".

>target -> site -> index.html

Click the right mouse button

> index.html -> Open In -> Browser -> Chrome

![img.png](src/test/java/resources/img.png)

![img.png](src/test/java/resources/img_2.png)

***
2) The jacoco report in the IntelliJ IDEA

>1) CTRL + ALT + F6<br/>
>2) Click to "+" button (Add Insert)<br/>
>3) Choose the file "jacoco.exec" in the "target" package and click to OK

![img.png](src/test/java/resources/img_3.png)
>4) Click to "Show Selected" button

![img.png](src/test/java/resources/img_4.png)

![img.png](src/test/java/resources/img_5.png)