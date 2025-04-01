# JUEGO-DE-BINGO

## Roles y Responsabilidades: 
1.	Product Owner
    •	Define los requisitos del juego.
    •	Crea y prioriza el Product Backlog (lista de características del juego).
    •	Asegura que el equipo comprenda las funcionalidades del producto.
    •	Valida que el desarrollo cumpla con las expectativas.

2.	Scrum Master
    •	Facilita las reuniones diarias (Daily Stand-ups).
    •	Resuelve bloqueos o impedimentos del equipo.
    •	Asegura que el equipo siga la metodología Scrum.

3.	Development Team (Desarrolladores y Diseñadores)
    •	Implementa las funcionalidades del juego según el Sprint Backlog.
    •	Divide las tareas y trabaja en cada funcionalidad.
    •	Hace pruebas para garantizar el correcto funcionamiento del juego.


## Estructura del Proyecto y Asignación de Tareas:

📂 JUEGO-DE-BINGO/ (Directorio principal)
│
├── 📂 docs/ (Documentación del proyecto)
│   ├── 📄 product-backlog.md → Product Owner: Lista priorizada de funcionalidades.
│   ├── 📄 sprint-backlog.md → Scrum Master y Equipo: Lista de tareas del sprint.
│   ├── 📄 manual-usuario.md → Product Owner: Explicación de cómo jugar.
│
├── 📂 src/ (Código fuente del juego)
│   ├── 📄 main.py → Desarrollador 1: Lógica principal del juego.
│   ├── 📄 bingo_card.py → Desarrollador 2: Generación y validación de cartones.
│   ├── 📄 game_logic.py → Desarrollador 3: Reglas del juego y extracción de números.
│   ├── 📄 ui.py → Diseñador/Desarrollador 4: Interfaz gráfica del juego.
│
├── 📂 tests/ (Pruebas del sistema)
│   ├── 📄 test_bingo_card.py → Tester: Pruebas unitarias para la generación de cartones.
│   ├── 📄 test_game_logic.py → Tester: Pruebas para la lógica del juego.
│
├── 📄 README.md → Scrum Master: Descripción general del proyecto y cómo ejecutarlo.
├── 📄 requirements.txt → Desarrollador 1: Librerías necesarias para el proyecto.
└── 📄 .gitignore → Desarrollador 2: Archivos que no deben subirse al repositorio.