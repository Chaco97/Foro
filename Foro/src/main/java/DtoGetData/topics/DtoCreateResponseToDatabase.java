

public record DtoCreateResponseToDatabase(
        String message,
        Topic topic,
        User author,
        String solution
) {
}