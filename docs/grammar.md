$$
\begin{align}
    [\text{Prog}] &\to [\text{Stmt}]^* \\
    [\text{Stmt}] &\to
    \begin{cases}
        \text{exit}([\text{Expr}]); \\
        \text{printRaw}([\text{Expr}]); \\
        \text{int}\space\text{ident} = [\text{Expr}];
    \end{cases} \\
    [\text{Expr}] &\to
    \begin{cases}
        [\text{Term}] \\
        [\text{BinExpr}]
    \end{cases} \\
    [\text{BinExpr}] &\to
    \begin{cases}
    [\text{Expr}] * [\text{Expr}] & \text{prec} = 1 \\
        [\text{Expr}] + [\text{Expr}] & \text{prec} = 0 \\
    \end{cases} \\ 
    [\text{Term}] &\to
    \begin{cases}
        \text{int}\_\text{lit} \\
        \text{ident}
    \end{cases}
\end{align}
$$
