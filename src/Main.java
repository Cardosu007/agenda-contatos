public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 992179851);
        agendaContatos.adicionarContato("Contato 2", 991179852);
        agendaContatos.adicionarContato("Contato 3", 993179853);
        agendaContatos.adicionarContato("Contato 4", 994179854);
        agendaContatos.adicionarContato("Contato 5", 995179855);
        agendaContatos.adicionarContato("Contato 6", 996179856);
        agendaContatos.adicionarContato("Contato 7", 997179857);

        agendaContatos.exibirContatos();

    }
}