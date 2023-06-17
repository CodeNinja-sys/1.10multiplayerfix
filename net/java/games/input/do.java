/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

public final class do {
    private static final String a = "2.0.5";
    private static final String b = "1088";
    private static final String c = "@BUILD_NUMBER@";
    private static final String d = "@API_VERSION@";

    private do() {
    }

    public static String a() {
        String string = "Unversioned";
        if (!d.equals(a)) {
            string = a;
        }
        if (!c.equals(b)) {
            string = string + "-b1088";
        }
        return string;
    }
}

