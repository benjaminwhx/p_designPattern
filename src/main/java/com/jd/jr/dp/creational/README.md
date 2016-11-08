## 创建型模式
共分为5种：
* 工厂方法模式
* 抽象工厂模式
* 单例模式
* 建造者模式
* 原型模式

工厂方法模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。在以上的三种模式中，
普通工厂模式如果传入的字符串有误，不能正确创建对象，静态工厂方法模式相对于多个工厂方法模式，不需要实例化工厂类，
所以，大多数情况下，我们会选用静态工厂方法模式。

工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，
从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
不需要修改之前的代码。因为抽象工厂不太好理解，我们先看看图，然后就和代码，就比较容易理解。

抽象模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，
实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！