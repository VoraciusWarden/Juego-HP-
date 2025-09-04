# 🎮 Videojuego Harry Potter – Patrón Strategy

Este proyecto implementa el **Patrón de Diseño Strategy** en un videojuego inspirado en la saga de Harry Potter.  
Cada personaje puede lanzar un hechizo, y con el uso de **Strategy** es posible **cambiar el hechizo de los personajes en tiempo de ejecución**.

---

## 📂 Estructura del Proyecto

```
juego/
├── hechizos/
│   ├── Hechizo.java
│   ├── WingardiumLeviosa.java
│   ├── Expelliarmus.java
│   ├── ExpectoPatronum.java
│   └── OculusReparo.java
├── personajes/
│   └── Personaje.java
└── main/
    └── Main.java
```

---

## ▶️ Ejecución

### Desde la terminal
Ubícate en la carpeta raíz (`HP/`) y ejecuta:

------------------------------------------------

javac juego/main/Main.java
java juego.main.Main

------------------------------------------------


### Desde VS Code
1. Asegúrate de tener instalada la **extensión Java**.  
2. Usa el archivo ".vscode/launch.json" para configurar la ejecución.  
3. Presiona **Run** en `Main.java` y el programa se ejecutará.

   ## ⚙️ Configuración en VS Code

Si usas **Visual Studio Code**, puedes crear la carpeta ".vscode/" en la raíz del proyecto  
y dentro un archivo llamado "launch.json" con el siguiente contenido:


{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "java",
      "name": "Ejecutar Main",
      "request": "launch",
      "mainClass": "juego.main.Main",
      "projectName": "HP"
    }
  ]
}


## 📌 Salida esperada

```
Harry Potter lanza: ¡Expecto Patronum! Un guardián mágico aparece.
-> Harry cambia de hechizo a Expelliarmus
Harry Potter lanza: ¡Expelliarmus! El oponente pierde su varita.

Ron Weasley lanza: ¡Expelliarmus! El oponente pierde su varita.
-> Ron cambia de hechizo a Wingardium Leviosa
Ron Weasley lanza: ¡Wingardium Leviosa! Un objeto empieza a volar.

Hermione Granger lanza: ¡Wingardium Leviosa! Un objeto empieza a volar.
-> Hermione cambia de hechizo a Oculus Reparo
Hermione Granger lanza: ¡Oculus Reparo! Los anteojos dañados se reparan instantáneamente.
```
--------------------------------
## 📖 Diagrama UML :
<img width="719" height="430" alt="image" src="https://github.com/user-attachments/assets/7ee97790-c3d0-4d1a-ab81-5c869008420b" />


