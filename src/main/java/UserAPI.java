import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserAPI {
    @GET("users")
    Call<UserResponse> getUsers(
            @Query("site") String site,
            @Query("pagesize") int pageSize,
            @Query("location") String location1,
            @Query("location") String location2,
            @Query("min") int minReputation,
            @Query("tags")String[]tags
    );
}
