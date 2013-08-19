# Clojure practice

## My environment

* Ubuntu 13.04 amd64
* Clojure 1.5.1
* Leiningen 2.2.0

## Setup memo

```
# setup Java 6 (or 7) at first

cd $HOME/local/bin
wget https://raw.github.com/technomancy/leiningen/stable/bin/lein
chmod +x lein
./lein
```

`sudo aptitude install leiningen` command installs leiningen version 0.1.x.

## Create a project, Compile it and Execute it

```
lein new mysecondapp
cd mysecondapp
# edit project.clj
# edit src/myfirstapp/core.clj
lein uberjar

java -jar target/mysecondapp-1.0.0-SNAPSHOT-standalone.jar
```

## Launch REPL

```
lein repl
```

## Sample codes

```
wget http://media.pragprog.com/titles/shcloj2/code/shcloj2-code.tgz
```

or

```
git clone http://github.com/stuarthalloway/programming-clojure
```

## References

* [The Pragmatic Bookshelf | Programming Clojure](http://pragprog.com/book/shcloj2/programming-clojure)
* [プログラミングClojure 第2版](http://www.amazon.co.jp/dp/4274069133)
* [Ubuntu 12.04 に Oracle Java 6, 7 (JRE, JDK) をインストール - Qiita [キータ]](http://qiita.com/ka_/items/dbeca6fac63a6e8ec9a6)
* [Clojure - Wikipedia](http://ja.wikipedia.org/wiki/Clojure)
* [ClojureのビルドツールLeiningenのチュートリアルを訳しました @ t100のプログラミング脱出作戦](http://t100life.blog121.fc2.com/blog-entry-207.html)
