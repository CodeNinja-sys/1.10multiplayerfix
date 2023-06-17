/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.fd;
import com.ibm.icu.a.fi;
import com.ibm.icu.a.fl;
import com.ibm.icu.a.fm;
import com.ibm.icu.a.fn;
import com.ibm.icu.a.fo;
import com.ibm.icu.a.fp;
import com.ibm.icu.a.fq;
import com.ibm.icu.a.fr;
import com.ibm.icu.a.je;
import com.ibm.icu.d.el;
import com.ibm.icu.d.kj;
import com.ibm.icu.d.kl;
import com.ibm.icu.d.kr;
import com.ibm.icu.d.ks;
import com.ibm.icu.util.az;
import com.ibm.icu.util.b;
import com.ibm.icu.util.cd;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dk;
import com.ibm.icu.util.dm;
import com.ibm.icu.util.dn;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class fk
implements az,
Serializable {
    private static final long b = 2729910342063468417L;
    private dn c;
    private kl d;
    private transient boolean e;
    private transient String f;
    private transient WeakReference g;
    private transient MessageFormat[] h;
    private transient ConcurrentHashMap i;
    private transient ConcurrentHashMap j;
    private transient fd k;
    private transient boolean l;
    private static fm m = new fm(null);
    private static final long n = 15897600000L;
    private static final ks[] o = new ks[]{ks.a, ks.d};

    public fk(dn dn2, kl kl2) {
        this.c = dn2;
        this.d = kl2;
        this.c();
    }

    private void c() {
        if (this.d == null) {
            this.d = kl.a(this.c);
        }
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new fd(true);
        this.l = false;
        dj dj2 = dj.p();
        String string = je.a(dj2);
        if (string != null) {
            this.b(string);
        }
    }

    private fk(dn dn2) {
        this(dn2, (kl)null);
    }

    public static fk a(dn dn2) {
        String string = dn2.k();
        return (fk)m.a((Object)string, (Object)dn2);
    }

    public String a(dj dj2, fp fp2, long l2) {
        String string = null;
        String string2 = null;
        switch (fp2) {
            case a: {
                string2 = je.a(dj2);
                if (string2 == null) break;
                string = this.a(string2);
                break;
            }
            case b: 
            case c: {
                string = this.b(dj2, fp2, l2);
                if (string != null || (string2 = je.a(dj2)) == null) break;
                string = this.a(string2);
            }
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String a(String string) {
        Object object;
        if (string == null || string.length() == 0) {
            return null;
        }
        String string2 = (String)this.i.get(string);
        if (string2 != null) {
            if (string2.length() == 0) {
                return null;
            }
            return string2;
        }
        cd cd2 = new cd();
        String string3 = je.a(string, cd2);
        if (string3 != null) {
            if (((Boolean)cd2.a).booleanValue()) {
                object = this.d().e(string3);
                string2 = this.a(fr.a, new String[]{object});
            } else {
                object = this.d.b(string);
                string2 = this.a(fr.a, new String[]{object});
            }
        }
        if (string2 == null) {
            this.i.putIfAbsent(string.intern(), "");
        } else {
            object = this;
            synchronized (object) {
                string = string.intern();
                String string4 = this.i.putIfAbsent(string, string2.intern());
                if (string4 == null) {
                    fq fq2 = new fq(null);
                    fq2.a = string;
                    fq2.b = fp.a;
                    this.k.a((CharSequence)string2, fq2);
                } else {
                    string2 = string4;
                }
            }
        }
        return string2;
    }

    public fk a(fr fr2, String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (!this.i.isEmpty()) {
            this.i = new ConcurrentHashMap();
        }
        if (!this.j.isEmpty()) {
            this.j = new ConcurrentHashMap();
        }
        this.k = null;
        this.l = false;
        if (this.h == null) {
            this.h = new MessageFormat[fr.values().length];
        }
        this.h[fr2.ordinal()] = new MessageFormat(string);
        return this;
    }

    private String b(dj dj2, fp fp2, long l2) {
        assert (fp2 == fp.b || fp2 == fp.c);
        String string = je.a(dj2);
        if (string == null) {
            return null;
        }
        ks ks2 = fp2 == fp.b ? ks.a : ks.d;
        Object object = this.d.b(string, ks2);
        if (object != null) {
            return object;
        }
        String string2 = this.d.a(string, l2);
        if (string2 != null) {
            Object object2;
            Object object3;
            Object object4;
            boolean bl2 = false;
            int[] arrn = new int[]{0, 0};
            dj2.a(l2, false, arrn);
            if (arrn[1] == 0) {
                bl2 = true;
                if (dj2 instanceof b) {
                    object4 = (b)dj2;
                    object3 = ((b)object4).b(l2, true);
                    if (object3 != null && l2 - ((dm)object3).a() < 15897600000L && ((dm)object3).c().g() != 0) {
                        bl2 = false;
                    } else {
                        object2 = ((b)object4).a(l2, false);
                        if (object2 != null && ((dm)object2).a() - l2 < 15897600000L && ((dm)object2).b().g() != 0) {
                            bl2 = false;
                        }
                    }
                } else {
                    object4 = new int[2];
                    dj2.a(l2 - 15897600000L, false, (int[])object4);
                    if (object4[1] != false) {
                        bl2 = false;
                    } else {
                        dj2.a(l2 + 15897600000L, false, (int[])object4);
                        if (object4[1] != false) {
                            bl2 = false;
                        }
                    }
                }
            }
            if (bl2 && (object3 = this.d.a(string, (ks)((Object)(object4 = ks2 == ks.a ? ks.b : ks.e)), l2)) != null) {
                object = object3;
                object2 = this.d.a(string2, ks2);
                if (((String)object3).equalsIgnoreCase((String)object2)) {
                    object = null;
                }
            }
            if (object == null && (object4 = this.d.a(string2, ks2)) != null) {
                object3 = this.d.a(string2, this.e());
                if (object3 != null && !((String)object3).equals(string)) {
                    object2 = dj.c((String)object3);
                    int[] arrn2 = new int[]{0, 0};
                    ((dj)object2).a(l2 + (long)arrn[0] + (long)arrn[1], true, arrn2);
                    object = arrn[0] != arrn2[0] || arrn[1] != arrn2[1] ? this.a(string, string2, ks2 == ks.a, (String)object4) : object4;
                } else {
                    object = object4;
                }
            }
        }
        return object;
    }

    private synchronized String a(fr fr2, String ... arrstring) {
        int n2;
        if (this.h == null) {
            this.h = new MessageFormat[fr.values().length];
        }
        if (this.h[n2 = fr2.ordinal()] == null) {
            String string;
            try {
                bc bc2 = (bc)bc.a("com/ibm/icu/impl/data/icudt51b/zone", this.c);
                string = bc2.f("zoneStrings/" + fr2.a());
            }
            catch (MissingResourceException missingResourceException) {
                string = fr2.b();
            }
            this.h[n2] = new MessageFormat(string);
        }
        return this.h[n2].format(arrstring);
    }

    private synchronized el d() {
        el el2 = null;
        if (this.g != null) {
            el2 = (el)this.g.get();
        }
        if (el2 == null) {
            el2 = el.b(this.c);
            this.g = new WeakReference<el>(el2);
        }
        return el2;
    }

    private synchronized void b(String string) {
        if (string == null || string.length() == 0) {
            return;
        }
        this.a(string);
        Set set = this.d.a(string);
        for (String string2 : set) {
            String string3 = this.d.a(string2, this.e());
            if (string.equals(string3)) continue;
            for (ks ks2 : o) {
                String string4 = this.d.a(string2, ks2);
                if (string4 == null) continue;
                this.a(string, string2, ks2 == ks.a, string4);
            }
        }
    }

    private synchronized String e() {
        if (this.f == null) {
            this.f = this.c.h();
            if (this.f.length() == 0) {
                dn dn2 = dn.j(this.c);
                this.f = dn2.h();
                if (this.f.length() == 0) {
                    this.f = "001";
                }
            }
        }
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String a(String string, String string2, boolean bl2, String string3) {
        Object object;
        String string4 = bl2 ? "L" : "S";
        String string5 = string + "&" + string2 + "#" + string4;
        String string6 = (String)this.j.get(string5);
        if (string6 != null) {
            return string6;
        }
        String string7 = null;
        String string8 = je.d(string);
        if (string8 != null) {
            object = this.d.a(string2, string8);
            string7 = string.equals(object) ? this.d().e(string8) : this.d.b(string);
        } else {
            string7 = this.d.b(string);
            if (string7 == null) {
                string7 = string;
            }
        }
        string6 = this.a(fr.b, string7, string3);
        object = this;
        synchronized (object) {
            String string9 = this.j.putIfAbsent(string5.intern(), string6.intern());
            if (string9 == null) {
                fq fq2 = new fq(null);
                fq2.a = string.intern();
                fq2.b = bl2 ? fp.b : fp.c;
                this.k.a((CharSequence)string6, fq2);
            } else {
                string6 = string9;
            }
        }
        return string6;
    }

    public fn a(String string, int n2, EnumSet enumSet) {
        Object object;
        if (string == null || string.length() == 0 || n2 < 0 || n2 >= string.length()) {
            throw new IllegalArgumentException("bad input text or range");
        }
        Object object2 = null;
        Collection collection = this.c(string, n2, enumSet);
        if (collection != null) {
            object = null;
            for (Object object3 : collection) {
                if (object != null && ((kr)object3).d() <= ((kr)object).d()) continue;
                object = object3;
            }
            if (object != null && ((fn)(object2 = this.a((kr)object))).d() == string.length() - n2 && ((fn)object2).d != kj.b) {
                return object2;
            }
        }
        if ((object = this.d(string, n2, enumSet)) != null) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object object3;
                object3 = (fn)iterator.next();
                if (object2 != null && ((fn)object3).d() < ((fn)object2).d()) continue;
                object2 = object3;
            }
        }
        return object2;
    }

    public Collection b(String string, int n2, EnumSet enumSet) {
        if (string == null || string.length() == 0 || n2 < 0 || n2 >= string.length()) {
            throw new IllegalArgumentException("bad input text or range");
        }
        LinkedList<fn> linkedList = this.d(string, n2, enumSet);
        Collection collection = this.c(string, n2, enumSet);
        if (collection != null) {
            for (kr kr2 : collection) {
                if (linkedList == null) {
                    linkedList = new LinkedList<fn>();
                }
                linkedList.add(this.a(kr2));
            }
        }
        return linkedList;
    }

    private fn a(kr kr2) {
        Object object;
        fp fp2 = null;
        kj kj2 = kj.a;
        switch (kr2.c()) {
            case b: {
                fp2 = fp.b;
                kj2 = kj.b;
                break;
            }
            case a: {
                fp2 = fp.b;
                break;
            }
            case e: {
                fp2 = fp.c;
                kj2 = kj.b;
                break;
            }
            case d: {
                fp2 = fp.c;
            }
        }
        assert (fp2 != null);
        String string = kr2.a();
        if (string == null) {
            object = kr2.b();
            assert (object != null);
            string = this.d.a((String)object, this.e());
        }
        assert (string != null);
        object = new fn();
        ((fn)object).a = fp2;
        ((fn)object).b = string;
        ((fn)object).c = kr2.d();
        ((fn)object).d = kj2;
        return object;
    }

    private Collection c(String string, int n2, EnumSet enumSet) {
        Collection collection = null;
        EnumSet<ks> enumSet2 = EnumSet.noneOf(ks.class);
        if (enumSet.contains((Object)fp.b)) {
            enumSet2.add(ks.a);
            enumSet2.add(ks.b);
        }
        if (enumSet.contains((Object)fp.c)) {
            enumSet2.add(ks.d);
            enumSet2.add(ks.e);
        }
        if (!enumSet2.isEmpty()) {
            collection = this.d.a((CharSequence)string, n2, enumSet2);
        }
        return collection;
    }

    private synchronized Collection d(String string, int n2, EnumSet enumSet) {
        fo fo2 = new fo(enumSet);
        this.k.a((CharSequence)string, n2, (fi)fo2);
        if (fo2.b() == string.length() - n2 || this.l) {
            return fo2.a();
        }
        Set set = dj.a(dk.b, null, null);
        for (String string2 : set) {
            this.b(string2);
        }
        this.l = true;
        fo2.c();
        this.k.a((CharSequence)string, n2, (fi)fo2);
        return fo2.a();
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c();
    }

    public boolean f() {
        return this.e;
    }

    public fk a() {
        this.e = true;
        return this;
    }

    public fk b() {
        fk fk2 = null;
        try {
            fk2 = (fk)super.clone();
            fk2.e = false;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return fk2;
    }

    public /* synthetic */ Object i() {
        return this.b();
    }

    public /* synthetic */ Object j() {
        return this.a();
    }

    /* synthetic */ fk(dn dn2, fl fl2) {
        this(dn2);
    }
}

