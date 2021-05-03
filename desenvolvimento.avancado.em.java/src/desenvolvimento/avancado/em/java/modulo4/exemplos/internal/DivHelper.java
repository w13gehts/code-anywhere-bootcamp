package desenvolvimento.avancado.em.java.modulo4.exemplos.internal;

import desenvolvimento.avancado.em.java.modulo4.exemplos.Operacao;

public class DivHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
