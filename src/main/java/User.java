import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @SerializedName("display_name")
    private String displayName;
    private String location;
    @SerializedName("answer_count")
    private int answerCount;
    @SerializedName("question_count")
    private int questionCount;
    private List<String> tags;
    @SerializedName("link")
    private String link;
    @SerializedName("profile_image")
    private String profileImage;

    public String getDisplayName() {
        return displayName;
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

    public String getLink() {
        return link;
    }

    public String getProfileImage() {
        return profileImage;
    }

    @Override
    public String toString() {
        return "User{" +
                "displayName='" + displayName + '\'' +
                ", location='" + location + '\'' +
                ", answerCount=" + answerCount +
                ", questionCount=" + questionCount +
                ", tags=" + tags +
                ", link='" + link + '\'' +
                ", profileImage='" + profileImage + '\'' +
                '}';
    }
}