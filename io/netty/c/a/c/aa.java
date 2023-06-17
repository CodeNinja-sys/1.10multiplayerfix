/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.jcraft.jzlib.Deflater
 *  com.jcraft.jzlib.Inflater
 *  com.jcraft.jzlib.JZlib
 *  com.jcraft.jzlib.JZlib$WrapperType
 */
package io.netty.c.a.c;

import com.jcraft.jzlib.Deflater;
import com.jcraft.jzlib.Inflater;
import com.jcraft.jzlib.JZlib;
import io.netty.c.a.c.a;
import io.netty.c.a.c.ac;
import io.netty.c.a.c.c;

final class aa {
    static void a(Inflater inflater, String string, int n2) {
        throw aa.b(inflater, string, n2);
    }

    static void a(Deflater deflater, String string, int n2) {
        throw aa.b(deflater, string, n2);
    }

    static c b(Inflater inflater, String string, int n2) {
        return new c(string + " (" + n2 + ')' + (inflater.msg != null ? ": " + inflater.msg : ""));
    }

    static a b(Deflater deflater, String string, int n2) {
        return new a(string + " (" + n2 + ')' + (deflater.msg != null ? ": " + deflater.msg : ""));
    }

    static JZlib.WrapperType a(ac ac2) {
        JZlib.WrapperType wrapperType;
        switch (ac2) {
            case c: {
                wrapperType = JZlib.W_NONE;
                break;
            }
            case a: {
                wrapperType = JZlib.W_ZLIB;
                break;
            }
            case b: {
                wrapperType = JZlib.W_GZIP;
                break;
            }
            case d: {
                wrapperType = JZlib.W_ANY;
                break;
            }
            default: {
                throw new Error();
            }
        }
        return wrapperType;
    }

    static int b(ac ac2) {
        int n2;
        switch (ac2) {
            case c: {
                n2 = 0;
                break;
            }
            case a: 
            case d: {
                n2 = 2;
                break;
            }
            case b: {
                n2 = 10;
                break;
            }
            default: {
                throw new Error();
            }
        }
        return n2;
    }

    private aa() {
    }
}

