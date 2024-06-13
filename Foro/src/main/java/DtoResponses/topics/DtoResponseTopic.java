import java.time.LocalDateTime;

public record DtoResponseTopic (
        LocalDateTime creationDate,
        String message,
        String solution,
        DtoUser author
)
{
}