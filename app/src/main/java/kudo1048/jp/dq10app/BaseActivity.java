package kudo1048.jp.dq10app;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kudo.toshiya on 2015/07/20.
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * ActionBarのHome Buttonを有効にします。
     */
    protected final void setHomeAsUpEnabled(boolean state) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(state);
            actionBar.setHomeButtonEnabled(state);
            actionBar.setDisplayShowHomeEnabled(state);
        }
    }


    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        switch (name) {

            case "SwitchCompat":
                return new SwitchCompat(context, attrs);
            case "RecyclerView":
                return new RecyclerView(context, attrs);
            case "ViewPager":
                return new ViewPager(context,attrs);

        }

        return super.onCreateView(parent, name, context, attrs);
    }

}
