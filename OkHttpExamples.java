package lesson06;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class OkHttpExamples {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("geekbrains.ru")
                .addPathSegment("/courses")
                .build();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println("Код ответа:" + response.code());
        System.out.println("Код ответа:" + response.code());
        System.out.println(response.headers());
        String responseBody = response.body().string();
    }

    public Executor newCall(Request requestAuth) {
    }
}

