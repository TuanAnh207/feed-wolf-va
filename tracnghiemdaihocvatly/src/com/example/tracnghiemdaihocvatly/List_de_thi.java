package com.example.tracnghiemdaihocvatly;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_de_thi extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		String[] values = new String[] { "De 1", "De 2", "De 3",
				"De 4", "De 5 ", "De 6", "De 7 ", "De 8",
				"De 9", "De 10" };
		// use your custom layout
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.row_layout, R.id.de, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
}