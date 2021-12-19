# Mock and Spy
The intent of this project is demonstrate the use of Mock and Spy.

# Definition 
[1] Mock - Mock object replace mocked class entirely, returning recorded or default values. You can create mock out of "thin air". This is what is mostly used during unit testing.

[2] Spy - When spying, you take an existing object and "replace" only some methods. This is useful when you have a huge class and only want to mock certain methods (partial mocking)

## How to run
```bash
mvn clean test
```

### Run the JaCoCo
```bash
mvn jacoco:report
```

## Class diagram
<kbd>
 <img src="https://raw.githubusercontent.com/luizgustavocosta/mock-spy/master/static/ClassDiagram.png">
</kbd>

## Stack
* Java 11
* JUnit 5
* Maven 3.8.4
## More about
Go to the Medium article

## References
1. [Mock](https://stackoverflow.com/questions/12827580/mocking-vs-spying-in-mocking-frameworks)
2. [Spy](https://stackoverflow.com/questions/12827580/mocking-vs-spying-in-mocking-frameworks)