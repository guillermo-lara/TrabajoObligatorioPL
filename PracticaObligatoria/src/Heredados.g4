grammar Heredados;


NUM: [0-9]+;
WS: [ \t\n\r] -> skip;
r:exp {System.out.println($exp.value);};
exp returns  [int v] : exp1 exp_p [$exp1.v] {$value = $exp_p.v;};
exp_p [int i] returns [int v]:  '+' exp1 exp_p [$i + $exp1.v] {$value = $exp_p.v;}
    | '-' exp1 exp_p [$i - $exp1.v]{$v = $exp_p.v;}
    | exp1 {$v = $exp1.v;};

exp1 returns [int v] : factor exp1_p [$factor.v]{$v = $exp1_p.v};
exp1_p  [int i] returns [int v]: factor '*' exp1_p [$i *factor.v] {$v = $exp1_p.v;}
    | factor '/' exp1_p [$i / factor.v] {$v = $exp1_p.v;}
    | {$v = $i;};

factor returns [int v]: '(' exp ')' {$v = $exp.v;}| NUM {$v = Integer.parseInt($NUM.text);};
