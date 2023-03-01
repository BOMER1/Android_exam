package com.t2011e.android_daotuananh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = AppDatabase.getAppDatabase(this);
        insertEmployee();
        updateEmployee(2);
        getAllEmployee();
    }
    private void insertEmployee(){
        EmployeeEntity ep = new EmployeeEntity();
        ep.EmployeeName = "NGUYEN VAN BA NHAT 1";
        ep.Salary = "20.0000vnd";
        ep.Designation = "SOME THING HERE";
        db.employeeDao().insertEmployee(ep);
    }
    private void updateEmployee(int id){
        EmployeeEntity ep = db.employeeDao().getEmployee(id);
        ep.EmployeeName="this is employee update";
        db.employeeDao().updateEmployee(ep);
    }
    private void getAllEmployee(){
        List<EmployeeEntity> list = db.employeeDao().getAllEmployee();
        for (EmployeeEntity model : list){
            Log.d("TAG", "id:" +model.id+"title:"+model.EmployeeName);
        }

    }
}