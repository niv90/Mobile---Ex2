package shenkar.ac.il.ex_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TaskListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        String[] task = {"Task1", "Task2" ,"Task3", "Task4" ,"Task5", "Task6",
                         "Task7", "Task8" ,"Task9", "Task10" ,"Task11", "Task12",
                         "Task13", "Task14" ,"Task15", "Task16" ,"Task17", "Task18",
                         "Task19", "Task20"} ;

        ListAdapter listAdapter = new CustomAdapter(this,task);
        ListView listView = (ListView) findViewById(R.id.myListView);
        listView.setAdapter(listAdapter);

    }

    public void addTask(View view)
    {
        Intent intent = new Intent(this, CreateTaskActivity.class);
        startActivity(intent);

    }


}
