/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.af;
import com.ibm.icu.util.a;
import com.ibm.icu.util.b;
import com.ibm.icu.util.bl;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dl;
import com.ibm.icu.util.dm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.List;

public class cm
extends b {
    private static final long a = 7580833058949327935L;
    private final bl b;
    private List i;
    private a[] j;
    private transient List z;
    private transient boolean A;
    private transient boolean B = false;

    public cm(String string, bl bl2) {
        super(string);
        this.b = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(dl dl2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen RuleBasedTimeZone instance.");
        }
        if (!dl2.d()) {
            throw new IllegalArgumentException("Rule must be a transition rule");
        }
        if (dl2 instanceof a && ((a)dl2).c() == Integer.MAX_VALUE) {
            if (this.j == null) {
                this.j = new a[2];
                this.j[0] = (a)dl2;
            } else {
                if (this.j[1] != null) throw new IllegalStateException("Too many final rules");
                this.j[1] = (a)dl2;
            }
        } else {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(dl2);
        }
        this.A = false;
    }

    public int a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 == 0) {
            n3 = 1 - n3;
        }
        long l2 = af.a(n3, n4, n5) * 86400000L + (long)n7;
        int[] arrn = new int[2];
        this.a(l2, true, 3, 1, arrn);
        return arrn[0] + arrn[1];
    }

    public void a(long l2, boolean bl2, int[] arrn) {
        this.a(l2, bl2, 4, 12, arrn);
    }

    public void a(long l2, int n2, int n3, int[] arrn) {
        this.a(l2, true, n2, n3, arrn);
    }

    public int a() {
        long l2 = System.currentTimeMillis();
        int[] arrn = new int[2];
        this.a(l2, false, arrn);
        return arrn[0];
    }

    public boolean a(Date date) {
        int[] arrn = new int[2];
        this.a(date.getTime(), false, arrn);
        return arrn[1] != 0;
    }

    public void a(int n2) {
        throw new UnsupportedOperationException("setRawOffset in RuleBasedTimeZone is not supported.");
    }

    public boolean b() {
        long l2 = System.currentTimeMillis();
        int[] arrn = new int[2];
        this.a(l2, false, arrn);
        if (arrn[1] != 0) {
            return true;
        }
        dm dm2 = this.a(l2, false);
        return dm2 != null && dm2.b().g() != 0;
    }

    public boolean c() {
        dm dm2;
        BitSet bitSet;
        long l2 = System.currentTimeMillis();
        int[] arrn = new int[2];
        this.a(l2, false, arrn);
        if (arrn[1] != 0) {
            return true;
        }
        BitSet bitSet2 = bitSet = this.j == null ? null : new BitSet(this.j.length);
        while ((dm2 = this.a(l2, false)) != null) {
            dl dl2 = dm2.b();
            if (dl2.g() != 0) {
                return true;
            }
            if (bitSet != null) {
                for (int i2 = 0; i2 < this.j.length; ++i2) {
                    if (!this.j[i2].equals(dl2)) continue;
                    bitSet.set(i2);
                }
                if (bitSet.cardinality() == this.j.length) break;
            }
            l2 = dm2.a();
        }
        return false;
    }

    public boolean a(dj dj2) {
        if (this == dj2) {
            return true;
        }
        if (!(dj2 instanceof cm)) {
            return false;
        }
        cm cm2 = (cm)dj2;
        if (!this.b.a(cm2.b)) {
            return false;
        }
        if (this.j != null && cm2.j != null) {
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                if (this.j[i2] == null && cm2.j[i2] == null || this.j[i2] != null && cm2.j[i2] != null && this.j[i2].a(cm2.j[i2])) continue;
                return false;
            }
        } else if (this.j != null || cm2.j != null) {
            return false;
        }
        if (this.i != null && cm2.i != null) {
            if (this.i.size() != cm2.i.size()) {
                return false;
            }
            for (dl dl2 : this.i) {
                boolean bl2 = false;
                for (dl dl3 : cm2.i) {
                    if (!dl2.a(dl3)) continue;
                    bl2 = true;
                    break;
                }
                if (bl2) continue;
                return false;
            }
        } else if (this.i != null || cm2.i != null) {
            return false;
        }
        return true;
    }

    public dl[] k() {
        int n2 = 1;
        if (this.i != null) {
            n2 += this.i.size();
        }
        if (this.j != null) {
            n2 = this.j[1] != null ? (n2 += 2) : ++n2;
        }
        dl[] arrdl = new dl[n2];
        arrdl[0] = this.b;
        if (this.i != null) {
            for (int i2 = 1; i2 < this.i.size() + 1; ++i2) {
                arrdl[i2] = (dl)this.i.get(i2 - 1);
            }
        }
        if (this.j != null) {
            arrdl[i2++] = this.j[0];
            if (this.j[1] != null) {
                arrdl[i2] = this.j[1];
            }
        }
        return arrdl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dm a(long l2, boolean bl2) {
        Object object;
        this.e();
        if (this.z == null) {
            return null;
        }
        boolean bl3 = false;
        Object object2 = null;
        dm dm2 = (dm)this.z.get(0);
        long l3 = dm2.a();
        if (l3 > l2 || bl2 && l3 == l2) {
            object2 = dm2;
        } else {
            int n2 = this.z.size() - 1;
            dm2 = (dm)this.z.get(n2);
            l3 = dm2.a();
            if (bl2 && l3 == l2) {
                object2 = dm2;
            } else if (l3 <= l2) {
                if (this.j == null) return null;
                object = this.j[0].a(l2, this.j[1].f(), this.j[1].g(), bl2);
                Date date = this.j[1].a(l2, this.j[0].f(), this.j[0].g(), bl2);
                dm2 = date.after((Date)object) ? new dm(((Date)object).getTime(), this.j[1], this.j[0]) : new dm(date.getTime(), this.j[0], this.j[1]);
                object2 = dm2;
                bl3 = true;
            } else {
                --n2;
                object = dm2;
                while (n2 > 0 && (l3 = (dm2 = (dm)this.z.get(n2)).a()) >= l2 && (bl2 || l3 != l2)) {
                    --n2;
                    object = dm2;
                }
                object2 = object;
            }
        }
        if (object2 == null) return object2;
        dl dl2 = ((dm)object2).c();
        object = ((dm)object2).b();
        if (dl2.f() != ((dl)object).f()) return object2;
        if (dl2.g() != ((dl)object).g()) return object2;
        if (!bl3) return this.a(((dm)object2).a(), false);
        return null;
    }

    public dm b(long l2, boolean bl2) {
        Serializable serializable;
        this.e();
        if (this.z == null) {
            return null;
        }
        dm dm2 = null;
        dm dm3 = (dm)this.z.get(0);
        long l3 = dm3.a();
        if (bl2 && l3 == l2) {
            dm2 = dm3;
        } else {
            if (l3 >= l2) {
                return null;
            }
            int n2 = this.z.size() - 1;
            dm3 = (dm)this.z.get(n2);
            l3 = dm3.a();
            if (bl2 && l3 == l2) {
                dm2 = dm3;
            } else if (l3 < l2) {
                if (this.j != null) {
                    serializable = this.j[0].b(l2, this.j[1].f(), this.j[1].g(), bl2);
                    Date date = this.j[1].b(l2, this.j[0].f(), this.j[0].g(), bl2);
                    dm3 = date.before((Date)serializable) ? new dm(((Date)serializable).getTime(), this.j[1], this.j[0]) : new dm(date.getTime(), this.j[0], this.j[1]);
                }
                dm2 = dm3;
            } else {
                --n2;
                while (!(n2 < 0 || (l3 = (dm3 = (dm)this.z.get(n2)).a()) < l2 || bl2 && l3 == l2)) {
                    --n2;
                }
                dm2 = dm3;
            }
        }
        if (dm2 != null) {
            dl dl2 = dm2.c();
            serializable = dm2.b();
            if (dl2.f() == ((dl)serializable).f() && dl2.g() == ((dl)serializable).g()) {
                dm2 = this.b(dm2.a(), false);
            }
        }
        return dm2;
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.h();
    }

    private void e() {
        if (this.A) {
            return;
        }
        if (this.j != null && this.j[1] == null) {
            throw new IllegalStateException("Incomplete final rules");
        }
        if (this.i != null || this.j != null) {
            Cloneable cloneable;
            bl bl2 = this.b;
            long l2 = -184303902528000000L;
            if (this.i != null) {
                cloneable = new BitSet(this.i.size());
                while (true) {
                    long l3;
                    Date date;
                    int n2;
                    int n3 = bl2.f();
                    int n4 = bl2.g();
                    long l4 = 183882168921600000L;
                    dl dl2 = null;
                    for (n2 = 0; n2 < this.i.size(); ++n2) {
                        if (((BitSet)cloneable).get(n2)) continue;
                        dl dl3 = (dl)this.i.get(n2);
                        date = dl3.a(l2, n3, n4, false);
                        if (date == null) {
                            ((BitSet)cloneable).set(n2);
                            continue;
                        }
                        if (dl3 == bl2 || dl3.e().equals(bl2.e()) && dl3.f() == bl2.f() && dl3.g() == bl2.g() || (l3 = date.getTime()) >= l4) continue;
                        l4 = l3;
                        dl2 = dl3;
                    }
                    if (dl2 == null) {
                        n2 = 1;
                        for (int i2 = 0; i2 < this.i.size(); ++i2) {
                            if (((BitSet)cloneable).get(i2)) continue;
                            n2 = 0;
                            break;
                        }
                        if (n2 != 0) break;
                    }
                    if (this.j != null) {
                        for (n2 = 0; n2 < 2; ++n2) {
                            if (this.j[n2] == bl2 || (date = this.j[n2].a(l2, n3, n4, false)) == null || (l3 = date.getTime()) >= l4) continue;
                            l4 = l3;
                            dl2 = this.j[n2];
                        }
                    }
                    if (dl2 == null) break;
                    if (this.z == null) {
                        this.z = new ArrayList();
                    }
                    this.z.add(new dm(l4, bl2, dl2));
                    l2 = l4;
                    bl2 = dl2;
                }
            }
            if (this.j != null) {
                if (this.z == null) {
                    this.z = new ArrayList();
                }
                cloneable = this.j[0].a(l2, bl2.f(), bl2.g(), false);
                Date date = this.j[1].a(l2, bl2.f(), bl2.g(), false);
                if (date.after((Date)cloneable)) {
                    this.z.add(new dm(((Date)cloneable).getTime(), bl2, this.j[0]));
                    date = this.j[1].a(((Date)cloneable).getTime(), this.j[0].f(), this.j[0].g(), false);
                    this.z.add(new dm(date.getTime(), this.j[0], this.j[1]));
                } else {
                    this.z.add(new dm(date.getTime(), bl2, this.j[1]));
                    cloneable = this.j[0].a(date.getTime(), this.j[1].f(), this.j[1].g(), false);
                    this.z.add(new dm(((Date)cloneable).getTime(), this.j[1], this.j[0]));
                }
            }
        }
        this.A = true;
    }

    private void a(long l2, boolean bl2, int n2, int n3, int[] arrn) {
        this.e();
        dl dl2 = null;
        if (this.z == null) {
            dl2 = this.b;
        } else {
            long l3 = cm.a((dm)this.z.get(0), bl2, n2, n3);
            if (l2 < l3) {
                dl2 = this.b;
            } else {
                int n4 = this.z.size() - 1;
                long l4 = cm.a((dm)this.z.get(n4), bl2, n2, n3);
                if (l2 > l4) {
                    if (this.j != null) {
                        dl2 = this.a(l2, bl2, n2, n3);
                    }
                    if (dl2 == null) {
                        dl2 = ((dm)this.z.get(n4)).b();
                    }
                } else {
                    while (n4 >= 0 && l2 < cm.a((dm)this.z.get(n4), bl2, n2, n3)) {
                        --n4;
                    }
                    dl2 = ((dm)this.z.get(n4)).b();
                }
            }
        }
        arrn[0] = dl2.f();
        arrn[1] = dl2.g();
    }

    private dl a(long l2, boolean bl2, int n2, int n3) {
        int n4;
        if (this.j == null || this.j.length != 2 || this.j[0] == null || this.j[1] == null) {
            return null;
        }
        long l3 = l2;
        if (bl2) {
            n4 = cm.b(this.j[1].f(), this.j[1].g(), this.j[0].f(), this.j[0].g(), n2, n3);
            l3 -= (long)n4;
        }
        Date date = this.j[0].b(l3, this.j[1].f(), this.j[1].g(), true);
        l3 = l2;
        if (bl2) {
            n4 = cm.b(this.j[0].f(), this.j[0].g(), this.j[1].f(), this.j[1].g(), n2, n3);
            l3 -= (long)n4;
        }
        Date date2 = this.j[1].b(l3, this.j[0].f(), this.j[0].g(), true);
        if (date == null || date2 == null) {
            if (date != null) {
                return this.j[0];
            }
            if (date2 != null) {
                return this.j[1];
            }
            return null;
        }
        return date.after(date2) ? this.j[0] : this.j[1];
    }

    private static long a(dm dm2, boolean bl2, int n2, int n3) {
        long l2 = dm2.a();
        if (bl2) {
            l2 += (long)cm.b(dm2.c().f(), dm2.c().g(), dm2.b().f(), dm2.b().g(), n2, n3);
        }
        return l2;
    }

    private static int b(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2;
        int n8 = 0;
        int n9 = n2 + n3;
        int n10 = n4 + n5;
        boolean bl3 = n3 != 0 && n5 == 0;
        boolean bl4 = bl2 = n3 == 0 && n5 != 0;
        n8 = n10 - n9 >= 0 ? ((n6 & 3) == 1 && bl3 || (n6 & 3) == 3 && bl2 ? n9 : ((n6 & 3) == 1 && bl2 || (n6 & 3) == 3 && bl3 ? n10 : ((n6 & 0xC) == 12 ? n9 : n10))) : ((n7 & 3) == 1 && bl3 || (n7 & 3) == 3 && bl2 ? n10 : ((n7 & 3) == 1 && bl2 || (n7 & 3) == 3 && bl3 ? n9 : ((n7 & 0xC) == 4 ? n9 : n10)));
        return n8;
    }

    public boolean f() {
        return this.B;
    }

    public dj g() {
        this.e();
        this.B = true;
        return this;
    }

    public dj h() {
        cm cm2 = (cm)super.h();
        if (this.i != null) {
            cm2.i = new ArrayList(this.i);
        }
        if (this.j != null) {
            cm2.j = (a[])this.j.clone();
        }
        cm2.B = false;
        return cm2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }
}

