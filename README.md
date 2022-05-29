# 課題 9-3: 親クラスのコンストラクタの呼び出し

### 課題の説明
課題9-2で作成したInvinsibleHeroクラスのインスタンスを作成する際に名前やHPを設定できるように
Heroクラスに以下の３つのコンストラクタを追加し、InvisibleHeroクラスから親クラスのコンストラクタを呼び出せるように変更しなさい。
またInvisibleHeroクラスには新たにname, hp, isVisibleの３つの値を設定できるコンストラクタを追加しなさい。

- Heroクラスに追加するコンストラクタ

| 引数リスト               | 処理内容                                           |
|---------------------|------------------------------------------------|
| なし                  | hpフィールドに初期値120を代入する、nameフィールドに「??」を初期値として代入する。 | 
| String name         | hpフィールドに初期値120を代入する、引数のnameでnameフィールドを初期化する。   | 
| String name, int hp | 引数のhpでhpフィールドを初期化する、引数のnameでnameフィールドを初期化する。   | 

- InvisibleHeroクラスに追加するコンストラクタ

| 引数リスト                                  | 処理内容                                                                            |
|----------------------------------------|---------------------------------------------------------------------------------|
| String name, int hp, boolean isVisible | 引数のhpでhpフィールドを初期化する、引数のnameでnameフィールドを初期化する, 引数のisVisibleでisVisibleフィールドを初期化する。 | 

### Prog93 (提出不要)
```java
public class Prog93 {

    public static void main(String[] args) {

        InvisibleHero h;
        h = new InvisibleHero();
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp isVisible: " + h.isVisible);
        h = new InvisibleHero("工太");
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);
        h = new InvisibleHero("工太", 150);
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);
        h = new InvisibleHero("工太", 150, false);
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);

    }

}
```


### 実行例
```
勇者??が誕生した! HP:120, isVisible: true
勇者工太が誕生した! HP:120, isVisible: true
勇者工太が誕生した! HP:150, isVisible: true
勇者工太が誕生した! HP:150, isVisible: false
```
