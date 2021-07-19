# JAVA

_Compendio de ejercicios de las guias JAVA._

## Guia 5.0 🚀

_La guía 5.0 contiene la introducción al lenguaje JAVA; Estructuras Condicionales (If/Else - Switch) - Estructuras Repetitivas (While - Do/while - for) ._ 

### ESTRUCTURA DE UN PROGRAMA JAVA
```
package primerprograma;

public class HolaMundo {

    public static void main (String[] args) { 
    
        System.out.println("Hola Mundo");
        
    }
}
```
## Estructuras Condicionales
### Sintaxis de if
```
if(<condición>){
    <sentencias>
}
```
### Sintaxis de if / else
```
if(<condición>){
    <sentencias A>
} else {
    <sentencias B>
}
```
### Sintaxis de if anidado
```
if (<condicion1>) {
    <sentencias A>
} else if(<condicion2>){
    <sentencias B>
} else {
    <sentencias C>
}
```
### Sintaxis de Switch
```
switch(<variable>) {
  case <valor1>:
      <sentencias1>
  break;
  case <valor2>:
      <sentencias2>
  break;
  default:
      <sentencias3>
}
```
## Estructuras Repetitivas
### Sintaxis de While
```
while (<condición>) {
     <sentencias>
}
```
### Sintaxis de Do / while
```
do {
    <sentencias>
} while (<condición>);
```
### Sintaxis de for
```
for (<inicialización>; <terminación>; <incremento>) {
      <sentencias>
}
```
## Como generar números aleatorios con el método Math.random de Java

Por defecto sería, Math.random(), con este método podemos generar números aleatorios, en principio seria entre 0 y 1, pero esto lo podemos cambiar para que genere un número entre un rango que nosotros deseemos. Para generar un número entre 0 y el número que deseemos, debemos escribir *num_deseado, por ejemplo:
```
Math.random()*30
```
esto genera números entre 0 y 30, este último no se incluye, el máximo sería 29,9999…

Para generar un número entre un número que deseemos a otro, debemos escribir *(num_minimo-num_maximo)+num_maximo, por ejemplo:
```
Math.random()*(5-20)+20
```
Un buen truco, para recordar esto es multiplicar por 0 para saber el mínimo y por 1 para el máximo. Por ejemplo, en el ejemplo anterior, el mínimo seria 5, ya que 0*(5-20)+20 daría como resultado 5, y el máximo seria 20, ya que 1*(20-5)+5 daría como resultado 20. Por último, haremos que el número generado sea un número entero en lugar de uno de coma flotante, para ello escribimos:
```
(int)Math.floor(Math.random()*(num_maximo-num_minimo)+num_minimo).
```
