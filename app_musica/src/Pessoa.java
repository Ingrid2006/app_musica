public abstract class Pessoa {
        private String nome;
        private String nacionalidade;
        private int idade; 


        public String getNome() {
                return this.nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getNacionalidade() {
                return this.nacionalidade;
        }

        public void setNacionalidade(String nacionalidade) {
                this.nacionalidade = nacionalidade;
        }

        public int getIdade() {
                return this.idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

}
