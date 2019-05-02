# eppdev-jee-java

**[English](README_en.md)**

## 说明

DPPDEV-JEE是一个基于Springboot的代码生成程序，可以根据数据库库表结构定义生成mybatis基础OR映射类，
对应的基础Service和Controller，以及相应的基础类和工具类，生成的代码无任何私有依赖，完全可以独立运行

具体生成的内容包括：

* 每个表对应的生成文件（以sys_user表为例）
  * _SysUser.java：自动生成Java类，继承BasicEntity类，实现各个字段到Java属性的映射
  * SysUser.java：实际使用的Java实体类，继承自_SysUser，自定义属性可以在此添加
  * _SysUserDao.java：自动生成的Dao文件，继承自BasicDao，实现各基础调用方法
  * SysUserDao.java：实际使用的Dao文件，继承自_SysUserDao，自定义DAO方法可以在此定义
  * _SysUserParam.java：自动生成的查询条件类，根据库表中各个字段的配置，自动生成
  * SysUserParam.java：实际使用的查询条件类，继承自_SysUserParam，自定义的条件可以在此添加
  * _SysUserService.java：自动生成的Service类，继承自BasicService，实现了exists()、getDao()方法
  * SysUserService.java：使用使用的Service类，需自定义customInit方法，有需要增加的方法可以在此处理
  * SysUserController.java：对应的RestController，实现了基础的增删改查操作
  * sys_user.sql：基础的库表定义文件
* 基础类类文件
  * BasicDao.java: 定义了基础的Dao方法
  * BasicEntity.java：定义了OR映射实体类的基础字段和方法
  * BasicService.java：定义了Service的基础方法
  * BasicParam.java: 定义了条件类的基础属性和方法，包括排序条件的构建等
  * BasicController.java：定义了Controller的基础方法，包括增删改查等操作
* 一些工具类
  * StringUtils.java
  * JsonUtils.java
  * PasswordUtils.java
  * RandomUtils.java
* 基础配置文件
  * pom.xml：maven工程的基础配置
  * application.properties：springboot配置文件
  * Application.java：springboot的启动文件
  * .gitignore：git配置文件

> 对于每个表，之所以在Entity、Param、Dao、Service和Mapper文件都要分两个，是为了区分自动生成以后要根据数据库配置自动更新的代码文件和可以手工修改的文件。
> 有下划线的文件都是后续自动生成的时候要自动修改覆盖的文件，无下划线的是可以手工修改的，后续的自动代码生成不会覆盖。

## 快速开始

### 环境准备

本代码生成器是基于web界面的代码生成器，可以个人使用，也可以部署在服务器上供大家共同使用，在服务器上使用需要部结合git使用，便于自动提交代码。

#### 单机环境准备

1. 安装jdk（推荐JDK8+，可以是OpenJDK，也可以是OracleJDK）
2. 安装Git（可选，若个人开发或使用其他代码管理工具如subversion，可以不安装git）
3. 安装maven，用于编译

#### 服务器环境准备

1. 安装jdk
2. 安装git
3. 安装nginx（用于多工程代码生成器之间的代理和切换）


### 编译与安装

#### 编译前的准备

1. 安装JDK（推荐JDK8+）
2. 安装Maven
3. 修改Maven仓库地址（可选，国内建设采用Aliyun或163镜像提速）

#### 编译

1. 下载本工程源代码
2. 使用maven package命令进行打包

#### 安装

1. 创建要安装的文件夹
2. 复制eppdev-jee-web/src/main/resources/application.properties到该文件夹下，修改其中的数据库链接信息
3. 复制通过maven打包的jar文件（在eppdev-jee-web/target目录下）到该文件夹下 


### 使用eppdev_jee生成代码

#### 启动程序

**Windows下的启动**
~~~shall
cd <安装目录>
java -jar eppdev-jee-web-<version>.jar --spring.config.location=./application.properites
~~~

**Linux/Mac下的启动**
~~~shell
./eppdev-jee-web-<version>.jar
~~~
> Linux或者Mac下可以直接通过chmod将jar文件改为可执行文件，直接运行

#### 代码生成

1. 通过浏览器访问接生成管理页面(默认是：[http://localhost:8080](http://localhost:8080), 
   若application.properties中有修改，以修改后的端口和contextPath为准)
2. 在初始化配置中配置相关内容（注意目前没有实现所有配置同事修改功能，只能一条条保存）
3. 在工程初始化中，根据需要初始化相应的基础类和工具类，以及对应的配置文件
4. 在最新的库表列表中添加库表，配置数据库字段信息，根据需要生成相应的代码

## 系统架构与技术栈

### 系统架构设计


### 技术栈

* springboot
* mybatis
* freemarker
* thymeleaf
* mybatis-pagehelper

## 如何贡献

1. Fork this project
2. Create a new Branch, such as: Feat_xxx 
3. push the code
4. Create a Pull Request

## 许可



 版权所有：2019，[郝金隆](mailto:jinlong.hao@eppdev.cn)
 
 软件许可：[Anti-996 License v1.0](LICENSE-CN)




