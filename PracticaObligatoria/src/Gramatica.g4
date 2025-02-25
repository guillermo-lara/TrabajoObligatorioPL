grammar Gramatica;

axioma:(ID|CONSTINT|CONSTREAL|CONSTLI|COMENTARIO1L|COMENTARIOVL)+;

ID: [a-no-zA-NO-Z][a-no-zA-NO-Z0-9_]+{};
CONSTINT:('+'|'-')? [0-9]+{};
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|(('e'|'E')('+'|'-')?)|'.'[0-9]+ (('e'|'E')('+'|'-')?)) [0-9]+{};
CONSTLI:('\'')([a-no-zA-NO-Z.,_0-9]+ ('\''))+ ('\'') {};
COMENTARIO1L: ('{') [~\n]+ ('}') {}; // No debe reconocer saltos de lineas
COMENTARIOVL: ('*') [~*]+ ('*') {};

