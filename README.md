# fuck_his

## 项目背景
学习课程《医学信息学》时做的实践作业

## 项目结构
```
.
├─main
│  ├─java
│  │  └─com
│  │      └─gzucm
│  │          └─fuck_his
│  │              ├─constant 常量类(Redis设置)
│  │              ├─controller 控制类
│  │              ├─DTO 数据传输对象
│  │              ├─entity 数据库表的实体类
│  │              ├─repository JPA
│  │              ├─service 服务类及其实现
│  │              │  └─impl
│  │              ├─utils 工具类
│  │              └─websocket 
│  │                  ├─config websocket的配置类
│  │                  ├─controller websocket的控制类
│  │                  └─model websocket的数据传输类
│  └─resources
│      ├─static 各静态资源
│      │  ├─css
│      │  ├─img
│      │  └─js
│      └─templates 各html页面文件
└─test
```

## 涉及技术：
1. 使用 `Spring-JPA` 实现 DAO 业务；
2. 使用 `thymeleaf` 搭建的 Spring-Boot 前后端一体化项目；
3. 使用 `WebSocket(stomp)` 实现叫号功能； 
4. 使用 `Redis` 缓存病人预约队列；

## 亮点
1. 使用了 `WebSocket` 实现叫号功能；
2. 使用了 `Redis` 缓存病人预约队列；

## 截图展示
