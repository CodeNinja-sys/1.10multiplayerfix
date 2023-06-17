/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import org.apache.logging.log4j.core.d.v;

public final class y {
    private static final String a = "<![CDATA[";
    private static final String b = "]]>";
    private static final String c = "]]&gt;";
    private static final String d = "]]>]]&gt;<![CDATA[";
    private static final int e = "]]>".length();

    private y() {
    }

    public static String a(String string) {
        if (v.a(string) || string.indexOf(34) == -1 && string.indexOf(38) == -1 && string.indexOf(60) == -1 && string.indexOf(62) == -1) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length() + 6);
        char c2 = ' ';
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            c2 = string.charAt(i2);
            if (c2 > '>') {
                stringBuilder.append(c2);
                continue;
            }
            if (c2 == '<') {
                stringBuilder.append("&lt;");
                continue;
            }
            if (c2 == '>') {
                stringBuilder.append("&gt;");
                continue;
            }
            if (c2 == '&') {
                stringBuilder.append("&amp;");
                continue;
            }
            if (c2 == '\"') {
                stringBuilder.append("&quot;");
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static void a(StringBuilder stringBuilder, String string) {
        if (string != null) {
            int n2 = string.indexOf(b);
            if (n2 < 0) {
                stringBuilder.append(string);
            } else {
                int n3 = 0;
                while (n2 > -1) {
                    stringBuilder.append(string.substring(n3, n2));
                    stringBuilder.append(d);
                    n3 = n2 + e;
                    if (n3 < string.length()) {
                        n2 = string.indexOf(b, n3);
                        continue;
                    }
                    return;
                }
                stringBuilder.append(string.substring(n3));
            }
        }
    }

    public static String b(String string) {
        if (v.a(string) || string.indexOf(34) == -1 && string.indexOf(92) == -1 && string.indexOf(47) == -1 && string.indexOf(8) == -1 && string.indexOf(12) == -1 && string.indexOf(10) == -1 && string.indexOf(13) == -1 && string.indexOf(9) == -1) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length() + 6);
        int n2 = string.length();
        block10: for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            String string2 = "\\\\";
            switch (c2) {
                case '\"': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append(c2);
                    continue block10;
                }
                case '\\': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append(c2);
                    continue block10;
                }
                case '/': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append(c2);
                    continue block10;
                }
                case '\b': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append('b');
                    continue block10;
                }
                case '\f': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append('f');
                    continue block10;
                }
                case '\n': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append('n');
                    continue block10;
                }
                case '\r': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append('r');
                    continue block10;
                }
                case '\t': {
                    stringBuilder.append("\\\\");
                    stringBuilder.append('t');
                    continue block10;
                }
                default: {
                    stringBuilder.append(c2);
                }
            }
        }
        return stringBuilder.toString();
    }
}

