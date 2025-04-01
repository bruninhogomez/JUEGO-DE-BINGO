# JUEGO-DE-BINGO (Kotlin)

## Roles y Responsabilidades:
1. **Product Owner**
    - Define los requisitos del juego.
    - Crea y prioriza el Product Backlog (lista de características del juego).
    - Asegura que el equipo comprenda las funcionalidades del producto.
    - Valida que el desarrollo cumpla con las expectativas.

2. **Scrum Master**
    - Facilita las reuniones diarias (Daily Stand-ups).
    - Resuelve bloqueos o impedimentos del equipo.
    - Asegura que el equipo siga la metodología Scrum.

3. **Development Team (Desarrolladores y Diseñadores)**
    - Implementa las funcionalidades del juego según el Sprint Backlog.
    - Divide las tareas y trabaja en cada funcionalidad.
    - Hace pruebas para garantizar el correcto funcionamiento del juego.

## Estructura del Proyecto y Asignación de Tareas:

📂 **JUEGO-DE-BINGO/** _(Directorio principal)_  
│  
├── 📂 **docs/** _(Documentación del proyecto)_  
│   ├── 📄 **product-backlog.md** → Product Owner: Lista priorizada de funcionalidades.  
│   ├── 📄 **sprint-backlog.md** → Scrum Master y Equipo: Lista de tareas del sprint.  
│   ├── 📄 **manual-usuario.md** → Product Owner: Explicación de cómo jugar.  
│  
├── 📂 **src/** _(Código fuente del juego en Kotlin)_  
│   ├── 📄 **Main.kt** → Desarrollador 1: Lógica principal del juego.  
│   ├── 📄 **BingoCard.kt** → Desarrollador 2: Generación y validación de cartones.  
│   ├── 📄 **GameLogic.kt** → Desarrollador 3: Reglas del juego y extracción de números.  
│   ├── 📄 **UI.kt** → Diseñador/Desarrollador 4: Interfaz gráfica del juego.  
│  
├── 📂 **tests/** _(Pruebas del sistema)_  
│   ├── 📄 **TestBingoCard.kt** → Tester: Pruebas unitarias para la generación de cartones.  
│   ├── 📄 **TestGameLogic.kt** → Tester: Pruebas para la lógica del juego.  
│  
├── 📄 **README.md** → Scrum Master: Descripción general del proyecto y cómo ejecutarlo.  
├── 📄 **build.gradle.kts** → Desarrollador 1: Configuración del proyecto con Gradle Kotlin DSL.  
├── 📄 **settings.gradle.kts** → Configuración adicional del proyecto.  
├── 📄 **.gitignore** → Desarrollador 2: Archivos que no deben subirse al repositorio.  
└── 📄 **gradlew / gradlew.bat** → Scripts para compilar y ejecutar el proyecto.