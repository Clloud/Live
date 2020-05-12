# SpringBoot Demo
使用SpringBoot + MyBatis实现基本的增删改查

- 添加项目依赖
在pom.xml中添加数据库驱动、数据库连接池和MyBatis的依赖
```xml
<!-- MySQL数据库驱动 -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.41</version>
</dependency>

<!-- MyBatis -->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.3.1</version>
</dependency>

<!--数据库连接池-->
<dependency>
    <groupId>com.mchange</groupId>
    <artifactId>c3p0</artifactId>
    <version>0.9.5.2</version>
</dependency>
```

- 编写mybatis-config.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <settings>
        <!-- 使用jdbc的getGeneratedKeys获取数据库的自增主键 -->
        <setting name="useGeneratedKeys" value="true"/>

        <!-- 使用列标签替换列别名 默认：true -->
        <setting name="useColumnLabel" value="true"/>

        <!-- 开启驼峰命名转换：Table{create_time} -> Entity{createTime} -->
        <setting name="mapUnderscoreToCamelCase" value="true"/>
    </settings>
</configuration>
```

- 配置DAO层的DataSource和SessionFactory

- 编写DAO层

- 在/mapper/*.xml中实现DAO定义的方法

- 配置TransactionManagement，在Service层开启事务管理

- 在Service层定义接口并实现

- 在Controller层实现各个业务方法的控制器