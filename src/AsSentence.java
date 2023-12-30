import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsSentence implements ChangeRegister
{
    public String change(String text)
    {
        String out = "";
        text = text.toLowerCase();
        String[] str = text.split("(?<=\\. |\\? |! )");
        List<String> list = Arrays.asList(str);
        for (String sent: list) {
            boolean check = false;
            for (int i = 0; i < sent.length(); i++)
            {
                if (sent.charAt(i) != ' ' && !check)
                {
                    check = true;
                    out = out + Character.toUpperCase(sent.charAt(i));
                }
                else
                    out = out + sent.charAt(i);
            }
        }
        return out;
    }
}
