public class ChangeReg implements ChangeRegister
{
    public String change(String text)
    {
        StringBuilder txt = new StringBuilder();
        for (int i = 0; i < text.length(); i++)
        {
            if ((String.valueOf(text.charAt(i)).toLowerCase()).equals(String.valueOf(text.charAt(i))))
                txt.append(String.valueOf(text.charAt(i)).toUpperCase());
            else
                txt.append(String.valueOf(text.charAt(i)).toLowerCase());
        }
        return String.valueOf(txt);
    }
}
