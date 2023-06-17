/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.f.aa;
import org.apache.commons.compress.archivers.f.h;
import org.apache.commons.compress.archivers.f.u;
import org.apache.commons.compress.archivers.f.v;
import org.apache.commons.compress.archivers.f.w;
import org.apache.commons.compress.archivers.f.x;
import org.apache.commons.compress.archivers.f.z;

public class y
implements Closeable {
    private final RandomAccessFile a;
    private final List b = new ArrayList();
    private int c = 0;
    private final CRC32 d = new CRC32();
    private final CRC32 e = new CRC32();
    private long f = 0L;
    private boolean g = false;
    private org.apache.commons.compress.c.h h;
    private org.apache.commons.compress.c.h[] i;
    private Iterable j = Collections.singletonList(new x(w.c));
    private final Map k = new HashMap();

    public y(File file) {
        this.a = new RandomAccessFile(file, "rw");
        this.a.seek(32L);
    }

    public void a(w w2) {
        this.a(Collections.singletonList(new x(w2)));
    }

    public void a(Iterable iterable) {
        this.j = y.b(iterable);
    }

    public void close() {
        if (!this.g) {
            this.b();
        }
        this.a.close();
    }

    public u a(File file, String string) {
        u u2 = new u();
        u2.b(file.isDirectory());
        u2.a(string);
        u2.b(new Date(file.lastModified()));
        return u2;
    }

    public void a(a a2) {
        u u2 = (u)a2;
        this.b.add(u2);
    }

    public void a() {
        if (this.h != null) {
            this.h.flush();
            this.h.close();
        }
        u u2 = (u)this.b.get(this.b.size() - 1);
        if (this.f > 0L) {
            u2.a(true);
            ++this.c;
            u2.f(this.h.a());
            u2.g(this.f);
            u2.d(this.d.getValue());
            u2.e(this.e.getValue());
            u2.h(true);
            if (this.i != null) {
                long[] arrl = new long[this.i.length];
                for (int i2 = 0; i2 < this.i.length; ++i2) {
                    arrl[i2] = this.i[i2].a();
                }
                this.k.put(u2, arrl);
            }
        } else {
            u2.a(false);
            u2.f(0L);
            u2.g(0L);
            u2.h(false);
        }
        this.h = null;
        this.i = null;
        this.d.reset();
        this.e.reset();
        this.f = 0L;
    }

    public void a(int n2) {
        this.c().write(n2);
    }

    public void a(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (n3 > 0) {
            this.c().write(arrby, n2, n3);
        }
    }

    public void b() {
        if (this.g) {
            throw new IOException("This archive has already been finished");
        }
        this.g = true;
        long l2 = this.a.getFilePointer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        this.a(dataOutputStream);
        dataOutputStream.flush();
        byte[] arrby = byteArrayOutputStream.toByteArray();
        this.a.write(arrby);
        CRC32 cRC32 = new CRC32();
        this.a.seek(0L);
        this.a.write(v.b);
        this.a.write(0);
        this.a.write(2);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream2.writeLong(Long.reverseBytes(l2 - 32L));
        dataOutputStream2.writeLong(Long.reverseBytes(0xFFFFFFFFL & (long)arrby.length));
        cRC32.reset();
        cRC32.update(arrby);
        dataOutputStream2.writeInt(Integer.reverseBytes((int)cRC32.getValue()));
        dataOutputStream2.flush();
        byte[] arrby2 = byteArrayOutputStream2.toByteArray();
        cRC32.reset();
        cRC32.update(arrby2);
        this.a.writeInt(Integer.reverseBytes((int)cRC32.getValue()));
        this.a.write(arrby2);
    }

    private OutputStream c() {
        if (this.h == null) {
            this.h = this.d();
        }
        return this.h;
    }

    private org.apache.commons.compress.c.h d() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No current 7z entry");
        }
        OutputStream outputStream = new aa(this, null);
        ArrayList<org.apache.commons.compress.c.h> arrayList = new ArrayList<org.apache.commons.compress.c.h>();
        boolean bl2 = true;
        for (x x2 : this.a((u)this.b.get(this.b.size() - 1))) {
            if (!bl2) {
                org.apache.commons.compress.c.h h2 = new org.apache.commons.compress.c.h(outputStream);
                arrayList.add(h2);
                outputStream = h2;
            }
            outputStream = org.apache.commons.compress.archivers.f.h.a(outputStream, x2.a(), x2.b());
            bl2 = false;
        }
        if (!arrayList.isEmpty()) {
            this.i = arrayList.toArray(new org.apache.commons.compress.c.h[arrayList.size()]);
        }
        return new z(this, outputStream);
    }

    private Iterable a(u u2) {
        Iterable iterable = u2.q();
        return iterable == null ? this.j : iterable;
    }

    private void a(DataOutput dataOutput) {
        dataOutput.write(1);
        dataOutput.write(4);
        this.b(dataOutput);
        this.f(dataOutput);
        dataOutput.write(0);
    }

    private void b(DataOutput dataOutput) {
        if (this.c > 0) {
            this.c(dataOutput);
            this.d(dataOutput);
        }
        this.e(dataOutput);
        dataOutput.write(0);
    }

    private void c(DataOutput dataOutput) {
        dataOutput.write(6);
        this.a(dataOutput, 0L);
        this.a(dataOutput, 0xFFFFFFFFL & (long)this.c);
        dataOutput.write(9);
        for (u u2 : this.b) {
            if (!u2.b()) continue;
            this.a(dataOutput, u2.p());
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (u u2 : this.b) {
            if (!u2.b()) continue;
            dataOutput.writeInt(Integer.reverseBytes((int)u2.o()));
        }
        dataOutput.write(0);
    }

    private void d(DataOutput dataOutput) {
        dataOutput.write(7);
        dataOutput.write(11);
        this.a(dataOutput, this.c);
        dataOutput.write(0);
        for (u u2 : this.b) {
            if (!u2.b()) continue;
            this.a(dataOutput, u2);
        }
        dataOutput.write(12);
        for (u u2 : this.b) {
            if (!u2.b()) continue;
            long[] arrl = (long[])this.k.get(u2);
            if (arrl != null) {
                for (long l2 : arrl) {
                    this.a(dataOutput, l2);
                }
            }
            this.a(dataOutput, u2.getSize());
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (u u2 : this.b) {
            if (!u2.b()) continue;
            dataOutput.writeInt(Integer.reverseBytes((int)u2.m()));
        }
        dataOutput.write(0);
    }

    private void a(DataOutput dataOutput, u u2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = 0;
        for (x x2 : this.a(u2)) {
            ++n2;
            this.a(x2, byteArrayOutputStream);
        }
        this.a(dataOutput, n2);
        dataOutput.write(byteArrayOutputStream.toByteArray());
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            this.a(dataOutput, i2 + 1);
            this.a(dataOutput, i2);
        }
    }

    private void a(x x2, OutputStream outputStream) {
        byte[] arrby = x2.a().a();
        byte[] arrby2 = org.apache.commons.compress.archivers.f.h.a(x2.a()).b(x2.b());
        int n2 = arrby.length;
        if (arrby2.length > 0) {
            n2 |= 0x20;
        }
        outputStream.write(n2);
        outputStream.write(arrby);
        if (arrby2.length > 0) {
            outputStream.write(arrby2.length);
            outputStream.write(arrby2);
        }
    }

    private void e(DataOutput dataOutput) {
        dataOutput.write(8);
        dataOutput.write(0);
    }

    private void f(DataOutput dataOutput) {
        dataOutput.write(5);
        this.a(dataOutput, this.b.size());
        this.g(dataOutput);
        this.h(dataOutput);
        this.i(dataOutput);
        this.j(dataOutput);
        this.k(dataOutput);
        this.l(dataOutput);
        this.m(dataOutput);
        this.n(dataOutput);
        dataOutput.write(0);
    }

    private void g(DataOutput dataOutput) {
        boolean bl2 = false;
        for (u u2 : this.b) {
            if (u2.b()) continue;
            bl2 = true;
            break;
        }
        if (bl2) {
            dataOutput.write(14);
            BitSet bitSet = new BitSet(this.b.size());
            for (int i2 = 0; i2 < this.b.size(); ++i2) {
                bitSet.set(i2, !((u)this.b.get(i2)).b());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            this.a(dataOutputStream, bitSet, this.b.size());
            dataOutputStream.flush();
            byte[] arrby = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, arrby.length);
            dataOutput.write(arrby);
        }
    }

    private void h(DataOutput dataOutput) {
        boolean bl2 = false;
        int n2 = 0;
        BitSet bitSet = new BitSet(0);
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (((u)this.b.get(i2)).b()) continue;
            boolean bl3 = ((u)this.b.get(i2)).isDirectory();
            bitSet.set(n2++, !bl3);
            bl2 |= !bl3;
        }
        if (bl2) {
            dataOutput.write(15);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            this.a(dataOutputStream, bitSet, n2);
            dataOutputStream.flush();
            byte[] arrby = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, arrby.length);
            dataOutput.write(arrby);
        }
    }

    private void i(DataOutput dataOutput) {
        boolean bl2 = false;
        BitSet bitSet = new BitSet(0);
        int n2 = 0;
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (((u)this.b.get(i2)).b()) continue;
            boolean bl3 = ((u)this.b.get(i2)).c();
            bitSet.set(n2++, bl3);
            bl2 |= bl3;
        }
        if (bl2) {
            dataOutput.write(16);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            this.a(dataOutputStream, bitSet, n2);
            dataOutputStream.flush();
            byte[] arrby = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, arrby.length);
            dataOutput.write(arrby);
        }
    }

    private void j(DataOutput dataOutput) {
        dataOutput.write(17);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.write(0);
        for (u u2 : this.b) {
            dataOutputStream.write(u2.getName().getBytes("UTF-16LE"));
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
        Object object = byteArrayOutputStream.toByteArray();
        this.a(dataOutput, ((Object)object).length);
        dataOutput.write((byte[])object);
    }

    private void k(DataOutput dataOutput) {
        int n2 = 0;
        for (Object object2 : this.b) {
            if (!((u)object2).d()) continue;
            ++n2;
        }
        if (n2 > 0) {
            Object object;
            Object object2;
            dataOutput.write(18);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object2 = new DataOutputStream(byteArrayOutputStream);
            if (n2 != this.b.size()) {
                ((DataOutputStream)object2).write(0);
                object = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    ((BitSet)object).set(i2, ((u)this.b.get(i2)).d());
                }
                this.a((DataOutput)object2, (BitSet)object, this.b.size());
            } else {
                ((DataOutputStream)object2).write(1);
            }
            ((DataOutputStream)object2).write(0);
            for (u u2 : this.b) {
                if (!u2.d()) continue;
                ((DataOutputStream)object2).writeLong(Long.reverseBytes(u.d(u2.e())));
            }
            ((DataOutputStream)object2).flush();
            object = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void l(DataOutput dataOutput) {
        int n2 = 0;
        for (Object object2 : this.b) {
            if (!((u)object2).g()) continue;
            ++n2;
        }
        if (n2 > 0) {
            Object object;
            Object object2;
            dataOutput.write(19);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object2 = new DataOutputStream(byteArrayOutputStream);
            if (n2 != this.b.size()) {
                ((DataOutputStream)object2).write(0);
                object = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    ((BitSet)object).set(i2, ((u)this.b.get(i2)).g());
                }
                this.a((DataOutput)object2, (BitSet)object, this.b.size());
            } else {
                ((DataOutputStream)object2).write(1);
            }
            ((DataOutputStream)object2).write(0);
            for (u u2 : this.b) {
                if (!u2.g()) continue;
                ((DataOutputStream)object2).writeLong(Long.reverseBytes(u.d(u2.h())));
            }
            ((DataOutputStream)object2).flush();
            object = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void m(DataOutput dataOutput) {
        int n2 = 0;
        for (Object object2 : this.b) {
            if (!((u)object2).f()) continue;
            ++n2;
        }
        if (n2 > 0) {
            Object object;
            Object object2;
            dataOutput.write(20);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object2 = new DataOutputStream(byteArrayOutputStream);
            if (n2 != this.b.size()) {
                ((DataOutputStream)object2).write(0);
                object = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    ((BitSet)object).set(i2, ((u)this.b.get(i2)).f());
                }
                this.a((DataOutput)object2, (BitSet)object, this.b.size());
            } else {
                ((DataOutputStream)object2).write(1);
            }
            ((DataOutputStream)object2).write(0);
            for (u u2 : this.b) {
                if (!u2.f()) continue;
                ((DataOutputStream)object2).writeLong(Long.reverseBytes(u.d(u2.a())));
            }
            ((DataOutputStream)object2).flush();
            object = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void n(DataOutput dataOutput) {
        int n2 = 0;
        for (Object object2 : this.b) {
            if (!((u)object2).i()) continue;
            ++n2;
        }
        if (n2 > 0) {
            Object object;
            Object object2;
            dataOutput.write(21);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object2 = new DataOutputStream(byteArrayOutputStream);
            if (n2 != this.b.size()) {
                ((DataOutputStream)object2).write(0);
                object = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    ((BitSet)object).set(i2, ((u)this.b.get(i2)).i());
                }
                this.a((DataOutput)object2, (BitSet)object, this.b.size());
            } else {
                ((DataOutputStream)object2).write(1);
            }
            ((DataOutputStream)object2).write(0);
            for (u u2 : this.b) {
                if (!u2.i()) continue;
                ((DataOutputStream)object2).writeInt(Integer.reverseBytes(u2.j()));
            }
            ((DataOutputStream)object2).flush();
            object = byteArrayOutputStream.toByteArray();
            this.a(dataOutput, ((Object)object).length);
            dataOutput.write((byte[])object);
        }
    }

    private void a(DataOutput dataOutput, long l2) {
        int n2;
        int n3 = 0;
        int n4 = 128;
        for (n2 = 0; n2 < 8; ++n2) {
            if (l2 < 1L << 7 * (n2 + 1)) {
                n3 = (int)((long)n3 | l2 >>> 8 * n2);
                break;
            }
            n3 |= n4;
            n4 >>>= 1;
        }
        dataOutput.write(n3);
        while (n2 > 0) {
            dataOutput.write((int)(0xFFL & l2));
            l2 >>>= 8;
            --n2;
        }
    }

    private void a(DataOutput dataOutput, BitSet bitSet, int n2) {
        int n3 = 0;
        int n4 = 7;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 |= (bitSet.get(i2) ? 1 : 0) << n4;
            if (--n4 >= 0) continue;
            dataOutput.write(n3);
            n4 = 7;
            n3 = 0;
        }
        if (n4 != 7) {
            dataOutput.write(n3);
        }
    }

    private static Iterable b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        for (Object t2 : iterable) {
            linkedList.addFirst(t2);
        }
        return linkedList;
    }

    static /* synthetic */ CRC32 a(y y2) {
        return y2.d;
    }

    static /* synthetic */ RandomAccessFile b(y y2) {
        return y2.a;
    }

    static /* synthetic */ CRC32 c(y y2) {
        return y2.e;
    }

    static /* synthetic */ long d(y y2) {
        return y2.f++;
    }

    static /* synthetic */ long a(y y2, long l2) {
        return y2.f += l2;
    }
}

