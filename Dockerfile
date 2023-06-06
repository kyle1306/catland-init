# 该镜像需要依赖的基础镜像
FROM openjdk:8
# 将当前目录下的jar包复制到docker容器的/目录下
ADD ./cat-land-1.0.0-SNAPSHOT.jar /cat-land-1.0.0-SNAPSHOT.jar
# 声明服务运行在8080端口
EXPOSE 8080
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/cat-land-1.0.0-SNAPSHOT.jar"]
# 指定维护者的名字
MAINTAINER kyle