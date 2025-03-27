#!/bin/bash

# Compile all Java files
javac src/main/java/com/example/abstractfactory/*.java
javac src/main/java/com/example/builder/*.java
javac src/main/java/com/example/factory/logistics/*.java
javac src/main/java/com/example/factory/transport/*.java
javac src/main/java/com/example/prototype/*.java
javac src/main/java/com/example/singleton/*.java

# Run each main class and print output to console
echo "Running AbstractFactoryDemo..."
java -cp src/main/java com.example.abstractfactory.AbstractFactoryDemo

echo "Running HouseBuilderDemo..."
java -cp src/main/java com.example.builder.HouseBuilderDemo

echo "Running LogisticsDemo..."
java -cp src/main/java com.example.factory.logistics.LogisticsDemo

echo "Running PrototypeDemo..."
java -cp src/main/java com.example.prototype.PrototypeDemo

echo "Running SingletonDemo..."
java -cp src/main/java com.example.singleton.SingletonDemo
