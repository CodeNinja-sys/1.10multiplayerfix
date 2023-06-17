/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

public class f {
    public static final String a = "ISO-8859-1";
    public static final String b = "US-ASCII";
    public static final String c = "UTF-16";
    public static final String d = "UTF-16BE";
    public static final String e = "UTF-16LE";
    public static final String f = "UTF-8";

    public static boolean a(String string) {
        if (string == null) {
            return false;
        }
        try {
            return Charset.isSupported(string);
        }
        catch (IllegalCharsetNameException illegalCharsetNameException) {
            return false;
        }
    }
}

