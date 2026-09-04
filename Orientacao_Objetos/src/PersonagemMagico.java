public class PersonagemMagico {

        //Atributos
        String nome;
        String poderMagico;
        int nivelEnergia;

        HabilidadeEspecial habilidade;

        public PersonagemMagico() {
        }

        //Construtor exige a inclusão de um nome
        public PersonagemMagico(String nome) {
                this.nome = nome;
        }
        public void atacar(String ataque) {
                if (nivelEnergia >= 10) {
                        System.out.println(nome + " realizou um ataque: " + ataque + "!");
                        nivelEnergia -= 10;
                } else {
                        System.out.println(nome + " esta sem energia para atacar.");
                }
        }
        public int aumentarEnergia(int energia) {
                nivelEnergia = nivelEnergia + energia;
                return nivelEnergia;
        }

        public void ativarHabilidadeEspecial(){
                if(!habilidade.ativa){
                   System.out.println("Habilidade especial não esta ativada.");
                } else if (nivelEnergia >= habilidade.custoEnergia){
                        System.out.println("Ativando habilidade: " + habilidade.nomeHabilidade);
                        nivelEnergia -= habilidade.custoEnergia;
                } else {
                        System.out.println(nome + "está sem energia para a habilidade especial");
                }
        }
}



