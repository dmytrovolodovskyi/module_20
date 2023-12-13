import java.util.List;

public class StringUtils {
    /*
    Вітаю!
    Хочу подякувати Вам за ці 10 місяців, що були з нами!
    Це, напевно, моє остання дз, якє Ви перевіряєте,
    і я дякую Вам за виділений час та підтримку з Вашої сторони
    Бажаю всього найкращого!😌
    */

    public String mergeStrings(List<String> words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
        }

        return stringBuilder.toString();
    }
}
