public class AllLowercase implements ChangeRegister
{
    public String change(String text)
    {
        StringBuilder txt = new StringBuilder();
        for (int i = 0; i < text.length(); i++)
        {
            txt.append(String.valueOf(text.charAt(i)).toLowerCase());
        }
    return String.valueOf(txt);
    }
}
