package Parte16Concorrencia.Dominio;

public class Discount {
    public enum Code{
        NOME(0), DISCOUNT1 (5), DISCOUNT2(10), DISCOUNT3(15);
        private final int porcentagem;

        Code(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }
}
