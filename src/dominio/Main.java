package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreveBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Diogo: " + devDiogo.getConteudosInscritos());
        devDiogo.progredir();
        devDiogo.progredir();
        System.out.println(".");
        System.out.println("Conteúdos Inscrito Diogo: " + devDiogo.getConteudosInscritos());
        System.out.println("Conteúdos Concluído Diogo: " + devDiogo.getConteudosConcluidos());
        System.out.println("XP: " + devDiogo.calcularTotalXp());

        System.out.println(".............");

        Dev devVictor = new Dev();
        devVictor.inscreveBootcamp(bootcamp);
        devVictor.setNome("Victor");
        System.out.println("Conteúdos Inscrito Victor: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println(".");
        System.out.println("Conteúdos Inscrito Victor: " + devVictor.getConteudosInscritos());
        System.out.println("Conteúdos Concluído Victor: " + devVictor.getConteudosConcluidos());
        System.out.println("XP: " + devVictor.calcularTotalXp());



    }
}
