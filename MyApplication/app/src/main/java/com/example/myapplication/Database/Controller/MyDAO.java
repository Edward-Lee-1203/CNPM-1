package com.example.myapplication.Database.Controller;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.Database.Object.Bill;
import com.example.myapplication.Database.Object.Partner;
import com.example.myapplication.Database.Object.Service;
import com.example.myapplication.Database.Object.User;

import java.util.List;

@Dao
public  interface MyDAO {

    @Insert
    public void addUser(User user);

    @Insert
    public void addBill(Bill bill);

    @Insert
    public void addPartner(Partner partner);

    @Insert
    public void addService(Service service);

    @Query("select partnerID from serviceOfPartner where serviceID = :serviceID")
    public List<Integer> getPartner(int serviceID);

    @Query("select * from users where userName = :userName AND userPassword = :pass")
    public User getUser(String userName, String pass);

    @Query("select * from partners")
    public List<Partner> getPartner();

    @Query("select * from users")
    public List<User> getUsers();

    @Update
    public void updateWithPassword(User user);

    @Update
    public void updateInformation(User user);

    //@Query("select * from bills where userID = :userId")
    //public void getBill(int userId);


}