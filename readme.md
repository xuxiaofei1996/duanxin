效果图：

![img](https://mmbiz.qpic.cn/mmbiz_png/LS4lxg6IgF91nkVSQ5GulCPob04RnTUW9Ph5tSmxMMaSyuJ4PQicnkwRJRzlS1rAhZ5JOVce0vfr8zdVTfnbkyA/640?wx_fmt=png)



> 阿里云短信api申请入口：
>
> https://dysms.console.aliyun.com/dysms.htm?spm=5176.8195934.1283918..1e4530c9JPkwcB&aly_as=TMi1CRWG#/overview

![img](https://mmbiz.qpic.cn/mmbiz_png/LS4lxg6IgF91nkVSQ5GulCPob04RnTUWQL2icaL8VRTysZx40aI4NEPmhj0WZgh5ibicJjwjD1GKlLKta6p2DibC7g/640?wx_fmt=png)

```
配置信息类：ConfigurationInformation
功能实现类：VerificationCode
执行类：Run

ConfigurationInformation类中这三个参数需要改成你自己的。
SignName
TemplateCode
accessKeyId

VerificationCode类中
private static String code;//code要与你的短信模板中的参数一致

```





SignName

![img](https://mmbiz.qpic.cn/mmbiz_png/LS4lxg6IgF91nkVSQ5GulCPob04RnTUWEzwksbWzhialk8FgxrgAicHiagMq1K6vZ88Q8aXPr2d9QUL3LtPPFeajQ/640?wx_fmt=png)

TemplateCode

![img](https://mmbiz.qpic.cn/mmbiz_png/LS4lxg6IgF91nkVSQ5GulCPob04RnTUWQzklUrLRSN0F1y69WOMSz35BwFdnicnFX8uM4UTks8KwXMV0RCS9Spw/640?wx_fmt=png)

accessKeyId

![img](https://mmbiz.qpic.cn/mmbiz_png/LS4lxg6IgF91nkVSQ5GulCPob04RnTUWyqtWTOBEPoJ0C344gx8DUiaTMIKjggkXUKINiayvoG8e9Snf8hb9NlTw/640?wx_fmt=png)

```
private static String code;
```

![img](https://mmbiz.qpic.cn/mmbiz_png/LS4lxg6IgF91nkVSQ5GulCPob04RnTUWia5xwoRcDMUibfwDvy0yyhQT4ic7TCGnW4zzLdOS2ug8DvqHRmAyml3LQ/640?wx_fmt=png)

