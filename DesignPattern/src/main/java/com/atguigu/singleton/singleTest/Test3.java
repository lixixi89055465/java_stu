package com.atguigu.singleton.singleTest;

class User{
    private String username;
    static  enum SingleInstance{
        INSTANCE;
        User user;
        private  SingleInstance(){
            user=new User();
        }
        public User getInstance(){
            return user;
        }
    }

}
public class Test3 {
    public static void main(String[] args) {
        User user=User.SingleInstance.INSTANCE.getInstance();
        User user1=User.SingleInstance.INSTANCE.getInstance();
        System.out.println(user==user1);

    }
}
