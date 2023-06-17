/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.g;
import org.apache.commons.compress.archivers.h.h;
import org.apache.commons.compress.archivers.h.j;
import org.apache.commons.compress.archivers.h.r;

public class ab
extends ZipEntry
implements a {
    public static final int b = 3;
    public static final int c = 0;
    private static final int d = 65535;
    private static final int e = 16;
    private static final byte[] f = new byte[0];
    private int g = -1;
    private long h = -1L;
    private int i = 0;
    private int j = 0;
    private long k = 0L;
    private LinkedHashMap l = null;
    private r m = null;
    private String n = null;
    private byte[] o = null;
    private j p = new j();

    public ab(String string) {
        super(string);
        this.a(string);
    }

    public ab(ZipEntry zipEntry) {
        super(zipEntry);
        this.a(zipEntry.getName());
        byte[] arrby = zipEntry.getExtra();
        if (arrby != null) {
            this.a(org.apache.commons.compress.archivers.h.g.a(arrby, true, org.apache.commons.compress.archivers.h.h.f));
        } else {
            this.l();
        }
        this.setMethod(zipEntry.getMethod());
        this.h = zipEntry.getSize();
    }

    public ab(ab ab2) {
        this((ZipEntry)ab2);
        this.a(ab2.d());
        this.a(ab2.e());
        this.a(ab2.a(true));
    }

    protected ab() {
        this("");
    }

    public ab(File file, String string) {
        this(file.isDirectory() && !string.endsWith("/") ? string + "/" : string);
        if (file.isFile()) {
            this.setSize(file.length());
        }
        this.setTime(file.lastModified());
    }

    public Object clone() {
        ab ab2 = (ab)super.clone();
        ab2.a(this.d());
        ab2.a(this.e());
        ab2.a(this.a(true));
        return ab2;
    }

    public int getMethod() {
        return this.g;
    }

    public void setMethod(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + n2);
        }
        this.g = n2;
    }

    public int d() {
        return this.i;
    }

    public void a(int n2) {
        this.i = n2;
    }

    public long e() {
        return this.k;
    }

    public void a(long l2) {
        this.k = l2;
    }

    public void b(int n2) {
        this.a((long)(n2 << 16 | ((n2 & 0x80) == 0 ? 1 : 0) | (this.isDirectory() ? 16 : 0)));
        this.j = 3;
    }

    public int f() {
        return this.j != 3 ? 0 : (int)(this.e() >> 16 & 0xFFFFL);
    }

    public boolean g() {
        return (this.f() & 0xA000) == 40960;
    }

    public int h() {
        return this.j;
    }

    protected void c(int n2) {
        this.j = n2;
    }

    public void a(ap[] arrap) {
        this.l = new LinkedHashMap();
        for (ap ap2 : arrap) {
            if (ap2 instanceof r) {
                this.m = (r)ap2;
                continue;
            }
            this.l.put(ap2.cI_(), ap2);
        }
        this.l();
    }

    public ap[] i() {
        return this.a(false);
    }

    public ap[] a(boolean bl2) {
        if (this.l == null) {
            ap[] arrap;
            if (!bl2 || this.m == null) {
                arrap = new ap[]{};
            } else {
                ap[] arrap2 = new ap[1];
                arrap = arrap2;
                arrap2[0] = this.m;
            }
            return arrap;
        }
        ArrayList arrayList = new ArrayList(this.l.values());
        if (bl2 && this.m != null) {
            arrayList.add(this.m);
        }
        return arrayList.toArray(new ap[0]);
    }

    public void a(ap ap2) {
        if (ap2 instanceof r) {
            this.m = (r)ap2;
        } else {
            if (this.l == null) {
                this.l = new LinkedHashMap();
            }
            this.l.put(ap2.cI_(), ap2);
        }
        this.l();
    }

    public void b(ap ap2) {
        if (ap2 instanceof r) {
            this.m = (r)ap2;
        } else {
            LinkedHashMap linkedHashMap = this.l;
            this.l = new LinkedHashMap();
            this.l.put(ap2.cI_(), ap2);
            if (linkedHashMap != null) {
                linkedHashMap.remove(ap2.cI_());
                this.l.putAll(linkedHashMap);
            }
        }
        this.l();
    }

    public void a(ba ba2) {
        if (this.l == null) {
            throw new NoSuchElementException();
        }
        if (this.l.remove(ba2) == null) {
            throw new NoSuchElementException();
        }
        this.l();
    }

    public void j() {
        if (this.m == null) {
            throw new NoSuchElementException();
        }
        this.m = null;
        this.l();
    }

    public ap b(ba ba2) {
        if (this.l != null) {
            return (ap)this.l.get(ba2);
        }
        return null;
    }

    public r k() {
        return this.m;
    }

    public void setExtra(byte[] arrby) {
        try {
            ap[] arrap = org.apache.commons.compress.archivers.h.g.a(arrby, true, org.apache.commons.compress.archivers.h.h.f);
            this.a(arrap, true);
        }
        catch (ZipException zipException) {
            throw new RuntimeException("Error parsing extra fields for entry: " + this.getName() + " - " + zipException.getMessage(), zipException);
        }
    }

    protected void l() {
        super.setExtra(org.apache.commons.compress.archivers.h.g.a(this.a(true)));
    }

    public void a(byte[] arrby) {
        try {
            ap[] arrap = org.apache.commons.compress.archivers.h.g.a(arrby, false, org.apache.commons.compress.archivers.h.h.f);
            this.a(arrap, false);
        }
        catch (ZipException zipException) {
            throw new RuntimeException(zipException.getMessage(), zipException);
        }
    }

    public byte[] m() {
        byte[] arrby = this.getExtra();
        return arrby != null ? arrby : f;
    }

    public byte[] n() {
        return org.apache.commons.compress.archivers.h.g.b(this.a(true));
    }

    public String getName() {
        return this.n == null ? super.getName() : this.n;
    }

    public boolean isDirectory() {
        return this.getName().endsWith("/");
    }

    protected void a(String string) {
        if (string != null && this.h() == 0 && string.indexOf("/") == -1) {
            string = string.replace('\\', '/');
        }
        this.n = string;
    }

    public long getSize() {
        return this.h;
    }

    public void setSize(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("invalid entry size");
        }
        this.h = l2;
    }

    protected void a(String string, byte[] arrby) {
        this.a(string);
        this.o = arrby;
    }

    public byte[] o() {
        if (this.o != null) {
            byte[] arrby = new byte[this.o.length];
            System.arraycopy(this.o, 0, arrby, 0, this.o.length);
            return arrby;
        }
        return null;
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public j p() {
        return this.p;
    }

    public void a(j j2) {
        this.p = j2;
    }

    private void a(ap[] arrap, boolean bl2) {
        if (this.l == null) {
            this.a(arrap);
        } else {
            for (ap ap2 : arrap) {
                byte[] arrby;
                ap ap3 = ap2 instanceof r ? this.m : this.b(ap2.cI_());
                if (ap3 == null) {
                    this.a(ap2);
                    continue;
                }
                if (bl2) {
                    arrby = ap2.e();
                    ap3.a(arrby, 0, arrby.length);
                    continue;
                }
                arrby = ap2.c();
                ap3.b(arrby, 0, arrby.length);
            }
            this.l();
        }
    }

    public Date a() {
        return new Date(this.getTime());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ab ab2 = (ab)object;
        String string = this.getName();
        String string2 = ab2.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getComment();
        String string4 = ab2.getComment();
        if (string3 == null) {
            string3 = "";
        }
        if (string4 == null) {
            string4 = "";
        }
        return this.getTime() == ab2.getTime() && string3.equals(string4) && this.d() == ab2.d() && this.h() == ab2.h() && this.e() == ab2.e() && this.getMethod() == ab2.getMethod() && this.getSize() == ab2.getSize() && this.getCrc() == ab2.getCrc() && this.getCompressedSize() == ab2.getCompressedSize() && Arrays.equals(this.n(), ab2.n()) && Arrays.equals(this.m(), ab2.m()) && this.p.equals(ab2.p);
    }
}

