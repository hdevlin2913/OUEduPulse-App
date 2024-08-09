package com.fh.app_student_management.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.fh.app_student_management.data.entities.User;
import com.fh.app_student_management.utilities.Constants;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM users ORDER BY id DESC")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE id = :id")
    User getById(long id);

    @Query("SELECT * FROM users WHERE email = :email")
    User getByEmail(String email);

    @Insert
    Long insert(User user);

    @Insert
    void insertAll(User... users);

    @Update
    void update(User user);

    @Delete
    void delete(User user);
}
