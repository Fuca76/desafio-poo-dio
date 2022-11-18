import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("descrição curso java");
        curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescriçao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescriçao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudoInscritos()) ;

    devCamila.progredir();
    devCamila.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudoInscritos())  ;
    System.out.println("Conteudos Concluídos Camila : " + devCamila.getConteudosConcluidos());
    System.out.println("XP :" + devCamila.calcularTotalXp());

    System.out.println("-------");

    Dev devTais = new Dev();
    devTais.setNome("Taís");devTais.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Taís : " + devTais.getConteudoInscritos());

    devTais.progredir();
    devTais.progredir();
    devTais.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos Taís : " + devTais.getConteudoInscritos());
    System.out.println("Conteudos Concluídos Taís : " + devTais.getConteudosConcluidos());
    System.out.println("XP :" + devTais.calcularTotalXp());
    System.out.println("-------");
    }
}