/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ac;
import io.netty.b.bc;
import io.netty.b.bd;
import io.netty.b.be;
import io.netty.b.bj;
import io.netty.b.bk;
import io.netty.b.bl;
import io.netty.b.bm;
import io.netty.b.bn;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.w;
import io.netty.util.c.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class bi {
    private static final h d = bj.b;
    public static final ByteOrder a = ByteOrder.BIG_ENDIAN;
    public static final ByteOrder b = ByteOrder.LITTLE_ENDIAN;
    public static final g c = d.a(0, 0);

    public static g a() {
        return d.c();
    }

    public static g b() {
        return d.d();
    }

    public static g a(int n2) {
        return d.c(n2);
    }

    public static g b(int n2) {
        return d.d(n2);
    }

    public static g a(int n2, int n3) {
        return d.c(n2, n3);
    }

    public static g b(int n2, int n3) {
        return d.d(n2, n3);
    }

    public static g a(byte[] arrby) {
        if (arrby.length == 0) {
            return c;
        }
        return new bl(d, arrby, arrby.length);
    }

    public static g a(byte[] arrby, int n2, int n3) {
        if (n3 == 0) {
            return c;
        }
        if (n2 == 0 && n3 == arrby.length) {
            return bi.a(arrby);
        }
        return bi.a(arrby).i(n2, n3);
    }

    public static g a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return c;
        }
        if (byteBuffer.hasArray()) {
            return bi.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()).a(byteBuffer.order());
        }
        if (u.f()) {
            if (byteBuffer.isReadOnly()) {
                if (byteBuffer.isDirect()) {
                    return new be(d, byteBuffer);
                }
                return new bd(d, byteBuffer);
            }
            return new bm(d, byteBuffer, byteBuffer.remaining());
        }
        if (byteBuffer.isReadOnly()) {
            return new bd(d, byteBuffer);
        }
        return new bk(d, byteBuffer, byteBuffer.remaining());
    }

    public static g a(g g2) {
        if (g2.u()) {
            return g2.R();
        }
        return c;
    }

    public static g a(byte[] ... arrby) {
        return bi.a(16, arrby);
    }

    public static g a(g ... arrg) {
        return bi.a(16, arrg);
    }

    public static g a(ByteBuffer ... arrbyteBuffer) {
        return bi.a(16, arrbyteBuffer);
    }

    public static g a(int n2, byte[] ... arrby) {
        switch (arrby.length) {
            case 0: {
                break;
            }
            case 1: {
                if (arrby[0].length == 0) break;
                return bi.a(arrby[0]);
            }
            default: {
                ArrayList<g> arrayList = new ArrayList<g>(arrby.length);
                for (byte[] arrby2 : arrby) {
                    if (arrby2 == null) break;
                    if (arrby2.length <= 0) continue;
                    arrayList.add(bi.a(arrby2));
                }
                if (arrayList.isEmpty()) break;
                return new ac(d, false, n2, arrayList);
            }
        }
        return c;
    }

    public static g a(int n2, g ... arrg) {
        switch (arrg.length) {
            case 0: {
                break;
            }
            case 1: {
                if (!arrg[0].u()) break;
                return bi.a(arrg[0].a(a));
            }
            default: {
                for (g g2 : arrg) {
                    if (!g2.u()) continue;
                    return new ac(d, false, n2, arrg);
                }
            }
        }
        return c;
    }

    public static g a(int n2, ByteBuffer ... arrbyteBuffer) {
        switch (arrbyteBuffer.length) {
            case 0: {
                break;
            }
            case 1: {
                if (!arrbyteBuffer[0].hasRemaining()) break;
                return bi.a(arrbyteBuffer[0].order(a));
            }
            default: {
                ArrayList<g> arrayList = new ArrayList<g>(arrbyteBuffer.length);
                for (ByteBuffer byteBuffer : arrbyteBuffer) {
                    if (byteBuffer == null) break;
                    if (byteBuffer.remaining() <= 0) continue;
                    arrayList.add(bi.a(byteBuffer.order(a)));
                }
                if (arrayList.isEmpty()) break;
                return new ac(d, false, n2, arrayList);
            }
        }
        return c;
    }

    public static ac c() {
        return bi.c(16);
    }

    public static ac c(int n2) {
        return new ac(d, false, n2);
    }

    public static g b(byte[] arrby) {
        if (arrby.length == 0) {
            return c;
        }
        return bi.a((byte[])arrby.clone());
    }

    public static g b(byte[] arrby, int n2, int n3) {
        if (n3 == 0) {
            return c;
        }
        byte[] arrby2 = new byte[n3];
        System.arraycopy(arrby, n2, arrby2, 0, n3);
        return bi.a(arrby2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static g b(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        if (n2 == 0) {
            return c;
        }
        byte[] arrby = new byte[n2];
        int n3 = byteBuffer.position();
        try {
            byteBuffer.get(arrby);
        }
        finally {
            byteBuffer.position(n3);
        }
        return bi.a(arrby).a(byteBuffer.order());
    }

    public static g b(g g2) {
        int n2 = g2.r();
        if (n2 > 0) {
            g g3 = bi.a(n2);
            g3.b(g2, g2.p(), n2);
            return g3;
        }
        return c;
    }

    public static g b(byte[] ... arrby) {
        switch (arrby.length) {
            case 0: {
                return c;
            }
            case 1: {
                if (arrby[0].length == 0) {
                    return c;
                }
                return bi.b(arrby[0]);
            }
        }
        int n2 = 0;
        for (byte[] arrby2 : arrby) {
            if (Integer.MAX_VALUE - n2 < arrby2.length) {
                throw new IllegalArgumentException("The total length of the specified arrays is too big.");
            }
            n2 += arrby2.length;
        }
        if (n2 == 0) {
            return c;
        }
        byte[] arrby3 = new byte[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            byte[] arrby2;
            arrby2 = arrby[i2];
            System.arraycopy(arrby2, 0, arrby3, n3, arrby2.length);
            n3 += arrby2.length;
        }
        return bi.a(arrby3);
    }

    public static g b(g ... arrg) {
        int n2;
        switch (arrg.length) {
            case 0: {
                return c;
            }
            case 1: {
                return bi.b(arrg[0]);
            }
        }
        ByteOrder byteOrder = null;
        int n3 = 0;
        for (g g2 : arrg) {
            n2 = g2.r();
            if (n2 <= 0) continue;
            if (Integer.MAX_VALUE - n3 < n2) {
                throw new IllegalArgumentException("The total length of the specified buffers is too big.");
            }
            n3 += n2;
            if (byteOrder != null) {
                if (byteOrder.equals(g2.m())) continue;
                throw new IllegalArgumentException("inconsistent byte order");
            }
            byteOrder = g2.m();
        }
        if (n3 == 0) {
            return c;
        }
        byte[] arrby = new byte[n3];
        int n4 = 0;
        for (int i2 = 0; i2 < arrg.length; ++i2) {
            g g2;
            g2 = arrg[i2];
            n2 = g2.r();
            g2.a(g2.p(), arrby, n4, n2);
            n4 += n2;
        }
        return bi.a(arrby).a(byteOrder);
    }

    public static g b(ByteBuffer ... arrbyteBuffer) {
        int n2;
        switch (arrbyteBuffer.length) {
            case 0: {
                return c;
            }
            case 1: {
                return bi.b(arrbyteBuffer[0]);
            }
        }
        ByteOrder byteOrder = null;
        int n3 = 0;
        for (ByteBuffer byteBuffer : arrbyteBuffer) {
            n2 = byteBuffer.remaining();
            if (n2 <= 0) continue;
            if (Integer.MAX_VALUE - n3 < n2) {
                throw new IllegalArgumentException("The total length of the specified buffers is too big.");
            }
            n3 += n2;
            if (byteOrder != null) {
                if (byteOrder.equals(byteBuffer.order())) continue;
                throw new IllegalArgumentException("inconsistent byte order");
            }
            byteOrder = byteBuffer.order();
        }
        if (n3 == 0) {
            return c;
        }
        byte[] arrby = new byte[n3];
        int n4 = 0;
        for (int i2 = 0; i2 < arrbyteBuffer.length; ++i2) {
            ByteBuffer byteBuffer;
            byteBuffer = arrbyteBuffer[i2];
            n2 = byteBuffer.remaining();
            int n5 = byteBuffer.position();
            byteBuffer.get(arrby, n4, n2);
            byteBuffer.position(n5);
            n4 += n2;
        }
        return bi.a(arrby).a(byteOrder);
    }

    public static g a(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            throw new NullPointerException("string");
        }
        if (charSequence instanceof CharBuffer) {
            return bi.a((CharBuffer)charSequence, charset);
        }
        return bi.a(CharBuffer.wrap(charSequence), charset);
    }

    public static g a(CharSequence charSequence, int n2, int n3, Charset charset) {
        if (charSequence == null) {
            throw new NullPointerException("string");
        }
        if (n3 == 0) {
            return c;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer)charSequence;
            if (charBuffer.hasArray()) {
                return bi.a(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + n2, n3, charset);
            }
            charBuffer = charBuffer.slice();
            charBuffer.limit(n3);
            charBuffer.position(n2);
            return bi.a(charBuffer, charset);
        }
        return bi.a(CharBuffer.wrap(charSequence, n2, n2 + n3), charset);
    }

    public static g a(char[] arrc, Charset charset) {
        if (arrc == null) {
            throw new NullPointerException("array");
        }
        return bi.a(arrc, 0, arrc.length, charset);
    }

    public static g a(char[] arrc, int n2, int n3, Charset charset) {
        if (arrc == null) {
            throw new NullPointerException("array");
        }
        if (n3 == 0) {
            return c;
        }
        return bi.a(CharBuffer.wrap(arrc, n2, n3), charset);
    }

    private static g a(CharBuffer charBuffer, Charset charset) {
        return w.a(d, true, charBuffer, charset);
    }

    public static g c(g g2) {
        ByteOrder byteOrder = g2.m();
        if (byteOrder == a) {
            return new bc(g2);
        }
        return new bc(g2.a(a)).a(b);
    }

    public static g d(int n2) {
        g g2 = bi.a(4);
        g2.E(n2);
        return g2;
    }

    public static g a(int ... arrn) {
        if (arrn == null || arrn.length == 0) {
            return c;
        }
        g g2 = bi.a(arrn.length * 4);
        for (int n2 : arrn) {
            g2.E(n2);
        }
        return g2;
    }

    public static g e(int n2) {
        g g2 = bi.a(2);
        g2.C(n2);
        return g2;
    }

    public static g a(short ... arrs) {
        if (arrs == null || arrs.length == 0) {
            return c;
        }
        g g2 = bi.a(arrs.length * 2);
        for (short s2 : arrs) {
            g2.C(s2);
        }
        return g2;
    }

    public static g b(int ... arrn) {
        if (arrn == null || arrn.length == 0) {
            return c;
        }
        g g2 = bi.a(arrn.length * 2);
        for (int n2 : arrn) {
            g2.C(n2);
        }
        return g2;
    }

    public static g f(int n2) {
        g g2 = bi.a(3);
        g2.D(n2);
        return g2;
    }

    public static g c(int ... arrn) {
        if (arrn == null || arrn.length == 0) {
            return c;
        }
        g g2 = bi.a(arrn.length * 3);
        for (int n2 : arrn) {
            g2.D(n2);
        }
        return g2;
    }

    public static g a(long l2) {
        g g2 = bi.a(8);
        g2.b(l2);
        return g2;
    }

    public static g a(long ... arrl) {
        if (arrl == null || arrl.length == 0) {
            return c;
        }
        g g2 = bi.a(arrl.length * 8);
        for (long l2 : arrl) {
            g2.b(l2);
        }
        return g2;
    }

    public static g a(boolean bl2) {
        g g2 = bi.a(1);
        g2.a(bl2);
        return g2;
    }

    public static g a(boolean ... arrbl) {
        if (arrbl == null || arrbl.length == 0) {
            return c;
        }
        g g2 = bi.a(arrbl.length);
        for (boolean bl2 : arrbl) {
            g2.a(bl2);
        }
        return g2;
    }

    public static g a(float f2) {
        g g2 = bi.a(4);
        g2.a(f2);
        return g2;
    }

    public static g a(float ... arrf) {
        if (arrf == null || arrf.length == 0) {
            return c;
        }
        g g2 = bi.a(arrf.length * 4);
        for (float f2 : arrf) {
            g2.a(f2);
        }
        return g2;
    }

    public static g a(double d2) {
        g g2 = bi.a(8);
        g2.a(d2);
        return g2;
    }

    public static g a(double ... arrd) {
        if (arrd == null || arrd.length == 0) {
            return c;
        }
        g g2 = bi.a(arrd.length * 8);
        for (double d2 : arrd) {
            g2.a(d2);
        }
        return g2;
    }

    public static g d(g g2) {
        return new bn(g2);
    }

    private bi() {
    }
}

