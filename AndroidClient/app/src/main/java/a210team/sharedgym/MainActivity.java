package a210team.sharedgym;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import a210team.sharedgym.Fragment.FirstFragment;
import a210team.sharedgym.Fragment.SecondFragment;
import a210team.sharedgym.Frame.AppFragmentPageAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.mainValue)
    ViewPager mcContainer;

    private List<Fragment> fragmentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // butter knife injection
        ButterKnife.bind(this);

        fragmentList = new ArrayList<>();
        fragmentList.add(new FirstFragment());
        fragmentList.add(new SecondFragment());

        mcContainer.setAdapter(new AppFragmentPageAdapter(getSupportFragmentManager(),fragmentList));
    }
}
