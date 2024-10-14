@echo off
javac .\*.java -cp antlr-4.13.1-complete.jar
java -cp ".;antlr-4.13.1-complete.jar" main codiFont.txt
echo -----------------------------------------------
java fitxerquecalexecutar
