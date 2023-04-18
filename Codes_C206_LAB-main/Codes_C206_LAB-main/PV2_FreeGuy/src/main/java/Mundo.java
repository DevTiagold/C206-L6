public class Mundo {
        private String nome;
        Personagem[] personagems= new Personagem[10];

        public Mundo(String nome) {
                this.nome = nome;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
}

