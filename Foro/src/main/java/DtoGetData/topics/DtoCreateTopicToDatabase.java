

public record DtoCreateTopicToDatabase (
        String title,
        String message,
        User user,
        Course course,
        Status status
)
{
}