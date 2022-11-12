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

while {lexeme=yytext(); return Reservada;}
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

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
