package shenkar.ac.il.ex_2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context,String[] task)
    {
        super(context,R.layout.custom_row,task);

    }

    @Override
    public View getView(int position, View overview,ViewGroup parent)
    {
        LayoutInflater listInflater = LayoutInflater.from(getContext());
        View customView = listInflater.inflate(R.layout.custom_row, parent, false);

        String singleTask = getItem(position);
        TextView listView = (TextView) customView.findViewById(R.id.listTextView);

        listView.setText(singleTask);
        return customView;
    }


}

