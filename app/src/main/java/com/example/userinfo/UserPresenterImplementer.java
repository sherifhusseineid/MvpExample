package com.example.userinfo;

public class UserPresenterImplementer implements UserPresenter {
   private UserView view;
   private UserModel model = new UserModel();
   UserPresenterImplementer(UserView view){
       this.view = view;
   }

    @Override
    public void onCreate() {
        view.updateUserInfo(model.getName());
    }
}