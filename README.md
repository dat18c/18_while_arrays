# 20_while_arrays

## Opsamling på konvertering af klasssediagram
Uddannelse -> Student til kode

## While loops
``````
int i=0;
while (i<10)
{
  System.out.println(i);
  i++;
}
``````
gør det samme som
```````
for (int i=0;i<10;i++)
{
  System.out.println(i);
}
```````
Ofte skal vi have en løkke, der kører til en betingelse er opfyldt - vi ved bare ikke hvor længe.
```````
boolean run = true;
while (run)
{
  //gør noget
  if (betingelse) //når en eller anden betingelse er opfyldt
  {
    run = false;
  }
}
```````
Et eksempel er at finde mindste divisor...

### øvelser
primtalsfaktorisering med while. Brug f.eks. (tal % i != 0) i while-sætningen. Hvis tal efter while-løkken er det samme som i (løkkevariablen), så er det et primtal. Husk at lægge en til i for hver iteration.
```````
int = 2;
tal = ...
while (tal % i !=0)
{
  i++;
}
//test om det er et primtal
```````
Er 113 et primtal? Er 117?

Selvcheck problem 2

Exercises 1 og 2

## Planlægning af næste uges studier

## Arrays
Erklære
``````
<type>[] <navn> = new <type>[<størrelse>];
int[] tal = new int[10];
``````
Læse array
```````
mitTal = tal[7];
```````
Skrive til array
```````
tal[7] = mitTal;
```````
nyttige metoder
```````
import java.util.Arrays;
...
boolean ligMed = Arrays.equals(array1, array2); // sammenligner indholdet af array1 og array2
String tekst = Arrays.toString(array1); // giver indholdet af array1 formateret som liste, kan f.eks. bruges ved println
Arrays.sort(tal); // sorterer tal i stigende orden
```````
### Øvelse
Brug arrays til at styre Student1, 2 og 3 i Skole.

Grav evt. bilforhandleren op og gør plads til 10 biler i forretningen (eller hundekennelen).

Lav array med forskellige tal.
Gå baglæns igennem et array (fra sidste til første) og skriv indholdet ud.
