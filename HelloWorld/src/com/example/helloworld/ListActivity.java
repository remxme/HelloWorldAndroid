package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ListActivity extends Activity {
	private List<Map<String, Object>> data;
	private ListView listView;
	private SimpleAdapter adapt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		data = new ArrayList<Map<String, Object>>();
		Map<String, Object> val = new HashMap<String, Object>();
		for (int i = 0; i < 10; i++) {
			val.put("name", "daimon" + i);
			val.put("age", 32);
			data.add(val);
		}

		adapt = new SimpleAdapter(this, data, R.layout.listview_row,
				new String[] { "name", "age" },
				new int[] { R.id.name, R.id.age });
		listView = (ListView) findViewById(R.id.listview);
		listView.setAdapter(adapt);
	}

}
