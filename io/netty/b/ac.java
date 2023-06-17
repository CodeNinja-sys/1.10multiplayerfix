/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ad;
import io.netty.b.bi;
import io.netty.b.e;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.aa;
import io.netty.util.c.d;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ac
extends e {
    private final aa d;
    private final h e;
    private final boolean f;
    private final List g = new ArrayList();
    private final int h;
    private static final ByteBuffer i = (ByteBuffer)ByteBuffer.allocate(1).position(1);
    private boolean j;

    public ac(h h2, boolean bl2, int n2) {
        super(Integer.MAX_VALUE);
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        this.e = h2;
        this.f = bl2;
        this.h = n2;
        this.d = a.a(this);
    }

    public ac(h h2, boolean bl2, int n2, g ... arrg) {
        super(Integer.MAX_VALUE);
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        if (n2 < 2) {
            throw new IllegalArgumentException("maxNumComponents: " + n2 + " (expected: >= 2)");
        }
        this.e = h2;
        this.f = bl2;
        this.h = n2;
        this.b(0, arrg);
        this.am();
        this.y(0, this.j());
        this.d = a.a(this);
    }

    public ac(h h2, boolean bl2, int n2, Iterable iterable) {
        super(Integer.MAX_VALUE);
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        if (n2 < 2) {
            throw new IllegalArgumentException("maxNumComponents: " + n2 + " (expected: >= 2)");
        }
        this.e = h2;
        this.f = bl2;
        this.h = n2;
        this.b(0, iterable);
        this.am();
        this.y(0, this.j());
        this.d = a.a(this);
    }

    public ac d(g g2) {
        this.f(this.g.size(), g2);
        this.am();
        return this;
    }

    public ac a(g ... arrg) {
        this.b(this.g.size(), arrg);
        this.am();
        return this;
    }

    public ac a(Iterable iterable) {
        this.b(this.g.size(), iterable);
        this.am();
        return this;
    }

    public ac c(int n2, g g2) {
        this.f(n2, g2);
        this.am();
        return this;
    }

    private int f(int n2, g g2) {
        this.ai(n2);
        if (g2 == null) {
            throw new NullPointerException("buffer");
        }
        int n3 = g2.r();
        if (n3 == 0) {
            return n2;
        }
        ad ad2 = new ad(g2.a(ByteOrder.BIG_ENDIAN).R());
        if (n2 == this.g.size()) {
            this.g.add(ad2);
            if (n2 == 0) {
                ad2.d = n3;
            } else {
                ad ad3 = (ad)this.g.get(n2 - 1);
                ad2.c = ad3.d;
                ad2.d = ad2.c + n3;
            }
        } else {
            this.g.add(n2, ad2);
            this.aj(n2);
        }
        return n2;
    }

    public ac a(int n2, g ... arrg) {
        this.b(n2, arrg);
        this.am();
        return this;
    }

    private int b(int n2, g ... arrg) {
        this.ai(n2);
        if (arrg == null) {
            throw new NullPointerException("buffers");
        }
        int n3 = 0;
        for (g g2 : arrg) {
            if (g2 == null) break;
            n3 += g2.r();
        }
        if (n3 == 0) {
            return n2;
        }
        for (g g2 : arrg) {
            if (g2 == null) break;
            if (g2.u()) {
                int n4;
                if ((n2 = this.f(n2, g2) + 1) <= (n4 = this.g.size())) continue;
                n2 = n4;
                continue;
            }
            g2.ad();
        }
        return n2;
    }

    public ac a(int n2, Iterable iterable) {
        this.b(n2, iterable);
        this.am();
        return this;
    }

    private int b(int n2, Iterable arrayList) {
        ArrayList<g> arrayList2;
        if (arrayList == null) {
            throw new NullPointerException("buffers");
        }
        if (arrayList instanceof g) {
            return this.f(n2, (g)((Object)arrayList));
        }
        if (!(arrayList instanceof Collection)) {
            arrayList2 = new ArrayList<g>();
            for (g g2 : arrayList) {
                arrayList2.add(g2);
            }
            arrayList = arrayList2;
        }
        arrayList2 = arrayList;
        return this.b(n2, arrayList2.toArray(new g[arrayList2.size()]));
    }

    private void am() {
        int n2 = this.g.size();
        if (n2 > this.h) {
            int n3 = ((ad)this.g.get((int)(n2 - 1))).d;
            g g2 = this.al(n3);
            for (int i2 = 0; i2 < n2; ++i2) {
                ad ad2 = (ad)this.g.get(i2);
                g g3 = ad2.a;
                g2.b(g3);
                ad2.a();
            }
            ad ad3 = new ad(g2);
            ad3.d = ad3.b;
            this.g.clear();
            this.g.add(ad3);
        }
    }

    private void ai(int n2) {
        this.b();
        if (n2 < 0 || n2 > this.g.size()) {
            throw new IndexOutOfBoundsException(String.format("cIndex: %d (expected: >= 0 && <= numComponents(%d))", n2, this.g.size()));
        }
    }

    private void B(int n2, int n3) {
        this.b();
        if (n2 < 0 || n2 + n3 > this.g.size()) {
            throw new IndexOutOfBoundsException(String.format("cIndex: %d, numComponents: %d (expected: cIndex >= 0 && cIndex + numComponents <= totalNumComponents(%d))", n2, n3, this.g.size()));
        }
    }

    private void aj(int n2) {
        int n3 = this.g.size();
        if (n3 <= n2) {
            return;
        }
        ad ad2 = (ad)this.g.get(n2);
        if (n2 == 0) {
            ad2.c = 0;
            ad2.d = ad2.b;
            ++n2;
        }
        for (int i2 = n2; i2 < n3; ++i2) {
            ad ad3 = (ad)this.g.get(i2 - 1);
            ad ad4 = (ad)this.g.get(i2);
            ad4.c = ad3.d;
            ad4.d = ad4.c + ad4.b;
        }
    }

    public ac P(int n2) {
        this.ai(n2);
        ((ad)this.g.remove(n2)).a();
        this.aj(n2);
        return this;
    }

    public ac r(int n2, int n3) {
        this.B(n2, n3);
        List list = this.g.subList(n2, n2 + n3);
        for (ad ad2 : list) {
            ad2.a();
        }
        list.clear();
        this.aj(n2);
        return this;
    }

    public Iterator d() {
        this.b();
        ArrayList<g> arrayList = new ArrayList<g>(this.g.size());
        for (ad ad2 : this.g) {
            arrayList.add(ad2.a);
        }
        return arrayList.iterator();
    }

    public List s(int n2, int n3) {
        int n4;
        this.q(n2, n3);
        if (n3 == 0) {
            return Collections.emptyList();
        }
        int n5 = this.R(n2);
        ArrayList<g> arrayList = new ArrayList<g>(this.g.size());
        ad ad2 = (ad)this.g.get(n5);
        g g2 = ad2.a.S();
        g2.g(n2 - ad2.c);
        g g3 = g2;
        int n6 = n3;
        do {
            if (n6 <= (n4 = g3.r())) {
                g3.h(g3.p() + n6);
                arrayList.add(g3);
                break;
            }
            arrayList.add(g3);
            g3 = ((ad)this.g.get((int)(++n5))).a.S();
        } while ((n6 -= n4) > 0);
        for (n4 = 0; n4 < arrayList.size(); ++n4) {
            arrayList.set(n4, ((g)arrayList.get(n4)).R());
        }
        return arrayList;
    }

    @Override
    public boolean o() {
        int n2 = this.g.size();
        if (n2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((ad)this.g.get((int)i2)).a.o()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean W() {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.W();
        }
        return false;
    }

    @Override
    public byte[] X() {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.X();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public int Y() {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.Y();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean Z() {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.Z();
        }
        return false;
    }

    @Override
    public long aa() {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.aa();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public int j() {
        if (this.g.isEmpty()) {
            return 0;
        }
        return ((ad)this.g.get((int)(this.g.size() - 1))).d;
    }

    public ac Q(int n2) {
        this.b();
        if (n2 < 0 || n2 > this.k()) {
            throw new IllegalArgumentException("newCapacity: " + n2);
        }
        int n3 = this.j();
        if (n2 > n3) {
            int n4 = n2 - n3;
            int n5 = this.g.size();
            if (n5 < this.h) {
                g g2 = this.al(n4);
                g2.a(0, n4);
                this.f(this.g.size(), g2);
            } else {
                g g3 = this.al(n4);
                g3.a(0, n4);
                this.f(this.g.size(), g3);
                this.am();
            }
        } else if (n2 < n3) {
            int n6 = n3 - n2;
            ListIterator<ad> listIterator = this.g.listIterator(this.g.size());
            while (listIterator.hasPrevious()) {
                ad ad2 = (ad)listIterator.previous();
                if (n6 >= ad2.b) {
                    n6 -= ad2.b;
                    listIterator.remove();
                    continue;
                }
                ad ad3 = new ad(ad2.a.i(0, ad2.b - n6));
                ad3.c = ad2.c;
                ad3.d = ad3.c + ad3.b;
                listIterator.set(ad3);
                break;
            }
            if (this.p() > n2) {
                this.y(n2, n2);
            } else if (this.q() > n2) {
                this.Y(n2);
            }
        }
        return this;
    }

    @Override
    public h l() {
        return this.e;
    }

    @Override
    public ByteOrder m() {
        return ByteOrder.BIG_ENDIAN;
    }

    public int e() {
        return this.g.size();
    }

    public int f() {
        return this.h;
    }

    public int R(int n2) {
        this.M(n2);
        int n3 = 0;
        int n4 = this.g.size();
        while (n3 <= n4) {
            int n5 = n3 + n4 >>> 1;
            ad ad2 = (ad)this.g.get(n5);
            if (n2 >= ad2.d) {
                n3 = n5 + 1;
                continue;
            }
            if (n2 < ad2.c) {
                n4 = n5 - 1;
                continue;
            }
            return n5;
        }
        throw new Error("should not reach here");
    }

    public int S(int n2) {
        this.ai(n2);
        return ((ad)this.g.get((int)n2)).c;
    }

    @Override
    public byte m(int n2) {
        return this.c(n2);
    }

    @Override
    protected byte c(int n2) {
        ad ad2 = this.ak(n2);
        return ad2.a.m(n2 - ad2.c);
    }

    @Override
    protected short d(int n2) {
        ad ad2 = this.ak(n2);
        if (n2 + 2 <= ad2.d) {
            return ad2.a.o(n2 - ad2.c);
        }
        if (this.m() == ByteOrder.BIG_ENDIAN) {
            return (short)((this.c(n2) & 0xFF) << 8 | this.c(n2 + 1) & 0xFF);
        }
        return (short)(this.c(n2) & 0xFF | (this.c(n2 + 1) & 0xFF) << 8);
    }

    @Override
    protected int e(int n2) {
        ad ad2 = this.ak(n2);
        if (n2 + 3 <= ad2.d) {
            return ad2.a.r(n2 - ad2.c);
        }
        if (this.m() == ByteOrder.BIG_ENDIAN) {
            return (this.d(n2) & 0xFFFF) << 8 | this.c(n2 + 2) & 0xFF;
        }
        return this.d(n2) & 0xFFFF | (this.c(n2 + 2) & 0xFF) << 16;
    }

    @Override
    protected int K(int n2) {
        ad ad2 = this.ak(n2);
        if (n2 + 4 <= ad2.d) {
            return ad2.a.s(n2 - ad2.c);
        }
        if (this.m() == ByteOrder.BIG_ENDIAN) {
            return (this.d(n2) & 0xFFFF) << 16 | this.d(n2 + 2) & 0xFFFF;
        }
        return this.d(n2) & 0xFFFF | (this.d(n2 + 2) & 0xFFFF) << 16;
    }

    @Override
    protected long L(int n2) {
        ad ad2 = this.ak(n2);
        if (n2 + 8 <= ad2.d) {
            return ad2.a.u(n2 - ad2.c);
        }
        if (this.m() == ByteOrder.BIG_ENDIAN) {
            return ((long)this.K(n2) & 0xFFFFFFFFL) << 32 | (long)this.K(n2 + 4) & 0xFFFFFFFFL;
        }
        return (long)this.K(n2) & 0xFFFFFFFFL | ((long)this.K(n2 + 4) & 0xFFFFFFFFL) << 32;
    }

    public ac c(int n2, byte[] arrby, int n3, int n4) {
        this.b(n2, n4, n3, arrby.length);
        if (n4 == 0) {
            return this;
        }
        int n5 = this.R(n2);
        while (n4 > 0) {
            ad ad2 = (ad)this.g.get(n5);
            g g2 = ad2.a;
            int n6 = ad2.c;
            int n7 = Math.min(n4, g2.j() - (n2 - n6));
            g2.a(n2 - n6, arrby, n3, n7);
            n2 += n7;
            n3 += n7;
            n4 -= n7;
            ++n5;
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ac c(int n2, ByteBuffer byteBuffer) {
        int n3 = byteBuffer.limit();
        int n4 = byteBuffer.remaining();
        this.q(n2, n4);
        if (n4 == 0) {
            return this;
        }
        int n5 = this.R(n2);
        try {
            while (n4 > 0) {
                ad ad2 = (ad)this.g.get(n5);
                g g2 = ad2.a;
                int n6 = ad2.c;
                int n7 = Math.min(n4, g2.j() - (n2 - n6));
                byteBuffer.limit(byteBuffer.position() + n7);
                g2.a(n2 - n6, byteBuffer);
                n2 += n7;
                n4 -= n7;
                ++n5;
            }
        }
        finally {
            byteBuffer.limit(n3);
        }
        return this;
    }

    public ac c(int n2, g g2, int n3, int n4) {
        this.b(n2, n4, n3, g2.j());
        if (n4 == 0) {
            return this;
        }
        int n5 = this.R(n2);
        while (n4 > 0) {
            ad ad2 = (ad)this.g.get(n5);
            g g3 = ad2.a;
            int n6 = ad2.c;
            int n7 = Math.min(n4, g3.j() - (n2 - n6));
            g3.a(n2 - n6, g2, n3, n7);
            n2 += n7;
            n3 += n7;
            n4 -= n7;
            ++n5;
        }
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        int n4 = this.T();
        if (n4 == 1) {
            return gatheringByteChannel.write(this.k(n2, n3));
        }
        long l2 = gatheringByteChannel.write(this.l(n2, n3));
        if (l2 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)l2;
    }

    public ac b(int n2, OutputStream outputStream, int n3) {
        this.q(n2, n3);
        if (n3 == 0) {
            return this;
        }
        int n4 = this.R(n2);
        while (n3 > 0) {
            ad ad2 = (ad)this.g.get(n4);
            g g2 = ad2.a;
            int n5 = ad2.c;
            int n6 = Math.min(n3, g2.j() - (n2 - n5));
            g2.a(n2 - n5, outputStream, n6);
            n2 += n6;
            n3 -= n6;
            ++n4;
        }
        return this;
    }

    public ac t(int n2, int n3) {
        ad ad2 = this.ak(n2);
        ad2.a.b(n2 - ad2.c, n3);
        return this;
    }

    @Override
    protected void m(int n2, int n3) {
        this.t(n2, n3);
    }

    public ac u(int n2, int n3) {
        return (ac)super.c(n2, n3);
    }

    @Override
    protected void n(int n2, int n3) {
        ad ad2 = this.ak(n2);
        if (n2 + 2 <= ad2.d) {
            ad2.a.c(n2 - ad2.c, n3);
        } else if (this.m() == ByteOrder.BIG_ENDIAN) {
            this.m(n2, (byte)(n3 >>> 8));
            this.m(n2 + 1, (byte)n3);
        } else {
            this.m(n2, (byte)n3);
            this.m(n2 + 1, (byte)(n3 >>> 8));
        }
    }

    public ac v(int n2, int n3) {
        return (ac)super.d(n2, n3);
    }

    @Override
    protected void o(int n2, int n3) {
        ad ad2 = this.ak(n2);
        if (n2 + 3 <= ad2.d) {
            ad2.a.d(n2 - ad2.c, n3);
        } else if (this.m() == ByteOrder.BIG_ENDIAN) {
            this.n(n2, (short)(n3 >> 8));
            this.m(n2 + 2, (byte)n3);
        } else {
            this.n(n2, (short)n3);
            this.m(n2 + 2, (byte)(n3 >>> 16));
        }
    }

    public ac w(int n2, int n3) {
        return (ac)super.e(n2, n3);
    }

    @Override
    protected void p(int n2, int n3) {
        ad ad2 = this.ak(n2);
        if (n2 + 4 <= ad2.d) {
            ad2.a.e(n2 - ad2.c, n3);
        } else if (this.m() == ByteOrder.BIG_ENDIAN) {
            this.n(n2, (short)(n3 >>> 16));
            this.n(n2 + 2, (short)n3);
        } else {
            this.n(n2, (short)n3);
            this.n(n2 + 2, (short)(n3 >>> 16));
        }
    }

    public ac c(int n2, long l2) {
        return (ac)super.a(n2, l2);
    }

    @Override
    protected void b(int n2, long l2) {
        ad ad2 = this.ak(n2);
        if (n2 + 8 <= ad2.d) {
            ad2.a.a(n2 - ad2.c, l2);
        } else if (this.m() == ByteOrder.BIG_ENDIAN) {
            this.p(n2, (int)(l2 >>> 32));
            this.p(n2 + 4, (int)l2);
        } else {
            this.p(n2, (int)l2);
            this.p(n2 + 4, (int)(l2 >>> 32));
        }
    }

    public ac d(int n2, byte[] arrby, int n3, int n4) {
        this.a(n2, n4, n3, arrby.length);
        if (n4 == 0) {
            return this;
        }
        int n5 = this.R(n2);
        while (n4 > 0) {
            ad ad2 = (ad)this.g.get(n5);
            g g2 = ad2.a;
            int n6 = ad2.c;
            int n7 = Math.min(n4, g2.j() - (n2 - n6));
            g2.b(n2 - n6, arrby, n3, n7);
            n2 += n7;
            n3 += n7;
            n4 -= n7;
            ++n5;
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ac d(int n2, ByteBuffer byteBuffer) {
        int n3 = byteBuffer.limit();
        int n4 = byteBuffer.remaining();
        this.q(n2, n4);
        if (n4 == 0) {
            return this;
        }
        int n5 = this.R(n2);
        try {
            while (n4 > 0) {
                ad ad2 = (ad)this.g.get(n5);
                g g2 = ad2.a;
                int n6 = ad2.c;
                int n7 = Math.min(n4, g2.j() - (n2 - n6));
                byteBuffer.limit(byteBuffer.position() + n7);
                g2.b(n2 - n6, byteBuffer);
                n2 += n7;
                n4 -= n7;
                ++n5;
            }
        }
        finally {
            byteBuffer.limit(n3);
        }
        return this;
    }

    public ac d(int n2, g g2, int n3, int n4) {
        this.a(n2, n4, n3, g2.j());
        if (n4 == 0) {
            return this;
        }
        int n5 = this.R(n2);
        while (n4 > 0) {
            ad ad2 = (ad)this.g.get(n5);
            g g3 = ad2.a;
            int n6 = ad2.c;
            int n7 = Math.min(n4, g3.j() - (n2 - n6));
            g3.b(n2 - n6, g2, n3, n7);
            n2 += n7;
            n3 += n7;
            n4 -= n7;
            ++n5;
        }
        return this;
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.q(n2, n3);
        if (n3 == 0) {
            return inputStream.read(io.netty.util.c.d.a);
        }
        int n4 = this.R(n2);
        int n5 = 0;
        do {
            ad ad2 = (ad)this.g.get(n4);
            g g2 = ad2.a;
            int n6 = ad2.c;
            int n7 = Math.min(n3, g2.j() - (n2 - n6));
            int n8 = g2.a(n2 - n6, inputStream, n7);
            if (n8 < 0) {
                if (n5 != 0) break;
                return -1;
            }
            if (n8 == n7) {
                n2 += n7;
                n3 -= n7;
                n5 += n7;
                ++n4;
                continue;
            }
            n2 += n8;
            n3 -= n8;
            n5 += n8;
        } while (n3 > 0);
        return n5;
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.q(n2, n3);
        if (n3 == 0) {
            return scatteringByteChannel.read(i);
        }
        int n4 = this.R(n2);
        int n5 = 0;
        do {
            ad ad2 = (ad)this.g.get(n4);
            g g2 = ad2.a;
            int n6 = ad2.c;
            int n7 = Math.min(n3, g2.j() - (n2 - n6));
            int n8 = g2.a(n2 - n6, scatteringByteChannel, n7);
            if (n8 == 0) break;
            if (n8 < 0) {
                if (n5 != 0) break;
                return -1;
            }
            if (n8 == n7) {
                n2 += n7;
                n3 -= n7;
                n5 += n7;
                ++n4;
                continue;
            }
            n2 += n8;
            n3 -= n8;
            n5 += n8;
        } while (n3 > 0);
        return n5;
    }

    @Override
    public g h(int n2, int n3) {
        this.q(n2, n3);
        g g2 = bi.a(n3);
        if (n3 != 0) {
            this.a(n2, n3, this.R(n2), g2);
        }
        return g2;
    }

    private void a(int n2, int n3, int n4, g g2) {
        int n5 = 0;
        int n6 = n4;
        while (n3 > 0) {
            ad ad2 = (ad)this.g.get(n6);
            g g3 = ad2.a;
            int n7 = ad2.c;
            int n8 = Math.min(n3, g3.j() - (n2 - n7));
            g3.a(n2 - n7, g2, n5, n8);
            n2 += n8;
            n5 += n8;
            n3 -= n8;
            ++n6;
        }
        g2.h(g2.j());
    }

    public g T(int n2) {
        return this.V(n2).S();
    }

    public g U(int n2) {
        return this.W(n2).S();
    }

    public g V(int n2) {
        this.ai(n2);
        return ((ad)this.g.get((int)n2)).a;
    }

    public g W(int n2) {
        return this.ak((int)n2).a;
    }

    private ad ak(int n2) {
        this.M(n2);
        int n3 = 0;
        int n4 = this.g.size();
        while (n3 <= n4) {
            int n5 = n3 + n4 >>> 1;
            ad ad2 = (ad)this.g.get(n5);
            if (n2 >= ad2.d) {
                n3 = n5 + 1;
                continue;
            }
            if (n2 < ad2.c) {
                n4 = n5 - 1;
                continue;
            }
            return ad2;
        }
        throw new Error("should not reach here");
    }

    @Override
    public int T() {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.T();
        }
        int n2 = 0;
        int n3 = this.g.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            ad ad2 = (ad)this.g.get(i2);
            n2 += ad2.a.T();
        }
        return n2;
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        if (this.g.size() == 1) {
            return ((ad)this.g.get((int)0)).a.k(n2, n3);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        Comparable<ByteBuffer> comparable;
        if (this.g.size() == 1 && ((g)(comparable = ((ad)this.g.get((int)0)).a)).T() == 1) {
            return ((ad)this.g.get((int)0)).a.j(n2, n3);
        }
        comparable = ByteBuffer.allocate(n3).order(this.m());
        ByteBuffer[] arrbyteBuffer = this.l(n2, n3);
        for (int i2 = 0; i2 < arrbyteBuffer.length; ++i2) {
            ((ByteBuffer)comparable).put(arrbyteBuffer[i2]);
        }
        ((ByteBuffer)comparable).flip();
        return comparable;
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        this.q(n2, n3);
        if (n3 == 0) {
            return io.netty.util.c.d.l;
        }
        ArrayList<ByteBuffer> arrayList = new ArrayList<ByteBuffer>(this.g.size());
        int n4 = this.R(n2);
        while (n3 > 0) {
            ad ad2 = (ad)this.g.get(n4);
            g g2 = ad2.a;
            int n5 = ad2.c;
            int n6 = Math.min(n3, g2.j() - (n2 - n5));
            switch (g2.T()) {
                case 0: {
                    throw new UnsupportedOperationException();
                }
                case 1: {
                    arrayList.add(g2.j(n2 - n5, n6));
                    break;
                }
                default: {
                    Collections.addAll(arrayList, g2.l(n2 - n5, n6));
                }
            }
            n2 += n6;
            n3 -= n6;
            ++n4;
        }
        return arrayList.toArray(new ByteBuffer[arrayList.size()]);
    }

    public ac g() {
        this.b();
        int n2 = this.e();
        if (n2 <= 1) {
            return this;
        }
        ad ad2 = (ad)this.g.get(n2 - 1);
        int n3 = ad2.d;
        g g2 = this.al(n3);
        for (int i2 = 0; i2 < n2; ++i2) {
            ad ad3 = (ad)this.g.get(i2);
            g g3 = ad3.a;
            g2.b(g3);
            ad3.a();
        }
        this.g.clear();
        this.g.add(new ad(g2));
        this.aj(0);
        return this;
    }

    public ac x(int n2, int n3) {
        this.B(n2, n3);
        if (n3 <= 1) {
            return this;
        }
        int n4 = n2 + n3;
        ad ad2 = (ad)this.g.get(n4 - 1);
        int n5 = ad2.d - ((ad)this.g.get((int)n2)).c;
        g g2 = this.al(n5);
        for (int i2 = n2; i2 < n4; ++i2) {
            ad ad3 = (ad)this.g.get(i2);
            g g3 = ad3.a;
            g2.b(g3);
            ad3.a();
        }
        this.g.subList(n2 + 1, n4).clear();
        this.g.set(n2, new ad(g2));
        this.aj(n2);
        return this;
    }

    public ac h() {
        this.b();
        int n2 = this.p();
        if (n2 == 0) {
            return this;
        }
        int n3 = this.q();
        if (n2 == n3 && n3 == this.j()) {
            for (ad ad2 : this.g) {
                ad2.a();
            }
            this.g.clear();
            this.y(0, 0);
            this.b(n2);
            return this;
        }
        int n4 = this.R(n2);
        for (int i2 = 0; i2 < n4; ++i2) {
            ((ad)this.g.get(i2)).a();
        }
        this.g.subList(0, n4).clear();
        ad ad3 = (ad)this.g.get(0);
        int n5 = ad3.c;
        this.aj(0);
        this.y(n2 - n5, n3 - n5);
        this.b(n5);
        return this;
    }

    public ac i() {
        this.b();
        int n2 = this.p();
        if (n2 == 0) {
            return this;
        }
        int n3 = this.q();
        if (n2 == n3 && n3 == this.j()) {
            for (ad ad2 : this.g) {
                ad2.a();
            }
            this.g.clear();
            this.y(0, 0);
            this.b(n2);
            return this;
        }
        int n4 = this.R(n2);
        for (int i2 = 0; i2 < n4; ++i2) {
            ((ad)this.g.get(i2)).a();
        }
        this.g.subList(0, n4).clear();
        ad ad3 = (ad)this.g.get(0);
        int n5 = n2 - ad3.c;
        if (n5 == ad3.b) {
            this.g.remove(0);
        } else {
            ad ad4 = new ad(ad3.a.i(n5, ad3.b - n5));
            this.g.set(0, ad4);
        }
        this.aj(0);
        this.y(0, n3 - n2);
        this.b(n2);
        return this;
    }

    private g al(int n2) {
        if (this.f) {
            return this.l().d(n2);
        }
        return this.l().c(n2);
    }

    @Override
    public String toString() {
        String string = super.toString();
        string = string.substring(0, string.length() - 1);
        return string + ", components=" + this.g.size() + ')';
    }

    public ac X(int n2) {
        return (ac)super.g(n2);
    }

    public ac Y(int n2) {
        return (ac)super.h(n2);
    }

    public ac y(int n2, int n3) {
        return (ac)super.a(n2, n3);
    }

    public ac af() {
        return (ac)super.w();
    }

    public ac ag() {
        return (ac)super.x();
    }

    public ac ah() {
        return (ac)super.y();
    }

    public ac ai() {
        return (ac)super.z();
    }

    public ac aj() {
        return (ac)super.A();
    }

    public ac Z(int n2) {
        return (ac)super.k(n2);
    }

    public ac d(int n2, g g2) {
        return (ac)super.a(n2, g2);
    }

    public ac c(int n2, g g2, int n3) {
        return (ac)super.a(n2, g2, n3);
    }

    public ac c(int n2, byte[] arrby) {
        return (ac)super.a(n2, arrby);
    }

    public ac c(int n2, boolean bl2) {
        return (ac)super.b(n2, bl2);
    }

    public ac z(int n2, int n3) {
        return (ac)super.f(n2, n3);
    }

    public ac b(int n2, float f2) {
        return (ac)super.a(n2, f2);
    }

    public ac b(int n2, double d2) {
        return (ac)super.a(n2, d2);
    }

    public ac e(int n2, g g2) {
        return (ac)super.b(n2, g2);
    }

    public ac d(int n2, g g2, int n3) {
        return (ac)super.b(n2, g2, n3);
    }

    public ac d(int n2, byte[] arrby) {
        return (ac)super.b(n2, arrby);
    }

    public ac A(int n2, int n3) {
        return (ac)super.g(n2, n3);
    }

    public ac e(g g2) {
        return (ac)super.a(g2);
    }

    public ac c(g g2, int n2) {
        return (ac)super.a(g2, n2);
    }

    public ac c(g g2, int n2, int n3) {
        return (ac)super.a(g2, n2, n3);
    }

    public ac a(byte[] arrby) {
        return (ac)super.b(arrby);
    }

    public ac c(byte[] arrby, int n2, int n3) {
        return (ac)super.a(arrby, n2, n3);
    }

    public ac c(ByteBuffer byteBuffer) {
        return (ac)super.a(byteBuffer);
    }

    public ac b(OutputStream outputStream, int n2) {
        return (ac)super.a(outputStream, n2);
    }

    public ac aa(int n2) {
        return (ac)super.A(n2);
    }

    public ac b(boolean bl2) {
        return (ac)super.a(bl2);
    }

    public ac ab(int n2) {
        return (ac)super.B(n2);
    }

    public ac ac(int n2) {
        return (ac)super.C(n2);
    }

    public ac ad(int n2) {
        return (ac)super.D(n2);
    }

    public ac ae(int n2) {
        return (ac)super.E(n2);
    }

    public ac a(long l2) {
        return (ac)super.b(l2);
    }

    public ac af(int n2) {
        return (ac)super.F(n2);
    }

    public ac b(float f2) {
        return (ac)super.a(f2);
    }

    public ac b(double d2) {
        return (ac)super.a(d2);
    }

    public ac f(g g2) {
        return (ac)super.b(g2);
    }

    public ac d(g g2, int n2) {
        return (ac)super.b(g2, n2);
    }

    public ac d(g g2, int n2, int n3) {
        return (ac)super.b(g2, n2, n3);
    }

    public ac d(byte[] arrby) {
        return (ac)super.c(arrby);
    }

    public ac d(byte[] arrby, int n2, int n3) {
        return (ac)super.b(arrby, n2, n3);
    }

    public ac d(ByteBuffer byteBuffer) {
        return (ac)super.b(byteBuffer);
    }

    public ac ag(int n2) {
        return (ac)super.G(n2);
    }

    public ac ah(int n2) {
        return (ac)super.H(n2);
    }

    public ac ak() {
        return (ac)super.ab();
    }

    @Override
    public ByteBuffer[] V() {
        return this.l(this.p(), this.r());
    }

    public ac al() {
        return this.h();
    }

    @Override
    protected void c() {
        if (this.j) {
            return;
        }
        this.j = true;
        int n2 = this.g.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ad)this.g.get(i2)).a();
        }
        if (this.d != null) {
            this.d.b();
        }
    }

    @Override
    public g n() {
        return null;
    }

    @Override
    public /* synthetic */ g H(int n2) {
        return this.ah(n2);
    }

    @Override
    public /* synthetic */ g ab() {
        return this.ak();
    }

    @Override
    public /* synthetic */ g G(int n2) {
        return this.ag(n2);
    }

    @Override
    public /* synthetic */ g b(ByteBuffer byteBuffer) {
        return this.d(byteBuffer);
    }

    @Override
    public /* synthetic */ g b(g g2, int n2, int n3) {
        return this.d(g2, n2, n3);
    }

    @Override
    public /* synthetic */ g b(g g2, int n2) {
        return this.d(g2, n2);
    }

    @Override
    public /* synthetic */ g b(g g2) {
        return this.f(g2);
    }

    @Override
    public /* synthetic */ g c(byte[] arrby) {
        return this.d(arrby);
    }

    @Override
    public /* synthetic */ g b(byte[] arrby, int n2, int n3) {
        return this.d(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ g a(double d2) {
        return this.b(d2);
    }

    @Override
    public /* synthetic */ g a(float f2) {
        return this.b(f2);
    }

    @Override
    public /* synthetic */ g F(int n2) {
        return this.af(n2);
    }

    @Override
    public /* synthetic */ g b(long l2) {
        return this.a(l2);
    }

    @Override
    public /* synthetic */ g E(int n2) {
        return this.ae(n2);
    }

    @Override
    public /* synthetic */ g D(int n2) {
        return this.ad(n2);
    }

    @Override
    public /* synthetic */ g C(int n2) {
        return this.ac(n2);
    }

    @Override
    public /* synthetic */ g B(int n2) {
        return this.ab(n2);
    }

    @Override
    public /* synthetic */ g a(boolean bl2) {
        return this.b(bl2);
    }

    @Override
    public /* synthetic */ g A(int n2) {
        return this.aa(n2);
    }

    @Override
    public /* synthetic */ g a(OutputStream outputStream, int n2) {
        return this.b(outputStream, n2);
    }

    @Override
    public /* synthetic */ g a(ByteBuffer byteBuffer) {
        return this.c(byteBuffer);
    }

    @Override
    public /* synthetic */ g a(g g2, int n2, int n3) {
        return this.c(g2, n2, n3);
    }

    @Override
    public /* synthetic */ g a(g g2, int n2) {
        return this.c(g2, n2);
    }

    @Override
    public /* synthetic */ g a(g g2) {
        return this.e(g2);
    }

    @Override
    public /* synthetic */ g b(byte[] arrby) {
        return this.a(arrby);
    }

    @Override
    public /* synthetic */ g a(byte[] arrby, int n2, int n3) {
        return this.c(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ g g(int n2, int n3) {
        return this.A(n2, n3);
    }

    @Override
    public /* synthetic */ g b(int n2, g g2, int n3) {
        return this.d(n2, g2, n3);
    }

    @Override
    public /* synthetic */ g b(int n2, g g2) {
        return this.e(n2, g2);
    }

    @Override
    public /* synthetic */ g b(int n2, byte[] arrby) {
        return this.d(n2, arrby);
    }

    @Override
    public /* synthetic */ g a(int n2, double d2) {
        return this.b(n2, d2);
    }

    @Override
    public /* synthetic */ g a(int n2, long l2) {
        return this.c(n2, l2);
    }

    @Override
    public /* synthetic */ g a(int n2, float f2) {
        return this.b(n2, f2);
    }

    @Override
    public /* synthetic */ g e(int n2, int n3) {
        return this.w(n2, n3);
    }

    @Override
    public /* synthetic */ g d(int n2, int n3) {
        return this.v(n2, n3);
    }

    @Override
    public /* synthetic */ g f(int n2, int n3) {
        return this.z(n2, n3);
    }

    @Override
    public /* synthetic */ g c(int n2, int n3) {
        return this.u(n2, n3);
    }

    @Override
    public /* synthetic */ g b(int n2, boolean bl2) {
        return this.c(n2, bl2);
    }

    @Override
    public /* synthetic */ g b(int n2, int n3) {
        return this.t(n2, n3);
    }

    @Override
    public /* synthetic */ g a(int n2, g g2, int n3) {
        return this.c(n2, g2, n3);
    }

    @Override
    public /* synthetic */ g a(int n2, g g2) {
        return this.d(n2, g2);
    }

    @Override
    public /* synthetic */ g a(int n2, byte[] arrby) {
        return this.c(n2, arrby);
    }

    @Override
    public /* synthetic */ g k(int n2) {
        return this.Z(n2);
    }

    @Override
    public /* synthetic */ g C() {
        return this.al();
    }

    @Override
    public /* synthetic */ g B() {
        return this.i();
    }

    @Override
    public /* synthetic */ g A() {
        return this.aj();
    }

    @Override
    public /* synthetic */ g z() {
        return this.ai();
    }

    @Override
    public /* synthetic */ g y() {
        return this.ah();
    }

    @Override
    public /* synthetic */ g x() {
        return this.ag();
    }

    @Override
    public /* synthetic */ g w() {
        return this.af();
    }

    @Override
    public /* synthetic */ g a(int n2, int n3) {
        return this.y(n2, n3);
    }

    @Override
    public /* synthetic */ g h(int n2) {
        return this.Y(n2);
    }

    @Override
    public /* synthetic */ g g(int n2) {
        return this.X(n2);
    }

    @Override
    public /* synthetic */ g b(int n2, ByteBuffer byteBuffer) {
        return this.d(n2, byteBuffer);
    }

    @Override
    public /* synthetic */ g b(int n2, byte[] arrby, int n3, int n4) {
        return this.d(n2, arrby, n3, n4);
    }

    @Override
    public /* synthetic */ g b(int n2, g g2, int n3, int n4) {
        return this.d(n2, g2, n3, n4);
    }

    @Override
    public /* synthetic */ g a(int n2, OutputStream outputStream, int n3) {
        return this.b(n2, outputStream, n3);
    }

    @Override
    public /* synthetic */ g a(int n2, ByteBuffer byteBuffer) {
        return this.c(n2, byteBuffer);
    }

    @Override
    public /* synthetic */ g a(int n2, byte[] arrby, int n3, int n4) {
        return this.c(n2, arrby, n3, n4);
    }

    @Override
    public /* synthetic */ g a(int n2, g g2, int n3, int n4) {
        return this.c(n2, g2, n3, n4);
    }

    @Override
    public /* synthetic */ g f(int n2) {
        return this.Q(n2);
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.ah(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.ak();
    }
}

