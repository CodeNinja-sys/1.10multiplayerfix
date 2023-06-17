/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class k {
    public static final String a = "";
    public static final String b = "'";
    public static final String c = System.getProperty("line.separator");

    private k() {
        throw new UnsupportedOperationException();
    }

    public static String a(char c2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static boolean a(String string) {
        return string == null || a.equals(string);
    }

    public static String a(String string, char c2, char c3) {
        return c2 + string + c3;
    }

    public static String a(String[] arrstring, String string) {
        return k.a(Arrays.asList(arrstring), string);
    }

    public static String a(List list, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

