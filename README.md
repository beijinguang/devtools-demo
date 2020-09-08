## devtools热部署

###  Ctrl+Shift+Alt+/,修改Registry ...
![image-20200908140935095](https://gitee.com/idea4j/imagerep/raw/master/images/image-20200908140935095.png)

### 修改 Compiler
![image-20200908141325266](https://gitee.com/idea4j/imagerep/raw/master/images/image-20200908141325266.png)

### 修改Run/Debug Configuration
![image-20200908141529993](https://gitee.com/idea4j/imagerep/raw/master/images/image-20200908141529993.png)


## springboot 构建mvn镜像 需要代理
mvn spring-boot:build-image

 docker run --tty --publish 8080:8080 devtools-demo:0.0.1-SNAPSHOT

## 远程应用
springboot文档
https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#using-boot-devtools-remote 

![image-20200908141739282](https://gitee.com/idea4j/imagerep/raw/master/images/image-20200908141739282.png)