package org.gabriel.devdojo.poo.classes.enumerate;

public enum FormaDePagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    // Métodos repetidos, porém se comportam diferente para cada Enum
    CREDITO {
      @Override
      public double calcularDesconto(double valor) {
          return valor * 0.05;
      }
    };

    // Na main:
    // FormaDePagamento.DEBITO.calcularDesconto(argumento);
    public abstract double calcularDesconto(double valor);
}
