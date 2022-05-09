基于[TelegramBots]('https://github.com/rubenlagus/TelegramBots)源码修改

## 申明
   仅使用于学习，勿用不正规渠道。合法合规

## 功能：
   1、telegramBots 基础功能

   2、可视化添加关键词，根据关键词回复

   3、可视化群发，添加群发语句，可定时发送

## 提供打包插件，安装即可。
   插件 ---- plugin.exe

## 如果进行二次开发，请申报


## 运行实例

```
public class Main {
        public static void main(String[] args) {
            try {
                TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
                telegramBotsApi.registerBot(new ChannelHandlers());
                telegramBotsApi.registerBot(new DirectionsHandlers());
                telegramBotsApi.registerBot(new RaeHandlers());
                telegramBotsApi.registerBot(new WeatherHandlers());
                telegramBotsApi.registerBot(new TransifexHandlers());
                telegramBotsApi.registerBot(new FilesHandlers());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
```

感谢[TelegramBots]('https://github.com/rubenlagus/TelegramBots) 提供支持