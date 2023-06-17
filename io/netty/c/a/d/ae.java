/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.c.ac;
import io.netty.c.a.c.x;
import io.netty.c.a.d.ai;
import io.netty.c.a.d.ak;
import io.netty.c.a.d.bm;
import io.netty.channel.a.a;
import io.netty.util.c.ad;

public class ae
extends ai {
    private final int b;
    private final int c;
    private final int d;

    public ae() {
        this(6);
    }

    public ae(int n2) {
        this(n2, 15, 8);
    }

    public ae(int n2, int n3, int n4) {
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        if (n3 < 9 || n3 > 15) {
            throw new IllegalArgumentException("windowBits: " + n3 + " (expected: 9-15)");
        }
        if (n4 < 1 || n4 > 9) {
            throw new IllegalArgumentException("memLevel: " + n4 + " (expected: 1-9)");
        }
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    @Override
    protected ak a(bm bm2, String string) {
        String string2;
        String string3 = bm2.q().b("Content-Encoding");
        if (string3 != null && !"identity".equalsIgnoreCase(string3)) {
            return null;
        }
        ac ac2 = this.a(string);
        if (ac2 == null) {
            return null;
        }
        switch (ac2) {
            case b: {
                string2 = "gzip";
                break;
            }
            case a: {
                string2 = "deflate";
                break;
            }
            default: {
                throw new Error();
            }
        }
        return new ak(string2, new a(x.a(ac2, this.b, this.c, this.d)));
    }

    protected ac a(String string) {
        float f2 = -1.0f;
        float f3 = -1.0f;
        float f4 = -1.0f;
        for (String string2 : ad.a(string, ',')) {
            float f5 = 1.0f;
            int n2 = string2.indexOf(61);
            if (n2 != -1) {
                try {
                    f5 = Float.valueOf(string2.substring(n2 + 1)).floatValue();
                }
                catch (NumberFormatException numberFormatException) {
                    f5 = 0.0f;
                }
            }
            if (string2.contains("*")) {
                f2 = f5;
                continue;
            }
            if (string2.contains("gzip") && f5 > f3) {
                f3 = f5;
                continue;
            }
            if (!string2.contains("deflate") || !(f5 > f4)) continue;
            f4 = f5;
        }
        if (f3 > 0.0f || f4 > 0.0f) {
            if (f3 >= f4) {
                return ac.b;
            }
            return ac.a;
        }
        if (f2 > 0.0f) {
            if (f3 == -1.0f) {
                return ac.b;
            }
            if (f4 == -1.0f) {
                return ac.a;
            }
        }
        return null;
    }
}

