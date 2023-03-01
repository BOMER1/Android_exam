package com.t2011e.android_daotuananh;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Employee")

public class EmployeeEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "EmployeeName")
    public String EmployeeName;
    @ColumnInfo(name = "Salary")
    public String Salary;

    @ColumnInfo(name = "Designation")
    public String Designation;

}
