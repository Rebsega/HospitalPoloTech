import pessoa.funcionario.Funcionario;
import pessoa.funcionario.atendente.Atendente;
import pessoa.funcionario.medico.Cirurgiao;
import pessoa.funcionario.medico.ClinicoGeral;
import pessoa.funcionario.medico.Neuro;
import pessoa.paciente.Paciente;
import pessoa.tipoPessoaEnum.TipoPessoaEnum;
import sala.Sala;
import sala.atendimento.Atendimento;
import sala.espera.SalaEspera;
import sala.tipoSalaEnum.TipoSalaEnum;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String nome = "";

    private static Atendente cadastroAtendente() {
        System.out.println("Cadastro de atendente");
        System.out.println("Digite o nome do atendente");
        nome = scanner.nextLine();
        Atendente atendente = new Atendente("1", nome, true, TipoPessoaEnum.ATENDENTE);
        System.out.println("Atendente cadastrado com sucesso");
        return atendente;
    }

    private static Paciente cadastroPaciente() {
        System.out.println("Cadastro de paciente");
        System.out.println("Digite o nome do paciente");
        nome = scanner.nextLine();
        Paciente paciente = new Paciente("A", nome, TipoPessoaEnum.PACIENTE);
        paciente.setSintomas(Arrays.asList("Dor de cabeça", "Dor de barriga"));
        SalaEspera salaEspera = new SalaEspera();
        salaEspera.acrescentaListaEspera(paciente);
        return paciente;
    }

    private static Object cadastroMedico() {
        System.out.println("Cadastro de médico");
        System.out.println("1 - Cirurgião\n2 - Clínico geral\n3 - Neuro");
        int opcaoMedico = scanner.nextInt();
        System.out.println("Digite o nome do médico");
        nome = scanner.nextLine();
        switch (opcaoMedico) {
            case 1:
                return cadastroCirurgiao(nome);
            case 2:
                return cadastroClinicoGeral(nome);
            case 3:
                return cadastroNeuro(nome);
            default:
                System.out.println("Erro interno"); return null;
        }
    }

    /**
     * TIPOS DE MÉDICOS
     **/
    private static Cirurgiao cadastroCirurgiao(String nome) {
        System.out.println("Cadastro de cirurgião");
        return new Cirurgiao("2", nome, false, TipoPessoaEnum.MEDICO, "Cirurgião geral");
    }

    private static ClinicoGeral cadastroClinicoGeral(String nome) {
        System.out.println("Cadastro de clínico geral");
        return new ClinicoGeral("3", nome, false, TipoPessoaEnum.MEDICO, "Clínico geral");
    }

    private static Neuro cadastroNeuro(String nome) {
        System.out.println("Cadastro de neuro");
        return new Neuro("4", nome, false, TipoPessoaEnum.MEDICO, "Neuro");
    }

    /**
     * TIPOS DE MÉDICOS
     **/

    private static Object cadastroSala() {
        System.out.println("Cadastro de sala");
        System.out.println("1 - Sala de espera\n2 - Sala de cirurgia\n3 - Sala de exames");
        int opcaoSala = scanner.nextInt();
        switch (opcaoSala) {
            case 1:
                return cadastroSalaEspera();
            case 2:
                return cadastroSalaCirurgia();
            case 3:
                return cadastroSalaExames();
            default:
                System.out.println("Erro interno"); return null;
        }
    }

    /**
     * TIPOS DE SALAS
     **/
    private static Sala cadastroSalaEspera() {
        System.out.println("Cadastro de sala de espera");
        return new Sala("S-1", TipoSalaEnum.ESPERA, false);
    }

    private static Sala cadastroSalaCirurgia() {
        System.out.println("Cadastro de sala de cirurgia");
        return new Sala("S-2", TipoSalaEnum.CIRURGIA, false);
    }

    private static Sala cadastroSalaExames() {
        System.out.println("Cadastro de sala de exames");
        return new Sala("S-3", TipoSalaEnum.EXAME, false);
    }

    /**
     * TIPOS DE SALAS
     **/


    public static void main(String[] args) {
        int opt;
        do {
            System.out.println("Cadastro de pessoas");
            System.out.println("1 - Cadastro de atendente\n2 - Cadastro de paciente\n3 - Cadastro de médico\n4 - Cadastro de sala");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastroAtendente();
                    break;
                case 2:
                    cadastroPaciente();
                    break;
                case 3:
                    cadastroMedico();
                    break;
                case 4:
                    cadastroSala();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja continuar? 1 - Sim 2 - Não");
            opt = scanner.nextInt();
        } while (opt != 2);
        System.out.println("Iniciar atendimento? 1- Sim 2 - Não");
        int opcaoAtendimento = scanner.nextInt();
        if (opcaoAtendimento == 1) {
            System.out.println("Iniciando atendimento");
            Atendimento atendimento = new Atendimento();
            try {
                equals(Objects.requireNonNull(cadastroMedico()), Object.class);
                equals(Objects.requireNonNull(cadastroSala()), Object.class);
            } catch (Exception e) {
                System.out.println("Erro interno");
            }
            /**Valida se os objetos são iguais antes de dar cast**/
            atendimento.iniciarAtendimento(cadastroAtendente(), cadastroPaciente(), (Funcionario) cadastroMedico(), (Sala) cadastroSala());
        } else {
            System.out.println("Encerrando sistema");
        }
    }

    public static boolean equals(Object ob1, Object ob2) {
        return ob1.getClass() == ob2.getClass();
    }
}
