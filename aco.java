/*
 * Decompiled with CFR 0.150.
 */
import java.util.regex.Pattern;
import org.apache.commons.c.am;

public class aco {
    private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

    public static String a(int n2) {
        int n3 = n2 / 20;
        int n4 = n3 / 60;
        if ((n3 %= 60) < 10) {
            return n4 + ":0" + n3;
        }
        return n4 + ":" + n3;
    }

    public static String a(String string) {
        return a.matcher(string).replaceAll("");
    }

    public static boolean b(String string) {
        return am.a((CharSequence)string);
    }
}

