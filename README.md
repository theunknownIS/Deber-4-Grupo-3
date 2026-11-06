# Deber 4 · Grupo 3 · patmic poliRETOS

Programa en Java, orientado a objetos, con dos partes:

- **Parte 1 – Series:** 36 series (19 numéricas, SN01–SN19, y 17 de caracteres, SC01–SC17). Muestra los primeros `n` términos de cada una, en el orden del enunciado.
- **Parte 2 – poliRETOS:** 60 ejercicios en 6 categorías: figuras, cadenas, arrays, loading, recursión y autómatas.

Además, cada integrante tiene su **tarea individual de herencia** en la carpeta `tareaIndividual/`.

**Asignatura:** Programación 2 · Escuela Politécnica Nacional

## Integrantes

| Integrante | Series (parte 1) | Ejercicios (parte 2) |
|---|---|---|
| Robles.Steven | SN02, SN08, SN10, SC01, SC11, SC16, SC17 | F05, F10, F15, C05, C09, A05, L05, L10, L12, R05, GA05, GA08 |
| Salvatierra.Kleimer | SC02, SC04, SC06, SC08, SC10, SC12, SC14 | F04, F09, F14, F19, C04, A04, L04, L09, L11b, R04, R06, GA04 |
| Santamaria.Axel | SN01, SN03, SN04, SN05, SN07, SN09, SN11 | F01, F06, F11, F16, C01, C06, A01, L01, L06, R01, GA01, GA06 |
| Silva.Ismael | SN06, SN12, SN13, SN14, SN15, SN16, SN18 | F03, F08, F13, F18, C03, C08, A03, L03, L08, L11a, R03, GA03 |
| Teran.Camila | SN17, SN19, SC03, SC05, SC07, SC09, SC13, SC15 | F02, F07, F12, F17, C02, C07, A02, L02, L07, R02, GA02, GA07 |

## Estructura del repositorio

```
Deber-4-Grupo-3/
├── prjDeber4Grupo3/              Proyecto principal (VS Code)
│   └── src/
│       ├── App.java
│       ├── pkgGrupo/              GrupoController y Utilidades
│       ├── pkgSteven/ pkgKleimer/ pkgAxel/ pkgIsmael/ pkgCamila/   Series (parte 1)
│       ├── pkgFiguras/            F01 – F19
│       ├── pkgCadenas/            C01 – C09
│       ├── pkgArrays/             A01 – A05
│       ├── pkgLoading/            L01 – L12 (incluye L11a y L11b)
│       ├── pkgRecursion/          R01 – R06
│       └── pkgAutomatas/          GA01 – GA08
├── analisis/                     Fotos del análisis de cada integrante
└── tareaIndividual/              Tarea individual de herencia de cada integrante
```

## Diseño

```
App  →  GrupoController  →  Utilidades        (lectura y validación de datos)
                         →  clases de series  (parte 1)
                         →  XController       →  ejercicios (parte 2)
```

- **`App`** solo crea el `GrupoController` y llama a sus métodos en orden: presentación, lectura de datos, series y ejercicios.
- **`GrupoController`** presenta al grupo, pide todos los datos usando `Utilidades`, los guarda en atributos y se los entrega a las series y a cada controller.
- **`Utilidades`** reúne todos los métodos de lectura por consola (`leerParametroN`, `leerEntero`, `leerTexto`, `leerVocal`, etc.). Usa el mismo `Scanner` de `GrupoController`, así hay un solo lector de consola en todo el programa.
- **Clases de series** (`IsmaelSerie`, `CamilaSerie`, etc.): tienen un método por serie, que recibe `n` como parámetro. Cada integrante tiene además su propio controlador para probar solo sus series.
- **Controllers de la parte 2** (`FigurasController`, `CadenasController`, `ArraysController`, `LoadingController`, `RecursionController` y `AutomatasController`): cada uno recibe los datos de su bloque y ejecuta sus ejercicios en orden, con su código y nombre.

## Datos que se piden al inicio

Todos los datos se piden **antes** de ejecutar cualquier serie o ejercicio. Si un dato no es válido, se muestra un `ERROR` y se vuelve a pedir.

| Dato | Validación | Lo usan |
|---|---|---|
| `n` de las series | Entero mayor a 0 | SN01 – SC17 |
| Tamaño/niveles de las figuras | Entero mayor a 0 | F01 – F19 |
| Frase | No vacía | C01 – C07, C09 |
| Vocal | a, e, i, o, u | C03 |
| Letra | Una letra | C04 |
| Nombre completo | Al menos nombre y apellido | A01 – A05, L08, L09 |
| Porcentaje de cada palabra del nombre | Entre 0 y 100, uno por palabra (máximo 4) | A01 |
| Tamaño de la matriz de iniciales | Entero mayor o igual a 3 | A02 |
| Carácter de la matriz | Un carácter | A02 |
| Carácter de carga | Un carácter | L02, L03 |
| Cantidad de barras de sonido | Entero mayor a 0 | L11b |
| `n` de recursión | Entero mayor o igual a 0 | R01, R05, R06 |
| Números `a` y `b` | Cualquier entero | R02, R03, R04 |
| Una cadena por autómata | La valida cada autómata | GA01 – GA08 |

> **Única excepción: C08 (anagramas).** Pide los intentos durante su ejecución, porque el usuario necesita ver primero la palabra elegida al azar.

## Validaciones de la parte 1

### Entrada de `n`

| Entrada | Respuesta del programa |
|---|---|
| `abc`, `3.5`, `99999999999` | `ERROR: abc no es un número entero positivo.` y vuelve a pedir |
| `0`, `-4` | `ERROR: n debe ser mayor a cero` y vuelve a pedir |
| Entero mayor a 0 | Continúa |

### Límite por serie

Cada método revisa si su tipo de dato soporta el `n` ingresado. Si no lo soporta, muestra un aviso en lugar de la serie y el programa **continúa con las demás**:

```java
final int limite = 20;
if (n > limite) {
    System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
    return;
}
```

| Serie | Máximo n | Motivo |
|---|---|---|
| SN13 | 20 | 21! supera el máximo de `long` (2^63 − 1) |
| SC06, SC07, SC08, SC09, SC10, SC13, SC14, SC16 | 26 | El alfabeto tiene 26 letras |
| SN10 | 39 | 3^40 supera el máximo de `long` |
| SN17 | 45 | El término 46 de Lucas supera el máximo de `int` (2^31 − 1) |
| SN09 | 62 | 2^63 no cabe en `long` |
| SN01, SN03, SN04 | 93 | El término 94 de Fibonacci supera el máximo de `long` |
| SN19 | 1 291 | 1292^3 supera el máximo de `int` |
| SN15 | 32 768 | 2n² supera el máximo de `int` |
| SN06 | 46 340 | n² supera el máximo de `int` |
| SN12 | 65 535 | n(n+1)/2 supera el máximo de `int` |
| SN18 | 65 536 | El término supera el máximo de `int` |

Las demás series (SN02, SN05, SN07, SN08, SN11, SN14, SN16, SC01–SC05, SC11, SC12, SC15 y SC17) no necesitan límite.

## Convenciones

- Nombres en **camelCase**.
- Cada método de una serie o ejercicio lleva el prefijo del grupo y su código: `g3Sn01MostrarFibonacci(int n)`, `g3F08DibujarEscaleraAscendente(int n)`, `g3C08JugarAnagrama(Scanner scanner)`.
- Los controllers y las utilidades no llevan el prefijo, igual que `leerParametroN()`.
- Los ejercicios reciben sus datos por parámetro; no leen de la consola (salvo C08).
- Todo el código está documentado con **Javadoc**, sin comentarios en línea.

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

Requiere JDK 17 o superior. En la consola de Windows, si las tildes se ven como `?`, ejecutar `chcp 65001` antes de correr el programa.

> El bloque de loading dura alrededor de un minuto, por las pausas de sus 13 animaciones.

## Ejemplo de ejecución

### Presentación y datos

```
grupo-03
Integrantes:
Robles.Steven
Salvatierra.Kleimer
Santamaria.Axel
Silva.Ismael
Teran.Camila

Ingrese un parámetro n (entero mayor a 0): 5

=== Parámetros de figuras ===
Ingrese el tamaño/niveles de las figuras (entero mayor a 0): 4
=== Parámetros de cadenas ===
Ingrese una frase: ballena azul
Ingrese una vocal: a
Ingrese una letra: l
=== Parámetros de arrays y loading ===
Ingrese su nombre completo (nombre y apellido): Ismael Silva
Ingrese el porcentaje de carga de Ismael (0 a 100): 100
Ingrese el porcentaje de carga de Silva (0 a 100): 50
Ingrese el tamaño de la matriz de iniciales (entero mayor o igual a 3): 5
Ingrese el carácter de la matriz: *
Ingrese el carácter de carga: #
Ingrese la cantidad de barras de sonido (entero mayor a 0): 10
=== Parámetros de recursión ===
Ingrese n para el factorial y los conteos (entero mayor o igual a 0): 5
Ingrese el número a: 3
Ingrese el número b: 4
=== Parámetros de autómatas ===
Ingrese una cadena para GA01 (a*b+c): aabbc
...
Ingrese una clave para GA08: Clave123
```

### Parte 1 (n = 5)

```
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

### Parte 2 (extracto)

```
=== Figuras ===
F01. Cuadrado hueco:
* * * *
*     *
*     *
* * * *
...
=== Cadenas de caracteres ===
C01. Contar vocales: tiene 5 vocales
C03. Eliminar la vocal a: b llen   zul
C05. Invertida con vocales en mayúsculas: lUzA AnEllAb
...
=== Arrays ===
A01. Barras de carga por palabra:
[==============>] 100% Ismael
[=======>       ] 50% Si
A02. Matriz con las iniciales:
Iniciales: IS
*****   *****
  *     *
  *     *****
  *         *
*****   *****
...
=== Recursión ===
R01. Factorial: 5! = 120
R02. Suma: La suma de 3 y 4 es: 7
R03. Multiplicación: 3 * 4 = 12
R04. Potencia: 3^4 = 81
R05. Conteo progresivo: 1, 2, 3, 4, 5
R06. Conteo regresivo: 5, 4, 3, 2, 1, 0

=== Autómatas ===
GA01. a*b+c: aabbc -> aceptada
GA02. ab+ca: abbca -> aceptada
GA03. a+/b+/c+: aaa -> aceptada
GA04. 1+/0+1*: 0011 -> aceptada
GA05. Número decimal: 3.14 -> aceptada
GA06. Declaración de variables: edad; -> aceptada
GA07. Palabras reservadas: for( -> aceptada
GA08. Validador de clave: Clave123 -> aceptada
```

## Tareas individuales de herencia

Cada integrante modeló una jerarquía de clases del reino animal y vegetal (flora y fauna) con herencia, a partir de su propio diagrama UML.

| Integrante | Carpeta | Paquete | Análisis / UML |
|---|---|---|---|
| Robles.Steven | `tareaIndividual/stevenInd` | `pkgHerencia` | `Analisis/` |
| Salvatierra.Kleimer | `tareaIndividual/kleimerInd` | `pkgDeberAnimales` | Imágenes `Analisis_Tarea_Individual*.jpeg` |
| Santamaria.Axel | `tareaIndividual/axellnd` | `pkgHerencia` | `evidencias/` |
| Silva.Ismael | `tareaIndividual/ismaelInd` | `seresVivos` | `imagenesUML/` |
| Teran.Camila | `tareaIndividual/camilaInd` | `pkgHerencia` | `Analisis/` |

## Flujo de trabajo en Git

- `main`: versión estable, a la que solo se integran cambios mediante Pull Request.
- Una rama por integrante (`axel`, `camila`, `ismael`, `kleimer`, `steven`), con un commit por serie o ejercicio.
- Para cambios puntuales se crean ramas por tarea a partir de `main` (por ejemplo `limites-camila`, `parte2-ismael` o `ismael-individual`).
- Las fotos del análisis de cada integrante están en `analisis/<integrante>Evidencia/`.

## Versiones

| Versión | Descripción |
|---|---|
| [v1.0](https://github.com/theunknownIS/Deber-4-Grupo-3/releases/tag/v1.0) | Las 36 series funcionan; se muestran agrupadas por integrante. |
| [v2.0](https://github.com/theunknownIS/Deber-4-Grupo-3/releases/tag/v2.0) | Se agrega `GrupoController`: las series se muestran en orden y se valida `n > 0`. |
| [v3.0](https://github.com/theunknownIS/Deber-4-Grupo-3/releases/tag/v3.0) | Validación de entrada (solo enteros mayores a 0, con mensajes de error) y cada serie valida su propio límite de tipo de dato. |
