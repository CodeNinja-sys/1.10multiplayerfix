/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.bp;
import com.ibm.icu.a.eo;
import com.ibm.icu.a.ew;
import com.ibm.icu.util.VersionInfo;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dx;
import com.ibm.icu.util.dy;
import com.ibm.icu.util.dz;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public abstract class dv
extends ResourceBundle {
    private static aj a = new ew();
    private static final dx b = new dx(null);
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static SoftReference f = new SoftReference(new ConcurrentHashMap());
    private Set g = null;
    public static final int J = -1;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 7;
    public static final int O = 8;
    public static final int P = 14;

    public static dv b(String string, String string2) {
        return dv.c(string, string2, bc.n, false);
    }

    public static dv b(String string, String string2, ClassLoader classLoader) {
        return dv.c(string, string2, classLoader, false);
    }

    protected static dv c(String string, String string2, ClassLoader classLoader, boolean bl2) {
        return dv.d(string, string2, classLoader, bl2);
    }

    public static dv a(dn dn2) {
        if (dn2 == null) {
            dn2 = dn.b();
        }
        return dv.c("com/ibm/icu/impl/data/icudt51b", dn2.toString(), bc.n, false);
    }

    public static dv k(String string) {
        if (string == null) {
            string = "com/ibm/icu/impl/data/icudt51b";
        }
        dn dn2 = dn.b();
        return dv.c(string, dn2.toString(), bc.n, false);
    }

    public static dv a(String string, Locale locale) {
        if (string == null) {
            string = "com/ibm/icu/impl/data/icudt51b";
        }
        dn dn2 = locale == null ? dn.b() : dn.a(locale);
        return dv.c(string, dn2.toString(), bc.n, false);
    }

    public static dv a(String string, dn dn2) {
        if (string == null) {
            string = "com/ibm/icu/impl/data/icudt51b";
        }
        if (dn2 == null) {
            dn2 = dn.b();
        }
        return dv.c(string, dn2.toString(), bc.n, false);
    }

    public static dv a(String string, Locale locale, ClassLoader classLoader) {
        if (string == null) {
            string = "com/ibm/icu/impl/data/icudt51b";
        }
        dn dn2 = locale == null ? dn.b() : dn.a(locale);
        return dv.c(string, dn2.toString(), classLoader, false);
    }

    public static dv a(String string, dn dn2, ClassLoader classLoader) {
        if (string == null) {
            string = "com/ibm/icu/impl/data/icudt51b";
        }
        if (dn2 == null) {
            dn2 = dn.b();
        }
        return dv.c(string, dn2.toString(), classLoader, false);
    }

    public abstract dn i();

    protected abstract String g();

    protected abstract String h();

    protected abstract dv j();

    public Locale getLocale() {
        return this.i().a();
    }

    public static void B() {
        a = new ew();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static dv a(ClassLoader classLoader, String string, dn dn2, dv dv2) {
        dx dx2 = b;
        synchronized (dx2) {
            dx.a(b, classLoader, string, dn2);
            dv dv3 = (dv)a.a(b);
            if (dv3 != null) {
                return dv3;
            }
            a.a((dx)b.clone(), dv2);
            return dv2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static dv a(ClassLoader classLoader, String string, dn dn2) {
        dx dx2 = b;
        synchronized (dx2) {
            dx.a(b, classLoader, string, dn2);
            return (dv)a.a(b);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static int a(String string, ClassLoader classLoader) {
        Integer n2;
        Object object;
        ConcurrentHashMap<String, Integer> concurrentHashMap = null;
        concurrentHashMap = (ConcurrentHashMap<String, Integer>)f.get();
        if (concurrentHashMap == null) {
            object = dv.class;
            // MONITORENTER : com.ibm.icu.util.dv.class
            concurrentHashMap = (ConcurrentHashMap)f.get();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<String, Integer>();
                f = new SoftReference(concurrentHashMap);
            }
            // MONITOREXIT : object
        }
        if ((n2 = (Integer)concurrentHashMap.get(string)) != null) return n2;
        object = string.indexOf(46) == -1 ? "root" : "";
        int n3 = 0;
        try {
            bc.a(string, (String)object, classLoader, true);
            n3 = 1;
        }
        catch (MissingResourceException missingResourceException) {
            try {
                eo.a(string, (String)object, classLoader, true);
                n3 = 2;
            }
            catch (MissingResourceException missingResourceException2) {
                // empty catch block
            }
        }
        n2 = n3;
        concurrentHashMap.putIfAbsent(string, n2);
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void a(String string, int n2) {
        Integer n3 = n2;
        ConcurrentHashMap<String, Integer> concurrentHashMap = null;
        concurrentHashMap = (ConcurrentHashMap<String, Integer>)f.get();
        if (concurrentHashMap == null) {
            Class<dv> class_ = dv.class;
            // MONITORENTER : com.ibm.icu.util.dv.class
            concurrentHashMap = (ConcurrentHashMap)f.get();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<String, Integer>();
                f = new SoftReference(concurrentHashMap);
            }
            // MONITOREXIT : class_
        }
        concurrentHashMap.put(string, n3);
    }

    protected static dv d(String string, String string2, ClassLoader classLoader, boolean bl2) {
        dv dv2 = null;
        int n2 = dv.a(string, classLoader);
        dn dn2 = dn.b();
        switch (n2) {
            case 1: {
                if (bl2) {
                    String string3 = bp.a(string, string2);
                    dv2 = dv.a(classLoader, string3, dn2);
                    if (dv2 == null) {
                        dv2 = bc.a(string, string2, classLoader, bl2);
                    }
                } else {
                    dv2 = bc.a(string, string2, classLoader, bl2);
                }
                return dv2;
            }
            case 2: {
                return eo.a(string, string2, classLoader, bl2);
            }
        }
        try {
            dv2 = bc.a(string, string2, classLoader, bl2);
            dv.a(string, 1);
        }
        catch (MissingResourceException missingResourceException) {
            dv2 = eo.a(string, string2, classLoader, bl2);
            dv.a(string, 2);
        }
        return dv2;
    }

    public ByteBuffer v() {
        throw new dz("");
    }

    public String A() {
        throw new dz("");
    }

    public String[] u() {
        throw new dz("");
    }

    public byte[] a(byte[] arrby) {
        throw new dz("");
    }

    public int[] z() {
        throw new dz("");
    }

    public int x() {
        throw new dz("");
    }

    public int y() {
        throw new dz("");
    }

    public dv l(String string) {
        dv dv2 = this.j(string);
        if (dv2 == null) {
            String string2 = bp.a(this.h(), this.g());
            throw new MissingResourceException("Can't find resource for bundle " + string2 + ", key " + string, this.getClass().getName(), string);
        }
        return dv2;
    }

    protected dv j(String string) {
        for (dv dv2 = this; dv2 != null; dv2 = dv2.j()) {
            dv dv3 = dv2.b(string, null, this);
            if (dv3 == null) continue;
            ((bc)dv3).a(this.g());
            return dv3;
        }
        return null;
    }

    public String j(int n2) {
        bc bc2 = (bc)this.k(n2);
        if (bc2.l() == 0) {
            return bc2.A();
        }
        throw new dz("");
    }

    public dv k(int n2) {
        dv dv2 = this.a(n2, null, this);
        if (dv2 == null) {
            dv2 = (bc)this.j();
            if (dv2 != null) {
                dv2 = dv2.k(n2);
            }
            if (dv2 == null) {
                throw new MissingResourceException("Can't find resource for bundle " + this.getClass().getName() + ", key " + this.k(), this.getClass().getName(), this.k());
            }
        }
        ((bc)dv2).a(this.g());
        return dv2;
    }

    protected dv h(int n2) {
        for (dv dv2 = this; dv2 != null; dv2 = dv2.j()) {
            dv dv3 = dv2.a(n2, null, this);
            if (dv3 == null) continue;
            ((bc)dv3).a(this.g());
            return dv3;
        }
        return null;
    }

    public Enumeration getKeys() {
        return Collections.enumeration(this.keySet());
    }

    public Set keySet() {
        if (this.g == null) {
            if (this.r()) {
                TreeSet<String> treeSet;
                if (this.parent == null) {
                    treeSet = new TreeSet<String>();
                } else if (this.parent instanceof dv) {
                    treeSet = new TreeSet(((dv)this.parent).keySet());
                } else {
                    treeSet = new TreeSet();
                    Enumeration<String> enumeration = this.parent.getKeys();
                    while (enumeration.hasMoreElements()) {
                        treeSet.add(enumeration.nextElement());
                    }
                }
                treeSet.addAll(this.handleKeySet());
                this.g = Collections.unmodifiableSet(treeSet);
            } else {
                return this.handleKeySet();
            }
        }
        return this.g;
    }

    protected Set handleKeySet() {
        return Collections.emptySet();
    }

    public int w() {
        return 1;
    }

    public int l() {
        return -1;
    }

    public VersionInfo C() {
        return null;
    }

    public dy D() {
        return new dy(this);
    }

    public String k() {
        return null;
    }

    protected dv b(String string, HashMap hashMap, dv dv2) {
        return null;
    }

    protected dv a(int n2, HashMap hashMap, dv dv2) {
        return null;
    }

    protected String[] t() {
        return null;
    }

    protected Enumeration q() {
        return null;
    }

    protected Object handleGetObject(String string) {
        return this.a(string, this);
    }

    private Object a(String string, dv dv2) {
        Object object = this.b(string, dv2);
        if (object == null) {
            dv dv3 = this.j();
            if (dv3 != null) {
                object = dv3.a(string, dv2);
            }
            if (object == null) {
                throw new MissingResourceException("Can't find resource for bundle " + this.getClass().getName() + ", key " + string, this.getClass().getName(), string);
            }
        }
        return object;
    }

    private Object b(String string, dv dv2) {
        if (this.l() == 0) {
            return this.A();
        }
        dv dv3 = this.b(string, null, dv2);
        if (dv3 != null) {
            if (dv3.l() == 0) {
                return dv3.A();
            }
            try {
                if (dv3.l() == 8) {
                    return dv3.t();
                }
            }
            catch (dz dz2) {
                return dv3;
            }
        }
        return dv3;
    }

    protected abstract void a(int var1);

    protected boolean r() {
        return true;
    }
}

