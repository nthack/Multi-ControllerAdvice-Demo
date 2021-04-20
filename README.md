# 基本概述

## 环境描述
### 开发环境
![](https://img.shields.io/badge/IDEA-2021.1-blue?style=for-the-badge)

![](https://img.shields.io/badge/lombok%20plugin-211.6693.111-green?style=for-the-badge)


### POM依赖
![](https://img.shields.io/badge/Spring%20Boot-2.4.5-green?style=for-the-badge)

![](https://img.shields.io/badge/lombok-1.18.20-g?style=for-the-badge)

---
---

## 全局的异常处理
通常来说，在`Spring Boot Web`项目中，有些异常信息是需要返回给调用者的。例如一些业务异常：账号异常、某个具体业务异常等。不同的异常有时候可能需要做不同的处理，一般项目中都会有多个异常。

基本上为了代码可读性和整洁，很少会在`Controller`中`try-catch`捕获`service`抛出的异常。除了在`某个Controller`的方法中使用`@ExceptionHandler`外，更多情况下是使用`@ControllerAdvice`配合`@ExceptionHandler`进行全局的异常捕获和处理，方便快捷。

> PS. 控制好**异常的生命周期（抛出及捕获）**对于一个**攻城狮**来说很重要




## 关于`@ControllerAdvice`注解
相信很多人都比较熟悉这个注解，简单说下，一般这个注解用于：
1. 全局数据绑定，`@ModelAttribute`
2. 全局数据预处理`@InitBinder`
3. 全局异常处理`@ExceptionHandler`

通常主要用于全局异常处理，也是本篇主要说的，下面使用`@ControllerAdvice`注解的类统称为`全局异常处理类`。





# 全局异常处理类
主要分为：
* [单个全局异常处理类](#单个全局异常处理类)
* [多个全局异常处理类](#多个全局异常处理类)

## 单个全局异常处理类
当抛出的异常种类不多的时候，一般使用单个`@ControllerAdvice`注解的类并配合`@ExceptionHandler`即可.

### 例子
假设现在分别有：`BusinessException`、`AccountException`、`Exception`三个异常，需要对这三个异常进行全局异常处理。







## 多个全局异常处理类