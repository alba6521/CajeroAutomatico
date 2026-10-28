# CajeroAutomatico
## 🎯 Objetivos

- Desarrollar una aplicación de consola en Kotlin que simule un cajero automático.
- Practicar variables, estructuras condicionales, bucles y menús interactivos.
- Validar los datos introducidos por el usuario para evitar errores.
- Controlar la salida del programa de forma correcta.

## 🛠️ Tecnologías

- Kotlin
- IntelliJ IDEA
- JDK 17 o superior

## 📋 Requisitos

### Funcionalidades

- **Saldo inicial:** el programa empieza con 500.0 € guardados en una variable que se actualiza con cada operación.
- **Menú principal:** se repite con un bucle `while` hasta que el usuario elige salir.
- **Consultar saldo:** muestra el saldo actual.
- **Ingresar dinero:** solo acepta cantidades mayores que cero y las suma al saldo.
- **Retirar dinero:** solo acepta cantidades mayores que cero y que no superen el saldo.
- **Salir:** finaliza el programa con un mensaje de despedida.

### Validaciones

- Opciones de menú no válidas (números fuera de 1-4, letras o entrada vacía).
- Ingresos de importe cero o negativo.
- Retiradas de importe cero o negativo.
- Retiradas superiores al saldo disponible (`Error: saldo insuficiente.`).
- Importes que no son un número válido (se acepta coma o punto decimal).

## 📟 Menú

```
===== CAJERO AUTOMÁTICO =====
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Seleccione una opción:
```


## 📁 Estructura

```
UD01_Actividad05_CajeroAutomatico/
├── src/main/kotlin/Main.kt
└── README.md
```
