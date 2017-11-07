
TESTCLASS=StackTest \
	  QueueTest

build:
	mkdir -p bin/
	javac -sourcepath src/ -d bin/ src/*.java

test: build
	javac -cp bin/:/home/${USER}/lib/junit-4.12.jar \
		-sourcepath test/ -d bin/ test/*.java
	java -cp bin/:/home/${USER}/lib/junit-4.12.jar:/home/${USER}/lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore ${TESTCLASS} | tee TestReport.txt

run: build
	java -cp bin/ Main

.PHONY: clean test

clean:
	rm bin/*.class
