package com.example.skstockm.program2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CharacterDetailFragment extends Fragment {
    private long characterId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            characterId = savedInstanceState.getLong("characterId");
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Character character = Character.CHARACTERs[(int) characterId];
            title.setText(character.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(character.getDescription());
            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(character.getImageResourceId());
            photo.setContentDescription(character.getName());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("characterId", characterId);
    }

    public void setWorkoutId(long id){
        this.characterId = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_detail, container, false);
    }
}
