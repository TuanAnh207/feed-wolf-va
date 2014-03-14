package com.example.tracnghiemdaihocvatly;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.widget.ExpandableListView;

public class HomeMainActivity extends Activity {
	// more efficient than HashMap for mapping integers to objects
	SparseArray<Group> groups = new SparseArray<Group>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity_main);
		createData();
		ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
		MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
				groups);
		listView.setAdapter(adapter);
	}

	public void createData() {
		String[] myStringArray = { "Toan", "Ly", "Hoa", "Anh", "Sinh" };
		for (int j = 0; j < 5; j++) {
			Group group = new Group(myStringArray[j]);
			for (int i = 0; i < 5; i++) {
				group.children.add("Chuyen de " + i);
			}
			groups.append(j, group);
		}
	}

}