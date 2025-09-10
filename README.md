# VentanaBienvenida
# 🖥️ Reto Práctico 01 – Ventana de Bienvenida con Mensaje Emergente

Este proyecto implementa una aplicación de escritorio en **Java Swing** que muestra una ventana de bienvenida con un botón.  
Al hacer clic en el botón, se solicita al usuario su nombre y se muestra un saludo personalizado.  
Incluye soporte básico para español e inglés según la configuración regional del sistema.  

---

## 🚀 Características
- Ventana principal con título **"Bienvenid@"**.  
- Botón **"Mostrar saludo"** para iniciar la interacción.  
- Uso de **`JOptionPane`** para solicitar el nombre y mostrar el saludo.  
- Validación de entradas vacías y manejo de cancelación.  
- **Internacionalización básica**: mensajes en español o inglés según `Locale`.  
- Color de fondo personalizado en la ventana.  
- Posibilidad de añadir un ícono (`icon.png`) a la aplicación.  

---

## 📂 Estructura del código
El proyecto contiene las siguientes clases:

- **`MainApp`** → Punto de entrada del programa. Configura el Look & Feel y lanza la ventana.  
- **`WelcomeFrame`** → Ventana principal con el botón de saludo e integración del ícono.  
- **`GreetingService`** → Lógica de validación, internacionalización y generación del saludo.  

---

## 📥 Requisitos
- **Java JDK 8** o superior (se recomienda JDK 17 o 21).  
- IDE como **IntelliJ IDEA** o simplemente línea de comandos con `javac` y `java`.  

---

## ▶️ Ejecución

### Opción 1: Desde IntelliJ IDEA
1. Clonar este repositorio.  
2. Abrir el proyecto en IntelliJ.  
3. Asegurarse de tener configurado un **Project SDK** (Java 8+).  
4. Colocar el archivo `icon.png` en la carpeta `resources` (marcada como *Resources Root* en IntelliJ).  
5. Ejecutar la clase `MainApp`.  

### Opción 2: Desde terminal
Compilar y ejecutar desde la carpeta raíz del proyecto:

```bash
javac -d out src/*.java
java -cp out MainApp
