# Deber 4 · Grupo 3 · patmic poliRETOS
 
Programa en Java, orientado a objetos, que genera **36 series**: 19 numéricas (SN01–SN19) y 17 de caracteres (SC01–SC17). Muestra los primeros `n` términos de cada una, en el orden del enunciado.
 
**Asignatura:** Programación 2 · Escuela Politécnica Nacional
 
## Integrantes
 
| Integrante | Paquete | Series |
|---|---|---|
| Robles.Steven | `pkgSteven` | SN02, SN08, SN10, SC01, SC11, SC16, SC17 |
| Salvatierra.Kleimer | `pkgKleimer` | SC02, SC04, SC06, SC08, SC10, SC12, SC14 |
| Santamaria.Axel | `pkgAxel` | SN01, SN03, SN04, SN05, SN07, SN09, SN11 |
| Silva.Ismael | `pkgIsmael` | SN06, SN12, SN13, SN14, SN15, SN16, SN18 |
| Teran.Camila | `pkgCamila` | SN17, SN19, SC03, SC05, SC07, SC09, SC13, SC15 |
 
```
App  →  GrupoController  →  clases de series de cada integrante
```
 
- **`App`** solo crea el `GrupoController` y llama a sus métodos.
- **`GrupoController`** presenta al grupo, pide `n` (validando que `n > 0` con `do-while`) y llama a las 36 series en orden.
- **Clases de series** (`IsmaelSerie`, `CamilaSerie`, etc.): tienen un método por serie, que recibe `n` como parámetro y usa `for`, `while` o `do-while`.
Además, cada integrante tiene su propio controlador para probar solo sus series.
 
## Convenciones
 
- Nombres en **camelCase**.
- Cada método lleva el prefijo del grupo y el código de la serie: `g3Sn01MostrarFibonacci(int n)`, `g3Sc14MostrarAlfabeto(int n)`.
- Todos los métodos están documentados con **Javadoc**.
## Cómo ejecutar
 
### Visual Studio Code
 
1. Clonar el repositorio:
```bash
   git clone https://github.com/theunknownIS/Deber-4-Grupo-3.git
```
2. Abrir la carpeta `prjDeber4Grupo3` en VS Code, con el *Extension Pack for Java* instalado.
3. Abrir `src/App.java` y pulsar **Run**.
### Terminal
 
```bash
cd prjDeber4Grupo3/src
javac -d ../bin App.java pkg*/*.java
java -cp ../bin App
```
 
Requiere JDK 17 o superior.
 
## Ejemplo de ejecución (n = 5)
 
```
grupo-03
Integrantes:
Robles.Steven
Salvatierra.Kleimer
Santamaria.Axel
Silva.Ismael
Teran.Camila
 
Ingrese un parámetro n (n > 0): 5
 
=== Series numéricas ===
SN01. Fibonacci: 0, 1, 1, 2, 3
SN02. Impares alternados con cero: 1, 0, 3, 0, 5
SN03. Fibonacci sobre impares: 0/1, 1/3, 1/5, 2/7, 3/9
SN04. Fibonacci sobre pares: 0/2, 1/4, 1/6, 2/8, 3/10
SN05. Números primos: 2, 3, 5, 7, 11
SN06. Cuadrados perfectos: 1, 4, 9, 16, 25
SN07. Progresión aritmética: 1, 4, 7, 10, 13
SN08. Progresión aritmética: 3, 8, 13, 18, 23
SN09. Potencias: 2, 4, 8, 16, 32
SN10. Potencias: 3, 9, 27, 81, 243
SN11. Números oblongos: 2, 6, 12, 20, 30
SN12. Triangulares: 1, 3, 6, 10, 15
SN13. Factoriales: 1, 2, 6, 24, 120
SN14. Signos alternos: 1, -2, 3, -4, 5
SN15. Cuadrados desplazados: 0, 2, 8, 18, 32
SN16. Repunidades: 1, 11, 111, 1111, 11111
SN17. Números de Lucas: 2, 1, 3, 4, 7
SN18. Crecientes: 1, 2, 4, 7, 11
SN19. Alternancias: 1, 8, 9, 64, 25
 
=== Series de caracteres ===
SC01. Signos alternados: +, -, +, -, +
SC02. Grupos de signos: +, ++, +++, ++++, +++++
SC03. Grupos de signos: ++, +++, +++++, +++++++, +++++++++++
SC04. Operadores cíclicos: +, -, *, /, +
SC05. Indicador direccional cíclico: \, |, /, -, |
SC06. Letras consecutivas: a, b, c, d, e
SC07. Letra y signo alternados: a, +, c, -, e
SC08. Letras repetidas: aa, bbbb, cccccc, dddddddd, eeeeeeeeee
SC09. Letras repetidas: a, bbb, ccccc, ddddddd, eeeeeeeee
SC10. Letras con repetición: a, bb, ccc, dddd, eeeee
SC11. Grupos de #: ##, ####, ######, ########, ##########
SC12. Vocales repetidas: a, ee, iii, oooo, uuuuu
SC13. Letra repetida creciente: A, BB, CCC, DDDD, EEEEE
SC14. Alfabeto: A, B, C, D, E
SC15. Bloques: *, **, ***, ****, *****
SC16. Alternancia: a, B, c, D, e
SC17. Símbolos: +, -, *, /, %
```
 
## Flujo de trabajo en Git
 
- `main`: versión estable, a la que solo se integran cambios mediante Pull Request.
- Una rama por integrante (`axel`, `camila`, `ismael`, `kleimer`, `steven`), con un commit por serie.
- Las fotos del análisis de cada serie están en `analisis/<integrante>Evidencia/`.
## Versiones
 
| Versión | Descripción |
|---|---|
| [v1.0](https://github.com/theunknownIS/Deber-4-Grupo-3/releases/tag/v1.0) | Las 36 series funcionan; se muestran agrupadas por integrante. |
| [v2.0](https://github.com/theunknownIS/Deber-4-Grupo-3/releases/tag/v2.0) | Se agrega `GrupoController`: las series se muestran en orden y se valida `n > 0`. |
