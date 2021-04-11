# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#types)

## Types

<table>
<thead>
<tr>
<th align="center" colspan="8">Java Primitives</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center" colspan="4">Whole</td>
<td align="center" colspan="2">Floating</td>
<td align="center">Boolean</td>
<td align="center">Character</td>
</tr>
<tr>
<td align="center">byte</td>
<td align="center">short</td>
<td align="center">int</td>
<td align="center">long</td>
<td align="center">float</td>
<td align="center">double</td>
<td align="center">boolean</td>
<td align="center">char</td>
</tr>
<tr>
<td align="center">8 bits</td>
<td align="center">16 bits</td>
<td align="center">32 bits</td>
<td align="center">64 bits</td>
<td align="center">32 bits</td>
<td align="center">64 bits</td>
<td align="center"></td>
<td align="center">16 bits</td>
</tr>
<tr>
<td align="center">127</td>
<td align="center">32K</td>
<td align="center">2.1E9</td>
<td align="center">9.2E18</td>
<td align="center">3.4E38</td>
<td align="center">1.7E308</td>
<td align="center">true/false</td>
<td align="center">65K chars</td>
</tr>
<tr>
<td align="center">127</td>
<td align="center">32K</td>
<td align="center">two point one times ten to the nineth power</td>
<td align="center">nine point two times ten to the eighteenth power</td>
<td align="center">three point four times ten to the thirty eighth power</td>
<td align="center">one point seven times ten to the three hundred and eighth power</td>
<td align="center">true/false</td>
<td align="center">65K chars</td>
</tr>          
</tbody>
</table>


### int
````java
int someInt = 10_000_000;
````

### String
Uninitialized has a default value **null**

### double
````java
double someDouble = 32.16;

double someDouble = 32.16d;

double someDouble = 32.16D;

double someDouble = 2.1E12;

double someDouble = 75; //Becomes 75.0
        
double someDouble = .3;

double someDouble = 4.0f;
````
