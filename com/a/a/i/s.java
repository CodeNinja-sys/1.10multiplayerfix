/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import com.a.a.i.ak;
import com.a.a.i.ax;
import com.a.a.i.cc;
import com.a.a.i.o;
import com.a.a.i.p;
import com.a.a.i.u;
import com.a.a.i.v;
import com.a.a.i.w;
import com.a.a.i.x;
import com.a.a.i.y;
import com.a.a.i.z;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

public abstract class s
implements cc {
    private static final int a = 4096;
    private static final byte[] b = new byte[4096];

    protected s() {
    }

    public ak a(Charset charset) {
        return new u(this, charset, null);
    }

    public abstract InputStream a();

    public final InputStream b() {
        return this.a();
    }

    public InputStream c() {
        InputStream inputStream = this.a();
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream)inputStream : new BufferedInputStream(inputStream);
    }

    public s a(long l2, long l3) {
        return new y(this, l2, l3, null);
    }

    public boolean d() {
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            boolean bl2 = inputStream.read() == -1;
            return bl2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long e() {
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            long l2 = this.a(inputStream);
            return l2;
        }
        catch (IOException iOException) {
        }
        finally {
            ax2.close();
        }
        ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            long l3 = this.b(inputStream);
            return l3;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    private long a(InputStream inputStream) {
        long l2 = 0L;
        while (true) {
            long l3;
            if ((l3 = inputStream.skip(Math.min(inputStream.available(), Integer.MAX_VALUE))) <= 0L) {
                if (inputStream.read() == -1) {
                    return l2;
                }
                if (l2 == 0L && inputStream.available() == 0) {
                    throw new IOException();
                }
                ++l2;
                continue;
            }
            l2 += l3;
        }
    }

    private long b(InputStream inputStream) {
        long l2;
        long l3 = 0L;
        while ((l2 = (long)inputStream.read(b)) != -1L) {
            l3 += l2;
        }
        return l3;
    }

    public long a(OutputStream outputStream) {
        cl.a(outputStream);
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            long l2 = z.a(inputStream, outputStream);
            return l2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public long a(p p2) {
        cl.a(p2);
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            OutputStream outputStream = (OutputStream)ax2.a(p2.a());
            long l2 = z.a(inputStream, outputStream);
            return l2;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public byte[] f() {
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            byte[] arrby = z.a(inputStream);
            return arrby;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public Object a(o o2) {
        cl.a(o2);
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            Object object = z.a(inputStream, o2);
            return object;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public ae a(ai ai2) {
        aj aj2 = ai2.a();
        this.a(com.a.a.g.v.a(aj2));
        return aj2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(s s2) {
        cl.a(s2);
        byte[] arrby = new byte[4096];
        byte[] arrby2 = new byte[4096];
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a(this.a());
            InputStream inputStream2 = (InputStream)ax2.a(s2.a());
            while (true) {
                int n2;
                int n3;
                if ((n3 = z.b(inputStream, arrby, 0, 4096)) != (n2 = z.b(inputStream2, arrby2, 0, 4096)) || !Arrays.equals(arrby, arrby2)) {
                    boolean bl2 = false;
                    return bl2;
                }
                if (n3 != 4096) {
                    boolean bl3 = true;
                    return bl3;
                }
                continue;
                break;
            }
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public static s a(Iterable iterable) {
        return new w(iterable);
    }

    public static s a(Iterator iterator) {
        return s.a(jl.a(iterator));
    }

    public static s a(s ... arrs) {
        return s.a(jl.a(arrs));
    }

    public static s a(byte[] arrby) {
        return new v(arrby);
    }

    public static s g() {
        return x.i();
    }

    @Override
    public /* synthetic */ Object h() {
        return this.b();
    }
}

