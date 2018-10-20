package ru.vavtech.septemberworkout.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.vavtech.septemberworkout.Model.Workout;
import ru.vavtech.septemberworkout.R;

class WorkoutViewHOlder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView description;
    private TextView recordDate;
    private TextView recordRepsCount;
    private TextView recordWeight;

    public WorkoutViewHOlder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.list_item_title_text_view);
        description = itemView.findViewById(R.id.list_item_deskription_text_view);
        recordDate = itemView.findViewById(R.id.list_item_record_date);
        recordRepsCount = itemView.findViewById(R.id.list_item_record_reps_count);
        recordWeight = itemView.findViewById(R.id.list_item_record_weight);
    }

    public void bindView(Workout workout) {
        title.setText(workout.getTitle());
        description.setText(workout.getDescription());
        recordWeight.setText(String.valueOf(workout.getRecordWeight()));
        recordRepsCount.setText(String.valueOf(workout.getRecordRepsCount()));
        recordDate.setText(workout.getFormattedRecordDate());
    }
}