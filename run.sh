#!/bin/bash

echo "🔨 Compilando el proyecto..."
javac -d out $(find src -name "*.java")

if [ 0 -eq 0 ]; then
    echo "🚀 Ejecutando el programa..."
    java -cp out com.example.main.Main
else
    echo "❌ Error en la compilación"
fi
