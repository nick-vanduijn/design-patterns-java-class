#!/bin/zsh

find src -name "*.java" -exec javac -cp src {} \;
echo "Run main demonstration:"
java -cp src patterns.PatternRunner