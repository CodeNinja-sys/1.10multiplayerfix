/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.b;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.h;
import org.apache.commons.compress.archivers.h.k;
import org.apache.commons.compress.archivers.h.o;
import org.apache.commons.compress.archivers.h.p;
import org.apache.commons.compress.archivers.h.r;
import org.apache.commons.compress.archivers.h.s;
import org.apache.commons.compress.archivers.h.w;
import org.apache.commons.compress.archivers.h.x;
import org.apache.commons.compress.archivers.h.y;

public class g {
    private static final int a = 4;
    private static final Map b = new ConcurrentHashMap();

    public static void a(Class class_) {
        try {
            ap ap2 = (ap)class_.newInstance();
            b.put(ap2.cI_(), class_);
        }
        catch (ClassCastException classCastException) {
            throw new RuntimeException(class_ + " doesn't implement ZipExtraField");
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException(class_ + " is not a concrete class");
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(class_ + "'s no-arg constructor is not public");
        }
    }

    public static ap a(ba ba2) {
        Class class_ = (Class)b.get(ba2);
        if (class_ != null) {
            return (ap)class_.newInstance();
        }
        s s2 = new s();
        s2.a(ba2);
        return s2;
    }

    public static ap[] a(byte[] arrby) {
        return g.a(arrby, true, h.d);
    }

    public static ap[] a(byte[] arrby, boolean bl2) {
        return g.a(arrby, bl2, h.d);
    }

    public static ap[] a(byte[] arrby, boolean bl2, h h2) {
        Object object;
        int n2;
        ArrayList<ap> arrayList = new ArrayList<ap>();
        block8: for (int i2 = 0; i2 <= arrby.length - 4; i2 += n2 + 4) {
            ap ap2;
            object = new ba(arrby, i2);
            n2 = new ba(arrby, i2 + 2).b();
            if (i2 + 4 + n2 > arrby.length) {
                switch (h2.a()) {
                    case 0: {
                        throw new ZipException("bad extra field starting at " + i2 + ".  Block length of " + n2 + " bytes exceeds remaining" + " data of " + (arrby.length - i2 - 4) + " bytes.");
                    }
                    case 2: {
                        ap2 = new r();
                        if (bl2) {
                            ((r)ap2).a(arrby, i2, arrby.length - i2);
                        } else {
                            ((r)ap2).b(arrby, i2, arrby.length - i2);
                        }
                        arrayList.add(ap2);
                    }
                    case 1: {
                        break block8;
                    }
                    default: {
                        throw new ZipException("unknown UnparseableExtraField key: " + h2.a());
                    }
                }
            }
            try {
                ap2 = g.a((ba)object);
                if (bl2) {
                    ap2.a(arrby, i2 + 4, n2);
                } else {
                    ap2.b(arrby, i2 + 4, n2);
                }
                arrayList.add(ap2);
                continue;
            }
            catch (InstantiationException instantiationException) {
                throw (ZipException)new ZipException(instantiationException.getMessage()).initCause(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw (ZipException)new ZipException(illegalAccessException.getMessage()).initCause(illegalAccessException);
            }
        }
        object = new ap[arrayList.size()];
        return arrayList.toArray((T[])object);
    }

    public static byte[] a(ap[] arrap) {
        byte[] arrby;
        boolean bl2 = arrap.length > 0 && arrap[arrap.length - 1] instanceof r;
        int n2 = bl2 ? arrap.length - 1 : arrap.length;
        int n3 = 4 * n2;
        for (ap ap2 : arrap) {
            n3 += ap2.f().b();
        }
        byte[] arrby2 = new byte[n3];
        int n4 = 0;
        for (int arrby3 = 0; arrby3 < n2; ++arrby3) {
            System.arraycopy(arrap[arrby3].cI_().a(), 0, arrby2, n4, 2);
            System.arraycopy(arrap[arrby3].f().a(), 0, arrby2, n4 + 2, 2);
            n4 += 4;
            byte[] arrby4 = arrap[arrby3].e();
            if (arrby4 == null) continue;
            System.arraycopy(arrby4, 0, arrby2, n4, arrby4.length);
            n4 += arrby4.length;
        }
        if (bl2 && (arrby = arrap[arrap.length - 1].e()) != null) {
            System.arraycopy(arrby, 0, arrby2, n4, arrby.length);
        }
        return arrby2;
    }

    public static byte[] b(ap[] arrap) {
        byte[] arrby;
        boolean bl2 = arrap.length > 0 && arrap[arrap.length - 1] instanceof r;
        int n2 = bl2 ? arrap.length - 1 : arrap.length;
        int n3 = 4 * n2;
        for (ap ap2 : arrap) {
            n3 += ap2.d().b();
        }
        byte[] arrby2 = new byte[n3];
        int n4 = 0;
        for (int arrby3 = 0; arrby3 < n2; ++arrby3) {
            System.arraycopy(arrap[arrby3].cI_().a(), 0, arrby2, n4, 2);
            System.arraycopy(arrap[arrby3].d().a(), 0, arrby2, n4 + 2, 2);
            n4 += 4;
            byte[] arrby4 = arrap[arrby3].c();
            if (arrby4 == null) continue;
            System.arraycopy(arrby4, 0, arrby2, n4, arrby4.length);
            n4 += arrby4.length;
        }
        if (bl2 && (arrby = arrap[arrap.length - 1].c()) != null) {
            System.arraycopy(arrby, 0, arrby2, n4, arrby.length);
        }
        return arrby2;
    }

    static {
        g.a(b.class);
        g.a(w.class);
        g.a(x.class);
        g.a(k.class);
        g.a(p.class);
        g.a(o.class);
        g.a(y.class);
    }
}

