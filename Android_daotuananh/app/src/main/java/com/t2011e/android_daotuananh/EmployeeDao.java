package com.t2011e.android_daotuananh;
import static androidx.room.OnConflictStrategy.REPLACE;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Insert(onConflict = REPLACE)
    void insertEmployee(EmployeeEntity employee);
    @Update
    void updateEmployee(EmployeeEntity employee);
    @Delete
    void deleteEmployee(EmployeeEntity employee);
    @Query("DELETE FROM Employee")
    void deleteAll();
    @Query("SELECT * FROM Employee WHERE id = :id" )
    EmployeeEntity getEmployee(int id);
    @Query("SELECT * FROM Employee")
    List<EmployeeEntity> getAllEmployee();


}
