import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private static final String BASE_URL = "https://api.stackexchange.com/2.3/";
    private Retrofit retrofit;

    public UserService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public List<User> getUsers() {
        UserAPI api = retrofit.create(UserAPI.class);
        Call<UserResponse> call = api.getUsers("stackoverflow", 100,"Romania","Moldova",223,new String[]{"java",".net","docker" , "C#"});
        try {
            Response<UserResponse> response = call.execute();
            if (response.isSuccessful()) {
                UserResponse userResponse = response.body();
                if (userResponse != null) {
                    return filterUsers(userResponse.getItems());
                }
            } else {
                System.err.println("Failed to retrieve users. Response code: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private List<User> filterUsers(List<User> users) {
        return users.stream()
//                .filter(user -> user.getAnswerCount() >= 1)
//                .filter(user -> user.getLocation().equals("USA") || user.getLocation().equals("Moldova"))
//                .filter(user -> user.getTags().stream().anyMatch(tag -> List.of("java", ".net", "docker", "C#").contains(tag)))
                .collect(Collectors.toList());
    }
}
