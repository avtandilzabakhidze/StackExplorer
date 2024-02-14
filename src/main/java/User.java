import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @SerializedName("display_name")
    private String userName;
    private String location;
    @SerializedName("answer_count")
    private int answerCount;
    @SerializedName("question_count")
    private int questionCount;
    private List<String> tags;
    @SerializedName("link")
    private String profileLink;
    @SerializedName("profile_image")
    private String avatarLink;

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getProfileLink() {
        return profileLink;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", location='" + location + '\'' +
                ", answerCount=" + answerCount +
                ", questionCount=" + questionCount +
                ", tags=" + tags +
                ", profileLink='" + profileLink + '\'' +
                ", avatarLink='" + avatarLink + '\'' +
                '}';
    }
}