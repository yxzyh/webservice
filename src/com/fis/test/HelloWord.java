package com.fis.test;

 

import javax.jws.WebService;

import javax.xml.ws.Endpoint;

 


/**

*@javax.jws.WebService注解，标识一个java类或一个接口作为一个服务，一旦被标注@WebService,他就不是一个普通的

*接口，他被称作服务端点接口（Service Endpoint Interface）

 */

@WebService

public class HelloWord {

/**

 * 打招呼的方法

 * @param name

 * @return

 */

  public String say(String name){

  System.out.println("欢迎"+name);

  return  "你好："+name;

  }

  

public static void main(String[] args) {

   String address="http://localhost:9001/HelloWord";

   //发布服务

   Endpoint.publish(address, new HelloWord());

   System.out.println("启动服务成功.....");

  }

}
