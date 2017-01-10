package az.kanan.retrofit_example;

import java.util.ArrayList;
import java.util.List;

import az.kanan.retrofit_example.api.Api;
import az.kanan.retrofit_example.api.RestInit;
import az.kanan.retrofit_example.pojo.Data;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Kanan on 1/10/2017.
 */

public class AppTest {


    public static void main(String... args) {

        Api api = RestInit.init();

        final List<Data> datas = new ArrayList<>();

        api.callApi("bash.im", "bash", 2).enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                datas.addAll(response.body());
                System.out.println("Kanan : " + datas.toString());
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                System.out.println("Kanan : " + "onFailure");
            }
        });


    }

}
