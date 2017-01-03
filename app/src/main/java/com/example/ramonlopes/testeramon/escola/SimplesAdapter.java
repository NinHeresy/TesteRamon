package com.example.ramonlopes.testeramon.escola;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ramonlopes.testeramon.R;

import java.util.ArrayList;

/**
 * Created by Ramon Lopes on 03/01/2017.
 */

public class SimplesAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Aluno> aluno;


    //construtor da classe
    public SimplesAdapter(Context context, ArrayList<Aluno> aluno) {
        this.context = context;
        this.aluno = aluno;
    }

    @Override
    public int getCount() {
        return aluno.size();
    }

    @Override
    public Object getItem(int position) {
        return aluno.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Aluno student = aluno.get(position);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.activity_list,null);

        TextView nomeAluno = (TextView)layout.findViewById(R.id.textAluno);
        nomeAluno.setText(student.getNomeAluno());

        TextView nomeProf = (TextView)layout.findViewById(R.id.textProf);
        nomeAluno.setText(student.getListProfMateria());

        TextView nomeMat = (TextView)layout.findViewById(R.id.textMat);
        nomeAluno.setText(student.getMateriaAluno());

        return layout;
    }
}
