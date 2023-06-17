/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.af;
import com.ibm.icu.util.a;
import com.ibm.icu.util.av;
import com.ibm.icu.util.bl;
import com.ibm.icu.util.dg;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dl;
import com.ibm.icu.util.dm;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Date;
import java.util.LinkedList;

public abstract class b
extends dj {
    private static final long a = -3204278532246180932L;
    private static final long b = 31536000000L;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 12;
    protected static final int g = 3;
    protected static final int h = 12;

    public abstract dm a(long var1, boolean var3);

    public abstract dm b(long var1, boolean var3);

    public boolean a(dj dj2, long l2, long l3) {
        return this.a(dj2, l2, l3, false);
    }

    public boolean a(dj dj2, long l2, long l3, boolean bl2) {
        if (this == dj2) {
            return true;
        }
        if (!(dj2 instanceof b)) {
            return false;
        }
        int[] arrn = new int[2];
        int[] arrn2 = new int[2];
        this.a(l2, false, arrn);
        dj2.a(l2, false, arrn2);
        if (bl2 ? arrn[0] + arrn[1] != arrn2[0] + arrn2[1] || arrn[1] != 0 && arrn2[1] == 0 || arrn[1] == 0 && arrn2[1] != 0 : arrn[0] != arrn2[0] || arrn[1] != arrn2[1]) {
            return false;
        }
        long l4 = l2;
        while (true) {
            dm dm2 = this.a(l4, false);
            dm dm3 = ((b)dj2).a(l4, false);
            if (bl2) {
                while (dm2 != null && dm2.a() <= l3 && dm2.c().f() + dm2.c().g() == dm2.b().f() + dm2.b().g() && dm2.c().g() != 0 && dm2.b().g() != 0) {
                    dm2 = this.a(dm2.a(), false);
                }
                while (dm3 != null && dm3.a() <= l3 && dm3.c().f() + dm3.c().g() == dm3.b().f() + dm3.b().g() && dm3.c().g() != 0 && dm3.b().g() != 0) {
                    dm3 = ((b)dj2).a(dm3.a(), false);
                }
            }
            boolean bl3 = false;
            boolean bl4 = false;
            if (dm2 != null && dm2.a() <= l3) {
                bl3 = true;
            }
            if (dm3 != null && dm3.a() <= l3) {
                bl4 = true;
            }
            if (!bl3 && !bl4) break;
            if (!bl3 || !bl4) {
                return false;
            }
            if (dm2.a() != dm3.a()) {
                return false;
            }
            if (bl2 ? dm2.b().f() + dm2.b().g() != dm3.b().f() + dm3.b().g() || dm2.b().g() != 0 && dm3.b().g() == 0 || dm2.b().g() == 0 && dm3.b().g() != 0 : dm2.b().f() != dm3.b().f() || dm2.b().g() != dm3.b().g()) {
                return false;
            }
            l4 = dm2.a();
        }
        return true;
    }

    public abstract dl[] k();

    public dl[] a(long l2) {
        Object object;
        dl[] arrdl = this.k();
        dm dm2 = this.b(l2, true);
        if (dm2 == null) {
            return arrdl;
        }
        BitSet bitSet = new BitSet(arrdl.length);
        LinkedList<Serializable> linkedList = new LinkedList<Serializable>();
        bl bl2 = new bl(dm2.b().e(), dm2.b().f(), dm2.b().g());
        linkedList.add(bl2);
        bitSet.set(0);
        for (int i2 = 1; i2 < arrdl.length; ++i2) {
            Date date = arrdl[i2].a(l2, bl2.f(), bl2.g(), false);
            if (date != null) continue;
            bitSet.set(i2);
        }
        long l3 = l2;
        boolean bl3 = false;
        boolean bl4 = false;
        while (!(bl3 && bl4 || (dm2 = this.a(l3, false)) == null)) {
            Serializable serializable;
            dl dl2;
            int n2;
            l3 = dm2.a();
            object = dm2.b();
            for (n2 = 1; n2 < arrdl.length && !arrdl[n2].equals(object); ++n2) {
            }
            if (n2 >= arrdl.length) {
                throw new IllegalStateException("The rule was not found");
            }
            if (bitSet.get(n2)) continue;
            if (object instanceof dg) {
                dl2 = (dg)object;
                long l4 = l2;
                while ((dm2 = this.a(l4, false)) != null && !dm2.b().equals(dl2)) {
                    l4 = dm2.a();
                }
                if (dm2 != null) {
                    serializable = ((dg)dl2).a(dm2.c().f(), dm2.c().g());
                    if (serializable.getTime() > l2) {
                        linkedList.add(dl2);
                    } else {
                        int n3;
                        int n4;
                        long[] arrl = ((dg)dl2).a();
                        int n5 = ((dg)dl2).b();
                        for (n4 = 0; n4 < arrl.length; ++n4) {
                            l4 = arrl[n4];
                            if (n5 == 1) {
                                l4 -= (long)dm2.c().f();
                            }
                            if (n5 == 0) {
                                l4 -= (long)dm2.c().g();
                            }
                            if (l4 > l2) break;
                        }
                        if ((n3 = arrl.length - n4) > 0) {
                            long[] arrl2 = new long[n3];
                            System.arraycopy(arrl, n4, arrl2, 0, n3);
                            dg dg2 = new dg(dl2.e(), dl2.f(), dl2.g(), arrl2, ((dg)dl2).b());
                            linkedList.add(dg2);
                        }
                    }
                }
            } else if (object instanceof a) {
                dl2 = (a)object;
                Date date = ((a)dl2).a(dm2.c().f(), dm2.c().g());
                if (date.getTime() == dm2.a()) {
                    linkedList.add(dl2);
                } else {
                    int[] arrn = new int[6];
                    af.b(dm2.a(), arrn);
                    serializable = new a(dl2.e(), dl2.f(), dl2.g(), ((a)dl2).a(), arrn[0], ((a)dl2).c());
                    linkedList.add(serializable);
                }
                if (((a)dl2).c() == Integer.MAX_VALUE) {
                    if (dl2.g() == 0) {
                        bl3 = true;
                    } else {
                        bl4 = true;
                    }
                }
            }
            bitSet.set(n2);
        }
        object = linkedList.toArray(new dl[linkedList.size()]);
        return object;
    }

    public dl[] b(long l2) {
        Object object;
        a[] arra = null;
        bl bl2 = null;
        dm dm2 = this.a(l2, false);
        if (dm2 != null) {
            object = dm2.c().e();
            int n2 = dm2.c().f();
            int n3 = dm2.c().g();
            long l3 = dm2.a();
            if ((dm2.c().g() == 0 && dm2.b().g() != 0 || dm2.c().g() != 0 && dm2.b().g() == 0) && l2 + 31536000000L > l3) {
                Date date;
                arra = new a[2];
                int[] arrn = af.b(l3 + (long)dm2.c().f() + (long)dm2.c().g(), null);
                int n4 = af.b(arrn[0], arrn[1], arrn[2]);
                av av2 = new av(arrn[1], n4, arrn[3], arrn[5], 0);
                a a2 = null;
                arra[0] = new a(dm2.b().e(), n2, dm2.b().g(), av2, arrn[0], Integer.MAX_VALUE);
                if (dm2.b().f() == n2 && (dm2 = this.a(l3, false)) != null && (dm2.c().g() == 0 && dm2.b().g() != 0 || dm2.c().g() != 0 && dm2.b().g() == 0) && l3 + 31536000000L > dm2.a()) {
                    arrn = af.b(dm2.a() + (long)dm2.c().f() + (long)dm2.c().g(), arrn);
                    n4 = af.b(arrn[0], arrn[1], arrn[2]);
                    av2 = new av(arrn[1], n4, arrn[3], arrn[5], 0);
                    a2 = new a(dm2.b().e(), dm2.b().f(), dm2.b().g(), av2, arrn[0] - 1, Integer.MAX_VALUE);
                    date = a2.b(l2, dm2.c().f(), dm2.c().g(), true);
                    if (date != null && date.getTime() <= l2 && n2 == dm2.b().f() && n3 == dm2.b().g()) {
                        arra[1] = a2;
                    }
                }
                if (arra[1] == null && (dm2 = this.b(l2, true)) != null && (dm2.c().g() == 0 && dm2.b().g() != 0 || dm2.c().g() != 0 && dm2.b().g() == 0)) {
                    arrn = af.b(dm2.a() + (long)dm2.c().f() + (long)dm2.c().g(), arrn);
                    n4 = af.b(arrn[0], arrn[1], arrn[2]);
                    av2 = new av(arrn[1], n4, arrn[3], arrn[5], 0);
                    a2 = new a(dm2.b().e(), n2, n3, av2, arra[0].b() - 1, Integer.MAX_VALUE);
                    date = a2.a(l2, dm2.c().f(), dm2.c().g(), false);
                    if (date.getTime() > l3) {
                        arra[1] = a2;
                    }
                }
                if (arra[1] == null) {
                    arra = null;
                } else {
                    object = arra[0].e();
                    n2 = arra[0].f();
                    n3 = arra[0].g();
                }
            }
            bl2 = new bl((String)object, n2, n3);
        } else {
            dm2 = this.b(l2, true);
            if (dm2 != null) {
                bl2 = new bl(dm2.b().e(), dm2.b().f(), dm2.b().g());
            } else {
                object = new int[2];
                this.a(l2, false, (int[])object);
                bl2 = new bl(this.l(), (int)object[0], (int)object[1]);
            }
        }
        object = null;
        object = arra == null ? new dl[]{bl2} : new dl[]{bl2, arra[0], arra[1]};
        return object;
    }

    public void a(long l2, int n2, int n3, int[] arrn) {
        throw new IllegalStateException("Not implemented");
    }

    protected b() {
    }

    protected b(String string) {
        super(string);
    }
}

