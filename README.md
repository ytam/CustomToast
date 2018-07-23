# CustomToast
Custom toast library


[Success Toast](https://user-images.githubusercontent.com/15671434/43009636-de73da16-8c46-11e8-8f14-46d6a5a56c72.png) | [Error Toast](https://user-images.githubusercontent.com/15671434/43009635-de46e2d6-8c46-11e8-924e-21740e331418.png)| [Info Toast](https://user-images.githubusercontent.com/15671434/43009634-de1e1f40-8c46-11e8-96b3-bb65270ed4a8.png) 
------------------------------------------------------- | -------------------------------------------------------------------------|--------------------
<img width="200" src="https://user-images.githubusercontent.com/15671434/43009636-de73da16-8c46-11e8-8f14-46d6a5a56c72.png">| <img width="200" src="https://user-images.githubusercontent.com/15671434/43009635-de46e2d6-8c46-11e8-924e-21740e331418.png">|<img width="200" src="https://user-images.githubusercontent.com/15671434/43009634-de1e1f40-8c46-11e8-96b3-bb65270ed4a8.png">


[Warning Toast](https://user-images.githubusercontent.com/15671434/43009632-ddd45680-8c46-11e8-91a3-9a1df1be8a7a.png) | [Normal Toast](https://user-images.githubusercontent.com/15671434/43009631-ddad1390-8c46-11e8-9975-82453d479b7a.png)| [Custom icon Toast](https://user-images.githubusercontent.com/15671434/43065818-a6a9d44c-8e6b-11e8-9ab1-37c3473e3832.png) | 
------------------------------------------------------- | ------------------------------------------------------------------------- | -------------------------------------------------------------------------
<img width="200" src="https://user-images.githubusercontent.com/15671434/43009632-ddd45680-8c46-11e8-91a3-9a1df1be8a7a.png">| <img width="200" src="https://user-images.githubusercontent.com/15671434/43009631-ddad1390-8c46-11e8-9975-82453d479b7a.png">| <img width="200" src="https://user-images.githubusercontent.com/15671434/43065818-a6a9d44c-8e6b-11e8-9ab1-37c3473e3832.png">



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
	implementation 'com.github.ytam:CustomToast:1.1.3'
}
```



#### Usage for success toast message

```java

  CustomToast.success(this, "This is success message",Toast.LENGTH_SHORT);
```

#### Usage for error toast message

```java

  CustomToast.error(this, "This is error message",Toast.LENGTH_LONG);
```

#### Usage for info toast message

```java

CustomToast.info(this, "This is info message",Toast.LENGTH_LONG);
```


#### Usage for warning toast message

```java

CustomToast.warning(this, "This is warning message",Toast.LENGTH_LONG);
```

#### Usage for normal toast message

```java

CustomToast.normal(this, "This is normal message",Toast.LENGTH_LONG);
```

#### Usage for custom icon and background color toast message

```java

CustomToast.iconToast(this,"This is custom icon toast", Toast.LENGTH_LONG, Color.parseColor("#6d4c41"),R.drawable.ic_android_black_24dp);
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












