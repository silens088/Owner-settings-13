package autotests.tests;

import autotests.config.ApiConfig;
import io.qameta.allure.Description;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {
    //важная строчка
    ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @Test
    @Description("берем токен через конфиг - из токен проперти - resources/config/token.properties")
    public void checkLocalToken() {
        assertEquals(apiConfig.getToken(), "123token");
    }

    @Test
    @Description("проверяем базовый URL")
    public void checkApiBaseUrl() {
        System.out.println(apiConfig.getBaseUrl());
        assertThat(apiConfig.getBaseUrl()).isEqualTo("https://kupithai.ru/");
    }
}
