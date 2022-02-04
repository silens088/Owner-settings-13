package autotests.config;

import org.aeonbits.owner.Config;

//указываем адрес проперти, откуда тянуть данные
@Config.Sources({"classpath:config/token.properties"})

//пример: тянуть данные с файла на локальном компьютере.
//          @Config.Sources({
//            "file:/tmp/token.properties",
//            "classpath:config/token.properties"
//          })

public interface ApiConfig extends Config {

    //метод который тянет базовый урл из проперти
    //но мы добавили дефолтное значение - этот адрес тянется по умолчанию
    @Config.Key("baseUrl")
    @Config.DefaultValue("https://kupithai.ru/")
    String getBaseUrl();


    //метод который тянет токен из проперти по адресу - classpath:config/token.properties
    @Config.Key("token")
    String getToken();
}
