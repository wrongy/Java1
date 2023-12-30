import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartWithUpper implements ChangeRegister
{
    public String change(String text)
    {
        String out;
        text = text.toLowerCase();
        String[] str = text.split("(?<= |\\. |\\? |! |, )");
        List<String> list = Arrays.asList(str);
        Stream<String> strStream = list.stream().map(elem -> elem.substring(0, 1).toUpperCase() + elem.substring(1));//elem.substring(0, 1).toUpperCase() + elem.substring(1)
        out = strStream.collect(Collectors.joining());
        return out;
    }
}
