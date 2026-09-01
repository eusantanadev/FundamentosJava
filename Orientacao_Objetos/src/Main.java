public class Main{
    public static void main(String[] args){
        //Criando um objeto do tipo Personagem Magico
        PersonagemMagico mago = new PersonagemMagico();
        //Atribuindo valores aos atributos do objeto
        mago.nome = "Gandolf";
        mago.nivelEnergia = 100;
        mago.poderMagico = "Magia";
        //Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);
        //Instanciando outro objeto do tipo PersonagemMagico
        PersonagemMagico elfo = new PersonagemMagico();
        elfo.nome = "Legolas";
        elfo.nivelEnergia = 50;
        elfo.poderMagico = "Arqueira";
        //Exibindo valores dos atributos do objeto
        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.poderMagico);
    }
}