package az.kanan.retrofit_example.api;

import java.util.List;

import az.kanan.retrofit_example.pojo.Data;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Kanan on 1/10/2017.
 */

public interface Api {

    @GET("get")
    Call<List<Data>> callApi(
            @Query("site") String site,
            @Query("name") String name,
            @Query("num") int num);

}
