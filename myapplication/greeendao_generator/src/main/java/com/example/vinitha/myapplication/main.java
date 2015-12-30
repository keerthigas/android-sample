package com.example.vinitha.myapplication;

import java.io.IOException;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

//import javax.swing.text.html.parser.Entity;

public class main {
    public static void main(String args[]) throws Exception
    {

        Schema schema=new Schema(1,"com.example.vinitha.myapplication.db");
        Entity program= schema.addEntity("Program");
        program.addIdProperty();
        program.addStringProperty("name");
        program.addDateProperty("begindate");
        DaoGenerator dg=new DaoGenerator();
        dg.generateAll(schema,"./app/src/main/java");






    }
}
