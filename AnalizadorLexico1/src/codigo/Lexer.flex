package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]+
D=[0-9]+
S=[¡!]
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%

BLANCO |
GRISCLARO |
GRIS |
NEGRO |
ROJO |
ROSA |
NARANJA |
AMARILLO |
VERDE |
FUSCIA |
AZULTURQ |
AZUL 
{lexeme=yytext(); return Constante;}

C |
CAD |
SZ |
Z |
R |
Q |
D |
VOF |
Cond |
Conds |
Mientras |
Ciclar |
Hacer |
Este |
Devolver |
CHANGE |
v |
f |
ROMPER |
PU |
PR |
PRO |
nuevo |
PAQUETE |
OPCION
{lexeme=yytext(); return Reservada;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"EQU" {lexeme=yytext();return Igual;}
"MAS" {lexeme=yytext();return Suma;} 
"MENOS" {lexeme=yytext();return Resta;}
"POR" {lexeme=yytext();return Multiplicacion;}
"ENTRE" {lexeme=yytext();return Division;}
"Y" {lexeme=yytext();return And;}
"O" {lexeme=yytext();return Or;}
"DIF" {lexeme=yytext();return DiferenteQue;}
"MAY" {lexeme=yytext();return MayorQue;}
"MEN" {lexeme=yytext();return MenorQue;}
"MAS1" {lexeme=yytext();return Incremento;}
"MEN1" {lexeme=yytext();return Decremento;}

"¡¡" {lexeme=yytext();return DosPuntos;}
"!!" {lexeme=yytext();return fin_de_sentencia;}

"<(" {lexeme=yytext();return Abrir_Bloque_De_Instruccion;}
")>" {lexeme=yytext();return Cerrar_Bloque_De_Instruccion;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
