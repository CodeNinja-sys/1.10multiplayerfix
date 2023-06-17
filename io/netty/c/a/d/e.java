/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.util.c.f;

final class e {
    static StringBuilder a() {
        return f.b().h();
    }

    static String a(StringBuilder stringBuilder) {
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        return stringBuilder.toString();
    }

    static void a(StringBuilder stringBuilder, String string, String string2) {
        if (string2 == null) {
            e.c(stringBuilder, string, "");
            return;
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            switch (c2) {
                case '\t': 
                case ' ': 
                case '\"': 
                case '(': 
                case ')': 
                case ',': 
                case '/': 
                case ':': 
                case ';': 
                case '<': 
                case '=': 
                case '>': 
                case '?': 
                case '@': 
                case '[': 
                case '\\': 
                case ']': 
                case '{': 
                case '}': {
                    e.c(stringBuilder, string, string2);
                    return;
                }
            }
        }
        e.b(stringBuilder, string, string2);
    }

    static void b(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append(string);
        stringBuilder.append('=');
        stringBuilder.append(string2);
        stringBuilder.append(';');
        stringBuilder.append(' ');
    }

    static void c(StringBuilder stringBuilder, String string, String string2) {
        if (string2 == null) {
            string2 = "";
        }
        stringBuilder.append(string);
        stringBuilder.append('=');
        stringBuilder.append('\"');
        stringBuilder.append(string2.replace("\\", "\\\\").replace("\"", "\\\""));
        stringBuilder.append('\"');
        stringBuilder.append(';');
        stringBuilder.append(' ');
    }

    static void a(StringBuilder stringBuilder, String string, long l2) {
        stringBuilder.append(string);
        stringBuilder.append('=');
        stringBuilder.append(l2);
        stringBuilder.append(';');
        stringBuilder.append(' ');
    }

    private e() {
    }
}

