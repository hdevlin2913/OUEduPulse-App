package com.fh.app_student_management.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.fh.app_student_management.data.entities.AcademicYear;

import java.util.List;

@Dao
public interface AcademicYearDAO {

    @Query("SELECT * FROM academic_years")
    List<AcademicYear> getAll();

    @Query("SELECT * FROM academic_years WHERE id = :id")
    AcademicYear getById(long id);

    @Query("SELECT * FROM academic_years WHERE name LIKE '%' || :name || '%'")
    List<AcademicYear> findByName(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AcademicYear AcademicYear);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(AcademicYear... academic_years);

    @Update
    void update(AcademicYear AcademicYear);

    @Delete
    void delete(AcademicYear AcademicYear);
}
