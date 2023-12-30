public class AllUppercase implements ChangeRegister
{

    public String change(String text)
    {
        StringBuilder txt = new StringBuilder();
        for (int i = 0; i < text.length(); i++)
        {
            txt.append(String.valueOf(text.charAt(i)).toUpperCase());
        }
        return String.valueOf(txt);
    }
}
