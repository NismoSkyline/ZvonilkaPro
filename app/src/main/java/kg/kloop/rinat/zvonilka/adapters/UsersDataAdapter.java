package kg.kloop.rinat.zvonilka.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import kg.kloop.rinat.zvonilka.R;
import kg.kloop.rinat.zvonilka.data.UserData;

public class UsersDataAdapter extends BaseAdapter {

    private Context context;
    private List<UserData> userDatas;
    private boolean inProgress, isSelectActivity;

    public UsersDataAdapter(Context context, List<UserData> userDatas, boolean isSelectActivity) {
        this.context = context;
        this.userDatas = userDatas;
        this.isSelectActivity = isSelectActivity;
    }

    @Override
    public int getCount() {
        return userDatas.size();
    }

    @Override
    public UserData getItem(int i) {
        return userDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        UserData user = userDatas.get(i);

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.user_data_list, null);
        }

        TextView name = (TextView) v.findViewById(R.id.user_data_list_name);
//        TextView events = (TextView) v.findViewById(R.id.user_data_list_events);

        String nameStr = user.getFirstName() + " " + user.getSecondName();
        name.setText(nameStr);


        return v;
    }
}
