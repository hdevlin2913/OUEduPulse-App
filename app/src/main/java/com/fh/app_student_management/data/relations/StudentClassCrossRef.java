package com.fh.app_student_management.data.relations;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"student_id", "class_id"})
public class StudentClassCrossRef {

    @ColumnInfo(name = "student_id")
    private long studentId;
    @ColumnInfo(name = "class_id")
    private long classId;
}
