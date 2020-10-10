

```java

切面的使用【基于注解】

@Aspect => 声明该类为一个注解类


切点注解：
@Pointcut => 定义一个切点，可以简化代码


通知注解：
@Before => 在切点之前执行代码
@After => 在切点之后执行代码
@AfterReturning => 切点返回内容后执行代码，可以对切点的返回值进行封装
@AfterThrowing => 切点抛出异常后执行
@Around => 环绕，在切点前后执行代码


```

