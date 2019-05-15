#### 1.  注解
@Configuration
@EnableAutoConfiguration
@ComponentScan
== 等效于 SpringBootApplication

####  2. 注解Configuration 是加载属性的
多个配置类可以使用@Import注入 
@Import`注解可以用来导入其他配置类
@ComponentScan`注解自动收集所有Spring组件

#### 3. 导入XML配置
@ImportResource注解加载XML配置文件。


#### 4. 自动配置
实现自动配置有两种可选方式，分别是将`@EnableAutoConfiguration`
或`@SpringBootApplication`注解到`@Configuration`类上。    
@EnableAutoConfiguration
尝试根据添加的jar依赖自动配置你的Spring应用

#### 5. 禁用特定的自动配置项
使用`@EnableAutoConfiguration`注解的exclude属性禁用


