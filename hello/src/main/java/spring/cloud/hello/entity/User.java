package spring.cloud.hello.entity;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/5/24
 * Time: 15:48
 */
public class User implements Serializable {
    private static final long serialVersionUID = -3923261225379781077L;
    private String name;
    private int age;

    public User(){

    }
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name="+name+",age="+age;
    }
}
