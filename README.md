# Clojure practice

## My environment

* Ubuntu 13.04 amd64
* Clojure 1.5.1
* Leiningen 2.3.1

## Setup memo

```
# setup Java 6 (or 7) at first

cd $HOME/local/bin
wget https://raw.github.com/technomancy/leiningen/stable/bin/lein
chmod +x lein
./lein
```

`sudo aptitude install leiningen` command installs leiningen version 0.1.x.

## Create a project, and run it

```
lein new app mythirdapp
cd mythirdapp
lein run
#=> Hello, World!
```

## Create standalone jar file

```
# edit project.clj
# edit src/mythirdapp/core.clj
# the changeset of these edit is like a commit e31ba90031d4ead55b034406ccfebd2229e674b7
lein uberjar
java -jar target/mythirdapp-0.1.0-SNAPSHOT-standalone.jar arg0 arg1
#=> Hello, World!; your arguments: (arg0 arg1)
```

### Question

What is **AOT**?

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
* [Leiningen入門（再） - Starlight](http://d.hatena.ne.jp/Kazuhira/20130820/1377000175)
* [leiningen/doc/TUTORIAL.md at stable · technomancy/leiningen](https://github.com/technomancy/leiningen/blob/stable/doc/TUTORIAL.md)
