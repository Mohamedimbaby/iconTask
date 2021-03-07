import com.example.task.Model.ApiResponse
import com.example.task.Model.ItemResponse
import com.example.task.Model.LoginUserInfo
import com.example.task.Model.UserInfo
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {
    @Headers("lang: 'en', apiKey:'fd94f23499b954d6cea823567a606a3f'")
    @POST("login/")
    fun Login(@Body userData: LoginUserInfo): Call<ApiResponse>

    @Headers("lang: en","apiKey: fd94f23499b954d6cea823567a606a3f")
    @POST("getHome/")
    fun whatsNew(): Call<ItemResponse>

   @Headers("lang: en","apiKey: fd94f23499b954d6cea823567a606a3f")
    @POST("getCategory/")
    fun getCategories(): Call<ItemResponse>

}