package FileManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserContainer implements Serializable {
    private List<User> users = new ArrayList<>();


    public void add(User user) {
        User newUser = new User();
      users.add(newUser) ;

    }

    public void delete(String id) {
        for (User deletedUser : users) {
            if (users.contains(id)){
                users.remove(deletedUser);
            }
        }
    }
    public void showAll(){
        System.out.println(users.toString());
    }
//    public void update (long id,User user){
//        for (int i = 0; i <users.size() ; i++) {
//            if (id==i){
//                users[i]= user;
//            }else {
//                System.out.println("Такой id не найден");
//            }
//        }
//    }
}
