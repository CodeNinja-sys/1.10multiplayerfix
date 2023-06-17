/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import net.java.games.input.OSXEvent;
import net.java.games.input.OSXHIDQueue;
import net.java.games.input.aq;
import net.java.games.input.at;
import net.java.games.input.co;
import net.java.games.input.dl;
import net.java.games.input.dm;
import net.java.games.input.dn;
import net.java.games.input.r;

final class OSXHIDDevice {
    private static final Logger b = Logger.getLogger((a == null ? (a = OSXHIDDevice.a("net.java.games.input.OSXHIDDevice")) : a).getName());
    private static final int c = 0;
    private static final int d = 65536;
    private static final String e = "Transport";
    private static final String f = "VendorID";
    private static final String g = "VendorIDSource";
    private static final String h = "ProductID";
    private static final String i = "VersionNumber";
    private static final String j = "Manufacturer";
    private static final String k = "Product";
    private static final String l = "SerialNumber";
    private static final String m = "CountryCode";
    private static final String n = "LocationID";
    private static final String o = "DeviceUsage";
    private static final String p = "DeviceUsagePage";
    private static final String q = "DeviceUsagePairs";
    private static final String r = "PrimaryUsage";
    private static final String s = "PrimaryUsagePage";
    private static final String t = "MaxInputReportSize";
    private static final String u = "MaxOutputReportSize";
    private static final String v = "MaxFeatureReportSize";
    private static final String w = "Elements";
    private static final String x = "ElementCookie";
    private static final String y = "Type";
    private static final String z = "CollectionType";
    private static final String A = "Usage";
    private static final String B = "UsagePage";
    private static final String C = "Min";
    private static final String D = "Max";
    private static final String E = "ScaledMin";
    private static final String F = "ScaledMax";
    private static final String G = "Size";
    private static final String H = "ReportSize";
    private static final String I = "ReportCount";
    private static final String J = "ReportID";
    private static final String K = "IsArray";
    private static final String L = "IsRelative";
    private static final String M = "IsWrapping";
    private static final String N = "IsNonLinear";
    private static final String O = "HasPreferredState";
    private static final String P = "HasNullState";
    private static final String Q = "Unit";
    private static final String R = "UnitExponent";
    private static final String S = "Name";
    private static final String T = "ValueLocation";
    private static final String U = "DuplicateIndex";
    private static final String V = "ParentCollection";
    private final long W;
    private final long X;
    private final Map Y;
    private boolean Z;
    static Class a;

    public OSXHIDDevice(long l2, long l3) {
        this.W = l2;
        this.X = l3;
        this.Y = this.g();
        this.h();
    }

    public final r a() {
        String string = (String)this.Y.get(e);
        if (string == null) {
            return net.java.games.input.r.a;
        }
        if (string.equals("USB")) {
            return net.java.games.input.r.b;
        }
        return net.java.games.input.r.a;
    }

    public final String b() {
        return (String)this.Y.get(k);
    }

    private final co a(Map map) {
        long l2 = OSXHIDDevice.b(map, x);
        int n2 = OSXHIDDevice.a(map, y);
        aq aq2 = aq.a(n2);
        int n3 = (int)OSXHIDDevice.a(map, C, 0L);
        int n4 = (int)OSXHIDDevice.a(map, D, 65536L);
        dn dn2 = this.d();
        boolean bl2 = dn2 != null && (dn2.b() == at.a || dn2.b() == at.b);
        boolean bl3 = OSXHIDDevice.a(map, L, bl2);
        int n5 = OSXHIDDevice.a(map, A);
        int n6 = OSXHIDDevice.a(map, B);
        dn dn3 = OSXHIDDevice.a(n6, n5);
        if (dn3 == null || aq2 != aq.a && aq2 != aq.b && aq2 != aq.c) {
            return null;
        }
        return new co(this, dn3, l2, aq2, n3, n4, bl3);
    }

    private final void a(List list, Map map) {
        Object[] arrobject = (Object[])map.get(w);
        if (arrobject == null) {
            return;
        }
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Map map2 = (Map)arrobject[i2];
            co co2 = this.a(map2);
            if (co2 != null) {
                list.add(co2);
            }
            this.a(list, map2);
        }
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        this.a(arrayList, this.Y);
        return arrayList;
    }

    private static final long a(Map map, String string, long l2) {
        Long l3 = (Long)map.get(string);
        if (l3 == null) {
            return l2;
        }
        return l3;
    }

    private static final boolean a(Map map, String string, boolean bl2) {
        return OSXHIDDevice.a(map, string, bl2 ? 1L : 0L) != 0L;
    }

    private static final int a(Map map, String string) {
        return (int)OSXHIDDevice.b(map, string);
    }

    private static final long b(Map map, String string) {
        Long l2 = (Long)map.get(string);
        return l2;
    }

    private static final dn a(int n2, int n3) {
        dl dl2;
        dm dm2 = dm.a(n2);
        if (dm2 != null && (dl2 = dm2.b(n3)) != null) {
            return new dn(dm2, dl2);
        }
        return null;
    }

    public final dn d() {
        int n2 = OSXHIDDevice.a(this.Y, s);
        int n3 = OSXHIDDevice.a(this.Y, r);
        return OSXHIDDevice.a(n2, n3);
    }

    private final void f() {
        b.info(this.toString());
        OSXHIDDevice.a("", this.Y);
    }

    private static final void a(String string, Object[] arrobject) {
        b.info(string + "{");
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            OSXHIDDevice.a(string + "\t", arrobject[i2]);
            b.info(string + ",");
        }
        b.info(string + "}");
    }

    private static final void a(String string, Map map) {
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object k2 = iterator.next();
            Object v2 = map.get(k2);
            OSXHIDDevice.a(string, k2);
            OSXHIDDevice.a(string + "\t", v2);
        }
    }

    private static final void a(String string, Object object) {
        if (object instanceof Long) {
            Long l2 = (Long)object;
            b.info(string + "0x" + Long.toHexString(l2));
        } else if (object instanceof Map) {
            OSXHIDDevice.a(string, (Map)object);
        } else if (object.getClass().isArray()) {
            OSXHIDDevice.a(string, (Object[])object);
        } else {
            b.info(string + object);
        }
    }

    private final Map g() {
        return OSXHIDDevice.nGetDeviceProperties(this.W);
    }

    private static final native Map nGetDeviceProperties(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void e() {
        try {
            this.i();
        }
        finally {
            this.Z = true;
            OSXHIDDevice.nReleaseDevice(this.W, this.X);
        }
    }

    private static final native void nReleaseDevice(long var0, long var2);

    public final synchronized void a(long l2, OSXEvent oSXEvent) {
        this.j();
        OSXHIDDevice.nGetElementValue(this.X, l2, oSXEvent);
    }

    private static final native void nGetElementValue(long var0, long var2, OSXEvent var4);

    public final synchronized OSXHIDQueue a(int n2) {
        this.j();
        long l2 = OSXHIDDevice.nCreateQueue(this.X);
        return new OSXHIDQueue(l2, n2);
    }

    private static final native long nCreateQueue(long var0);

    private final void h() {
        OSXHIDDevice.nOpen(this.X);
    }

    private static final native void nOpen(long var0);

    private final void i() {
        OSXHIDDevice.nClose(this.X);
    }

    private static final native void nClose(long var0);

    private final void j() {
        if (this.Z) {
            throw new IOException();
        }
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

