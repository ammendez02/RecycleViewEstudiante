package com.example.recycleviewestudiante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Estudiante> estudiantes = null;
    private RecyclerView rv_estudiantes = null;
    private ListaEstudiantesAdapter adaptadorEstudiantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //-------------------------------------------------

    rv_estudiantes = (RecyclerView) findViewById(R.id.rv_estudiantes);

    //-------------------------------------------------

    estudiantes = new ArrayList<Estudiante>();
    estudiantes.add(new Estudiante("dni1", "nombre1", "curso1", "1/1/21", "1:23"));
    estudiantes.add(new Estudiante("dni2", "nombre2", "curso1", "2/1/21", "2:23"));
    estudiantes.add(new Estudiante("dni3", "nombre3", "curso1", "3/1/21", "3:23"));
    estudiantes.add(new Estudiante("dni4", "nombre4", "curso1", "4/1/21", "4:23"));
    estudiantes.add(new Estudiante("dni5", "nombre5", "curso1", "5/1/21", "5:23"));
    estudiantes.add(new Estudiante("dni6", "nombre6", "curso1", "6/1/21", "6:23"));
    estudiantes.add(new Estudiante("dni7", "nombre7", "curso1", "7/1/21", "7:23"));
    estudiantes.add(new Estudiante("dni8", "nombre8", "curso1", "8/1/21", "8:23"));

    //-------------------------------------------------

    adaptadorEstudiantes = new ListaEstudiantesAdapter(this, estudiantes);
    rv_estudiantes.setAdapter(adaptadorEstudiantes);
    rv_estudiantes.setLayoutManager(new LinearLayoutManager(this));

}
}