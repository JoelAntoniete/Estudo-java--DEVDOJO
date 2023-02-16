package Aula80ate83.Dominio;

public enum TipoPagamento{
        DEBITO{
            @Override
            public double calcularDescondo(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDescondo(double valor) {
            return valor * 0.05;
        }
    };


    public abstract double calcularDescondo(double valor);
    /*
    Para criarmos metodos nas enumeracoes, basta criarmos um metodo que seja abstrado ou de modelo
    e sobreescrever ele dentro dos enums usando as chaves
     */
    }