# CustomToast
Custom toast library


[Success Toast](https://user-images.githubusercontent.com/15671434/42749753-68642828-88ed-11e8-920b-94d176d4a32f.png) | [Error Toast](https://user-images.githubusercontent.com/15671434/42749754-68856204-88ed-11e8-9c1b-cdcee869bc1b.png)| [Info Toast](https://user-images.githubusercontent.com/15671434/42749755-68a48544-88ed-11e8-9888-8badca914df7.png) 
------------------------------------------------------- | -------------------------------------------------------------------------|--------------------
<img width="200" src="https://user-images.githubusercontent.com/15671434/42749753-68642828-88ed-11e8-920b-94d176d4a32f.png">| <img width="200" src="https://user-images.githubusercontent.com/15671434/42749754-68856204-88ed-11e8-9c1b-cdcee869bc1b.png">|<img width="200" src="https://user-images.githubusercontent.com/15671434/42749755-68a48544-88ed-11e8-9888-8badca914df7.png">


[Warning Toast](https://user-images.githubusercontent.com/15671434/42749756-68c451a8-88ed-11e8-8329-45897dbf1653.png) | [Normal Toast](https://user-images.githubusercontent.com/15671434/42759618-4ccb37b4-8910-11e8-9ef2-41b34d67bf37.png)| 
------------------------------------------------------- | -------------------------------------------------------------------------
<img width="200" src="https://user-images.githubusercontent.com/15671434/42749756-68c451a8-88ed-11e8-8329-45897dbf1653.png">| <img width="200" src="https://user-images.githubusercontent.com/15671434/42759618-4ccb37b4-8910-11e8-9ef2-41b34d67bf37.png">



## How to add dependency?


### gradle
```groovy
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```

then add the library to dependency

```groovy
dependencies {
	implementation 'com.github.ytam:CustomSnackBarToast:1.1'
}
```



#### Usage for success toast message

```java

  CustomToast.success(this, "This is success message");
```

#### Usage for error toast message

```java

 CustomToast.error(this, "This is error message");
```

#### Usage for info toast message

```java

CustomToast.info(this, "This is info message");
```


#### Usage for info toast message

```java

CustomToast.warning(this, "This is warning message");
```

#### Usage for normal toast message

```java

CustomToast.normal(this, "This is normal message");
```


License
--------


      MIT License

    Copyright (c) 2018 Yıldırım Tam

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.












