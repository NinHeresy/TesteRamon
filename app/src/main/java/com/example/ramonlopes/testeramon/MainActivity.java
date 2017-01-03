package com.example.ramonlopes.testeramon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ramonlopes.testeramon.escola.Aluno;
import com.example.ramonlopes.testeramon.escola.SimplesAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ListView lista;
    ArrayAdapter<Aluno> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Aluno> alunos = new  ArrayList<Aluno>();

        for (int i = 0; i < 3; i ++){
            Aluno aluno = new Aluno();
            aluno.setNomeAluno("Ramon");
            aluno.setListProfMateria("Carla");
            aluno.setMateriaAluno("Portugues");

            alunos.add(aluno);
        }

        lista = (ListView)findViewById(R.id.list);
        lista.setAdapter(new SimplesAdapter(this,alunos));


        /*List<Aluno> alun = criarAlunos();
        adapter = new ArrayAdapter<Aluno>(this,android.R.layout.simple_list_item_1,alun);
        lista.setAdapter(adapter); */

    }
    /*
    public List<Aluno> criarAlunos(){
        List<Aluno> lista = new ArrayList<Aluno>();
        lista.add(criarAluno("Ramon","Masculino","Portugues","Carla",27,01));
        return lista;
    }
    private Aluno criarAluno(String nomeAluno, String sexoAluno, String materiaAluno, String listProfMateria, int idadeAluno, int codigoAluno) {
        Aluno student = new Aluno(nomeAluno,sexoAluno,materiaAluno,listProfMateria,idadeAluno,codigoAluno);
        return student;
    }*/
}
