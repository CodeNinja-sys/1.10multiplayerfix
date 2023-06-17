/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.y;
import org.lwjgl.z;

public class x
implements Comparable {
    private static final boolean e;
    protected final ByteBuffer a;
    protected final Buffer b;
    protected final IntBuffer c;
    protected final LongBuffer d;

    public x(int n2) {
        this(BufferUtils.a(n2 * x.c()));
    }

    public x(ByteBuffer byteBuffer) {
        if (org.lwjgl.d.j) {
            x.b(byteBuffer);
        }
        this.a = byteBuffer.slice().order(byteBuffer.order());
        if (e) {
            this.c = null;
            this.d = this.a.asLongBuffer();
            this.b = this.d;
        } else {
            this.c = this.a.asIntBuffer();
            this.b = this.c;
            this.d = null;
        }
    }

    private static void b(ByteBuffer byteBuffer) {
        int n2;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("The source buffer is not direct.");
        }
        int n3 = n2 = e ? 8 : 4;
        if ((o.a((Buffer)byteBuffer) + (long)byteBuffer.position()) % (long)n2 != 0L || byteBuffer.remaining() % n2 != 0) {
            throw new IllegalArgumentException("The source buffer is not aligned to " + n2 + " bytes.");
        }
    }

    public ByteBuffer a() {
        return this.a;
    }

    public static boolean b() {
        return e;
    }

    public static int c() {
        return e ? 8 : 4;
    }

    public final int d() {
        return this.b.capacity();
    }

    public final int e() {
        return this.b.position();
    }

    public final int f() {
        return this.e() * x.c();
    }

    public final x a(int n2) {
        this.b.position(n2);
        return this;
    }

    public final int g() {
        return this.b.limit();
    }

    public final x b(int n2) {
        this.b.limit(n2);
        return this;
    }

    public final x h() {
        this.b.mark();
        return this;
    }

    public final x i() {
        this.b.reset();
        return this;
    }

    public final x j() {
        this.b.clear();
        return this;
    }

    public final x k() {
        this.b.flip();
        return this;
    }

    public final x l() {
        this.b.rewind();
        return this;
    }

    public final int m() {
        return this.b.remaining();
    }

    public final int n() {
        return this.m() * x.c();
    }

    public final boolean o() {
        return this.b.hasRemaining();
    }

    public static x c(int n2) {
        return new x(n2);
    }

    protected x a(ByteBuffer byteBuffer) {
        return new x(byteBuffer);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public x p() {
        int n2 = x.c();
        this.a.position(this.b.position() * n2);
        this.a.limit(this.b.limit() * n2);
        try {
            x x2 = this.a(this.a);
            return x2;
        }
        finally {
            this.a.clear();
        }
    }

    public x q() {
        x x2 = this.a(this.a);
        x2.a(this.b.position());
        x2.b(this.b.limit());
        return x2;
    }

    public x r() {
        y y2 = new y(this.a);
        y2.a(this.b.position());
        y2.b(this.b.limit());
        return y2;
    }

    public boolean s() {
        return false;
    }

    public long t() {
        if (e) {
            return this.d.get();
        }
        return (long)this.c.get() & 0xFFFFFFFFL;
    }

    public x a(long l2) {
        if (e) {
            this.d.put(l2);
        } else {
            this.c.put((int)l2);
        }
        return this;
    }

    public x a(z z2) {
        return this.a(z2.a());
    }

    public static void a(ByteBuffer byteBuffer, long l2) {
        if (e) {
            byteBuffer.putLong(l2);
        } else {
            byteBuffer.putInt((int)l2);
        }
    }

    public long d(int n2) {
        if (e) {
            return this.d.get(n2);
        }
        return (long)this.c.get(n2) & 0xFFFFFFFFL;
    }

    public x a(int n2, long l2) {
        if (e) {
            this.d.put(n2, l2);
        } else {
            this.c.put(n2, (int)l2);
        }
        return this;
    }

    public x a(int n2, z z2) {
        return this.a(n2, z2.a());
    }

    public static void a(ByteBuffer byteBuffer, int n2, long l2) {
        if (e) {
            byteBuffer.putLong(n2, l2);
        } else {
            byteBuffer.putInt(n2, (int)l2);
        }
    }

    public x a(long[] arrl, int n2, int n3) {
        if (e) {
            this.d.get(arrl, n2, n3);
        } else {
            x.a(n2, n3, arrl.length);
            if (n3 > this.c.remaining()) {
                throw new BufferUnderflowException();
            }
            int n4 = n2 + n3;
            for (int i2 = n2; i2 < n4; ++i2) {
                arrl[i2] = (long)this.c.get() & 0xFFFFFFFFL;
            }
        }
        return this;
    }

    public x a(long[] arrl) {
        return this.a(arrl, 0, arrl.length);
    }

    public x a(x x2) {
        if (e) {
            this.d.put(x2.d);
        } else {
            this.c.put(x2.c);
        }
        return this;
    }

    public x b(long[] arrl, int n2, int n3) {
        if (e) {
            this.d.put(arrl, n2, n3);
        } else {
            x.a(n2, n3, arrl.length);
            if (n3 > this.c.remaining()) {
                throw new BufferOverflowException();
            }
            int n4 = n2 + n3;
            for (int i2 = n2; i2 < n4; ++i2) {
                this.c.put((int)arrl[i2]);
            }
        }
        return this;
    }

    public final x b(long[] arrl) {
        return this.b(arrl, 0, arrl.length);
    }

    public x u() {
        if (e) {
            this.d.compact();
        } else {
            this.c.compact();
        }
        return this;
    }

    public ByteOrder v() {
        if (e) {
            return this.d.order();
        }
        return this.c.order();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("[pos=");
        stringBuilder.append(this.e());
        stringBuilder.append(" lim=");
        stringBuilder.append(this.g());
        stringBuilder.append(" cap=");
        stringBuilder.append(this.d());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n2 = 1;
        int n3 = this.e();
        for (int i2 = this.g() - 1; i2 >= n3; --i2) {
            n2 = 31 * n2 + (int)this.d(i2);
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof x)) {
            return false;
        }
        x x2 = (x)object;
        if (this.m() != x2.m()) {
            return false;
        }
        int n2 = this.e();
        int n3 = this.g() - 1;
        int n4 = x2.g() - 1;
        while (n3 >= n2) {
            long l2;
            long l3 = this.d(n3);
            if (l3 != (l2 = x2.d(n4))) {
                return false;
            }
            --n3;
            --n4;
        }
        return true;
    }

    public int compareTo(Object object) {
        x x2 = (x)object;
        int n2 = this.e() + Math.min(this.m(), x2.m());
        int n3 = this.e();
        int n4 = x2.e();
        while (n3 < n2) {
            long l2;
            long l3 = this.d(n3);
            if (l3 != (l2 = x2.d(n4))) {
                if (l3 < l2) {
                    return -1;
                }
                return 1;
            }
            ++n3;
            ++n4;
        }
        return this.m() - x2.m();
    }

    private static void a(int n2, int n3, int n4) {
        if ((n2 | n3 | n2 + n3 | n4 - (n2 + n3)) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static {
        boolean bl2 = false;
        try {
            Method method = Class.forName("org.lwjgl.ab").getDeclaredMethod("c", null);
            bl2 = (Boolean)method.invoke(null, null);
        }
        catch (Throwable throwable) {
        }
        finally {
            e = bl2;
        }
    }
}

