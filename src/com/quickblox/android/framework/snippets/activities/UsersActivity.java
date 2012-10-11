package com.quickblox.android.framework.snippets.activities;

import android.app.Activity;
import android.os.Bundle;
import com.quickblox.android.framework.snippets.R;
import com.quickblox.android.framework.snippets.SnippetsList;
import com.quickblox.android.framework.snippets.modules.SnippetsUsers;

/**
 * User: Oleg Soroka
 * Date: 02.10.12
 * Time: 09:38
 */
public class UsersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snippets_list);

        SnippetsUsers snippets = new SnippetsUsers(this);
        SnippetsList list = (SnippetsList) findViewById(R.id.list);
        list.initialize(snippets);
    }
}
