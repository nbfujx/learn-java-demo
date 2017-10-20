# Goku.Dynamic.DruidDemo
Druid动态数据源演示Demo，采用spring+springmvc+mybatis架构  


备注：

1.需要调整 generatorConfig.xml,mybatis.properties 数据库连接

2.测试服务 MASTER库：http://localhost:8080/User/getUser/{id}
          SALVES库：http://localhost:8080/User/getFormElement/{id}   

3.durid监控地址 http://localhost:8080/druid/index.html
