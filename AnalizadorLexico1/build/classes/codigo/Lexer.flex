package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
NumCerrado |
Decimal |
VOF |
Car |
Cond |
Conds |
Mientras |
Ciclar |
Hacer |
este |
devolver |

while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"EQU" {return Igual;}
"MAS" {return Suma;} 
"MENOS" {return Resta;}
"POR" {return Multiplicacion;}
"ENTRE" {return Division;}
"Y" {return And;}
"O" {return Or;}
"DIF" {return DiferenteQue;}
"MAY" {return MayorQue;}
"MEN" {return MenorQue;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
