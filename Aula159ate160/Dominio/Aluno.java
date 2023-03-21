package Aula159ate160.Dominio;

import java.io.*;

public class Aluno implements Serializable {
    private long id;
    private String nome;
    private transient String password; //quando não queremos que um dado seja serializado, temos que por ao atributo tranzsent
    private transient Turma turma;

    /*
    Sabemos que nao conseguimos serializar turma porque ela nao é uma classe com Serializable, logo pra
    instruirmos o java a fazer isso, primeiro colocamos turma como transient, assim é possivel serializa-la,
    depois precisamos escrer metodos pra mostrar como serializar e como deserializar
     */

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject(); //primeiro salvamos da forma padrao
            oos.writeUTF(turma.getNome()); //depois escrevemos apenas a String com os dados de turma
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject(); //primeiro vamos ler o que foir esccrito no default
            String nomeTurma = ois.readUTF();//depois lemos o que foi serializado depois
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ",turma='" + turma + '\'' +
                '}';
    }



}
