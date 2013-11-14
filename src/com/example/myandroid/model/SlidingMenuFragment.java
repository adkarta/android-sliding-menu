package com.example.myandroid.model;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.example.myandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arman.d
 * Date: 14/11/13
 * Time: 09:32
 * To change this template use File | Settings | File Templates.
 */
public class SlidingMenuFragment extends Fragment implements ExpandableListView.OnChildClickListener {

    private String TAG = "SlidingMenuFragment";

    private ExpandableListView sectionListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Section> sectionList = createMenu();

        View view = inflater.inflate(R.layout.slidingmenu_fragment, container, false);
        this.sectionListView = (ExpandableListView) view.findViewById(R.id.slidingmenu_view);
        this.sectionListView.setGroupIndicator(null);

        SectionListAdapter sectionListAdapter = new SectionListAdapter(this.getActivity(), sectionList);
        this.sectionListView.setAdapter(sectionListAdapter);

        this.sectionListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });

        this.sectionListView.setOnChildClickListener(this);

        int count = sectionListAdapter.getGroupCount();

        for (int position = 0; position < count; position++) {
            this.sectionListView.expandGroup(position);
        }

        return view;
    }

    private List<Section> createMenu() {
        List<Section> sectionList = new ArrayList<Section>();

        Section oDemoSection = new Section("Demos");
        oDemoSection.addSectionItem(101, "List/Detail (Fragment)", "ic_navigation_accept");
        oDemoSection.addSectionItem(102, "Airport (AsyncTask)", "ic_navigation_back");

        Section oGeneralSection = new Section("General");
        oGeneralSection.addSectionItem(201, "Settings", "ic_navigation_cancel");
        oGeneralSection.addSectionItem(202, "Rate this app", "ic_navigation_collapse");

        sectionList.add(oDemoSection);
        sectionList.add(oGeneralSection);

        return sectionList;
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

        switch ((int) id) {
            case 101:
                Log.i(TAG, "Menu 101 called.");
                break;
            case 102:
                Log.i(TAG, "Menu 102 called.");
                break;
            case 201:
                Log.i(TAG, "Menu 201 called.");
                break;
            case 202:
                Log.i(TAG, "Menu 201 called.");
                break;
        }

        return false;
    }
}
