package patternsBuilder;

import modelo.Casa;

public interface IBuilderCasa {
    void buildQuartos();
    void buildBanheiros();
    void buildChurrasqueira();
    Casa getCasa();
}
