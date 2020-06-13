# hello-world

### 查看字节码

javap -c -v -classpath . FindLongLines

### java 和 scala 的区别

1.特质
特质和 class 以及 java 接口的区别
特质可以继承抽象类
特质使用线性化解读 super 2.访问修饰符
private（私有成员）：java 可以从外部类中访问内部类的私有成员，scala 不允许
protected（受保护成员）：java 允许包内或子类对 protected 修饰成员的访问，scala 只允许子类对 protected 修饰成员的访问
伴生类和伴生对象可以互相访问彼此的私有成员
3.static
scala 中 static 使用伴生对象
