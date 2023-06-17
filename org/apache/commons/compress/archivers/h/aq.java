/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ag;
import org.apache.commons.compress.archivers.h.al;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.archivers.h.ar;
import org.apache.commons.compress.archivers.h.as;
import org.apache.commons.compress.archivers.h.au;
import org.apache.commons.compress.archivers.h.av;
import org.apache.commons.compress.archivers.h.aw;
import org.apache.commons.compress.archivers.h.ax;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.az;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;
import org.apache.commons.compress.archivers.h.f;
import org.apache.commons.compress.archivers.h.j;
import org.apache.commons.compress.archivers.h.t;
import org.apache.commons.compress.archivers.h.y;
import org.apache.commons.compress.c.i;

public class aq
implements Closeable {
    private static final int d = 509;
    static final int a = 15;
    static final int b = 8;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private final List i = new LinkedList();
    private final Map j = new HashMap(509);
    private final String k;
    private final am l;
    private final String m;
    private final RandomAccessFile n;
    private final boolean o;
    private boolean p;
    private final byte[] q = new byte[8];
    private final byte[] r = new byte[4];
    private final byte[] s = new byte[42];
    private final byte[] t = new byte[2];
    private static final int u = 42;
    private static final long v = ay.a(ag.l);
    static final int c = 22;
    private static final int w = 65557;
    private static final int x = 16;
    private static final int y = 20;
    private static final int z = 8;
    private static final int A = 48;
    private static final long B = 26L;
    private final Comparator C = new as(this);

    public aq(File file) {
        this(file, "UTF8");
    }

    public aq(String string) {
        this(new File(string), "UTF8");
    }

    public aq(String string, String string2) {
        this(new File(string), string2, true);
    }

    public aq(File file, String string) {
        this(file, string, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public aq(File file, String string, boolean bl2) {
        this.m = file.getAbsolutePath();
        this.k = string;
        this.l = an.a(string);
        this.o = bl2;
        this.n = new RandomAccessFile(file, "r");
        boolean bl3 = false;
        try {
            Map map = this.d();
            this.b(map);
            bl3 = true;
        }
        finally {
            if (!bl3) {
                this.p = true;
                org.apache.commons.compress.c.i.a(this.n);
            }
        }
    }

    public String a() {
        return this.k;
    }

    public void close() {
        this.p = true;
        this.n.close();
    }

    public static void a(aq aq2) {
        org.apache.commons.compress.c.i.a(aq2);
    }

    public Enumeration b() {
        return Collections.enumeration(this.i);
    }

    public Enumeration c() {
        ab[] arrab = this.i.toArray(new ab[0]);
        Arrays.sort(arrab, this.C);
        return Collections.enumeration(Arrays.asList(arrab));
    }

    public ab a(String string) {
        LinkedList linkedList = (LinkedList)this.j.get(string);
        return linkedList != null ? (ab)linkedList.getFirst() : null;
    }

    public Iterable b(String string) {
        List list = (List)this.j.get(string);
        return list != null ? list : Collections.emptyList();
    }

    public Iterable c(String string) {
        ab[] arrab = new ab[]{};
        if (this.j.containsKey(string)) {
            arrab = ((LinkedList)this.j.get(string)).toArray(arrab);
            Arrays.sort(arrab, this.C);
        }
        return Arrays.asList(arrab);
    }

    public boolean a(ab ab2) {
        return bb.a(ab2);
    }

    public InputStream b(ab ab2) {
        if (!(ab2 instanceof av)) {
            return null;
        }
        ax ax2 = ((av)ab2).b();
        bb.b(ab2);
        long l2 = ax.a(ax2);
        au au2 = new au(this, l2, ab2.getCompressedSize());
        switch (az.a(ab2.getMethod())) {
            case a: {
                return au2;
            }
            case b: {
                return new t(au2);
            }
            case g: {
                return new f(ab2.p().e(), ab2.p().f(), new BufferedInputStream(au2));
            }
            case i: {
                au2.a();
                Inflater inflater = new Inflater(true);
                return new ar(this, au2, inflater, inflater);
            }
        }
        throw new ZipException("Found unsupported compression method " + ab2.getMethod());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c(ab ab2) {
        if (ab2 != null && ab2.g()) {
            InputStream inputStream = null;
            try {
                inputStream = this.b(ab2);
                byte[] arrby = org.apache.commons.compress.c.i.a(inputStream);
                String string = this.l.a(arrby);
                return string;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() {
        try {
            if (!this.p) {
                System.err.println("Cleaning up unclosed ZipFile for archive " + this.m);
                this.close();
            }
        }
        finally {
            super.finalize();
        }
    }

    private Map d() {
        HashMap hashMap = new HashMap();
        this.e();
        this.n.readFully(this.r);
        long l2 = ay.a(this.r);
        if (l2 != v && this.i()) {
            throw new IOException("central directory is empty, can't expand corrupt archive.");
        }
        while (l2 == v) {
            this.a(hashMap);
            this.n.readFully(this.r);
            l2 = ay.a(this.r);
        }
        return hashMap;
    }

    private void a(Map map) {
        this.n.readFully(this.s);
        int n2 = 0;
        ax ax2 = new ax(null);
        av av2 = new av(ax2);
        int n3 = ba.a(this.s, n2);
        n2 += 2;
        av2.c(n3 >> 8 & 0xF);
        j j2 = org.apache.commons.compress.archivers.h.j.a(this.s, n2 += 2);
        boolean bl2 = j2.a();
        am am2 = bl2 ? an.b : this.l;
        av2.a(j2);
        av2.setMethod(ba.a(this.s, n2 += 2));
        long l2 = bb.c(ay.a(this.s, n2 += 2));
        av2.setTime(l2);
        av2.setCrc(ay.a(this.s, n2 += 4));
        av2.setCompressedSize(ay.a(this.s, n2 += 4));
        av2.setSize(ay.a(this.s, n2 += 4));
        int n4 = ba.a(this.s, n2 += 4);
        int n5 = ba.a(this.s, n2 += 2);
        int n6 = ba.a(this.s, n2 += 2);
        int n7 = ba.a(this.s, n2 += 2);
        av2.a(ba.a(this.s, n2 += 2));
        av2.a(ay.a(this.s, n2 += 2));
        byte[] arrby = new byte[n4];
        this.n.readFully(arrby);
        av2.a(am2.a(arrby), arrby);
        ax.a(ax2, ay.a(this.s, n2 += 4));
        this.i.add(av2);
        byte[] arrby2 = new byte[n5];
        this.n.readFully(arrby2);
        av2.a(arrby2);
        this.a(av2, ax2, n7);
        byte[] arrby3 = new byte[n6];
        this.n.readFully(arrby3);
        av2.setComment(am2.a(arrby3));
        if (!bl2 && this.o) {
            map.put(av2, new aw(arrby, arrby3, null));
        }
    }

    private void a(ab ab2, ax ax2, int n2) {
        y y2 = (y)ab2.b(org.apache.commons.compress.archivers.h.y.a);
        if (y2 != null) {
            boolean bl2 = ab2.getSize() == 0xFFFFFFFFL;
            boolean bl3 = ab2.getCompressedSize() == 0xFFFFFFFFL;
            boolean bl4 = ax.b(ax2) == 0xFFFFFFFFL;
            y2.a(bl2, bl3, bl4, n2 == 65535);
            if (bl2) {
                ab2.setSize(y2.b().b());
            } else if (bl3) {
                y2.a(new al(ab2.getSize()));
            }
            if (bl3) {
                ab2.setCompressedSize(y2.g().b());
            } else if (bl2) {
                y2.b(new al(ab2.getCompressedSize()));
            }
            if (bl4) {
                ax.a(ax2, y2.h().b());
            }
        }
    }

    private void e() {
        boolean bl2;
        this.h();
        boolean bl3 = false;
        boolean bl4 = bl2 = this.n.getFilePointer() > 20L;
        if (bl2) {
            this.n.seek(this.n.getFilePointer() - 20L);
            this.n.readFully(this.r);
            bl3 = Arrays.equals(ag.o, this.r);
        }
        if (!bl3) {
            if (bl2) {
                this.a(16);
            }
            this.g();
        } else {
            this.f();
        }
    }

    private void f() {
        this.a(4);
        this.n.readFully(this.q);
        this.n.seek(al.a(this.q));
        this.n.readFully(this.r);
        if (!Arrays.equals(this.r, ag.n)) {
            throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
        }
        this.a(44);
        this.n.readFully(this.q);
        this.n.seek(al.a(this.q));
    }

    private void g() {
        this.a(16);
        this.n.readFully(this.r);
        this.n.seek(ay.a(this.r));
    }

    private void h() {
        boolean bl2 = this.a(22L, 65557L, ag.m);
        if (!bl2) {
            throw new ZipException("archive is not a ZIP archive");
        }
    }

    private boolean a(long l2, long l3, byte[] arrby) {
        long l4;
        boolean bl2 = false;
        long l5 = Math.max(0L, this.n.length() - l3);
        if (l4 >= 0L) {
            for (l4 = this.n.length() - l2; l4 >= l5; --l4) {
                this.n.seek(l4);
                int n2 = this.n.read();
                if (n2 == -1) break;
                if (n2 != arrby[0] || (n2 = this.n.read()) != arrby[1] || (n2 = this.n.read()) != arrby[2] || (n2 = this.n.read()) != arrby[3]) continue;
                bl2 = true;
                break;
            }
        }
        if (bl2) {
            this.n.seek(l4);
        }
        return bl2;
    }

    private void a(int n2) {
        int n3;
        for (int i2 = 0; i2 < n2; i2 += n3) {
            n3 = this.n.skipBytes(n2 - i2);
            if (n3 > 0) continue;
            throw new EOFException();
        }
    }

    private void b(Map map) {
        for (ab ab2 : this.i) {
            LinkedList<av> linkedList;
            Object object;
            int n2;
            av av2 = (av)ab2;
            ax ax2 = av2.b();
            long l2 = ax.b(ax2);
            this.n.seek(l2 + 26L);
            this.n.readFully(this.t);
            int n3 = ba.a(this.t);
            this.n.readFully(this.t);
            int n4 = ba.a(this.t);
            for (int i2 = n3; i2 > 0; i2 -= n2) {
                n2 = this.n.skipBytes(i2);
                if (n2 > 0) continue;
                throw new IOException("failed to skip file name in local file header");
            }
            byte[] arrby = new byte[n4];
            this.n.readFully(arrby);
            av2.setExtra(arrby);
            ax.b(ax2, l2 + 26L + 2L + 2L + (long)n3 + (long)n4);
            if (map.containsKey(av2)) {
                object = (aw)map.get(av2);
                bb.a(av2, aw.a((aw)object), aw.b((aw)object));
            }
            if ((linkedList = (LinkedList<av>)this.j.get(object = av2.getName())) == null) {
                linkedList = new LinkedList<av>();
                this.j.put(object, linkedList);
            }
            linkedList.addLast(av2);
        }
    }

    private boolean i() {
        this.n.seek(0L);
        this.n.readFully(this.r);
        return Arrays.equals(this.r, ag.j);
    }

    static /* synthetic */ RandomAccessFile b(aq aq2) {
        return aq2.n;
    }
}

