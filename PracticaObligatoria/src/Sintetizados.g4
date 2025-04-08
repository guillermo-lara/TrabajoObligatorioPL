grammar Sintetizados;

NUM: [0-9]+;
WS: [ \t\n\r] -> skip;
r:exp {System.out.println($exp.value);};
exp returns  [int value] : exp1 '+' exp {$value = $exp1.v + $exp.value;}
    | exp1 '-' exp {$value = $exp1.v - $exp.value;}
    | exp1 {$value = $exp1.v;};

exp1 returns [int v] : NUM '*' exp1 {$v = Integer.parseInt($NUM.text) * $exp1.v;}
    | NUM '/' exp1 {$v = Integer.parseInt($NUM.text) / $exp1.v;}
    | NUM {$v = Integer.parseInt($NUM.text);};


// el returns sirve para indicar que es un valor heredado
// para evitar problemas de recursion por la derecha usaremos atributos heredados y factorizaremos
// un ejemplo:
//          exp: exp1 exp_p;
//          exp_p: '+' exp1 exp_p | '-' exp1 exp_p | ;
//



