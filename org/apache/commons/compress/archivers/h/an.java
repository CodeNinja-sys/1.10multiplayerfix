/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.ao;
import org.apache.commons.compress.archivers.h.i;
import org.apache.commons.compress.archivers.h.l;
import org.apache.commons.compress.c.e;

public abstract class an {
    private static final Map c;
    private static final byte[] d;
    static final String a = "UTF8";
    static final am b;

    static ByteBuffer a(ByteBuffer byteBuffer, int n2) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        int n3 = byteBuffer.capacity() * 2;
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(n3 < n2 ? n2 : n3);
        byteBuffer2.put(byteBuffer);
        return byteBuffer2;
    }

    static void a(ByteBuffer byteBuffer, char c2) {
        byteBuffer.put((byte)37);
        byteBuffer.put((byte)85);
        byteBuffer.put(d[c2 >> 12 & 0xF]);
        byteBuffer.put(d[c2 >> 8 & 0xF]);
        byteBuffer.put(d[c2 >> 4 & 0xF]);
        byteBuffer.put(d[c2 & 0xF]);
    }

    public static am a(String string) {
        if (an.b(string)) {
            return b;
        }
        if (string == null) {
            return new i();
        }
        ao ao2 = (ao)c.get(string);
        if (ao2 != null) {
            return ao2.a();
        }
        try {
            Charset charset = Charset.forName(string);
            return new l(charset);
        }
        catch (UnsupportedCharsetException unsupportedCharsetException) {
            return new i(string);
        }
    }

    static boolean b(String string) {
        if (string == null) {
            string = System.getProperty("file.encoding");
        }
        if (e.f.name().equalsIgnoreCase(string)) {
            return true;
        }
        for (String string2 : e.f.aliases()) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    static {
        HashMap<String, ao> hashMap = new HashMap<String, ao>();
        char[] arrc = new char[]{'\u00c7', '\u00fc', '\u00e9', '\u00e2', '\u00e4', '\u00e0', '\u00e5', '\u00e7', '\u00ea', '\u00eb', '\u00e8', '\u00ef', '\u00ee', '\u00ec', '\u00c4', '\u00c5', '\u00c9', '\u00e6', '\u00c6', '\u00f4', '\u00f6', '\u00f2', '\u00fb', '\u00f9', '\u00ff', '\u00d6', '\u00dc', '\u00a2', '\u00a3', '\u00a5', '\u20a7', '\u0192', '\u00e1', '\u00ed', '\u00f3', '\u00fa', '\u00f1', '\u00d1', '\u00aa', '\u00ba', '\u00bf', '\u2310', '\u00ac', '\u00bd', '\u00bc', '\u00a1', '\u00ab', '\u00bb', '\u2591', '\u2592', '\u2593', '\u2502', '\u2524', '\u2561', '\u2562', '\u2556', '\u2555', '\u2563', '\u2551', '\u2557', '\u255d', '\u255c', '\u255b', '\u2510', '\u2514', '\u2534', '\u252c', '\u251c', '\u2500', '\u253c', '\u255e', '\u255f', '\u255a', '\u2554', '\u2569', '\u2566', '\u2560', '\u2550', '\u256c', '\u2567', '\u2568', '\u2564', '\u2565', '\u2559', '\u2558', '\u2552', '\u2553', '\u256b', '\u256a', '\u2518', '\u250c', '\u2588', '\u2584', '\u258c', '\u2590', '\u2580', '\u03b1', '\u00df', '\u0393', '\u03c0', '\u03a3', '\u03c3', '\u00b5', '\u03c4', '\u03a6', '\u0398', '\u03a9', '\u03b4', '\u221e', '\u03c6', '\u03b5', '\u2229', '\u2261', '\u00b1', '\u2265', '\u2264', '\u2320', '\u2321', '\u00f7', '\u2248', '\u00b0', '\u2219', '\u00b7', '\u221a', '\u207f', '\u00b2', '\u25a0', '\u00a0'};
        ao ao2 = new ao(arrc);
        hashMap.put("CP437", ao2);
        hashMap.put("Cp437", ao2);
        hashMap.put("cp437", ao2);
        hashMap.put("IBM437", ao2);
        hashMap.put("ibm437", ao2);
        char[] arrc2 = new char[]{'\u00c7', '\u00fc', '\u00e9', '\u00e2', '\u00e4', '\u00e0', '\u00e5', '\u00e7', '\u00ea', '\u00eb', '\u00e8', '\u00ef', '\u00ee', '\u00ec', '\u00c4', '\u00c5', '\u00c9', '\u00e6', '\u00c6', '\u00f4', '\u00f6', '\u00f2', '\u00fb', '\u00f9', '\u00ff', '\u00d6', '\u00dc', '\u00f8', '\u00a3', '\u00d8', '\u00d7', '\u0192', '\u00e1', '\u00ed', '\u00f3', '\u00fa', '\u00f1', '\u00d1', '\u00aa', '\u00ba', '\u00bf', '\u00ae', '\u00ac', '\u00bd', '\u00bc', '\u00a1', '\u00ab', '\u00bb', '\u2591', '\u2592', '\u2593', '\u2502', '\u2524', '\u00c1', '\u00c2', '\u00c0', '\u00a9', '\u2563', '\u2551', '\u2557', '\u255d', '\u00a2', '\u00a5', '\u2510', '\u2514', '\u2534', '\u252c', '\u251c', '\u2500', '\u253c', '\u00e3', '\u00c3', '\u255a', '\u2554', '\u2569', '\u2566', '\u2560', '\u2550', '\u256c', '\u00a4', '\u00f0', '\u00d0', '\u00ca', '\u00cb', '\u00c8', '\u0131', '\u00cd', '\u00ce', '\u00cf', '\u2518', '\u250c', '\u2588', '\u2584', '\u00a6', '\u00cc', '\u2580', '\u00d3', '\u00df', '\u00d4', '\u00d2', '\u00f5', '\u00d5', '\u00b5', '\u00fe', '\u00de', '\u00da', '\u00db', '\u00d9', '\u00fd', '\u00dd', '\u00af', '\u00b4', '\u00ad', '\u00b1', '\u2017', '\u00be', '\u00b6', '\u00a7', '\u00f7', '\u00b8', '\u00b0', '\u00a8', '\u00b7', '\u00b9', '\u00b3', '\u00b2', '\u25a0', '\u00a0'};
        ao ao3 = new ao(arrc2);
        hashMap.put("CP850", ao3);
        hashMap.put("Cp850", ao3);
        hashMap.put("cp850", ao3);
        hashMap.put("IBM850", ao3);
        hashMap.put("ibm850", ao3);
        c = Collections.unmodifiableMap(hashMap);
        d = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        b = new i(a);
    }
}

