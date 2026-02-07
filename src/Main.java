import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descriação Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descriação Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descriação Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlves = new Dev();
        devAlves.setNome("Alves");
        devAlves.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por Alves:" + devAlves.getConteudosInscritos());
        devAlves.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por Alves:" + devAlves.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por Alves:" + devAlves.getConteudosConcluidos());
        System.out.println("XP:" + devAlves.calcularTotalXP());

        System.out.println("-*-*-*-*-*-");
        Dev devEster = new Dev();
        devEster.setNome("Ester");
        devEster.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por Ester:" + devEster.getConteudosInscritos());
        devEster.progredir();
        devEster.progredir();
        devEster.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por Ester:" + devEster.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por Ester:" + devAlves.getConteudosConcluidos());
        System.out.println("XP:" + devEster.calcularTotalXP());


    }
}