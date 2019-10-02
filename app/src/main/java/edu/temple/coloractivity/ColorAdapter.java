package edu.temple.coloractivity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * CIS 3515 - Lab 3 Color Activity
 * Toi Do 9/27/2019
 */
public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colors;


public ColorAdapter(Context context, String[] colors){
    this.colors = colors;
    this.context = context;
}

    @Override
    public int getCount() {
        return colors.length;
    }
    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        String colorValue = colors[position];

        if (view == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView) view;
        }

        textView.setTextSize(20); //set the font size
        textView.setText(colorValue); //display color name in its position
        textView.setBackgroundColor(Color.parseColor(colors[position])); //set the back ground color according to color position

        return textView;
    }

}
