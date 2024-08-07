package com.fh.app_student_management.ui;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.fh.app_student_management.R;

public class StatisticalClassForAdminActivity extends AppCompatActivity {

    private EditText inputSemester;
    private EditText inputSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistical_class_for_admin);

        inputSemester = findViewById(R.id.inputSemester);
        inputSubject = findViewById(R.id.inputSubject);

        inputSemester.setOnClickListener(v -> showSemesterDialog());
        inputSubject.setOnClickListener(v -> showSubjectDialog());
    }

    private void showSemesterDialog() {
        String[] semesters = {"Học kì 1", "Học kì 2", "Học kì 3"};

        new AlertDialog.Builder(this)
                .setTitle("Chọn học kì")
                .setItems(semesters, (dialog, which) -> {
                    inputSemester.setText(semesters[which]);
                })
                .show();
    }

    private void showSubjectDialog() {
        String[] subjects = {"Lập trình di động", "Cơ sở lập trình", "Kĩ thuật lập trình"};

        new AlertDialog.Builder(this)
                .setTitle("Chọn môn")
                .setItems(subjects, (dialog, which) -> {
                    inputSubject.setText(subjects[which]);
                })
                .show();
    }
}