package FileManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserContainer implements Serializable  {
    private List<User> users = new ArrayList<>();


    public void add(User user) {
      users.add(user) ;

    }

    public void delete(String id) {
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                break;
            }
        }
    }
    public void showAll(){
        for(User user : users) {
            System.out.println((" Id: " +user.getId()));
        }
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
