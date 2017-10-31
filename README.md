# common-elegance
优雅编码的一些common实现，为了以后开发依赖使用，主要是为了开发规范

## 包含如下：

### 一个非常全的utils类库
hutool

```
<dependency>
	<groupId>com.xiaoleilu</groupId>
	<artifactId>hutool-all</artifactId>
	<version>${hutool-version}</version>
</dependency>
```

### 前后端接口规范
1. 所有接口都必须返回ResultBean，就是说一开始就考虑好成功和失败的场景。
2. ResultBean只允许出现在controller，不允许到处传。
3. 不要出现map，json等这种复杂对象做为输入和输出。
4. 对外接口可以考虑使用细分错误码，对内接口使用异常信息即可（方便编码）。

