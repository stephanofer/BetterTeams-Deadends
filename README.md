## BetterTeams -Deadends

This project is simply made so [BetterTeams](https://github.com/booksaw/BetterTeams) can compile. BetterTeams has a number of dependencies, some of which are closed source.
All missing dependencies have the scope `<provided>`, so the lack of function in this project is meaningless.

Plugins which are included within this repo:
* [UltimateClaims](https://songoda.com/marketplace/product/ultimateclaims-the-ultimate-claiming-plugin.65): This is beacuse the spigot repo cannot compile using jitpack
* [zKoth](https://www.spigotmc.org/resources/zkoth-king-of-the-hill.76749/): This plugin is premium and closed source, providing any information not provided with the API would be a breach of license.

This repository simply includes blank methods so betterteams can compile correctly, an example method is provided below

```java
public class Foo {

    public Player Bar(){
        // nothing here
    }

}
```
