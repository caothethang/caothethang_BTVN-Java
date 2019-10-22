/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;

/**
 *
 * @author Administrator
 */
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void InputName(String name) {
        this.name = name;
    }
    private int MP=100;
    
    public void ShowMP(){
        System.out.println(MP);
    }
    public void Bark(String name){
        if(name.length()==0)
        {
            System.out.println("Xin lỗi bạn chưa nhập tên");
        }
        else
        {
            System.out.println(name+"sua");
             MP-=20;
            
        }
    }
    
    
}
