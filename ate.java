/*
 * Decompiled with CFR 0.150.
 */
import io.netty.util.ab;
import io.netty.util.ad;

public class ate {
    public static final ad a = ad.a;
    public static final char[] b = new char[]{'.', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"'};
    public static final char[] c = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

    public static boolean a(char c2) {
        return c2 != '\u00a7' && c2 >= ' ' && c2 != '\u007f';
    }

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c2 : string.toCharArray()) {
            if (!ate.a(c2)) continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    static {
        ab.a(a);
    }
}

