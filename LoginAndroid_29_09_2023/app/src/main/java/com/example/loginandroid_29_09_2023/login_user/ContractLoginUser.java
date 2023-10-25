package com.example.loginandroid_29_09_2023.login_user;

import com.example.loginandroid_29_09_2023.beans.User;

public interface ContractLoginUser {
    public interface View{
        public void successLogin(User user); //me viene del BACK
        void failureLogin(String err);      //me viene del BACK
        // void failureLogin(MyException err);
    }
    public interface Presenter{
        // void login(String email, String pass);
        void login(User user); //ida hacia el back
        // void login(ViewUser viewUser);
        // VIEW-ORM
        // BEANS-ENTITIES
        // MVP - MVVM
    }
    public interface Model{
        interface OnLoginUserListener{
            void onFinished(User user); //vuelta de back
            void onFailure(String err);
        }
        void loginAPI(User user,
                      OnLoginUserListener onLoginUserListener); //va hacia el back
    }
}
