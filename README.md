# Clojure practice

## My environment

* Ubuntu 13.04 amd64

## Setup memo

```
# setup Java 6 at first

sudo aptitude install leiningen
```

## Create project, Compile it and Execute it

```
lein new myfirstapp
cd myfirstapp
# edit project.clj
# edit src/myfirstapp/core.clj
lein uberjar

java -jar myfirstapp-1.0.0-SNAPSHOT-standalone.jar
```

## References

* [プログラミングClojure 第2版](http://www.amazon.co.jp/dp/4274069133)
* [Ubuntu 12.04 に Oracle Java 6, 7 (JRE, JDK) をインストール - Qiita [キータ]](http://qiita.com/ka_/items/dbeca6fac63a6e8ec9a6)
* [Clojure - Wikipedia](http://ja.wikipedia.org/wiki/Clojure)
* [ClojureのビルドツールLeiningenのチュートリアルを訳しました @ t100のプログラミング脱出作戦](http://t100life.blog121.fc2.com/blog-entry-207.html)
