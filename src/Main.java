import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //System.out.println(transliteration(str));
        //System.out.println(transliteration(str, "_"));
        //str = sc.nextLine();
        //System.out.println(truncate(str));
        //System.out.println(truncate(str, 13));
        String txt = sc.nextLine();
        ChangeRegister a = new AsSentence();
        System.out.println(a.change(txt));
        a = new AllLowercase();
        System.out.println(a.change(txt));
        a = new AllUppercase();
        System.out.println(a.change(txt));
        a = new ChangeReg();
        System.out.println(a.change(txt));
        a = new StartWithUpper();
        System.out.println(a.change(txt));
    }


    public static String transliteration(String inp, String opt)
    {
        String out = "";
        char[] InpArray = new char[inp.length()];
        inp.getChars(0, inp.length(), InpArray, 0);
        Map<Character, String> dict = new HashMap<Character, String>()
        {
            {
                put('а', "a");
                put('б', "b");
                put('в', "v");
                put('г', "g");
                put('д', "d");
                put('е', "e");
                put('ё', "e");
                put('ж', "zh");
                put('з', "z");
                put('и', "i");
                put('й', "i");
                put('к', "k");
                put('л', "l");
                put('м', "m");
                put('н', "n");
                put('о', "o");
                put('п', "p");
                put('р', "r");
                put('с', "s");
                put('т', "t");
                put('у', "u");
                put('ф', "f");
                put('х', "h");
                put('ц', "c");
                put('ч', "ch");
                put('ш', "sh");
                put('щ', "sh");
                put('ъ', "");
                put('ы', "i");
                put('ь', "");
                put('э', "e");
                put('ю', "yu");
                put('я', "ya");
                put(' ', opt);
            }
        };
        for (int i = 0; i < inp.length(); i++)
        {
            if ((inp.charAt(i) == Character.toUpperCase(inp.charAt(i))) && (dict.get(Character.toLowerCase(inp.charAt(i))) != null))
            {
                out += dict.get(Character.toLowerCase(inp.charAt(i))).toUpperCase();
                if ((inp.charAt(i) == 'Ч') || (inp.charAt(i) == 'Ш') || (inp.charAt(i) == 'Щ') || (inp.charAt(i) == 'Ю') || (inp.charAt(i) == 'Я') || (inp.charAt(i) == 'Ж'))
                {
                    char ehh = Character.toLowerCase((out.charAt(out.length() - 1)));
                    out = out.substring(0, out.length() - 1) + ehh;
                }
            } else if (dict.get(Character.toLowerCase(inp.charAt(i))) != null)
                out += dict.get(inp.charAt(i));
            else
                out += inp.charAt(i);
        }
        return out;
    }

    public static String transliteration(String inp)
    {
        String out = transliteration(inp, " ");
        return out;
    }

    public static String truncate(String inp, int n)
    {
        String out = "";
        if (inp.trim().length() <= n)
            return inp.trim();
        out = inp.substring(0, n);
        out = out.trim();
        out = out + "...";
        return out;
    }

    public static String truncate(String inp)
    {
        String out = truncate(inp, 16);
        return out;
    }

}