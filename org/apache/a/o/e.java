/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class e {
    public static Charset a(String string) {
        if (string == null) {
            return null;
        }
        try {
            return Charset.forName(string);
        }
        catch (UnsupportedCharsetException unsupportedCharsetException) {
            return null;
        }
    }

    public static Charset b(String string) {
        if (string == null) {
            return null;
        }
        try {
            return Charset.forName(string);
        }
        catch (UnsupportedCharsetException unsupportedCharsetException) {
            throw new UnsupportedEncodingException(string);
        }
    }
}

